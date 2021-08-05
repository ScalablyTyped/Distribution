package typings.makerJs.global.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Clone an object.
  *
  * @param objectToClone The object to clone.
  * @returns A new clone of the original object.
  */
inline def cloneObject[T](objectToClone: T): T = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(objectToClone.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * Create a string representation of a route array.
  *
  * @param route Array of strings which are segments of a route.
  * @returns String of the flattened array.
  */
inline def createRouteKey(route: js.Array[java.lang.String]): java.lang.String = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("createRouteKey")(route.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/**
  * Current execution environment type, should be one of environmentTypes.
  */
inline def environment: java.lang.String = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].selectDynamic("environment").asInstanceOf[java.lang.String]
inline def environment_=(x: java.lang.String): scala.Unit = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].updateDynamic("environment")(x.asInstanceOf[js.Any])

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
inline def extendObject(target: js.Object, other: js.Object): js.Object = (typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("extendObject")(target.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[js.Object]

/**
  * Test to see if an object implements the required properties of a chain.
  *
  * @param item The item to test.
  */
inline def isChain(item: js.Any): scala.Boolean = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("isChain")(item.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Test to see if a variable is a function.
  *
  * @param value The object to test.
  * @returns True if the object is a function type.
  */
inline def isFunction(value: js.Any): scala.Boolean = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Test to see if an object implements the required properties of a model.
  */
inline def isModel(item: js.Any): scala.Boolean = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("isModel")(item.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Test to see if a variable is a number.
  *
  * @param value The object to test.
  * @returns True if the object is a number type.
  */
inline def isNumber(value: js.Any): scala.Boolean = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Test to see if a variable is an object.
  *
  * @param value The object to test.
  * @returns True if the object is an object type.
  */
inline def isObject(value: js.Any): scala.Boolean = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Test to see if an object implements the required properties of a path.
  *
  * @param item The item to test.
  */
inline def isPath(item: js.Any): scala.Boolean = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("isPath")(item.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Test to see if an object implements the required properties of an arc.
  *
  * @param item The item to test.
  */
inline def isPathArc(item: js.Any): scala.Boolean = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("isPathArc")(item.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Test to see if an object implements the required properties of an arc in a bezier curve.
  *
  * @param item The item to test.
  */
inline def isPathArcInBezierCurve(item: js.Any): scala.Boolean = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("isPathArcInBezierCurve")(item.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Test to see if an object implements the required properties of a circle.
  *
  * @param item The item to test.
  */
inline def isPathCircle(item: js.Any): scala.Boolean = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("isPathCircle")(item.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Test to see if an object implements the required properties of a line.
  *
  * @param item The item to test.
  */
inline def isPathLine(item: js.Any): scala.Boolean = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("isPathLine")(item.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Test to see if an object implements the required properties of a point.
  *
  * @param item The item to test.
  */
inline def isPoint(item: js.Any): scala.Boolean = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("isPoint")(item.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

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
  */
inline def round(n: scala.Double): scala.Double = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("round")(n.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
inline def round(n: scala.Double, accuracy: scala.Double): scala.Double = (typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("round")(n.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

/**
  * Travel along a route inside of a model to extract a specific node in its tree.
  *
  * @param modelContext Model to travel within.
  * @param routeKeyOrRoute String of a flattened route, or a string array of route segments.
  * @returns Model or Path object within the modelContext tree.
  */
inline def travel(modelContext: typings.makerJs.MakerJs.IModel, routeKeyOrRoute: java.lang.String): typings.makerJs.anon.Offset = (typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("travel")(modelContext.asInstanceOf[js.Any], routeKeyOrRoute.asInstanceOf[js.Any])).asInstanceOf[typings.makerJs.anon.Offset]
inline def travel(modelContext: typings.makerJs.MakerJs.IModel, routeKeyOrRoute: js.Array[java.lang.String]): typings.makerJs.anon.Offset = (typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].applyDynamic("travel")(modelContext.asInstanceOf[js.Any], routeKeyOrRoute.asInstanceOf[js.Any])).asInstanceOf[typings.makerJs.anon.Offset]

/**
  * Version info
  */
inline def version: java.lang.String = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
inline def version_=(x: java.lang.String): scala.Unit = typings.makerJs.global.MakerJs.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
