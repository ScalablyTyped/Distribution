package typings.graphqlToolsUtils.anon

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  var document: DocumentNode = js.native
  var location: String = js.native
  var rawSDL: String = js.native
}

object Document {
  @scala.inline
  def apply(document: DocumentNode, location: String, rawSDL: String): Document = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], rawSDL = rawSDL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
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
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawSDL(value: String): Self = this.set("rawSDL", value.asInstanceOf[js.Any])
  }
  
}

