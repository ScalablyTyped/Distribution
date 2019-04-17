package typings
package gzipDashSizeLib.gzipDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GzipSizeStream
  extends nodeLib.streamMod.PassThrough {
  /**
  		Contains the gzip size of the stream after it is finished. Since this happens asynchronously, it is recommended you use the `gzip-size` event instead.
  		*/
  var gzipSize: js.UndefOr[scala.Double] = js.native
  @JSName("addListener")
  def `addListener_gzip-size`(
    event: gzipDashSizeLib.gzipDashSizeLibStrings.`gzip-size`,
    listener: js.Function1[/* size */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("emit")
  def `emit_gzip-size`(event: gzipDashSizeLib.gzipDashSizeLibStrings.`gzip-size`, size: scala.Double): scala.Boolean = js.native
  @JSName("off")
  def `off_gzip-size`(
    event: gzipDashSizeLib.gzipDashSizeLibStrings.`gzip-size`,
    listener: js.Function1[/* size */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_gzip-size`(
    event: gzipDashSizeLib.gzipDashSizeLibStrings.`gzip-size`,
    listener: js.Function1[/* size */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_gzip-size`(
    event: gzipDashSizeLib.gzipDashSizeLibStrings.`gzip-size`,
    listener: js.Function1[/* size */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def `prependListener_gzip-size`(
    event: gzipDashSizeLib.gzipDashSizeLibStrings.`gzip-size`,
    listener: js.Function1[/* size */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def `prependOnceListener_gzip-size`(
    event: gzipDashSizeLib.gzipDashSizeLibStrings.`gzip-size`,
    listener: js.Function1[/* size */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_gzip-size`(
    event: gzipDashSizeLib.gzipDashSizeLibStrings.`gzip-size`,
    listener: js.Function1[/* size */ scala.Double, scala.Unit]
  ): this.type = js.native
}

