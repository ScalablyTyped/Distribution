package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlLayerMetadata extends js.Object {
  var author: KmlAuthor
  var description: java.lang.String
  var hasScreenOverlays: scala.Boolean
  var name: java.lang.String
  var snippet: java.lang.String
}

object KmlLayerMetadata {
  @scala.inline
  def apply(
    author: KmlAuthor,
    description: java.lang.String,
    hasScreenOverlays: scala.Boolean,
    name: java.lang.String,
    snippet: java.lang.String
  ): KmlLayerMetadata = {
    val __obj = js.Dynamic.literal(author = author, description = description, hasScreenOverlays = hasScreenOverlays, name = name, snippet = snippet)
  
    __obj.asInstanceOf[KmlLayerMetadata]
  }
}

