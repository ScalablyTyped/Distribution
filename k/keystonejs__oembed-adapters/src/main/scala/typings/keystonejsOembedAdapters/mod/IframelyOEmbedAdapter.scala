package typings.keystonejsOembedAdapters.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/oembed-adapters", "IframelyOEmbedAdapter")
@js.native
class IframelyOEmbedAdapter protected () extends js.Object {
  def this(options: OEmbedAdapterConfig) = this()
  // Unlikely to be used in client apps, hence the any, but if you're using this, feel free to
  // type it properly. It's a res.json response from Fetch, just didn't want to pull that in
  // when it's unlikely to be actually used in client apps, Keystone calls this.
  def fetch(parameters: js.Any): js.Promise[_] = js.native
}

