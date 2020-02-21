package typings.hapiHawk.browserMod

import typings.cryptoJs.mod.Hashes
import typings.hapiHawk.clientMod.Credentials
import typings.hapiHawk.cryptoMod.Artifacts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/browser", "crypto")
@js.native
object crypto extends js.Object {
  val algorithms: js.Array[String] = js.native
  val headerVersion: String = js.native
  val utils: Hashes = js.native
  def calculateMac(`type`: String, credentials: Credentials, options: Artifacts): String = js.native
  def calculatePayloadHash(payload: String, algorithm: String, contentType: String): String = js.native
  def calculateTsMac(ts: String, credentials: Credentials): String = js.native
  def generateNormalizedString(`type`: String, options: Artifacts): String = js.native
}

