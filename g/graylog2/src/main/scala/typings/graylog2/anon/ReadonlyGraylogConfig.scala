package typings.graylog2.anon

import typings.graylog2.mod.GraylogDeflate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<graylog2.graylog2.GraylogConfig> */
trait ReadonlyGraylogConfig extends js.Object {
  val bufferSize: js.UndefOr[Double] = js.undefined
  val deflate: js.UndefOr[GraylogDeflate] = js.undefined
  val facility: js.UndefOr[String] = js.undefined
  val hostname: js.UndefOr[String] = js.undefined
  val servers: js.Array[Readonlyhoststringportnum]
}

object ReadonlyGraylogConfig {
  @scala.inline
  def apply(
    servers: js.Array[Readonlyhoststringportnum],
    bufferSize: js.UndefOr[Double] = js.undefined,
    deflate: GraylogDeflate = null,
    facility: String = null,
    hostname: String = null
  ): ReadonlyGraylogConfig = {
    val __obj = js.Dynamic.literal(servers = servers.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferSize)) __obj.updateDynamic("bufferSize")(bufferSize.get.asInstanceOf[js.Any])
    if (deflate != null) __obj.updateDynamic("deflate")(deflate.asInstanceOf[js.Any])
    if (facility != null) __obj.updateDynamic("facility")(facility.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyGraylogConfig]
  }
}

