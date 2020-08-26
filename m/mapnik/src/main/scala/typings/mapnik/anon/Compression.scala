package typings.mapnik.anon

import typings.mapnik.mapnikStrings.DEFAULT
import typings.mapnik.mapnikStrings.FILTERED
import typings.mapnik.mapnikStrings.FIXED
import typings.mapnik.mapnikStrings.HUFFMAN_ONLY
import typings.mapnik.mapnikStrings.RLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compression extends js.Object {
  var compression: js.UndefOr[Double] = js.native
  var level: js.UndefOr[Double] = js.native
  var strategy: js.UndefOr[FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT] = js.native
}

object Compression {
  @scala.inline
  def apply(): Compression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compression]
  }
  @scala.inline
  implicit class CompressionOps[Self <: Compression] (val x: Self) extends AnyVal {
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
    def setCompression(value: Double): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setStrategy(value: FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
  
}

