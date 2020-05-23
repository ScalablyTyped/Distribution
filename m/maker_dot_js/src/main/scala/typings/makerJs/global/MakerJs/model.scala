package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IChain
import typings.makerJs.MakerJs.IChainCallback
import typings.makerJs.MakerJs.ICombineOptions
import typings.makerJs.MakerJs.IFindChainsOptions
import typings.makerJs.MakerJs.IFindLoopsOptions
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelPathCallback
import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPoint
import typings.makerJs.MakerJs.ISimplifyOptions
import typings.makerJs.MakerJs.IWalkOptions
import typings.makerJs.MakerJs.IWalkPathBooleanCallback
import typings.makerJs.MakerJs.measure.Atlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.model")
@js.native
object model extends js.Object {
  /**
    * Break a model's paths everywhere they intersect with another path.
    *
    * @param modelToBreak The model containing paths to be broken.
    * @param modelToIntersect Optional model containing paths to look for intersection, or else the modelToBreak will be used.
    */
  def breakPathsAtIntersections(modelToBreak: IModel): Unit = js.native
  def breakPathsAtIntersections(modelToBreak: IModel, modelToIntersect: IModel): Unit = js.native
  /**
    * Center a model at [0, 0].
    *
    * @param modelToCenter The model to center.
    */
  def center(modelToCenter: IModel): IModel = js.native
  /**
    * Combine 2 models.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    * @param includeAInsideB Flag to include paths from modelA which are inside of modelB.
    * @param includeAOutsideB Flag to include paths from modelA which are outside of modelB.
    * @param includeBInsideA Flag to include paths from modelB which are inside of modelA.
    * @param includeBOutsideA Flag to include paths from modelB which are outside of modelA.
    * @param keepDuplicates Flag to include paths which are duplicate in both models.
    * @param farPoint Optional point of reference which is outside the bounds of both models.
    */
  def combine(modelA: IModel, modelB: IModel): Unit = js.native
  def combine(modelA: IModel, modelB: IModel, includeAInsideB: Boolean): Unit = js.native
  def combine(modelA: IModel, modelB: IModel, includeAInsideB: Boolean, includeAOutsideB: Boolean): Unit = js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean
  ): Unit = js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): Unit = js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = js.native
  /**
    * Combine 2 models, resulting in a intersection.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    */
  def combineIntersection(modelA: IModel, modelB: IModel): Unit = js.native
  /**
    * Combine 2 models, resulting in a subtraction of B from A.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    */
  def combineSubtraction(modelA: IModel, modelB: IModel): Unit = js.native
  /**
    * Combine 2 models, resulting in a union.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    */
  def combineUnion(modelA: IModel, modelB: IModel): Unit = js.native
  /**
    * Convert a model to match a different unit system.
    *
    * @param modeltoConvert The model to convert.
    * @param destUnitType The unit system.
    * @returns The scaled model (for cascading).
    */
  def convertUnits(modeltoConvert: IModel, destUnitType: String): IModel = js.native
  /**
    * Count the number of child models within a given model.
    *
    * @param modelContext The model containing other models.
    * @returns Number of child models.
    */
  def countChildModels(modelContext: IModel): Double = js.native
  /**
    * Remove all paths in a loop model from the model(s) which contained them.
    *
    * @param loopToDetach The model to search for loops.
    */
  def detachLoop(loopToDetach: IModel): Unit = js.native
  /**
    * Expand all paths in a model, then combine the resulting expansions.
    *
    * @param modelToExpand Model to expand.
    * @param distance Distance to expand.
    * @param joints Number of points at a joint between paths. Use 0 for round joints, 1 for pointed joints, 2 for beveled joints.
    * @returns Model which surrounds the paths of the original model.
    */
  def expandPaths(modelToExpand: IModel, distance: Double): IModel = js.native
  def expandPaths(modelToExpand: IModel, distance: Double, joints: Double): IModel = js.native
  def expandPaths(modelToExpand: IModel, distance: Double, joints: Double, combineOptions: ICombineOptions): IModel = js.native
  /**
    * Find paths that have common endpoints and form chains.
    *
    * @param modelContext The model to search for chains.
    * @param options Optional options object.
    */
  def findChains(modelContext: IModel, callback: IChainCallback): Unit = js.native
  def findChains(modelContext: IModel, callback: IChainCallback, options: IFindChainsOptions): Unit = js.native
  /**
    * Find paths that have common endpoints and form loops.
    *
    * @param modelContext The model to search for loops.
    * @param options Optional options object.
    * @returns A new model with child models ranked according to their containment within other found loops. The paths of models will be IPathDirectionalWithPrimeContext.
    */
  def findLoops(modelContext: IModel): IModel = js.native
  def findLoops(modelContext: IModel, options: IFindLoopsOptions): IModel = js.native
  /**
    * Find a single chain within a model, across all layers. Shorthand of findChains; useful when you know there is only one chain to find in your model.
    *
    * @param modelContext The model to search for a chain.
    * @returns A chain object or null if chains were not found.
    */
  def findSingleChain(modelContext: IModel): IChain = js.native
  /**
    * Get an unused id in the models map with the same prefix.
    *
    * @param modelContext The model containing the models map.
    * @param modelId The id to use directly (if unused), or as a prefix.
    */
  def getSimilarModelId(modelContext: IModel, modelId: String): String = js.native
  /**
    * Get an unused id in the paths map with the same prefix.
    *
    * @param modelContext The model containing the paths map.
    * @param pathId The id to use directly (if unused), or as a prefix.
    */
  def getSimilarPathId(modelContext: IModel, pathId: String): String = js.native
  /**
    * Check to see if a path is inside of a model.
    *
    * @param pathContext The path to check.
    * @param modelContext The model to check against.
    * @param farPoint Optional point of reference which is outside the bounds of the modelContext.
    * @returns Boolean true if the path is inside of the modelContext.
    */
  def isPathInsideModel(pathContext: IPath, modelContext: IModel): Boolean = js.native
  def isPathInsideModel(pathContext: IPath, modelContext: IModel, pathOffset: IPoint): Boolean = js.native
  def isPathInsideModel(pathContext: IPath, modelContext: IModel, pathOffset: IPoint, farPoint: IPoint): Boolean = js.native
  def isPathInsideModel(
    pathContext: IPath,
    modelContext: IModel,
    pathOffset: IPoint,
    farPoint: IPoint,
    measureAtlas: Atlas
  ): Boolean = js.native
  /**
    * Create a clone of a model, mirrored on either or both x and y axes.
    *
    * @param modelToMirror The model to mirror.
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns Mirrored model.
    */
  def mirror(modelToMirror: IModel, mirrorX: Boolean, mirrorY: Boolean): IModel = js.native
  /**
    * Move a model to an absolute point. Note that this is also accomplished by directly setting the origin property. This function exists for cascading.
    *
    * @param modelToMove The model to move.
    * @param origin The new position of the model.
    * @returns The original model (for cascading).
    */
  def move(modelToMove: IModel, origin: IPoint): IModel = js.native
  /**
    * Move a model's origin by a relative amount.
    *
    * @param modelToMove The model to move.
    * @param delta The x & y adjustments as a point object.
    * @returns The original model (for cascading).
    */
  def moveRelative(modelToMove: IModel, delta: IPoint): IModel = js.native
  /**
    * Moves all of a model's children (models and paths, recursively) in reference to a single common origin. Useful when points between children need to connect to each other.
    *
    * @param modelToOriginate The model to originate.
    * @param origin Optional offset reference point.
    */
  def originate(modelToOriginate: IModel): IModel = js.native
  def originate(modelToOriginate: IModel, origin: IPoint): IModel = js.native
  /**
    * Outline a model by a specified distance. Useful for accommodating for kerf.
    *
    * @param modelToOutline Model to outline.
    * @param distance Distance to outline.
    * @param joints Number of points at a joint between paths. Use 0 for round joints, 1 for pointed joints, 2 for beveled joints.
    * @param inside Optional boolean to draw lines inside the model instead of outside.
    * @returns Model which surrounds the paths outside of the original model.
    */
  def outline(modelToOutline: IModel, distance: Double): IModel = js.native
  def outline(modelToOutline: IModel, distance: Double, joints: Double): IModel = js.native
  def outline(modelToOutline: IModel, distance: Double, joints: Double, inside: Boolean): IModel = js.native
  /**
    * Prefix the ids of paths in a model.
    *
    * @param modelToPrefix The model to prefix.
    * @param prefix The prefix to prepend on paths ids.
    * @returns The original model (for cascading).
    */
  def prefixPathIds(modelToPrefix: IModel, prefix: String): IModel = js.native
  /**
    * Remove paths from a model which have endpoints that do not connect to other paths.
    *
    * @param modelContext The model to search for dead ends.
    * @param options Optional options object.
    * @returns The input model (for cascading).
    */
  def removeDeadEnds(modelContext: IModel): IModel = js.native
  def removeDeadEnds(modelContext: IModel, pointMatchingDistance: js.Any): IModel = js.native
  def removeDeadEnds(modelContext: IModel, pointMatchingDistance: js.Any, keep: IWalkPathBooleanCallback): IModel = js.native
  /**
    * Rotate a model.
    *
    * @param modelToRotate The model to rotate.
    * @param angleInDegrees The amount of rotation, in degrees.
    * @param rotationOrigin The center point of rotation.
    * @returns The original model (for cascading).
    */
  def rotate(modelToRotate: IModel, angleInDegrees: Double): IModel = js.native
  def rotate(modelToRotate: IModel, angleInDegrees: Double, rotationOrigin: IPoint): IModel = js.native
  /**
    * Scale a model.
    *
    * @param modelToScale The model to scale.
    * @param scaleValue The amount of scaling.
    * @param scaleOrigin Optional boolean to scale the origin point. Typically false for the root model.
    * @returns The original model (for cascading).
    */
  def scale(modelToScale: IModel, scaleValue: Double): IModel = js.native
  def scale(modelToScale: IModel, scaleValue: Double, scaleOrigin: Boolean): IModel = js.native
  /**
    * Simplify a model's paths by reducing redundancy: combine multiple overlapping paths into a single path. The model must be originated.
    *
    * @param modelContext The originated model to search for similar paths.
    * @param options Optional options object.
    * @returns The simplified model (for cascading).
    */
  def simplify(modelToSimplify: IModel): IModel = js.native
  def simplify(modelToSimplify: IModel, options: ISimplifyOptions): IModel = js.native
  /**
    * Recursively walk through all paths for a given model.
    *
    * @param modelContext The model to walk.
    * @param pathCallback Callback for each path.
    * @param modelCallbackBeforeWalk Callback for each model prior to recursion, which can cancel the recursion if it returns false.
    * @param modelCallbackAfterWalk Callback for each model after recursion.
    */
  def walk(modelContext: IModel, options: IWalkOptions): Unit = js.native
  /**
    * Recursively walk through all paths for a given model.
    *
    * @param modelContext The model to walk.
    * @param callback Callback for each path.
    */
  def walkPaths(modelContext: IModel, callback: IModelPathCallback): Unit = js.native
  /**
    * Move a model so its bounding box begins at [0, 0].
    *
    * @param modelToZero The model to zero.
    */
  def zero(modelToZero: IModel): IModel = js.native
}

