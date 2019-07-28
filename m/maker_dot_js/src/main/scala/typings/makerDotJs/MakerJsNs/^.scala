package typings.makerDotJs.MakerJsNs

import typings.makerDotJs.Anon_Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs")
@js.native
object ^ extends js.Object {
  /**
    * Current execution environment type, should be one of environmentTypes.
    */
  var environment: String = js.native
  /**
    * Version info
    */
  var version: String = js.native
  /**
    * Clone an object.
    *
    * @param objectToClone The object to clone.
    * @returns A new clone of the original object.
    */
  def cloneObject[T](objectToClone: T): T = js.native
  /**
    * Create a string representation of a route array.
    *
    * @param route Array of strings which are segments of a route.
    * @returns String of the flattened array.
    */
  def createRouteKey(route: js.Array[String]): String = js.native
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
  def extendObject(target: js.Object, other: js.Object): js.Object = js.native
  /**
    * Test to see if an object implements the required properties of a chain.
    *
    * @param item The item to test.
    */
  def isChain(item: js.Any): Boolean = js.native
  /**
    * Test to see if a variable is a function.
    *
    * @param value The object to test.
    * @returns True if the object is a function type.
    */
  def isFunction(value: js.Any): Boolean = js.native
  /**
    * Test to see if an object implements the required properties of a model.
    */
  def isModel(item: js.Any): Boolean = js.native
  /**
    * Test to see if a variable is a number.
    *
    * @param value The object to test.
    * @returns True if the object is a number type.
    */
  def isNumber(value: js.Any): Boolean = js.native
  /**
    * Test to see if a variable is an object.
    *
    * @param value The object to test.
    * @returns True if the object is an object type.
    */
  def isObject(value: js.Any): Boolean = js.native
  /**
    * Test to see if an object implements the required properties of a path.
    *
    * @param item The item to test.
    */
  def isPath(item: js.Any): Boolean = js.native
  /**
    * Test to see if an object implements the required properties of an arc.
    *
    * @param item The item to test.
    */
  def isPathArc(item: js.Any): Boolean = js.native
  /**
    * Test to see if an object implements the required properties of an arc in a bezier curve.
    *
    * @param item The item to test.
    */
  def isPathArcInBezierCurve(item: js.Any): Boolean = js.native
  /**
    * Test to see if an object implements the required properties of a circle.
    *
    * @param item The item to test.
    */
  def isPathCircle(item: js.Any): Boolean = js.native
  /**
    * Test to see if an object implements the required properties of a line.
    *
    * @param item The item to test.
    */
  def isPathLine(item: js.Any): Boolean = js.native
  /**
    * Test to see if an object implements the required properties of a point.
    *
    * @param item The item to test.
    */
  def isPoint(item: js.Any): Boolean = js.native
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
  def round(n: Double): Double = js.native
  def round(n: Double, accuracy: Double): Double = js.native
  /**
    * Travel along a route inside of a model to extract a specific node in its tree.
    *
    * @param modelContext Model to travel within.
    * @param routeKeyOrRoute String of a flattened route, or a string array of route segments.
    * @returns Model or Path object within the modelContext tree.
    */
  def travel(modelContext: IModel, routeKeyOrRoute: String): Anon_Offset = js.native
  def travel(modelContext: IModel, routeKeyOrRoute: js.Array[String]): Anon_Offset = js.native
}

