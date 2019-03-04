package typings
package atIonicDiscoverLib.distPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherMessage extends js.Object {
  var commPort: js.UndefOr[scala.Double] = js.undefined
  var host: java.lang.String
  var id: java.lang.String
  var ip: java.lang.String
  var name: java.lang.String
  var nspace: java.lang.String
  var path: java.lang.String
  var port: scala.Double
  var t: scala.Double
}

object PublisherMessage {
  @scala.inline
  def apply(
    host: java.lang.String,
    id: java.lang.String,
    ip: java.lang.String,
    name: java.lang.String,
    nspace: java.lang.String,
    path: java.lang.String,
    port: scala.Double,
    t: scala.Double,
    commPort: scala.Int | scala.Double = null
  ): PublisherMessage = {
    val __obj = js.Dynamic.literal(host = host, id = id, ip = ip, name = name, nspace = nspace, path = path, port = port, t = t)
    if (commPort != null) __obj.updateDynamic("commPort")(commPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherMessage]
  }
}

