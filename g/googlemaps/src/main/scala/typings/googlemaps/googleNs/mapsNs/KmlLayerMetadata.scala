package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlLayerMetadata extends js.Object {
  var author: KmlAuthor
  var description: String
  var hasScreenOverlays: Boolean
  var name: String
  var snippet: String
}

object KmlLayerMetadata {
  @scala.inline
  def apply(author: KmlAuthor, description: String, hasScreenOverlays: Boolean, name: String, snippet: String): KmlLayerMetadata = {
    val __obj = js.Dynamic.literal(author = author, description = description, hasScreenOverlays = hasScreenOverlays, name = name, snippet = snippet)
  
    __obj.asInstanceOf[KmlLayerMetadata]
  }
}

