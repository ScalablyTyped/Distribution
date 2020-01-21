package typings.html5ToPdf.mod

import typings.html5ToPdf.html5ToPdfStrings.css
import typings.html5ToPdf.html5ToPdfStrings.js_
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
  var `type`: css | js_
}

object FileDef {
  @scala.inline
  def apply(filePath: String, `type`: css | js_): FileDef = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDef]
  }
}

