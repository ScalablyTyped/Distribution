package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileData extends js.Object {
  var element: stdLib.HTMLInputElement
  var name: java.lang.String
}

object IFileData {
  @scala.inline
  def apply(element: stdLib.HTMLInputElement, name: java.lang.String): IFileData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IFileData]
  }
}

