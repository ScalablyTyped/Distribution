package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trophy extends StObject {
  
  var data: String
  
  var data_link: String
  
  var datetime: Double
  
  var description: String
  
  var id: Double
  
  var image: String
  
  var name: String
  
  var name_clean: String
}
object Trophy {
  
  @scala.inline
  def apply(
    data: String,
    data_link: String,
    datetime: Double,
    description: String,
    id: Double,
    image: String,
    name: String,
    name_clean: String
  ): Trophy = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], data_link = data_link.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_clean = name_clean.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trophy]
  }
  
  @scala.inline
  implicit class TrophyMutableBuilder[Self <: Trophy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_link(value: String): Self = StObject.set(x, "data_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName_clean(value: String): Self = StObject.set(x, "name_clean", value.asInstanceOf[js.Any])
  }
}
