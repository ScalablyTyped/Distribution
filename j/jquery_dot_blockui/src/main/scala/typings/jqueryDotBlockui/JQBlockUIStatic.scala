package typings.jqueryDotBlockui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQBlockUIStatic extends js.Object {
  /** default options */
  var defaults: js.UndefOr[JQBlockUIOptions] = js.native
  /** block user activity for the page */
  def apply(): Unit = js.native
  /**
    * block user activity for the page
    * @param options options 
    */
  def apply(option: JQBlockUIOptions): Unit = js.native
}

