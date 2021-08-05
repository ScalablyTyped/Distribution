package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvBrowseFeedResponseIgtvFirstFrame extends StObject {
  
  var height: Double
  
  var url: String
  
  var width: Double
}
object IgtvBrowseFeedResponseIgtvFirstFrame {
  
  inline def apply(height: Double, url: String, width: Double): IgtvBrowseFeedResponseIgtvFirstFrame = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseIgtvFirstFrame]
  }
  
  extension [Self <: IgtvBrowseFeedResponseIgtvFirstFrame](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
