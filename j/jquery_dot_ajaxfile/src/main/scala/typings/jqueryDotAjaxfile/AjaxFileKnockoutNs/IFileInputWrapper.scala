package typings.jqueryDotAjaxfile.AjaxFileKnockoutNs

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInputWrapper extends js.Object {
  def fileSelected(): Boolean
  def getElement(): HTMLInputElement
}

object IFileInputWrapper {
  @scala.inline
  def apply(fileSelected: () => Boolean, getElement: () => HTMLInputElement): IFileInputWrapper = {
    val __obj = js.Dynamic.literal(fileSelected = js.Any.fromFunction0(fileSelected), getElement = js.Any.fromFunction0(getElement))
  
    __obj.asInstanceOf[IFileInputWrapper]
  }
}

