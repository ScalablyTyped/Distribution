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
  def apply(fileSelected: js.Function0[scala.Boolean], getElement: js.Function0[stdLib.HTMLInputElement]): IFileInputWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSelected")(fileSelected)
    __obj.updateDynamic("getElement")(getElement)
    __obj.asInstanceOf[IFileInputWrapper]
  }
}

