package typings
package jqueryDotAjaxfileLib.AjaxFileKnockoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInputWrapper extends js.Object {
  def fileSelected(): scala.Boolean
  def getElement(): stdLib.HTMLInputElement
}

object IFileInputWrapper {
  @scala.inline
  def apply(fileSelected: () => scala.Boolean, getElement: () => stdLib.HTMLInputElement): IFileInputWrapper = {
    val __obj = js.Dynamic.literal(fileSelected = js.Any.fromFunction0(fileSelected), getElement = js.Any.fromFunction0(getElement))
  
    __obj.asInstanceOf[IFileInputWrapper]
  }
}

