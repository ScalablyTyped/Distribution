package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdScheduleParam extends js.Object {
  var adbreaks: js.Array[js.Object]
  var client: java.lang.String
  var tag: java.lang.String
}

object AdScheduleParam {
  @scala.inline
  def apply(adbreaks: js.Array[js.Object], client: java.lang.String, tag: java.lang.String): AdScheduleParam = {
    val __obj = js.Dynamic.literal(adbreaks = adbreaks, client = client, tag = tag)
  
    __obj.asInstanceOf[AdScheduleParam]
  }
}

