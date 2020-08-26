package typings.jsonld.jsonldSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteDocument extends js.Object {
  var contextUrl: js.UndefOr[Url] = js.native
  var document: JsonLd = js.native
  var documentUrl: Url = js.native
}

object RemoteDocument {
  @scala.inline
  def apply(document: JsonLd, documentUrl: Url): RemoteDocument = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], documentUrl = documentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteDocument]
  }
  @scala.inline
  implicit class RemoteDocumentOps[Self <: RemoteDocument] (val x: Self) extends AnyVal {
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
    def setDocumentVarargs(value: JsonLdObj*): Self = this.set("document", js.Array(value :_*))
    @scala.inline
    def setDocument(value: JsonLd): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentUrl(value: Url): Self = this.set("documentUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextUrl(value: Url): Self = this.set("contextUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextUrl: Self = this.set("contextUrl", js.undefined)
  }
  
}

