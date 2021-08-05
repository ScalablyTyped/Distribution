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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object model {
  
  @JSGlobal("MakerJs.model")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Break a model's paths everywhere they intersect with another path.
    *
    * @param modelToBreak The model containing paths to be broken.
    * @param modelToIntersect Optional model containing paths to look for intersection, or else the modelToBreak will be used.
    */
  inline def breakPathsAtIntersections(modelToBreak: IModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("breakPathsAtIntersections")(modelToBreak.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def breakPathsAtIntersections(modelToBreak: IModel, modelToIntersect: IModel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("breakPathsAtIntersections")(modelToBreak.asInstanceOf[js.Any], modelToIntersect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Center a model at [0, 0].
    *
    * @param modelToCenter The model to center.
    */
  inline def center(modelToCenter: IModel): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(modelToCenter.asInstanceOf[js.Any]).asInstanceOf[IModel]
  
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
  inline def combine(modelA: IModel, modelB: IModel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(modelA: IModel, modelB: IModel, includeAInsideB: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(modelA: IModel, modelB: IModel, includeAInsideB: Boolean, includeAOutsideB: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(modelA: IModel, modelB: IModel, includeAInsideB: Unit, includeAOutsideB: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Combine 2 models, resulting in a intersection.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    */
  inline def combineIntersection(modelA: IModel, modelB: IModel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combineIntersection")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Combine 2 models, resulting in a subtraction of B from A.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    */
  inline def combineSubtraction(modelA: IModel, modelB: IModel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combineSubtraction")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Combine 2 models, resulting in a union.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    */
  inline def combineUnion(modelA: IModel, modelB: IModel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combineUnion")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Convert a model to match a different unit system.
    *
    * @param modeltoConvert The model to convert.
    * @param destUnitType The unit system.
    * @returns The scaled model (for cascading).
    */
  inline def convertUnits(modeltoConvert: IModel, destUnitType: String): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUnits")(modeltoConvert.asInstanceOf[js.Any], destUnitType.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Count the number of child models within a given model.
    *
    * @param modelContext The model containing other models.
    * @returns Number of child models.
    */
  inline def countChildModels(modelContext: IModel): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countChildModels")(modelContext.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Remove all paths in a loop model from the model(s) which contained them.
    *
    * @param loopToDetach The model to search for loops.
    */
  inline def detachLoop(loopToDetach: IModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachLoop")(loopToDetach.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Expand all paths in a model, then combine the resulting expansions.
    *
    * @param modelToExpand Model to expand.
    * @param distance Distance to expand.
    * @param joints Number of points at a joint between paths. Use 0 for round joints, 1 for pointed joints, 2 for beveled joints.
    * @returns Model which surrounds the paths of the original model.
    */
  inline def expandPaths(modelToExpand: IModel, distance: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("expandPaths")(modelToExpand.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def expandPaths(modelToExpand: IModel, distance: Double, joints: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("expandPaths")(modelToExpand.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def expandPaths(modelToExpand: IModel, distance: Double, joints: Double, combineOptions: ICombineOptions): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("expandPaths")(modelToExpand.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any], combineOptions.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def expandPaths(modelToExpand: IModel, distance: Double, joints: Unit, combineOptions: ICombineOptions): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("expandPaths")(modelToExpand.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any], combineOptions.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Find paths that have common endpoints and form chains.
    *
    * @param modelContext The model to search for chains.
    * @param options Optional options object.
    */
  inline def findChains(modelContext: IModel, callback: IChainCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findChains")(modelContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findChains(modelContext: IModel, callback: IChainCallback, options: IFindChainsOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findChains")(modelContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Find paths that have common endpoints and form loops.
    *
    * @param modelContext The model to search for loops.
    * @param options Optional options object.
    * @returns A new model with child models ranked according to their containment within other found loops. The paths of models will be IPathDirectionalWithPrimeContext.
    */
  inline def findLoops(modelContext: IModel): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("findLoops")(modelContext.asInstanceOf[js.Any]).asInstanceOf[IModel]
  inline def findLoops(modelContext: IModel, options: IFindLoopsOptions): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("findLoops")(modelContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Find a single chain within a model, across all layers. Shorthand of findChains; useful when you know there is only one chain to find in your model.
    *
    * @param modelContext The model to search for a chain.
    * @returns A chain object or null if chains were not found.
    */
  inline def findSingleChain(modelContext: IModel): IChain = ^.asInstanceOf[js.Dynamic].applyDynamic("findSingleChain")(modelContext.asInstanceOf[js.Any]).asInstanceOf[IChain]
  
  /**
    * Get an unused id in the models map with the same prefix.
    *
    * @param modelContext The model containing the models map.
    * @param modelId The id to use directly (if unused), or as a prefix.
    */
  inline def getSimilarModelId(modelContext: IModel, modelId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSimilarModelId")(modelContext.asInstanceOf[js.Any], modelId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Get an unused id in the paths map with the same prefix.
    *
    * @param modelContext The model containing the paths map.
    * @param pathId The id to use directly (if unused), or as a prefix.
    */
  inline def getSimilarPathId(modelContext: IModel, pathId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSimilarPathId")(modelContext.asInstanceOf[js.Any], pathId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Check to see if a path is inside of a model.
    *
    * @param pathContext The path to check.
    * @param modelContext The model to check against.
    * @param farPoint Optional point of reference which is outside the bounds of the modelContext.
    * @returns Boolean true if the path is inside of the modelContext.
    */
  inline def isPathInsideModel(pathContext: IPath, modelContext: IModel): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathInsideModel")(pathContext.asInstanceOf[js.Any], modelContext.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathInsideModel(pathContext: IPath, modelContext: IModel, pathOffset: Unit, farPoint: Unit, measureAtlas: Atlas): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathInsideModel")(pathContext.asInstanceOf[js.Any], modelContext.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], farPoint.asInstanceOf[js.Any], measureAtlas.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathInsideModel(pathContext: IPath, modelContext: IModel, pathOffset: Unit, farPoint: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathInsideModel")(pathContext.asInstanceOf[js.Any], modelContext.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], farPoint.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathInsideModel(pathContext: IPath, modelContext: IModel, pathOffset: Unit, farPoint: IPoint, measureAtlas: Atlas): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathInsideModel")(pathContext.asInstanceOf[js.Any], modelContext.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], farPoint.asInstanceOf[js.Any], measureAtlas.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathInsideModel(pathContext: IPath, modelContext: IModel, pathOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathInsideModel")(pathContext.asInstanceOf[js.Any], modelContext.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathInsideModel(pathContext: IPath, modelContext: IModel, pathOffset: IPoint, farPoint: Unit, measureAtlas: Atlas): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathInsideModel")(pathContext.asInstanceOf[js.Any], modelContext.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], farPoint.asInstanceOf[js.Any], measureAtlas.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathInsideModel(pathContext: IPath, modelContext: IModel, pathOffset: IPoint, farPoint: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathInsideModel")(pathContext.asInstanceOf[js.Any], modelContext.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], farPoint.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathInsideModel(
    pathContext: IPath,
    modelContext: IModel,
    pathOffset: IPoint,
    farPoint: IPoint,
    measureAtlas: Atlas
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathInsideModel")(pathContext.asInstanceOf[js.Any], modelContext.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any], farPoint.asInstanceOf[js.Any], measureAtlas.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Create a clone of a model, mirrored on either or both x and y axes.
    *
    * @param modelToMirror The model to mirror.
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns Mirrored model.
    */
  inline def mirror(modelToMirror: IModel, mirrorX: Boolean, mirrorY: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("mirror")(modelToMirror.asInstanceOf[js.Any], mirrorX.asInstanceOf[js.Any], mirrorY.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Move a model to an absolute point. Note that this is also accomplished by directly setting the origin property. This function exists for cascading.
    *
    * @param modelToMove The model to move.
    * @param origin The new position of the model.
    * @returns The original model (for cascading).
    */
  inline def move(modelToMove: IModel, origin: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(modelToMove.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Move a model's origin by a relative amount.
    *
    * @param modelToMove The model to move.
    * @param delta The x & y adjustments as a point object.
    * @returns The original model (for cascading).
    */
  inline def moveRelative(modelToMove: IModel, delta: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("moveRelative")(modelToMove.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Moves all of a model's children (models and paths, recursively) in reference to a single common origin. Useful when points between children need to connect to each other.
    *
    * @param modelToOriginate The model to originate.
    * @param origin Optional offset reference point.
    */
  inline def originate(modelToOriginate: IModel): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("originate")(modelToOriginate.asInstanceOf[js.Any]).asInstanceOf[IModel]
  inline def originate(modelToOriginate: IModel, origin: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("originate")(modelToOriginate.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Outline a model by a specified distance. Useful for accommodating for kerf.
    *
    * @param modelToOutline Model to outline.
    * @param distance Distance to outline.
    * @param joints Number of points at a joint between paths. Use 0 for round joints, 1 for pointed joints, 2 for beveled joints.
    * @param inside Optional boolean to draw lines inside the model instead of outside.
    * @returns Model which surrounds the paths outside of the original model.
    */
  inline def outline(modelToOutline: IModel, distance: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def outline(modelToOutline: IModel, distance: Double, joints: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def outline(modelToOutline: IModel, distance: Double, joints: Double, inside: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any], inside.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def outline(modelToOutline: IModel, distance: Double, joints: Unit, inside: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any], inside.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Prefix the ids of paths in a model.
    *
    * @param modelToPrefix The model to prefix.
    * @param prefix The prefix to prepend on paths ids.
    * @returns The original model (for cascading).
    */
  inline def prefixPathIds(modelToPrefix: IModel, prefix: String): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("prefixPathIds")(modelToPrefix.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Remove paths from a model which have endpoints that do not connect to other paths.
    *
    * @param modelContext The model to search for dead ends.
    * @param options Optional options object.
    * @returns The input model (for cascading).
    */
  inline def removeDeadEnds(modelContext: IModel): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any]).asInstanceOf[IModel]
  inline def removeDeadEnds(modelContext: IModel, pointMatchingDistance: js.Any): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any], pointMatchingDistance.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def removeDeadEnds(modelContext: IModel, pointMatchingDistance: js.Any, keep: IWalkPathBooleanCallback): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any], pointMatchingDistance.asInstanceOf[js.Any], keep.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def removeDeadEnds(modelContext: IModel, pointMatchingDistance: Unit, keep: IWalkPathBooleanCallback): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any], pointMatchingDistance.asInstanceOf[js.Any], keep.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Rotate a model.
    *
    * @param modelToRotate The model to rotate.
    * @param angleInDegrees The amount of rotation, in degrees.
    * @param rotationOrigin The center point of rotation.
    * @returns The original model (for cascading).
    */
  inline def rotate(modelToRotate: IModel, angleInDegrees: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(modelToRotate.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def rotate(modelToRotate: IModel, angleInDegrees: Double, rotationOrigin: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(modelToRotate.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any], rotationOrigin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Scale a model.
    *
    * @param modelToScale The model to scale.
    * @param scaleValue The amount of scaling.
    * @param scaleOrigin Optional boolean to scale the origin point. Typically false for the root model.
    * @returns The original model (for cascading).
    */
  inline def scale(modelToScale: IModel, scaleValue: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(modelToScale.asInstanceOf[js.Any], scaleValue.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def scale(modelToScale: IModel, scaleValue: Double, scaleOrigin: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(modelToScale.asInstanceOf[js.Any], scaleValue.asInstanceOf[js.Any], scaleOrigin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Simplify a model's paths by reducing redundancy: combine multiple overlapping paths into a single path. The model must be originated.
    *
    * @param modelContext The originated model to search for similar paths.
    * @param options Optional options object.
    * @returns The simplified model (for cascading).
    */
  inline def simplify(modelToSimplify: IModel): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(modelToSimplify.asInstanceOf[js.Any]).asInstanceOf[IModel]
  inline def simplify(modelToSimplify: IModel, options: ISimplifyOptions): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(modelToSimplify.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Recursively walk through all paths for a given model.
    *
    * @param modelContext The model to walk.
    * @param pathCallback Callback for each path.
    * @param modelCallbackBeforeWalk Callback for each model prior to recursion, which can cancel the recursion if it returns false.
    * @param modelCallbackAfterWalk Callback for each model after recursion.
    */
  inline def walk(modelContext: IModel, options: IWalkOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(modelContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Recursively walk through all paths for a given model.
    *
    * @param modelContext The model to walk.
    * @param callback Callback for each path.
    */
  inline def walkPaths(modelContext: IModel, callback: IModelPathCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPaths")(modelContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Move a model so its bounding box begins at [0, 0].
    *
    * @param modelToZero The model to zero.
    */
  inline def zero(modelToZero: IModel): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(modelToZero.asInstanceOf[js.Any]).asInstanceOf[IModel]
}
