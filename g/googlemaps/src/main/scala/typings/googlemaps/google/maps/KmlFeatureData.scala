package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlFeatureData extends js.Object {
  var author: KmlAuthor
  var description: String
  var id: String
  var infoWindowHtml: String
  var name: String
  var snippet: String
}

object KmlFeatureData {
  @scala.inline
  def apply(
    author: KmlAuthor,
    description: String,
    id: String,
    infoWindowHtml: String,
    name: String,
    snippet: String
  ): KmlFeatureData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], infoWindowHtml = infoWindowHtml.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlFeatureData]
  }
}

