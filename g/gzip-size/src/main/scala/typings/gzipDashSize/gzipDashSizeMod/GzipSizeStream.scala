package typings.gzipDashSize.gzipDashSizeMod

import typings.gzipDashSize.gzipDashSizeStrings.`gzip-size`
import typings.node.streamMod.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GzipSizeStream extends PassThrough {
  /**
  		Contains the gzip size of the stream after it is finished. Since this happens asynchronously, it is recommended you use the `gzip-size` event instead.
  		*/
  var gzipSize: js.UndefOr[Double] = js.native
  @JSName("addListener")
  def addListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
  @JSName("emit")
  def emit_gzipsize(event: `gzip-size`, size: Double): Boolean = js.native
  @JSName("off")
  def off_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
}

