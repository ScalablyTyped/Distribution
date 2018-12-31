package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends Envelope {
  var authentication: js.UndefOr[js.Any] = js.undefined
  var compression: js.UndefOr[java.lang.String] = js.undefined
  var compressionOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var encryption: js.UndefOr[java.lang.String] = js.undefined
  var encryptionOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var reason: js.UndefOr[Reason] = js.undefined
  var scheme: js.UndefOr[java.lang.String] = js.undefined
  var state: java.lang.String
}

