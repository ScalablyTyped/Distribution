package typings
package ibmDashMobilefirstLib.WLNs.SecurityUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.SecurityUtils")
@js.native
object ^ extends js.Object {
  def base64Decode(input: java.lang.String): jqueryLib.JQueryDeferred[java.lang.String] = js.native
  def base64Encode(input: java.lang.String): jqueryLib.JQueryDeferred[java.lang.String] = js.native
  def decrypt(options: DecryptOptions): jqueryLib.JQueryDeferred[java.lang.String] = js.native
  def encrypt(options: EncryptOptions): jqueryLib.JQueryDeferred[java.lang.String] = js.native
  def keygen(options: KeygenOptions): jqueryLib.JQueryDeferred[java.lang.String] = js.native
  def localRandomString(): jqueryLib.JQueryDeferred[java.lang.String] = js.native
  def localRandomString(bytes: scala.Double): jqueryLib.JQueryDeferred[java.lang.String] = js.native
  def remoteRandomString(): jqueryLib.JQueryDeferred[java.lang.String] = js.native
  def remoteRandomString(bytes: scala.Double): jqueryLib.JQueryDeferred[java.lang.String] = js.native
}

