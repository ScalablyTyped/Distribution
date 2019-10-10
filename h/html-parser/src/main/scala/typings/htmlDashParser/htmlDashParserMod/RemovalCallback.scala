package typings.htmlDashParser.htmlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovalCallback extends js.Object {
  var attributes: Callback | js.Array[String]
  var comments: Callback | Boolean
  var docTypes: Callback | Boolean
  var elements: Callback | js.Array[String]
}

object RemovalCallback {
  @scala.inline
  def apply(
    attributes: Callback | js.Array[String],
    comments: Callback | Boolean,
    docTypes: Callback | Boolean,
    elements: Callback | js.Array[String]
  ): RemovalCallback = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], docTypes = docTypes.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemovalCallback]
  }
}

