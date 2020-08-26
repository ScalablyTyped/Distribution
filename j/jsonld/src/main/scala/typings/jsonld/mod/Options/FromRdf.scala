package typings.jsonld.mod.Options

import typings.jsonld.mod.MimeNQuad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromRdf extends js.Object {
  var format: js.UndefOr[MimeNQuad] = js.native
  var rdfParser: js.UndefOr[js.Any] = js.native
  var useNativeTypes: js.UndefOr[Boolean] = js.native
  var useRdfType: js.UndefOr[Boolean] = js.native
}

object FromRdf {
  @scala.inline
  def apply(): FromRdf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromRdf]
  }
  @scala.inline
  implicit class FromRdfOps[Self <: FromRdf] (val x: Self) extends AnyVal {
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
    def setRdfParser(value: js.Any): Self = this.set("rdfParser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRdfParser: Self = this.set("rdfParser", js.undefined)
    @scala.inline
    def setUseNativeTypes(value: Boolean): Self = this.set("useNativeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeTypes: Self = this.set("useNativeTypes", js.undefined)
    @scala.inline
    def setUseRdfType(value: Boolean): Self = this.set("useRdfType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseRdfType: Self = this.set("useRdfType", js.undefined)
  }
  
}

