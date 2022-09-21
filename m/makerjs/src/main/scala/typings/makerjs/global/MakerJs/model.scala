package typings.makerjs.global.MakerJs

import typings.makerjs.MakerJs.IChain
import typings.makerjs.MakerJs.IChainCallback
import typings.makerjs.MakerJs.IChainsMap
import typings.makerjs.MakerJs.ICombineOptions
import typings.makerjs.MakerJs.IFindChainsOptions
import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IModelPathCallback
import typings.makerjs.MakerJs.IPath
import typings.makerjs.MakerJs.IPoint
import typings.makerjs.MakerJs.ISimplifyOptions
import typings.makerjs.MakerJs.IWalkOptions
import typings.makerjs.MakerJs.IWalkPath
import typings.makerjs.MakerJs.IWalkPathBooleanCallback
import typings.makerjs.MakerJs.measure.Atlas
import typings.makerjs.anon.ICaptionlayerstringundefi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object model {
  
  @JSGlobal("MakerJs.model")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add a Caption object to a model.
    * @param modelContext The model to add to.
    * @param text Text to add.
    * @param leftAnchorPoint Optional Point on left side middle of text.
    * @param rightAnchorPoint Optional Point on right side middle of text.
    * @returns The original model (for cascading).
    */
  inline def addCaption(modelContext: IModel, text: String): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("addCaption")(modelContext.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def addCaption(modelContext: IModel, text: String, leftAnchorPoint: Unit, rightAnchorPoint: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("addCaption")(modelContext.asInstanceOf[js.Any], text.asInstanceOf[js.Any], leftAnchorPoint.asInstanceOf[js.Any], rightAnchorPoint.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def addCaption(modelContext: IModel, text: String, leftAnchorPoint: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("addCaption")(modelContext.asInstanceOf[js.Any], text.asInstanceOf[js.Any], leftAnchorPoint.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def addCaption(modelContext: IModel, text: String, leftAnchorPoint: IPoint, rightAnchorPoint: IPoint): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("addCaption")(modelContext.asInstanceOf[js.Any], text.asInstanceOf[js.Any], leftAnchorPoint.asInstanceOf[js.Any], rightAnchorPoint.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Add a model as a child. This is basically equivalent to:
    * ```
    * parentModel.models[childModelId] = childModel;
    * ```
    * with additional checks to make it safe for cascading.
    *
    * @param parentModel The model to add to.
    * @param childModel The model to add.
    * @param childModelId The id of the child model.
    * @param overWrite Optional flag to overwrite any model referenced by childModelId. Default is false, which will create an id similar to childModelId.
    * @returns The original model (for cascading).
    */
  inline def addModel(parentModel: IModel, childModel: IModel, childModelId: String): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("addModel")(parentModel.asInstanceOf[js.Any], childModel.asInstanceOf[js.Any], childModelId.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def addModel(parentModel: IModel, childModel: IModel, childModelId: String, overWrite: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("addModel")(parentModel.asInstanceOf[js.Any], childModel.asInstanceOf[js.Any], childModelId.asInstanceOf[js.Any], overWrite.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Add a path as a child. This is basically equivalent to:
    * ```
    * parentModel.paths[childPathId] = childPath;
    * ```
    * with additional checks to make it safe for cascading.
    *
    * @param modelContext The model to add to.
    * @param pathContext The path to add.
    * @param pathId The id of the path.
    * @param overWrite Optional flag to overwrite any path referenced by pathId. Default is false, which will create an id similar to pathId.
    * @returns The original model (for cascading).
    */
  inline def addPath(modelContext: IModel, pathContext: IPath, pathId: String): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("addPath")(modelContext.asInstanceOf[js.Any], pathContext.asInstanceOf[js.Any], pathId.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def addPath(modelContext: IModel, pathContext: IPath, pathId: String, overWrite: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("addPath")(modelContext.asInstanceOf[js.Any], pathContext.asInstanceOf[js.Any], pathId.asInstanceOf[js.Any], overWrite.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Add a model as a child of another model. This is basically equivalent to:
    * ```
    * parentModel.models[childModelId] = childModel;
    * ```
    * with additional checks to make it safe for cascading.
    *
    * @param childModel The model to add.
    * @param parentModel The model to add to.
    * @param childModelId The id of the child model.
    * @param overWrite Optional flag to overwrite any model referenced by childModelId. Default is false, which will create an id similar to childModelId.
    * @returns The original model (for cascading).
    */
  inline def addTo(childModel: IModel, parentModel: IModel, childModelId: String): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("addTo")(childModel.asInstanceOf[js.Any], parentModel.asInstanceOf[js.Any], childModelId.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def addTo(childModel: IModel, parentModel: IModel, childModelId: String, overWrite: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("addTo")(childModel.asInstanceOf[js.Any], parentModel.asInstanceOf[js.Any], childModelId.asInstanceOf[js.Any], overWrite.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * DEPRECATED
    * Break a model's paths everywhere they intersect with another path.
    *
    * @param modelToBreak The model containing paths to be broken.
    * @param modelToIntersect Optional model containing paths to look for intersection, or else the modelToBreak will be used.
    * @returns The original model (for cascading).
    */
  inline def breakPathsAtIntersections(modelToBreak: IModel): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("breakPathsAtIntersections")(modelToBreak.asInstanceOf[js.Any]).asInstanceOf[IModel]
  inline def breakPathsAtIntersections(modelToBreak: IModel, modelToIntersect: IModel): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("breakPathsAtIntersections")(modelToBreak.asInstanceOf[js.Any], modelToIntersect.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Center a model at [0, 0].
    *
    * @param modelToCenter The model to center.
    * @param centerX Boolean to center on the x axis. Default is true.
    * @param centerY Boolean to center on the y axis. Default is true.
    * @returns The original model (for cascading).
    */
  inline def center(modelToCenter: IModel): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(modelToCenter.asInstanceOf[js.Any]).asInstanceOf[IModel]
  inline def center(modelToCenter: IModel, centerX: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("center")(modelToCenter.asInstanceOf[js.Any], centerX.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def center(modelToCenter: IModel, centerX: Boolean, centerY: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("center")(modelToCenter.asInstanceOf[js.Any], centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def center(modelToCenter: IModel, centerX: Unit, centerY: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("center")(modelToCenter.asInstanceOf[js.Any], centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Clone a model. Alias of makerjs.cloneObject(modelToClone)
    *
    * @param modelToClone The model to clone.
    * @returns A clone of the model you passed.
    */
  inline def clone_(modelToClone: IModel): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(modelToClone.asInstanceOf[js.Any]).asInstanceOf[IModel]
  
  /**
    * Combine 2 models. Each model will be modified accordingly.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    * @param includeAInsideB Flag to include paths from modelA which are inside of modelB.
    * @param includeAOutsideB Flag to include paths from modelA which are outside of modelB.
    * @param includeBInsideA Flag to include paths from modelB which are inside of modelA.
    * @param includeBOutsideA Flag to include paths from modelB which are outside of modelA.
    * @param options Optional ICombineOptions object.
    * @returns A new model containing both of the input models as "a" and "b".
    */
  inline def combine(modelA: IModel, modelB: IModel): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(modelA: IModel, modelB: IModel, includeAInsideB: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(modelA: IModel, modelB: IModel, includeAInsideB: Boolean, includeAOutsideB: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(modelA: IModel, modelB: IModel, includeAInsideB: Unit, includeAOutsideB: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def combine(
    modelA: IModel,
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any], includeAInsideB.asInstanceOf[js.Any], includeAOutsideB.asInstanceOf[js.Any], includeBInsideA.asInstanceOf[js.Any], includeBOutsideA.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Combine 2 models, resulting in a intersection. Each model will be modified accordingly.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    * @returns A new model containing both of the input models as "a" and "b".
    */
  inline def combineIntersection(modelA: IModel, modelB: IModel): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combineIntersection")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Combine 2 models, resulting in a subtraction of B from A. Each model will be modified accordingly.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    * @returns A new model containing both of the input models as "a" and "b".
    */
  inline def combineSubtraction(modelA: IModel, modelB: IModel): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combineSubtraction")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Combine 2 models, resulting in a union. Each model will be modified accordingly.
    *
    * @param modelA First model to combine.
    * @param modelB Second model to combine.
    * @returns A new model containing both of the input models as "a" and "b".
    */
  inline def combineUnion(modelA: IModel, modelB: IModel): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("combineUnion")(modelA.asInstanceOf[js.Any], modelB.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
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
    * Create a distorted copy of a model - scale x and y individually.
    *
    * @param modelToDistort The model to distort.
    * @param scaleX The amount of x scaling.
    * @param scaleY The amount of y scaling.
    * @param scaleOrigin Optional boolean to scale the origin point. Typically false for the root model.
    * @param bezierAccuracy Optional accuracy of Bezier curves.
    * @returns New model (for cascading).
    */
  inline def distort(modelToDistort: IModel, scaleX: Double, scaleY: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("distort")(modelToDistort.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def distort(modelToDistort: IModel, scaleX: Double, scaleY: Double, scaleOrigin: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("distort")(modelToDistort.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], scaleOrigin.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def distort(
    modelToDistort: IModel,
    scaleX: Double,
    scaleY: Double,
    scaleOrigin: Boolean,
    bezierAccuracy: Double
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("distort")(modelToDistort.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], scaleOrigin.asInstanceOf[js.Any], bezierAccuracy.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def distort(modelToDistort: IModel, scaleX: Double, scaleY: Double, scaleOrigin: Unit, bezierAccuracy: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("distort")(modelToDistort.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], scaleOrigin.asInstanceOf[js.Any], bezierAccuracy.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Expand all paths in a model, then combine the resulting expansions.
    *
    * @param modelToExpand Model to expand.
    * @param distance Distance to expand.
    * @param joints Number of points at a joint between paths. Use 0 for round joints, 1 for pointed joints, 2 for beveled joints.
    * @param combineOptions Optional object containing combine options.
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
    * @returns An array of chains, or a map (keyed by layer id) of arrays of chains - if options.byLayers is true.
    */
  inline def findChains(modelContext: IModel): js.Array[IChain] | IChainsMap = ^.asInstanceOf[js.Dynamic].applyDynamic("findChains")(modelContext.asInstanceOf[js.Any]).asInstanceOf[js.Array[IChain] | IChainsMap]
  /**
    * Find paths that have common endpoints and form chains.
    *
    * @param modelContext The model to search for chains.
    * @param callback Callback function when chains are found.
    * @param options Optional options object.
    * @returns An array of chains, or a map (keyed by layer id) of arrays of chains - if options.byLayers is true.
    */
  inline def findChains(modelContext: IModel, callback: IChainCallback): js.Array[IChain] | IChainsMap = (^.asInstanceOf[js.Dynamic].applyDynamic("findChains")(modelContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[IChain] | IChainsMap]
  inline def findChains(modelContext: IModel, callback: IChainCallback, options: IFindChainsOptions): js.Array[IChain] | IChainsMap = (^.asInstanceOf[js.Dynamic].applyDynamic("findChains")(modelContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[IChain] | IChainsMap]
  inline def findChains(modelContext: IModel, options: IFindChainsOptions): js.Array[IChain] | IChainsMap = (^.asInstanceOf[js.Dynamic].applyDynamic("findChains")(modelContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[IChain] | IChainsMap]
  
  /**
    * Find a single chain within a model, across all layers. Shorthand of findChains; useful when you know there is only one chain to find in your model.
    *
    * @param modelContext The model to search for a chain.
    * @returns A chain object or null if chains were not found.
    */
  inline def findSingleChain(modelContext: IModel): IChain = ^.asInstanceOf[js.Dynamic].applyDynamic("findSingleChain")(modelContext.asInstanceOf[js.Any]).asInstanceOf[IChain]
  
  /**
    * Gets all Caption objects, in absolute position, in this model and its children.
    * @param modelContext The model to search for Caption objects.
    * @returns Array of Caption objects.
    */
  inline def getAllCaptionsOffset(modelContext: IModel): js.Array[ICaptionlayerstringundefi] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCaptionsOffset")(modelContext.asInstanceOf[js.Any]).asInstanceOf[js.Array[ICaptionlayerstringundefi]]
  
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
    * DEPRECATED - use measure.isPointInsideModel instead.
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
    * Set the layer of a model. This is equivalent to:
    * ```
    * modelContext.layer = layer;
    * ```
    *
    * @param modelContext The model to set the layer.
    * @param layer The layer name.
    * @returns The original model (for cascading).
    */
  inline def layer(modelContext: IModel, layer: String): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("layer")(modelContext.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
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
    * @returns The original model (for cascading).
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
    * @param options Options to send to combine() function.
    * @returns Model which surrounds the paths outside of the original model.
    */
  inline def outline(modelToOutline: IModel, distance: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def outline(modelToOutline: IModel, distance: Double, joints: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def outline(modelToOutline: IModel, distance: Double, joints: Double, inside: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any], inside.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def outline(
    modelToOutline: IModel,
    distance: Double,
    joints: Double,
    inside: Boolean,
    options: ICombineOptions
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any], inside.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def outline(modelToOutline: IModel, distance: Double, joints: Double, inside: Unit, options: ICombineOptions): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any], inside.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def outline(modelToOutline: IModel, distance: Double, joints: Unit, inside: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any], inside.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def outline(modelToOutline: IModel, distance: Double, joints: Unit, inside: Boolean, options: ICombineOptions): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any], inside.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def outline(modelToOutline: IModel, distance: Double, joints: Unit, inside: Unit, options: ICombineOptions): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("outline")(modelToOutline.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], joints.asInstanceOf[js.Any], inside.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
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
    * @param pointMatchingDistance Optional max distance to consider two points as the same.
    * @param keep Optional callback function (which should return a boolean) to decide if a dead end path should be kept instead.
    * @param trackDeleted Optional callback function which will log discarded paths and the reason they were discarded.
    * @returns The input model (for cascading).
    */
  inline def removeDeadEnds(modelContext: IModel): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any]).asInstanceOf[IModel]
  inline def removeDeadEnds(modelContext: IModel, pointMatchingDistance: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any], pointMatchingDistance.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def removeDeadEnds(
    modelContext: IModel,
    pointMatchingDistance: Double,
    keep: Unit,
    trackDeleted: js.Function2[/* wp */ IWalkPath, /* reason */ String, Unit]
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any], pointMatchingDistance.asInstanceOf[js.Any], keep.asInstanceOf[js.Any], trackDeleted.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def removeDeadEnds(modelContext: IModel, pointMatchingDistance: Double, keep: IWalkPathBooleanCallback): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any], pointMatchingDistance.asInstanceOf[js.Any], keep.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def removeDeadEnds(
    modelContext: IModel,
    pointMatchingDistance: Double,
    keep: IWalkPathBooleanCallback,
    trackDeleted: js.Function2[/* wp */ IWalkPath, /* reason */ String, Unit]
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any], pointMatchingDistance.asInstanceOf[js.Any], keep.asInstanceOf[js.Any], trackDeleted.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def removeDeadEnds(
    modelContext: IModel,
    pointMatchingDistance: Unit,
    keep: Unit,
    trackDeleted: js.Function2[/* wp */ IWalkPath, /* reason */ String, Unit]
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any], pointMatchingDistance.asInstanceOf[js.Any], keep.asInstanceOf[js.Any], trackDeleted.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def removeDeadEnds(modelContext: IModel, pointMatchingDistance: Unit, keep: IWalkPathBooleanCallback): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any], pointMatchingDistance.asInstanceOf[js.Any], keep.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def removeDeadEnds(
    modelContext: IModel,
    pointMatchingDistance: Unit,
    keep: IWalkPathBooleanCallback,
    trackDeleted: js.Function2[/* wp */ IWalkPath, /* reason */ String, Unit]
  ): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDeadEnds")(modelContext.asInstanceOf[js.Any], pointMatchingDistance.asInstanceOf[js.Any], keep.asInstanceOf[js.Any], trackDeleted.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
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
    * Recursively walk through all child models and paths for a given model.
    *
    * @param modelContext The model to walk.
    * @param options Object containing callbacks.
    * @returns The original model (for cascading).
    */
  inline def walk(modelContext: IModel, options: IWalkOptions): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(modelContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * DEPRECATED - use model.walk instead.
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
    * @param zeroX Boolean to zero on the x axis. Default is true.
    * @param zeroY Boolean to zero on the y axis. Default is true.
    * @returns The original model (for cascading).
    */
  inline def zero(modelToZero: IModel): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(modelToZero.asInstanceOf[js.Any]).asInstanceOf[IModel]
  inline def zero(modelToZero: IModel, zeroX: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("zero")(modelToZero.asInstanceOf[js.Any], zeroX.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def zero(modelToZero: IModel, zeroX: Boolean, zeroY: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("zero")(modelToZero.asInstanceOf[js.Any], zeroX.asInstanceOf[js.Any], zeroY.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def zero(modelToZero: IModel, zeroX: Unit, zeroY: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("zero")(modelToZero.asInstanceOf[js.Any], zeroX.asInstanceOf[js.Any], zeroY.asInstanceOf[js.Any])).asInstanceOf[IModel]
}
