package typings.mandrillDashApi.mandrillDashApiMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Mandrill")
@js.native
class Mandrill protected () extends js.Object {
  def this(apikey: String) = this()
  def this(apikey: String, debug: Boolean) = this()
  var apikey: String = js.native
  var debug: Boolean = js.native
  var exports: Exports = js.native
  var inbound: Inbound = js.native
  var internal: Internal = js.native
  var ips: Ips = js.native
  var messages: Messages = js.native
  var metadata: Metadata = js.native
  @JSName("onerror")
  var onerror_Original: IErrorCallback = js.native
  var rejects: Rejects = js.native
  var senders: Senders = js.native
  var subaccounts: Subaccounts = js.native
  var tags: Tags = js.native
  var templates: Templates = js.native
  var urls: Urls = js.native
  var users: Users = js.native
  var webhooks: Webhooks = js.native
  var whitelists: Whitelists = js.native
  def call(uri: String, params: js.Any): Unit = js.native
  def call(uri: String, params: js.Any, onresult: ICallback): Unit = js.native
  def call(uri: String, params: js.Any, onresult: ICallback, onerror: ICallback): Unit = js.native
  def onerror(err: Error): Unit = js.native
}

