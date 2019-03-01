package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdProgressParam extends js.Object {
  var client: jwplayerLib.jwplayerLibStrings.vast | jwplayerLib.jwplayerLibStrings.googima
  var creativetype: java.lang.String
  var tag: java.lang.String
}

object AdProgressParam {
  @scala.inline
  def apply(
    client: jwplayerLib.jwplayerLibStrings.vast | jwplayerLib.jwplayerLibStrings.googima,
    creativetype: java.lang.String,
    tag: java.lang.String
  ): AdProgressParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.updateDynamic("creativetype")(creativetype)
    __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[AdProgressParam]
  }
}

