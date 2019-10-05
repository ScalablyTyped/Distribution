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
    val __obj = js.Dynamic.literal(attachKey = attachKey, data = data, docKey = docKey, url = url)
  
    __obj.asInstanceOf[Entry]
  }
}

