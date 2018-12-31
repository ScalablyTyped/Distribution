package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var data: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.ReadWriteStream
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var knownLength: js.UndefOr[scala.Double] = js.undefined
  def getType(): java.lang.String
}

