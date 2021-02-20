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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object model {
  
  /**
    * Break a model's paths everywhere they intersect with another path.
    *
    * @param modelToBreak The model containing paths to be broken.
    * @param modelToIntersect Optional model containing paths to look for intersection, or else the modelToBreak will be used.
    */
  @JSGlobal("MakerJs.model.breakPathsAtIntersections")
  @js.native
  def breakPathsAtIntersections(modelToBreak: IModel): Unit = js.native
  @JSGlobal("MakerJs.model.breakPathsAtIntersections")
  @js.native
  def breakPathsAtIntersections(modelToBreak: IModel, modelToIntersect: IModel): Unit = js.native
  
  /**
    * Center a model at [0, 0].
    *
    * @param modelToCenter The model to center.
    */
  @JSGlobal("MakerJs.model.center")
  @js.native
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
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(modelA: IModel, modelB: IModel): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: js.UndefOr[scala.Nothing],
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: Boolean,
    includeBOutsideA: js.UndefOr[scala.Nothing],
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: Boolean,
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: js.UndefOr[scala.Nothing],
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: Boolean,
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: Boolean,
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: js.UndefOr[scala.Nothing],
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: js.UndefOr[scala.Nothing],
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(modelA: IModel, modelB: IModel, includeAInsideB: Boolean): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: js.UndefOr[scala.Nothing],
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: Boolean,
    includeBOutsideA: js.UndefOr[scala.Nothing],
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: js.UndefOr[scala.Nothing],
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(modelA: IModel, modelB: IModel, includeAInsideB: Boolean, includeAOutsideB: Boolean): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: js.UndefOr[scala.Nothing],
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: js.UndefOr[scala.Nothing],
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: js.UndefOr[scala.Nothing],
    options: ICombineOptions
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
  def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): Unit = js.native
  @JSGlobal("MakerJs.model.combine")
  @js.native
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
  @JSGlobal("MakerJs.model.combineIntersection")
  @js.native
  def combineIntersection(modelA: IModel, modelB: IModel): Unit = js.native
  
  /**
    * Combine 2 models, resulting in a subtraction of B from A.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    */
  @JSGlobal("MakerJs.model.combineSubtraction")
  @js.native
  def combineSubtraction(modelA: IModel, modelB: IModel): Unit = js.native
  
  /**
    * Combine 2 models, resulting in a union.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    */
  @JSGlobal("MakerJs.model.combineUnion")
  @js.native
  def combineUnion(modelA: IModel, modelB: IModel): Unit = js.native
  
  /**
    * Convert a model to match a different unit system.
    *
    * @param modeltoConvert The model to convert.
    * @param destUnitType The unit system.
    * @returns The scaled model (for cascading).
    */
  @JSGlobal("MakerJs.model.convertUnits")
  @js.native
  def convertUnits(modeltoConvert: IModel, destUnitType: String): IModel = js.native
  
  /**
    * Count the number of child models within a given model.
    *
    * @param modelContext The model containing other models.
    * @returns Number of child models.
    */
  @JSGlobal("MakerJs.model.countChildModels")
  @js.native
  def countChildModels(modelContext: IModel): Double = js.native
  
  /**
    * Remove all paths in a loop model from the model(s) which contained them.
    *
    * @param loopToDetach The model to search for loops.
    */
  @JSGlobal("MakerJs.model.detachLoop")
  @js.native
  def detachLoop(loopToDetach: IModel): Unit = js.native
  
  /**
    * Expand all paths in a model, then combine the resulting expansions.
    *
    * @param modelToExpand Model to expand.
    * @param distance Distance to expand.
    * @param joints Number of points at a joint between paths. Use 0 for round joints, 1 for pointed joints, 2 for beveled joints.
    * @returns Model which surrounds the paths of the original model.
    */
  @JSGlobal("MakerJs.model.expandPaths")
  @js.native
  def expandPaths(modelToExpand: IModel, distance: Double): IModel = js.native
  @JSGlobal("MakerJs.model.expandPaths")
  @js.native
  def expandPaths(
    modelToExpand: IModel,
    distance: Double,
    joints: js.UndefOr[scala.Nothing],
    combineOptions: ICombineOptions
  ): IModel = js.native
  @JSGlobal("MakerJs.model.expandPaths")
  @js.native
  def expandPaths(modelToExpand: IModel, distance: Double, joints: Double): IModel = js.native
  @JSGlobal("MakerJs.model.expandPaths")
  @js.native
  def expandPaths(modelToExpand: IModel, distance: Double, joints: Double, combineOptions: ICombineOptions): IModel = js.native
  
  /**
    * Find paths that have common endpoints and form chains.
    *
    * @param modelContext The model to search for chains.
    * @param options Optional options object.
    */
  @JSGlobal("MakerJs.model.findChains")
  @js.native
  def findChains(modelContext: IModel, callback: IChainCallback): Unit = js.native
  @JSGlobal("MakerJs.model.findChains")
  @js.native
  def findChains(modelContext: IModel, callback: IChainCallback, options: IFindChainsOptions): Unit = js.native
  
  /**
    * Find paths that have common endpoints and form loops.
    *
    * @param modelContext The model to search for loops.
    * @param options Optional options object.
    * @returns A new model with child models ranked according to their containment within other found loops. The paths of models will be IPathDirectionalWithPrimeContext.
    */
  @JSGlobal("MakerJs.model.findLoops")
  @js.native
  def findLoops(modelContext: IModel): IModel = js.native
  @JSGlobal("MakerJs.model.findLoops")
  @js.native
  def findLoops(modelContext: IModel, options: IFindLoopsOptions): IModel = js.native
  
  /**
    * Find a single chain within a model, across all layers. Shorthand of findChains; useful when you know there is only one chain to find in your model.
    *
    * @param modelContext The model to search for a chain.
    * @returns A chain object or null if chains were not found.
    */
  @JSGlobal("MakerJs.model.findSingleChain")
  @js.native
  def findSingleChain(modelContext: IModel): IChain = js.native
  
  /**
    * Get an unused id in the models map with the same prefix.
    *
    * @param modelContext The model containing the models map.
    * @param modelId The id to use directly (if unused), or as a prefix.
    */
  @JSGlobal("MakerJs.model.getSimilarModelId")
  @js.native
  def getSimilarModelId(modelContext: IModel, modelId: String): String = js.native
  
  /**
    * Get an unused id in the paths map with the same prefix.
    *
    * @param modelContext The model containing the paths map.
    * @param pathId The id to use directly (if unused), or as a prefix.
    */
  @JSGlobal("MakerJs.model.getSimilarPathId")
  @js.native
  def getSimilarPathId(modelContext: IModel, pathId: String): String = js.native
  
  /**
    * Check to see if a path is inside of a model.
    *
    * @param pathContext The path to check.
    * @param modelContext The model to check against.
    * @param farPoint Optional point of reference which is outside the bounds of the modelContext.
    * @returns Boolean true if the path is inside of the modelContext.
    */
  @JSGlobal("MakerJs.model.isPathInsideModel")
  @js.native
  def isPathInsideModel(pathContext: IPath, modelContext: IModel): Boolean = js.native
  @JSGlobal("MakerJs.model.isPathInsideModel")
  @js.native
  def isPathInsideModel(
    pathContext: IPath,
    modelContext: IModel,
    pathOffset: js.UndefOr[scala.Nothing],
    farPoint: js.UndefOr[scala.Nothing],
    measureAtlas: Atlas
  ): Boolean = js.native
  @JSGlobal("MakerJs.model.isPathInsideModel")
  @js.native
  def isPathInsideModel(pathContext: IPath, modelContext: IModel, pathOffset: js.UndefOr[scala.Nothing], farPoint: IPoint): Boolean = js.native
  @JSGlobal("MakerJs.model.isPathInsideModel")
  @js.native
  def isPathInsideModel(
    pathContext: IPath,
    modelContext: IModel,
    pathOffset: js.UndefOr[scala.Nothing],
    farPoint: IPoint,
    measureAtlas: Atlas
  ): Boolean = js.native
  @JSGlobal("MakerJs.model.isPathInsideModel")
  @js.native
  def isPathInsideModel(pathContext: IPath, modelContext: IModel, pathOffset: IPoint): Boolean = js.native
  @JSGlobal("MakerJs.model.isPathInsideModel")
  @js.native
  def isPathInsideModel(
    pathContext: IPath,
    modelContext: IModel,
    pathOffset: IPoint,
    farPoint: js.UndefOr[scala.Nothing],
    measureAtlas: Atlas
  ): Boolean = js.native
  @JSGlobal("MakerJs.model.isPathInsideModel")
  @js.native
  def isPathInsideModel(pathContext: IPath, modelContext: IModel, pathOffset: IPoint, farPoint: IPoint): Boolean = js.native
  @JSGlobal("MakerJs.model.isPathInsideModel")
  @js.native
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
  @JSGlobal("MakerJs.model.mirror")
  @js.native
  def mirror(modelToMirror: IModel, mirrorX: Boolean, mirrorY: Boolean): IModel = js.native
  
  /**
    * Move a model to an absolute point. Note that this is also accomplished by directly setting the origin property. This function exists for cascading.
    *
    * @param modelToMove The model to move.
    * @param origin The new position of the model.
    * @returns The original model (for cascading).
    */
  @JSGlobal("MakerJs.model.move")
  @js.native
  def move(modelToMove: IModel, origin: IPoint): IModel = js.native
  
  /**
    * Move a model's origin by a relative amount.
    *
    * @param modelToMove The model to move.
    * @param delta The x & y adjustments as a point object.
    * @returns The original model (for cascading).
    */
  @JSGlobal("MakerJs.model.moveRelative")
  @js.native
  def moveRelative(modelToMove: IModel, delta: IPoint): IModel = js.native
  
  /**
    * Moves all of a model's children (models and paths, recursively) in reference to a single common origin. Useful when points between children need to connect to each other.
    *
    * @param modelToOriginate The model to originate.
    * @param origin Optional offset reference point.
    */
  @JSGlobal("MakerJs.model.originate")
  @js.native
  def originate(modelToOriginate: IModel): IModel = js.native
  @JSGlobal("MakerJs.model.originate")
  @js.native
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
  @JSGlobal("MakerJs.model.outline")
  @js.native
  def outline(modelToOutline: IModel, distance: Double): IModel = js.native
  @JSGlobal("MakerJs.model.outline")
  @js.native
  def outline(modelToOutline: IModel, distance: Double, joints: js.UndefOr[scala.Nothing], inside: Boolean): IModel = js.native
  @JSGlobal("MakerJs.model.outline")
  @js.native
  def outline(modelToOutline: IModel, distance: Double, joints: Double): IModel = js.native
  @JSGlobal("MakerJs.model.outline")
  @js.native
  def outline(modelToOutline: IModel, distance: Double, joints: Double, inside: Boolean): IModel = js.native
  
  /**
    * Prefix the ids of paths in a model.
    *
    * @param modelToPrefix The model to prefix.
    * @param prefix The prefix to prepend on paths ids.
    * @returns The original model (for cascading).
    */
  @JSGlobal("MakerJs.model.prefixPathIds")
  @js.native
  def prefixPathIds(modelToPrefix: IModel, prefix: String): IModel = js.native
  
  /**
    * Remove paths from a model which have endpoints that do not connect to other paths.
    *
    * @param modelContext The model to search for dead ends.
    * @param options Optional options object.
    * @returns The input model (for cascading).
    */
  @JSGlobal("MakerJs.model.removeDeadEnds")
  @js.native
  def removeDeadEnds(modelContext: IModel): IModel = js.native
  @JSGlobal("MakerJs.model.removeDeadEnds")
  @js.native
  def removeDeadEnds(
    modelContext: IModel,
    pointMatchingDistance: js.UndefOr[scala.Nothing],
    keep: IWalkPathBooleanCallback
  ): IModel = js.native
  @JSGlobal("MakerJs.model.removeDeadEnds")
  @js.native
  def removeDeadEnds(modelContext: IModel, pointMatchingDistance: js.Any): IModel = js.native
  @JSGlobal("MakerJs.model.removeDeadEnds")
  @js.native
  def removeDeadEnds(modelContext: IModel, pointMatchingDistance: js.Any, keep: IWalkPathBooleanCallback): IModel = js.native
  
  /**
    * Rotate a model.
    *
    * @param modelToRotate The model to rotate.
    * @param angleInDegrees The amount of rotation, in degrees.
    * @param rotationOrigin The center point of rotation.
    * @returns The original model (for cascading).
    */
  @JSGlobal("MakerJs.model.rotate")
  @js.native
  def rotate(modelToRotate: IModel, angleInDegrees: Double): IModel = js.native
  @JSGlobal("MakerJs.model.rotate")
  @js.native
  def rotate(modelToRotate: IModel, angleInDegrees: Double, rotationOrigin: IPoint): IModel = js.native
  
  /**
    * Scale a model.
    *
    * @param modelToScale The model to scale.
    * @param scaleValue The amount of scaling.
    * @param scaleOrigin Optional boolean to scale the origin point. Typically false for the root model.
    * @returns The original model (for cascading).
    */
  @JSGlobal("MakerJs.model.scale")
  @js.native
  def scale(modelToScale: IModel, scaleValue: Double): IModel = js.native
  @JSGlobal("MakerJs.model.scale")
  @js.native
  def scale(modelToScale: IModel, scaleValue: Double, scaleOrigin: Boolean): IModel = js.native
  
  /**
    * Simplify a model's paths by reducing redundancy: combine multiple overlapping paths into a single path. The model must be originated.
    *
    * @param modelContext The originated model to search for similar paths.
    * @param options Optional options object.
    * @returns The simplified model (for cascading).
    */
  @JSGlobal("MakerJs.model.simplify")
  @js.native
  def simplify(modelToSimplify: IModel): IModel = js.native
  @JSGlobal("MakerJs.model.simplify")
  @js.native
  def simplify(modelToSimplify: IModel, options: ISimplifyOptions): IModel = js.native
  
  /**
    * Recursively walk through all paths for a given model.
    *
    * @param modelContext The model to walk.
    * @param pathCallback Callback for each path.
    * @param modelCallbackBeforeWalk Callback for each model prior to recursion, which can cancel the recursion if it returns false.
    * @param modelCallbackAfterWalk Callback for each model after recursion.
    */
  @JSGlobal("MakerJs.model.walk")
  @js.native
  def walk(modelContext: IModel, options: IWalkOptions): Unit = js.native
  
  /**
    * Recursively walk through all paths for a given model.
    *
    * @param modelContext The model to walk.
    * @param callback Callback for each path.
    */
  @JSGlobal("MakerJs.model.walkPaths")
  @js.native
  def walkPaths(modelContext: IModel, callback: IModelPathCallback): Unit = js.native
  
  /**
    * Move a model so its bounding box begins at [0, 0].
    *
    * @param modelToZero The model to zero.
    */
  @JSGlobal("MakerJs.model.zero")
  @js.native
  def zero(modelToZero: IModel): IModel = js.native
}
