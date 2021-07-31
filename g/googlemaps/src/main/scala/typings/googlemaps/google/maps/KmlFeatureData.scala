package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlFeatureData extends StObject {
  
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
  
  @scala.inline
  implicit class KmlFeatureDataMutableBuilder[Self <: KmlFeatureData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: KmlAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoWindowHtml(value: String): Self = StObject.set(x, "infoWindowHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
