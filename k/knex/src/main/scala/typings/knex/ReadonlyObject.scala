package typings.knex

import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Object> */
trait ReadonlyObject extends js.Object {
  val constructor: js.Function
  def hasOwnProperty(v: PropertyKey): Boolean
  def propertyIsEnumerable(v: PropertyKey): Boolean
}

object ReadonlyObject {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ReadonlyObject = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ReadonlyObject]
  }
}

