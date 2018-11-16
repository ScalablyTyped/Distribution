package typings
package laddaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILadda extends js.Object {
  def bind(cssSelector: java.lang.String): scala.Unit = js.native
  def bind(cssSelector: java.lang.String, options: ILaddaOptions): scala.Unit = js.native
  def bind(target: stdLib.HTMLElement): scala.Unit = js.native
  def bind(target: stdLib.HTMLElement, options: ILaddaOptions): scala.Unit = js.native
  def create(button: stdLib.Element): ILaddaButton = js.native
  def stopAll(): scala.Unit = js.native
}

