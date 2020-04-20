package typings.jasmine

import typings.jasmine.jasmine.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spyOn")
@js.native
object spyOn extends js.Object {
  /**
    * Install a spy onto an existing object.
    * @param object The object upon which to install the `Spy`.
    * @param method The name of the method to replace with a `Spy`.
    */
  def apply[T](`object`: T, method: /* keyof T */ String): Spy = js.native
}

