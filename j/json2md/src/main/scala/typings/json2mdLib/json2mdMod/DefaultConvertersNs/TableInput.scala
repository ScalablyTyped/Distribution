package typings
package json2mdLib.json2mdMod.DefaultConvertersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableInput extends js.Object {
  var headers: js.Array[java.lang.String]
  var rows: js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]] | js.Array[js.Array[java.lang.String]]
}

object TableInput {
  @scala.inline
  def apply(
    headers: js.Array[java.lang.String],
    rows: js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]] | js.Array[js.Array[java.lang.String]]
  ): TableInput = {
    val __obj = js.Dynamic.literal(headers = headers, rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableInput]
  }
}

