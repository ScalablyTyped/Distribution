package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  var height: Double
  
  var width: Double
  
  var x: `0`
  
  // x and y will always be 0 according to https://developer.jwplayer.com/jw-player/docs/javascript-api-reference/#jwplayergetsaferegion
  var y: `0`
}
object Region {
  
  inline def apply(height: Double, width: Double): Region = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = 0, y = 0)
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: `0`): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: `0`): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
