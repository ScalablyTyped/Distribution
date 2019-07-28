package typings.html5DashToDashPdf.html5DashToDashPdfMod

import typings.html5DashToDashPdf.html5DashToDashPdfStrings.JS
import typings.html5DashToDashPdf.html5DashToDashPdfStrings.css
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDef extends js.Object {
  /**
    * File path
    */
  var filePath: String
  /**
    * File type
    */
  var `type`: css | JS
}

object FileDef {
  @scala.inline
  def apply(filePath: String, `type`: css | JS): FileDef = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDef]
  }
}

