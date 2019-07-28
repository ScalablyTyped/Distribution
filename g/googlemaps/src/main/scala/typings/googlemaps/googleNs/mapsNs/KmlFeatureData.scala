package typings.googlemaps.googleNs.mapsNs

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
    val __obj = js.Dynamic.literal(author = author, description = description, id = id, infoWindowHtml = infoWindowHtml, name = name, snippet = snippet)
  
    __obj.asInstanceOf[KmlFeatureData]
  }
}

