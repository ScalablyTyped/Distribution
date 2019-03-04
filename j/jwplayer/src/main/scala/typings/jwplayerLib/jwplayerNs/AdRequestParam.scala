package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdRequestParam extends js.Object {
  var adposition: jwplayerLib.jwplayerLibStrings.pre | jwplayerLib.jwplayerLibStrings.mid | jwplayerLib.jwplayerLibStrings.post
  var client: jwplayerLib.jwplayerLibStrings.vast | jwplayerLib.jwplayerLibStrings.googima
  var offset: jwplayerLib.jwplayerLibStrings.pre | jwplayerLib.jwplayerLibStrings.mid | jwplayerLib.jwplayerLibStrings.post
  var tag: java.lang.String
}

object AdRequestParam {
  @scala.inline
  def apply(
    adposition: jwplayerLib.jwplayerLibStrings.pre | jwplayerLib.jwplayerLibStrings.mid | jwplayerLib.jwplayerLibStrings.post,
    client: jwplayerLib.jwplayerLibStrings.vast | jwplayerLib.jwplayerLibStrings.googima,
    offset: jwplayerLib.jwplayerLibStrings.pre | jwplayerLib.jwplayerLibStrings.mid | jwplayerLib.jwplayerLibStrings.post,
    tag: java.lang.String
  ): AdRequestParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tag = tag)
  
    __obj.asInstanceOf[AdRequestParam]
  }
}

