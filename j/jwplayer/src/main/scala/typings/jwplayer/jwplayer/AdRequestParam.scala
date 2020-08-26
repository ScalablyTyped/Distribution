package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.googima
import typings.jwplayer.jwplayerStrings.mid
import typings.jwplayer.jwplayerStrings.post
import typings.jwplayer.jwplayerStrings.pre
import typings.jwplayer.jwplayerStrings.vast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdRequestParam extends js.Object {
  var adposition: pre | mid | post = js.native
  var client: vast | googima = js.native
  var offset: pre | mid | post = js.native
  var tag: String = js.native
}

object AdRequestParam {
  @scala.inline
  def apply(adposition: pre | mid | post, client: vast | googima, offset: pre | mid | post, tag: String): AdRequestParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdRequestParam]
  }
  @scala.inline
  implicit class AdRequestParamOps[Self <: AdRequestParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdposition(value: pre | mid | post): Self = this.set("adposition", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient(value: vast | googima): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: pre | mid | post): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

