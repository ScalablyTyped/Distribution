package typings.ionicDiscover.publisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherMessage extends js.Object {
  var commPort: js.UndefOr[Double] = js.undefined
  var host: String
  var id: String
  var ip: String
  var name: String
  var nspace: String
  var path: String
  var port: Double
  var t: Double
}

object PublisherMessage {
  @scala.inline
  def apply(
    host: String,
    id: String,
    ip: String,
    name: String,
    nspace: String,
    path: String,
    port: Double,
    t: Double,
    commPort: Int | Double = null
  ): PublisherMessage = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nspace = nspace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    if (commPort != null) __obj.updateDynamic("commPort")(commPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherMessage]
  }
}

