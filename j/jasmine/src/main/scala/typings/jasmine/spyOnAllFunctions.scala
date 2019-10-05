package typings.jasmine

import typings.jasmine.jasmine.SpyObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spyOnAllFunctions")
@js.native
object spyOnAllFunctions extends js.Object {
  /**
    * Installs spies on all writable and configurable properties of an object.
    * @param object The object upon which to install the `Spy`s.
    */
  def apply[T](`object`: T): SpyObj[T] = js.native
}

