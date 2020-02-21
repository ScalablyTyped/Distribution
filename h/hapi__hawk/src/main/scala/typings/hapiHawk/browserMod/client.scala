package typings.hapiHawk.browserMod

import typings.hapiHawk.browserMod.utils.ParsedUri
import typings.hapiHawk.clientMod.AuthenticateOptions
import typings.hapiHawk.clientMod.BewitOptions
import typings.hapiHawk.clientMod.Credentials
import typings.hapiHawk.clientMod.HeaderOptions
import typings.hapiHawk.clientMod.Header_
import typings.hapiHawk.clientMod.MessageOptions
import typings.hapiHawk.clientMod.Message_
import typings.hapiHawk.cryptoMod.Artifacts
import typings.std.Response
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/browser", "client")
@js.native
object client extends js.Object {
  def authenticate(request: Response, credentials: Credentials, artifacts: Artifacts): Boolean = js.native
  def authenticate(request: Response, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Boolean = js.native
  def authenticate(request: XMLHttpRequest, credentials: Credentials, artifacts: Artifacts): Boolean = js.native
  def authenticate(
    request: XMLHttpRequest,
    credentials: Credentials,
    artifacts: Artifacts,
    options: AuthenticateOptions
  ): Boolean = js.native
  def authenticateTimestamp(message: String, credentials: Credentials): Boolean = js.native
  def authenticateTimestamp(message: String, credentials: Credentials, updateClock: Boolean): Boolean = js.native
  def bewit(uri: String): String = js.native
  def bewit(uri: String, options: BewitOptions): String = js.native
  def header(uri: String, method: String): Header_ = js.native
  def header(uri: String, method: String, options: HeaderOptions): Header_ = js.native
  def header(uri: ParsedUri, method: String): Header_ = js.native
  def header(uri: ParsedUri, method: String, options: HeaderOptions): Header_ = js.native
  def message(host: String, port: Double, message: String, options: MessageOptions): Message_ = js.native
}

