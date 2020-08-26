package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProofPrint extends js.Object {
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[MediaInterface] = js.native
  var `proof-print-copies`: js.UndefOr[Double] = js.native
}

object ProofPrint {
  @scala.inline
  def apply(): ProofPrint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProofPrint]
  }
  @scala.inline
  implicit class ProofPrintOps[Self <: ProofPrint] (val x: Self) extends AnyVal {
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
    def setMedia(value: Media): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def `setMedia-col`(value: MediaInterface): Self = this.set("media-col", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMedia-col`: Self = this.set("media-col", js.undefined)
    @scala.inline
    def `setProof-print-copies`(value: Double): Self = this.set("proof-print-copies", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProof-print-copies`: Self = this.set("proof-print-copies", js.undefined)
  }
  
}

