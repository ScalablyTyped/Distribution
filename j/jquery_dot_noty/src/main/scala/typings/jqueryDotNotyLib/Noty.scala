package typings
package jqueryDotNotyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Noty extends js.Object {
  var closed: scala.Boolean = js.native
  var shown: scala.Boolean = js.native
  def apply(notyOptions: NotyOptions): js.Any = js.native
  def close(): js.Any = js.native
  def setText(text: java.lang.String): js.Any = js.native
  def setTimeout(timeout: scala.Double): js.Any = js.native
  def setType(`type`: java.lang.String): js.Any = js.native
  def show(): js.Any = js.native
}

