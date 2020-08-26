package typings.ionicDiscover.publisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublisherMessage extends js.Object {
  var commPort: js.UndefOr[Double] = js.native
  var host: String = js.native
  var id: String = js.native
  var ip: String = js.native
  var name: String = js.native
  var nspace: String = js.native
  var path: String = js.native
  var port: Double = js.native
  var t: Double = js.native
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
    t: Double
  ): PublisherMessage = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nspace = nspace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherMessage]
  }
  @scala.inline
  implicit class PublisherMessageOps[Self <: PublisherMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNspace(value: String): Self = this.set("nspace", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setT(value: Double): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommPort(value: Double): Self = this.set("commPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommPort: Self = this.set("commPort", js.undefined)
  }
  
}

