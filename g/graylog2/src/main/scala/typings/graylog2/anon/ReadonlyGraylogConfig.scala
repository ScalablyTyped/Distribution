package typings.graylog2.anon

import typings.graylog2.mod.GraylogDeflate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<graylog2.graylog2.GraylogConfig> */
@js.native
trait ReadonlyGraylogConfig extends js.Object {
  val bufferSize: js.UndefOr[Double] = js.native
  val deflate: js.UndefOr[GraylogDeflate] = js.native
  val facility: js.UndefOr[String] = js.native
  val hostname: js.UndefOr[String] = js.native
  val servers: js.Array[Readonlyhoststringportnum] = js.native
}

object ReadonlyGraylogConfig {
  @scala.inline
  def apply(servers: js.Array[Readonlyhoststringportnum]): ReadonlyGraylogConfig = {
    val __obj = js.Dynamic.literal(servers = servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyGraylogConfig]
  }
  @scala.inline
  implicit class ReadonlyGraylogConfigOps[Self <: ReadonlyGraylogConfig] (val x: Self) extends AnyVal {
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
    def setServersVarargs(value: Readonlyhoststringportnum*): Self = this.set("servers", js.Array(value :_*))
    @scala.inline
    def setServers(value: js.Array[Readonlyhoststringportnum]): Self = this.set("servers", value.asInstanceOf[js.Any])
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    @scala.inline
    def setDeflate(value: GraylogDeflate): Self = this.set("deflate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeflate: Self = this.set("deflate", js.undefined)
    @scala.inline
    def setFacility(value: String): Self = this.set("facility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacility: Self = this.set("facility", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
  }
  
}

