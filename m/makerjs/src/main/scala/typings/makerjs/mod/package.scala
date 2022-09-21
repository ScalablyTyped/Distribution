package typings.makerjs.mod

import typings.makerjs.MakerJs.ICascadeModel
import typings.makerjs.MakerJs.ICascadePath
import typings.makerjs.MakerJs.ICascadePoint
import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IPoint
import typings.makerjs.anon.Offset
import typings.makerjs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Create a container to cascade a series of functions upon a model. This allows JQuery-style method chaining, e.g.:
  * ```
  * makerjs.$(shape).center().rotate(45).$result
  * ```
  * The output of each function call becomes the first parameter input to the next function call.
  * The returned value of the last function call is available via the `.$result` property.
  *
  * @param modelContext The initial model to execute functions upon.
  * @returns A new cascade container with ICascadeModel methods.
  */
inline def _empty(modelContext: IModel): ICascadeModel = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(modelContext.asInstanceOf[js.Any]).asInstanceOf[ICascadeModel]
/**
  * Create a container to cascade a series of functions upon a point. This allows JQuery-style method chaining, e.g.:
  * ```
  * makerjs.$([1,0]).scale(5).rotate(60).$result
  * ```
  * The output of each function call becomes the first parameter input to the next function call.
  * The returned value of the last function call is available via the `.$result` property.
  *
  * @param pointContext The initial point to execute functions upon.
  * @returns A new cascade container with ICascadePoint methods.
  */
inline def _empty(pointContext: IPoint): ICascadePoint = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(pointContext.asInstanceOf[js.Any]).asInstanceOf[ICascadePoint]

/**
  * Create a container to cascade a series of functions upon a path. This allows JQuery-style method chaining, e.g.:
  * ```
  * makerjs.$(path).center().rotate(90).$result
  * ```
  * The output of each function call becomes the first parameter input to the next function call.
  * The returned value of the last function call is available via the `.$result` property.
  *
  * @param pathContext The initial path to execute functions upon.
  * @returns A new cascade container with ICascadePath methods.
  */
inline def _empty_ICascadePath(pathContext: IModel): ICascadePath = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(pathContext.asInstanceOf[js.Any]).asInstanceOf[ICascadePath]

/**
  * Clone an object.
  *
  * @param objectToClone The object to clone.
  * @returns A new clone of the original object.
  */
inline def cloneObject[T](objectToClone: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(objectToClone.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * Create a string representation of a route array.
  *
  * @param route Array of strings which are segments of a route.
  * @returns String of the flattened array.
  */
inline def createRouteKey(route: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouteKey")(route.asInstanceOf[js.Any]).asInstanceOf[String]

/**
  * Current execution environment type, should be one of environmentTypes.
  */
inline def environment: String = ^.asInstanceOf[js.Dynamic].selectDynamic("environment").asInstanceOf[String]
inline def environment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("environment")(x.asInstanceOf[js.Any])

/**
  * Copy the properties from one object to another object.
  *
  * Example:
  * ```
  * makerjs.extendObject({ abc: 123 }, { xyz: 789 }); //returns { abc: 123, xyz: 789 }
  * ```
  *
  * @param target The object to extend. It will receive the new properties.
  * @param other An object containing properties to merge in.
  * @returns The original object after merging.
  */
inline def extendObject(target: js.Object, other: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObject")(target.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[js.Object]

/**
  * Test to see if an object implements the required properties of a chain.
  *
  * @param item The item to test.
  */
inline def isChain(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChain")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Test to see if a variable is a function.
  *
  * @param value The object to test.
  * @returns True if the object is a function type.
  */
inline def isFunction(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Test to see if an object implements the required properties of a model.
  */
inline def isModel(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModel")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Test to see if a variable is a number.
  *
  * @param value The object to test.
  * @returns True if the object is a number type.
  */
inline def isNumber(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Test to see if a variable is an object.
  *
  * @param value The object to test.
  * @returns True if the object is an object type.
  */
inline def isObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Test to see if an object implements the required properties of a path.
  *
  * @param item The item to test.
  */
inline def isPath(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPath")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Test to see if an object implements the required properties of an arc.
  *
  * @param item The item to test.
  */
inline def isPathArc(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPathArc")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Test to see if an object implements the required properties of an arc in a bezier curve.
  *
  * @param item The item to test.
  */
inline def isPathArcInBezierCurve(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPathArcInBezierCurve")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Test to see if an object implements the required properties of a circle.
  *
  * @param item The item to test.
  */
inline def isPathCircle(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPathCircle")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Test to see if an object implements the required properties of a line.
  *
  * @param item The item to test.
  */
inline def isPathLine(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPathLine")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Test to see if an object implements the required properties of a point.
  *
  * @param item The item to test.
  */
inline def isPoint(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoint")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Numeric rounding
  *
  * Example: round to 3 decimal places
  * ```
  * makerjs.round(3.14159, .001); //returns 3.142
  * ```
  *
  * @param n The number to round off.
  * @param accuracy Optional exemplar of number of decimal places.
  * @returns Rounded number.
  */
inline def round(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def round(n: Double, accuracy: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(n.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[Double]

/**
  * Split a decimal into its whole and fractional parts as strings.
  *
  * Example: get whole and fractional parts of 42.056
  * ```
  * makerjs.splitDecimal(42.056); //returns ["42", "056"]
  * ```
  *
  * @param n The number to split.
  * @returns Array of 2 strings when n contains a decimal point, or an array of one string when n is an integer.
  */
inline def splitDecimal(n: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitDecimal")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

/**
  * Travel along a route inside of a model to extract a specific node in its tree.
  *
  * @param modelContext Model to travel within.
  * @param route String of a flattened route, or a string array of route segments.
  * @returns Model or Path object within the modelContext tree.
  */
inline def travel(modelContext: IModel, route: String): Offset = (^.asInstanceOf[js.Dynamic].applyDynamic("travel")(modelContext.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[Offset]
inline def travel(modelContext: IModel, route: js.Array[String]): Offset = (^.asInstanceOf[js.Dynamic].applyDynamic("travel")(modelContext.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[Offset]

/**
  * Version info
  */
inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
