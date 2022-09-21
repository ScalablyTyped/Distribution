package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICascadeModel
  extends StObject
     with ICascade {
  
  /**
    * Add a Caption object to a model.
    *
    * @param text Text to add.
    * @param leftAnchorPoint Optional Point on left side middle of text.
    * @param rightAnchorPoint Optional Point on right side middle of text.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def addCaption(text: String): ICascadeModel = js.native
  def addCaption(text: String, leftAnchorPoint: Unit, rightAnchorPoint: IPoint): ICascadeModel = js.native
  def addCaption(text: String, leftAnchorPoint: IPoint): ICascadeModel = js.native
  def addCaption(text: String, leftAnchorPoint: IPoint, rightAnchorPoint: IPoint): ICascadeModel = js.native
  
  /**
    * Add a model as a child. This is basically equivalent to:
  ```
  parentModel.models[childModelId] = childModel;
  ```
  with additional checks to make it safe for cascading.
    *
    * @param childModel The model to add.
    * @param childModelId The id of the child model.
    * @param overWrite (default false) Optional flag to overwrite any model referenced by childModelId. Default is false, which will create an id similar to childModelId.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def addModel(childModel: IModel, childModelId: String): ICascadeModel = js.native
  def addModel(childModel: IModel, childModelId: String, overWrite: Boolean): ICascadeModel = js.native
  
  /**
    * Add a path as a child. This is basically equivalent to:
  ```
  parentModel.paths[childPathId] = childPath;
  ```
  with additional checks to make it safe for cascading.
    *
    * @param pathContext The path to add.
    * @param pathId The id of the path.
    * @param overWrite (default false) Optional flag to overwrite any path referenced by pathId. Default is false, which will create an id similar to pathId.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def addPath(pathContext: IPath, pathId: String): ICascadeModel = js.native
  def addPath(pathContext: IPath, pathId: String, overWrite: Boolean): ICascadeModel = js.native
  
  /**
    * Add a model as a child of another model. This is basically equivalent to:
  ```
  parentModel.models[childModelId] = childModel;
  ```
  with additional checks to make it safe for cascading.
    *
    * @param parentModel The model to add to.
    * @param childModelId The id of the child model.
    * @param overWrite (default false) Optional flag to overwrite any model referenced by childModelId. Default is false, which will create an id similar to childModelId.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def addTo(parentModel: IModel, childModelId: String): ICascadeModel = js.native
  def addTo(parentModel: IModel, childModelId: String, overWrite: Boolean): ICascadeModel = js.native
  
  /**
    * DEPRECATED
  Break a model's paths everywhere they intersect with another path.
    *
    * @param modelToIntersect Optional model containing paths to look for intersection, or else the modelToBreak will be used.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def breakPathsAtIntersections(): ICascadeModel = js.native
  def breakPathsAtIntersections(modelToIntersect: IModel): ICascadeModel = js.native
  
  /**
    * Center a model at [0, 0].
    *
    * @param centerX (default true) Boolean to center on the x axis. Default is true.
    * @param centerY (default true) Boolean to center on the y axis. Default is true.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def center(): ICascadeModel = js.native
  def center(centerX: Boolean): ICascadeModel = js.native
  def center(centerX: Boolean, centerY: Boolean): ICascadeModel = js.native
  def center(centerX: Unit, centerY: Boolean): ICascadeModel = js.native
  
  /**
    * Combine 2 models. Each model will be modified accordingly.
    *
    * @param modelB Second model to combine.
    * @param includeAInsideB (default false) Flag to include paths from modelA which are inside of modelB.
    * @param includeAOutsideB (default true) Flag to include paths from modelA which are outside of modelB.
    * @param includeBInsideA (default false) Flag to include paths from modelB which are inside of modelA.
    * @param includeBOutsideA (default true) Flag to include paths from modelB which are outside of modelA.
    * @param options Optional ICombineOptions object.
    * @returns this cascade container, this.$result will be A new model containing both of the input models as "a" and "b".
    */
  def combine(modelB: IModel): ICascadeModel = js.native
  def combine(modelB: IModel, includeAInsideB: Boolean): ICascadeModel = js.native
  def combine(modelB: IModel, includeAInsideB: Boolean, includeAOutsideB: Boolean): ICascadeModel = js.native
  def combine(modelB: IModel, includeAInsideB: Boolean, includeAOutsideB: Boolean, includeBInsideA: Boolean): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(modelB: IModel, includeAInsideB: Boolean, includeAOutsideB: Unit, includeBInsideA: Boolean): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Boolean,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(modelB: IModel, includeAInsideB: Unit, includeAOutsideB: Boolean): ICascadeModel = js.native
  def combine(modelB: IModel, includeAInsideB: Unit, includeAOutsideB: Boolean, includeBInsideA: Boolean): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Boolean,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(modelB: IModel, includeAInsideB: Unit, includeAOutsideB: Unit, includeBInsideA: Boolean): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Boolean,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Boolean,
    options: ICombineOptions
  ): ICascadeModel = js.native
  def combine(
    modelB: IModel,
    includeAInsideB: Unit,
    includeAOutsideB: Unit,
    includeBInsideA: Unit,
    includeBOutsideA: Unit,
    options: ICombineOptions
  ): ICascadeModel = js.native
  
  /**
    * Combine 2 models, resulting in a intersection. Each model will be modified accordingly.
    *
    * @param modelB Second model to combine.
    * @returns this cascade container, this.$result will be A new model containing both of the input models as "a" and "b".
    */
  def combineIntersection(modelB: IModel): ICascadeModel = js.native
  
  /**
    * Combine 2 models, resulting in a subtraction of B from A. Each model will be modified accordingly.
    *
    * @param modelB Second model to combine.
    * @returns this cascade container, this.$result will be A new model containing both of the input models as "a" and "b".
    */
  def combineSubtraction(modelB: IModel): ICascadeModel = js.native
  
  /**
    * Combine 2 models, resulting in a union. Each model will be modified accordingly.
    *
    * @param modelB Second model to combine.
    * @returns this cascade container, this.$result will be A new model containing both of the input models as "a" and "b".
    */
  def combineUnion(modelB: IModel): ICascadeModel = js.native
  
  /**
    * Convert a model to match a different unit system.
    *
    * @param destUnitType The unit system.
    * @returns this cascade container, this.$result will be The scaled model (for cascading).
    */
  def convertUnits(destUnitType: String): ICascadeModel = js.native
  
  /**
    * Create a distorted copy of a model - scale x and y individually.
    *
    * @param scaleX The amount of x scaling.
    * @param scaleY The amount of y scaling.
    * @param scaleOrigin (default false) Optional boolean to scale the origin point. Typically false for the root model.
    * @param bezierAccuracy Optional accuracy of Bezier curves.
    * @returns this cascade container, this.$result will be New model (for cascading).
    */
  def distort(scaleX: Double, scaleY: Double): ICascadeModel = js.native
  def distort(scaleX: Double, scaleY: Double, scaleOrigin: Boolean): ICascadeModel = js.native
  def distort(scaleX: Double, scaleY: Double, scaleOrigin: Boolean, bezierAccuracy: Double): ICascadeModel = js.native
  def distort(scaleX: Double, scaleY: Double, scaleOrigin: Unit, bezierAccuracy: Double): ICascadeModel = js.native
  
  /**
    * Expand all paths in a model, then combine the resulting expansions.
    *
    * @param distance Distance to expand.
    * @param joints (default 0) Number of points at a joint between paths. Use 0 for round joints, 1 for pointed joints, 2 for beveled joints.
    * @param combineOptions (default {}) Optional object containing combine options.
    * @returns this cascade container, this.$result will be Model which surrounds the paths of the original model.
    */
  def expandPaths(distance: Double): ICascadeModel = js.native
  def expandPaths(distance: Double, joints: Double): ICascadeModel = js.native
  def expandPaths(distance: Double, joints: Double, combineOptions: ICombineOptions): ICascadeModel = js.native
  def expandPaths(distance: Double, joints: Unit, combineOptions: ICombineOptions): ICascadeModel = js.native
  
  /**
    * Set the layer of a model. This is equivalent to:
  ```
  modelContext.layer = layer;
  ```
    *
    * @param layer The layer name.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def layer(layer: String): ICascadeModel = js.native
  
  /**
    * Create a clone of a model, mirrored on either or both x and y axes.
    *
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns this cascade container, this.$result will be Mirrored model.
    */
  def mirror(mirrorX: Boolean, mirrorY: Boolean): ICascadeModel = js.native
  
  /**
    * Move a model to an absolute point. Note that this is also accomplished by directly setting the origin property. This function exists for cascading.
    *
    * @param origin The new position of the model.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def move(origin: IPoint): ICascadeModel = js.native
  
  /**
    * Move a model's origin by a relative amount.
    *
    * @param delta The x & y adjustments as a point object.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def moveRelative(delta: IPoint): ICascadeModel = js.native
  
  /**
    * Moves all of a model's children (models and paths, recursively) in reference to a single common origin. Useful when points between children need to connect to each other.
    *
    * @param origin Optional offset reference point.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def originate(): ICascadeModel = js.native
  def originate(origin: IPoint): ICascadeModel = js.native
  
  /**
    * Outline a model by a specified distance. Useful for accommodating for kerf.
    *
    * @param distance Distance to outline.
    * @param joints (default 0) Number of points at a joint between paths. Use 0 for round joints, 1 for pointed joints, 2 for beveled joints.
    * @param inside (default false) Optional boolean to draw lines inside the model instead of outside.
    * @param options (default {}) Options to send to combine() function.
    * @returns this cascade container, this.$result will be Model which surrounds the paths outside of the original model.
    */
  def outline(distance: Double): ICascadeModel = js.native
  def outline(distance: Double, joints: Double): ICascadeModel = js.native
  def outline(distance: Double, joints: Double, inside: Boolean): ICascadeModel = js.native
  def outline(distance: Double, joints: Double, inside: Boolean, options: ICombineOptions): ICascadeModel = js.native
  def outline(distance: Double, joints: Double, inside: Unit, options: ICombineOptions): ICascadeModel = js.native
  def outline(distance: Double, joints: Unit, inside: Boolean): ICascadeModel = js.native
  def outline(distance: Double, joints: Unit, inside: Boolean, options: ICombineOptions): ICascadeModel = js.native
  def outline(distance: Double, joints: Unit, inside: Unit, options: ICombineOptions): ICascadeModel = js.native
  
  /**
    * Prefix the ids of paths in a model.
    *
    * @param prefix The prefix to prepend on paths ids.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def prefixPathIds(prefix: String): ICascadeModel = js.native
  
  /**
    * Remove paths from a model which have endpoints that do not connect to other paths.
    *
    * @param pointMatchingDistance Optional max distance to consider two points as the same.
    * @param keep Optional callback function (which should return a boolean) to decide if a dead end path should be kept instead.
    * @param trackDeleted Optional callback function which will log discarded paths and the reason they were discarded.
    * @returns this cascade container, this.$result will be The input model (for cascading).
    */
  def removeDeadEnds(): ICascadeModel = js.native
  def removeDeadEnds(pointMatchingDistance: Double): ICascadeModel = js.native
  def removeDeadEnds(pointMatchingDistance: Double, keep: IWalkPathBooleanCallback): ICascadeModel = js.native
  def removeDeadEnds(pointMatchingDistance: Unit, keep: IWalkPathBooleanCallback): ICascadeModel = js.native
  
  /**
    * Rotate a model.
    *
    * @param angleInDegrees The amount of rotation, in degrees.
    * @param rotationOrigin (default [0, 0]) The center point of rotation.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def rotate(angleInDegrees: Double): ICascadeModel = js.native
  def rotate(angleInDegrees: Double, rotationOrigin: IPoint): ICascadeModel = js.native
  
  /**
    * Scale a model.
    *
    * @param scaleValue The amount of scaling.
    * @param scaleOrigin (default false) Optional boolean to scale the origin point. Typically false for the root model.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def scale(scaleValue: Double): ICascadeModel = js.native
  def scale(scaleValue: Double, scaleOrigin: Boolean): ICascadeModel = js.native
  
  /**
    * Simplify a model's paths by reducing redundancy: combine multiple overlapping paths into a single path. The model must be originated.
    *
    * @param options Optional options object.
    * @returns this cascade container, this.$result will be The simplified model (for cascading).
    */
  def simplify(): ICascadeModel = js.native
  def simplify(options: ISimplifyOptions): ICascadeModel = js.native
  
  /**
    * Recursively walk through all child models and paths for a given model.
    *
    * @param options Object containing callbacks.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def walk(options: IWalkOptions): ICascadeModel = js.native
  
  /**
    * Move a model so its bounding box begins at [0, 0].
    *
    * @param zeroX (default true) Boolean to zero on the x axis. Default is true.
    * @param zeroY (default true) Boolean to zero on the y axis. Default is true.
    * @returns this cascade container, this.$result will be The original model (for cascading).
    */
  def zero(): ICascadeModel = js.native
  def zero(zeroX: Boolean): ICascadeModel = js.native
  def zero(zeroX: Boolean, zeroY: Boolean): ICascadeModel = js.native
  def zero(zeroX: Unit, zeroY: Boolean): ICascadeModel = js.native
}
