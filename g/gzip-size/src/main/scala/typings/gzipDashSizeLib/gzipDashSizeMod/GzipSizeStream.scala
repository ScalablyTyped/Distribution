package typings
package gzipDashSizeLib.gzipDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GzipSizeStream
  extends nodeLib.streamMod.PassThrough {
  /**
       * Contains the gzip size of the stream after it is finished.
       * Since this happens asynchronously, it is recommended you use
       * the `.on("gzip-size", size => console.log(size))` method instead
       */
  var gzipSize: js.UndefOr[scala.Double] = js.native
  @JSName("on")
  def `on_gzip-size`(
    event: gzipDashSizeLib.gzipDashSizeLibStrings.`gzip-size`,
    listener: js.Function1[/* size */ scala.Double, scala.Unit]
  ): this.type = js.native
}

