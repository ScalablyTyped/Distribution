package typings.ibmDashMobilefirst.WLNs.SecurityUtilsNs

import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.SecurityUtils")
@js.native
object ^ extends js.Object {
  def base64Decode(input: String): JQueryDeferred[String] = js.native
  def base64Encode(input: String): JQueryDeferred[String] = js.native
  def decrypt(options: DecryptOptions): JQueryDeferred[String] = js.native
  def encrypt(options: EncryptOptions): JQueryDeferred[String] = js.native
  def keygen(options: KeygenOptions): JQueryDeferred[String] = js.native
  def localRandomString(): JQueryDeferred[String] = js.native
  def localRandomString(bytes: Double): JQueryDeferred[String] = js.native
  def remoteRandomString(): JQueryDeferred[String] = js.native
  def remoteRandomString(bytes: Double): JQueryDeferred[String] = js.native
}

