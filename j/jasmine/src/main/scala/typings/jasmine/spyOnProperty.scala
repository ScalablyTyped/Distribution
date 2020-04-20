package typings.jasmine

import typings.jasmine.jasmine.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spyOnProperty")
@js.native
object spyOnProperty extends js.Object {
  /**
    * Install a spy on a property installed with `Object.defineProperty` onto an existing object.
    * @param object The object upon which to install the `Spy`.
    * @param property The name of the property to replace with a `Spy`.
    * @param accessType The access type (get|set) of the property to `Spy` on.
    */
  def apply[T](`object`: T, property: /* keyof T */ String): Spy = js.native
}

