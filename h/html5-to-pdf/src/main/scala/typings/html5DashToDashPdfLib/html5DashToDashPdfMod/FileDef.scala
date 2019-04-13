package typings
package html5DashToDashPdfLib.html5DashToDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDef extends js.Object {
  /**
    * File path
    */
  var filePath: java.lang.String
  /**
    * File type
    */
  var `type`: html5DashToDashPdfLib.html5DashToDashPdfLibStrings.css | html5DashToDashPdfLib.html5DashToDashPdfLibStrings.JS
}

object FileDef {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    `type`: html5DashToDashPdfLib.html5DashToDashPdfLibStrings.css | html5DashToDashPdfLib.html5DashToDashPdfLibStrings.JS
  ): FileDef = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDef]
  }
}

