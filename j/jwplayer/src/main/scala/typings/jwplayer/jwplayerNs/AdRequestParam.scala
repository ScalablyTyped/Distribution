package typings.jwplayer.jwplayerNs

import typings.jwplayer.jwplayerStrings.googima
import typings.jwplayer.jwplayerStrings.mid
import typings.jwplayer.jwplayerStrings.post
import typings.jwplayer.jwplayerStrings.pre
import typings.jwplayer.jwplayerStrings.vast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdRequestParam extends js.Object {
  var adposition: pre | mid | post
  var client: vast | googima
  var offset: pre | mid | post
  var tag: String
}

object AdRequestParam {
  @scala.inline
  def apply(adposition: pre | mid | post, client: vast | googima, offset: pre | mid | post, tag: String): AdRequestParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tag = tag)
  
    __obj.asInstanceOf[AdRequestParam]
  }
}

