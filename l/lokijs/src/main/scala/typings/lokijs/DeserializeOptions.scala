package typings.lokijs

import typings.lokijs.lokijsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.lokijs.anon.Delimited
  - typings.lokijs.anon.Delimiter
*/
trait DeserializeOptions extends js.Object

object DeserializeOptions {
  @scala.inline
  def Delimited(delimited: `false`): DeserializeOptions = {
    val __obj = js.Dynamic.literal(delimited = delimited.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
  @scala.inline
  def Delimiter(delimiter: String): DeserializeOptions = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
}

