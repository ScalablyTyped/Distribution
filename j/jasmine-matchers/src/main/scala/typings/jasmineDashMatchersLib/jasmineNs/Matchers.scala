package typings
package jasmineDashMatchersLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  //toBe
  def toBeArray(): scala.Boolean = js.native
  def toBeCloseToOneOf(
    values: js.Array[_],
    isCloseToFunction: js.Function2[/* actual */ scala.Double, /* expected */ scala.Double, scala.Boolean]
  ): scala.Boolean = js.native
  def toBeInRange(min: scala.Double, max: scala.Double): scala.Boolean = js.native
  def toBeInstanceOf(Constructor: js.Function): scala.Boolean = js.native
  def toBeNan(): scala.Boolean = js.native
  def toBeNumber(): scala.Boolean = js.native
  def toBeOfType(`type`: java.lang.String): scala.Boolean = js.native
  def toBeOneOf(values: js.Array[_]): scala.Boolean = js.native
  //toContain
  def toContainOnce(value: js.Any): scala.Boolean = js.native
  def toEachEndWith(searchString: java.lang.String): scala.Boolean = js.native
  def toEachStartWith(searchString: java.lang.String): scala.Boolean = js.native
  def toEndWith(value: js.Any): scala.Boolean = js.native
  def toEndWith(values: js.Array[_]): scala.Boolean = js.native
  def toExactlyHaveProperties(names: java.lang.String*): scala.Boolean = js.native
  //toHave
  def toHaveBeenCalledXTimes(count: scala.Double): scala.Boolean = js.native
  def toHaveLength(length: scala.Double): scala.Boolean = js.native
  def toHaveOwnProperties(names: java.lang.String*): scala.Boolean = js.native
  def toHaveOwnPropertiesWithValues(obj: js.Object): scala.Boolean = js.native
  def toHaveProperties(names: java.lang.String*): scala.Boolean = js.native
  def toHavePropertiesWithValues(obj: js.Object): scala.Boolean = js.native
  def toSomeEndWith(searchString: java.lang.String): scala.Boolean = js.native
  def toSomeStartWith(searchString: java.lang.String): scala.Boolean = js.native
  //toStartEndWith
  def toStartWith(value: js.Any): scala.Boolean = js.native
  def toStartWith(value: js.Array[_]): scala.Boolean = js.native
  def toStartWithEither(searchString: js.Any*): scala.Boolean = js.native
  //toThrow
  def toThrowInstanceOf(klass: js.Function): scala.Boolean = js.native
  def toThrowStartsWith(text: java.lang.String): scala.Boolean = js.native
}

