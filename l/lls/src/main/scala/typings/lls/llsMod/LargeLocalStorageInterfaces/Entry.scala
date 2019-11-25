package typings.lls.llsMod.LargeLocalStorageInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var attachKey: String
  var data: js.Any
  var docKey: String
  var url: String
}

object Entry {
  @scala.inline
  def apply(attachKey: String, data: js.Any, docKey: String, url: String): Entry = {
    val __obj = js.Dynamic.literal(attachKey = attachKey.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], docKey = docKey.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Entry]
  }
}

