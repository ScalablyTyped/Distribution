package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdTimeParam extends js.Object {
  var client: jwplayerLib.jwplayerLibStrings.vast | jwplayerLib.jwplayerLibStrings.googima
  var creativetype: java.lang.String
  var duration: scala.Double
  var position: scala.Double
  var sequence: scala.Double
  var tag: java.lang.String
}

object AdTimeParam {
  @scala.inline
  def apply(
    client: jwplayerLib.jwplayerLibStrings.vast | jwplayerLib.jwplayerLibStrings.googima,
    creativetype: java.lang.String,
    duration: scala.Double,
    position: scala.Double,
    sequence: scala.Double,
    tag: java.lang.String
  ): AdTimeParam = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], creativetype = creativetype, duration = duration, position = position, sequence = sequence, tag = tag)
  
    __obj.asInstanceOf[AdTimeParam]
  }
}

