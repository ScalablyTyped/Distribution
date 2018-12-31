package typings
package jqueryDotColorboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("colorbox")
  var colorbox_Original: ColorboxStatic = js.native
  /**
    * This method allows you to call Colorbox without having to assign it to an element.
    */
  def colorbox(settings: ColorboxSettings): js.Any = js.native
}

