package typings
package llsLib.llsMod.LargeLocalStorageInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var attachKey: java.lang.String
  var data: js.Any
  var docKey: java.lang.String
  var url: java.lang.String
}

object Entry {
  @scala.inline
  def apply(attachKey: java.lang.String, data: js.Any, docKey: java.lang.String, url: java.lang.String): Entry = {
    val __obj = js.Dynamic.literal(attachKey = attachKey, data = data, docKey = docKey, url = url)
  
    __obj.asInstanceOf[Entry]
  }
}

