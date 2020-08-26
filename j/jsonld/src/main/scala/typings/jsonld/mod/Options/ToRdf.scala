package typings.jsonld.mod.Options

import typings.jsonld.mod.MimeNQuad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToRdf extends Common {
  var format: js.UndefOr[MimeNQuad] = js.native
  var produceGeneralizedRdf: js.UndefOr[Boolean] = js.native
  var skipExpansion: js.UndefOr[Boolean] = js.native
}

object ToRdf {
  @scala.inline
  def apply(): ToRdf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToRdf]
  }
  @scala.inline
  implicit class ToRdfOps[Self <: ToRdf] (val x: Self) extends AnyVal {
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
    def setFormat(value: MimeNQuad): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setProduceGeneralizedRdf(value: Boolean): Self = this.set("produceGeneralizedRdf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduceGeneralizedRdf: Self = this.set("produceGeneralizedRdf", js.undefined)
    @scala.inline
    def setSkipExpansion(value: Boolean): Self = this.set("skipExpansion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipExpansion: Self = this.set("skipExpansion", js.undefined)
  }
  
}

