package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.model")
@js.native
object modelNs extends js.Object {
  /**
    * Break a model's paths everywhere they intersect with another path.
    *
    * @param modelToBreak The model containing paths to be broken.
    * @param modelToIntersect Optional model containing paths to look for intersection, or else the modelToBreak will be used.
    */
  def breakPathsAtIntersections(modelToBreak: makerDotJsLib.MakerJsNs.IModel): scala.Unit = js.native
  def breakPathsAtIntersections(modelToBreak: makerDotJsLib.MakerJsNs.IModel, modelToIntersect: makerDotJsLib.MakerJsNs.IModel): scala.Unit = js.native
  /**
    * Center a model at [0, 0].
    *
    * @param modelToCenter The model to center.
    */
  def center(modelToCenter: makerDotJsLib.MakerJsNs.IModel): makerDotJsLib.MakerJsNs.IModel = js.native
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
  def combine(modelA: makerDotJsLib.MakerJsNs.IModel, modelB: makerDotJsLib.MakerJsNs.IModel): scala.Unit = js.native
  def combine(
    modelA: makerDotJsLib.MakerJsNs.IModel,
    modelB: makerDotJsLib.MakerJsNs.IModel,
    includeAInsideB: scala.Boolean
  ): scala.Unit = js.native
  def combine(
    modelA: makerDotJsLib.MakerJsNs.IModel,
    modelB: makerDotJsLib.MakerJsNs.IModel,
    includeAInsideB: scala.Boolean,
    includeAOutsideB: scala.Boolean
  ): scala.Unit = js.native
  def combine(
    modelA: makerDotJsLib.MakerJsNs.IModel,
    modelB: makerDotJsLib.MakerJsNs.IModel,
    includeAInsideB: scala.Boolean,
    includeAOutsideB: scala.Boolean,
    includeBInsideA: scala.Boolean
  ): scala.Unit = js.native
  def combine(
    modelA: makerDotJsLib.MakerJsNs.IModel,
    modelB: makerDotJsLib.MakerJsNs.IModel,
    includeAInsideB: scala.Boolean,
    includeAOutsideB: scala.Boolean,
    includeBInsideA: scala.Boolean,
    includeBOutsideA: scala.Boolean
  ): scala.Unit = js.native
  def combine(
    modelA: makerDotJsLib.MakerJsNs.IModel,
    modelB: makerDotJsLib.MakerJsNs.IModel,
    includeAInsideB: scala.Boolean,
    includeAOutsideB: scala.Boolean,
    includeBInsideA: scala.Boolean,
    includeBOutsideA: scala.Boolean,
    options: makerDotJsLib.MakerJsNs.ICombineOptions
  ): scala.Unit = js.native
  /**
    * Combine 2 models, resulting in a intersection.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    */
  def combineIntersection(modelA: makerDotJsLib.MakerJsNs.IModel, modelB: makerDotJsLib.MakerJsNs.IModel): scala.Unit = js.native
  /**
    * Combine 2 models, resulting in a subtraction of B from A.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    */
  def combineSubtraction(modelA: makerDotJsLib.MakerJsNs.IModel, modelB: makerDotJsLib.MakerJsNs.IModel): scala.Unit = js.native
  /**
    * Combine 2 models, resulting in a union.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    */
  def combineUnion(modelA: makerDotJsLib.MakerJsNs.IModel, modelB: makerDotJsLib.MakerJsNs.IModel): scala.Unit = js.native
  /**
    * Convert a model to match a different unit system.
    *
    * @param modeltoConvert The model to convert.
    * @param destUnitType The unit system.
    * @returns The scaled model (for cascading).
    */
  def convertUnits(modeltoConvert: makerDotJsLib.MakerJsNs.IModel, destUnitType: java.lang.String): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Count the number of child models within a given model.
    *
    * @param modelContext The model containing other models.
    * @returns Number of child models.
    */
  def countChildModels(modelContext: makerDotJsLib.MakerJsNs.IModel): scala.Double = js.native
  /**
    * Remove all paths in a loop model from the model(s) which contained them.
    *
    * @param loopToDetach The model to search for loops.
    */
  def detachLoop(loopToDetach: makerDotJsLib.MakerJsNs.IModel): scala.Unit = js.native
  /**
    * Expand all paths in a model, then combine the resulting expansions.
    *
    * @param modelToExpand Model to expand.
    * @param distance Distance to expand.
    * @param joints Number of points at a joint between paths. Use 0 for round joints, 1 for pointed joints, 2 for beveled joints.
    * @returns Model which surrounds the paths of the original model.
    */
  def expandPaths(modelToExpand: makerDotJsLib.MakerJsNs.IModel, distance: scala.Double): makerDotJsLib.MakerJsNs.IModel = js.native
  def expandPaths(modelToExpand: makerDotJsLib.MakerJsNs.IModel, distance: scala.Double, joints: scala.Double): makerDotJsLib.MakerJsNs.IModel = js.native
  def expandPaths(
    modelToExpand: makerDotJsLib.MakerJsNs.IModel,
    distance: scala.Double,
    joints: scala.Double,
    combineOptions: makerDotJsLib.MakerJsNs.ICombineOptions
  ): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Find paths that have common endpoints and form chains.
    *
    * @param modelContext The model to search for chains.
    * @param options Optional options object.
    */
  def findChains(modelContext: makerDotJsLib.MakerJsNs.IModel, callback: makerDotJsLib.MakerJsNs.IChainCallback): scala.Unit = js.native
  def findChains(
    modelContext: makerDotJsLib.MakerJsNs.IModel,
    callback: makerDotJsLib.MakerJsNs.IChainCallback,
    options: makerDotJsLib.MakerJsNs.IFindChainsOptions
  ): scala.Unit = js.native
  /**
    * Find paths that have common endpoints and form loops.
    *
    * @param modelContext The model to search for loops.
    * @param options Optional options object.
    * @returns A new model with child models ranked according to their containment within other found loops. The paths of models will be IPathDirectionalWithPrimeContext.
    */
  def findLoops(modelContext: makerDotJsLib.MakerJsNs.IModel): makerDotJsLib.MakerJsNs.IModel = js.native
  def findLoops(modelContext: makerDotJsLib.MakerJsNs.IModel, options: makerDotJsLib.MakerJsNs.IFindLoopsOptions): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Find a single chain within a model, across all layers. Shorthand of findChains; useful when you know there is only one chain to find in your model.
    *
    * @param modelContext The model to search for a chain.
    * @returns A chain object or null if chains were not found.
    */
  def findSingleChain(modelContext: makerDotJsLib.MakerJsNs.IModel): makerDotJsLib.MakerJsNs.IChain = js.native
  /**
    * Get an unused id in the models map with the same prefix.
    *
    * @param modelContext The model containing the models map.
    * @param modelId The id to use directly (if unused), or as a prefix.
    */
  def getSimilarModelId(modelContext: makerDotJsLib.MakerJsNs.IModel, modelId: java.lang.String): java.lang.String = js.native
  /**
    * Get an unused id in the paths map with the same prefix.
    *
    * @param modelContext The model containing the paths map.
    * @param pathId The id to use directly (if unused), or as a prefix.
    */
  def getSimilarPathId(modelContext: makerDotJsLib.MakerJsNs.IModel, pathId: java.lang.String): java.lang.String = js.native
  /**
    * Check to see if a path is inside of a model.
    *
    * @param pathContext The path to check.
    * @param modelContext The model to check against.
    * @param farPoint Optional point of reference which is outside the bounds of the modelContext.
    * @returns Boolean true if the path is inside of the modelContext.
    */
  def isPathInsideModel(pathContext: makerDotJsLib.MakerJsNs.IPath, modelContext: makerDotJsLib.MakerJsNs.IModel): scala.Boolean = js.native
  def isPathInsideModel(
    pathContext: makerDotJsLib.MakerJsNs.IPath,
    modelContext: makerDotJsLib.MakerJsNs.IModel,
    pathOffset: makerDotJsLib.MakerJsNs.IPoint
  ): scala.Boolean = js.native
  def isPathInsideModel(
    pathContext: makerDotJsLib.MakerJsNs.IPath,
    modelContext: makerDotJsLib.MakerJsNs.IModel,
    pathOffset: makerDotJsLib.MakerJsNs.IPoint,
    farPoint: makerDotJsLib.MakerJsNs.IPoint
  ): scala.Boolean = js.native
  def isPathInsideModel(
    pathContext: makerDotJsLib.MakerJsNs.IPath,
    modelContext: makerDotJsLib.MakerJsNs.IModel,
    pathOffset: makerDotJsLib.MakerJsNs.IPoint,
    farPoint: makerDotJsLib.MakerJsNs.IPoint,
    measureAtlas: makerDotJsLib.MakerJsNs.measureNs.Atlas
  ): scala.Boolean = js.native
  /**
    * Create a clone of a model, mirrored on either or both x and y axes.
    *
    * @param modelToMirror The model to mirror.
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns Mirrored model.
    */
  def mirror(modelToMirror: makerDotJsLib.MakerJsNs.IModel, mirrorX: scala.Boolean, mirrorY: scala.Boolean): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Move a model to an absolute point. Note that this is also accomplished by directly setting the origin property. This function exists for cascading.
    *
    * @param modelToMove The model to move.
    * @param origin The new position of the model.
    * @returns The original model (for cascading).
    */
  def move(modelToMove: makerDotJsLib.MakerJsNs.IModel, origin: makerDotJsLib.MakerJsNs.IPoint): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Move a model's origin by a relative amount.
    *
    * @param modelToMove The model to move.
    * @param delta The x & y adjustments as a point object.
    * @returns The original model (for cascading).
    */
  def moveRelative(modelToMove: makerDotJsLib.MakerJsNs.IModel, delta: makerDotJsLib.MakerJsNs.IPoint): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Moves all of a model's children (models and paths, recursively) in reference to a single common origin. Useful when points between children need to connect to each other.
    *
    * @param modelToOriginate The model to originate.
    * @param origin Optional offset reference point.
    */
  def originate(modelToOriginate: makerDotJsLib.MakerJsNs.IModel): makerDotJsLib.MakerJsNs.IModel = js.native
  def originate(modelToOriginate: makerDotJsLib.MakerJsNs.IModel, origin: makerDotJsLib.MakerJsNs.IPoint): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Outline a model by a specified distance. Useful for accommodating for kerf.
    *
    * @param modelToOutline Model to outline.
    * @param distance Distance to outline.
    * @param joints Number of points at a joint between paths. Use 0 for round joints, 1 for pointed joints, 2 for beveled joints.
    * @param inside Optional boolean to draw lines inside the model instead of outside.
    * @returns Model which surrounds the paths outside of the original model.
    */
  def outline(modelToOutline: makerDotJsLib.MakerJsNs.IModel, distance: scala.Double): makerDotJsLib.MakerJsNs.IModel = js.native
  def outline(modelToOutline: makerDotJsLib.MakerJsNs.IModel, distance: scala.Double, joints: scala.Double): makerDotJsLib.MakerJsNs.IModel = js.native
  def outline(
    modelToOutline: makerDotJsLib.MakerJsNs.IModel,
    distance: scala.Double,
    joints: scala.Double,
    inside: scala.Boolean
  ): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Prefix the ids of paths in a model.
    *
    * @param modelToPrefix The model to prefix.
    * @param prefix The prefix to prepend on paths ids.
    * @returns The original model (for cascading).
    */
  def prefixPathIds(modelToPrefix: makerDotJsLib.MakerJsNs.IModel, prefix: java.lang.String): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Remove paths from a model which have endpoints that do not connect to other paths.
    *
    * @param modelContext The model to search for dead ends.
    * @param options Optional options object.
    * @returns The input model (for cascading).
    */
  def removeDeadEnds(modelContext: makerDotJsLib.MakerJsNs.IModel): makerDotJsLib.MakerJsNs.IModel = js.native
  def removeDeadEnds(modelContext: makerDotJsLib.MakerJsNs.IModel, pointMatchingDistance: js.Any): makerDotJsLib.MakerJsNs.IModel = js.native
  def removeDeadEnds(
    modelContext: makerDotJsLib.MakerJsNs.IModel,
    pointMatchingDistance: js.Any,
    keep: makerDotJsLib.MakerJsNs.IWalkPathBooleanCallback
  ): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Rotate a model.
    *
    * @param modelToRotate The model to rotate.
    * @param angleInDegrees The amount of rotation, in degrees.
    * @param rotationOrigin The center point of rotation.
    * @returns The original model (for cascading).
    */
  def rotate(modelToRotate: makerDotJsLib.MakerJsNs.IModel, angleInDegrees: scala.Double): makerDotJsLib.MakerJsNs.IModel = js.native
  def rotate(
    modelToRotate: makerDotJsLib.MakerJsNs.IModel,
    angleInDegrees: scala.Double,
    rotationOrigin: makerDotJsLib.MakerJsNs.IPoint
  ): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Scale a model.
    *
    * @param modelToScale The model to scale.
    * @param scaleValue The amount of scaling.
    * @param scaleOrigin Optional boolean to scale the origin point. Typically false for the root model.
    * @returns The original model (for cascading).
    */
  def scale(modelToScale: makerDotJsLib.MakerJsNs.IModel, scaleValue: scala.Double): makerDotJsLib.MakerJsNs.IModel = js.native
  def scale(modelToScale: makerDotJsLib.MakerJsNs.IModel, scaleValue: scala.Double, scaleOrigin: scala.Boolean): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Simplify a model's paths by reducing redundancy: combine multiple overlapping paths into a single path. The model must be originated.
    *
    * @param modelContext The originated model to search for similar paths.
    * @param options Optional options object.
    * @returns The simplified model (for cascading).
    */
  def simplify(modelToSimplify: makerDotJsLib.MakerJsNs.IModel): makerDotJsLib.MakerJsNs.IModel = js.native
  def simplify(modelToSimplify: makerDotJsLib.MakerJsNs.IModel, options: makerDotJsLib.MakerJsNs.ISimplifyOptions): makerDotJsLib.MakerJsNs.IModel = js.native
  /**
    * Recursively walk through all paths for a given model.
    *
    * @param modelContext The model to walk.
    * @param pathCallback Callback for each path.
    * @param modelCallbackBeforeWalk Callback for each model prior to recursion, which can cancel the recursion if it returns false.
    * @param modelCallbackAfterWalk Callback for each model after recursion.
    */
  def walk(modelContext: makerDotJsLib.MakerJsNs.IModel, options: makerDotJsLib.MakerJsNs.IWalkOptions): scala.Unit = js.native
  /**
    * Recursively walk through all paths for a given model.
    *
    * @param modelContext The model to walk.
    * @param callback Callback for each path.
    */
  def walkPaths(modelContext: makerDotJsLib.MakerJsNs.IModel, callback: makerDotJsLib.MakerJsNs.IModelPathCallback): scala.Unit = js.native
  /**
    * Move a model so its bounding box begins at [0, 0].
    *
    * @param modelToZero The model to zero.
    */
  def zero(modelToZero: makerDotJsLib.MakerJsNs.IModel): makerDotJsLib.MakerJsNs.IModel = js.native
}

