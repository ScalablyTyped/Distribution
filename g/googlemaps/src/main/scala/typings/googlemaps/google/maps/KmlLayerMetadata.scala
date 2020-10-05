package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlLayerMetadata extends js.Object {
  var author: KmlAuthor = js.native
  var description: String = js.native
  var hasScreenOverlays: Boolean = js.native
  var name: String = js.native
  var snippet: String = js.native
}

object KmlLayerMetadata {
  @scala.inline
  def apply(author: KmlAuthor, description: String, hasScreenOverlays: Boolean, name: String, snippet: String): KmlLayerMetadata = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasScreenOverlays = hasScreenOverlays.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlLayerMetadata]
  }
  @scala.inline
  implicit class KmlLayerMetadataOps[Self <: KmlLayerMetadata] (val x: Self) extends AnyVal {
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
    def setAuthor(value: KmlAuthor): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasScreenOverlays(value: Boolean): Self = this.set("hasScreenOverlays", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnippet(value: String): Self = this.set("snippet", value.asInstanceOf[js.Any])
  }
  
}

