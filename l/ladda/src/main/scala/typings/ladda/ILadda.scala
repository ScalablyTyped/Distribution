package typings.ladda

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILadda extends js.Object {
  def bind(cssSelector: String): Unit = js.native
  def bind(cssSelector: String, options: ILaddaOptions): Unit = js.native
  def bind(target: HTMLElement): Unit = js.native
  def bind(target: HTMLElement, options: ILaddaOptions): Unit = js.native
  def create(button: Element): ILaddaButton = js.native
  def stopAll(): Unit = js.native
}

