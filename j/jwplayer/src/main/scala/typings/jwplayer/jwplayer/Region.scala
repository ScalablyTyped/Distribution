package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerNumbers.`0`
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
  
  @scala.inline
  def apply(height: Double, width: Double): Region = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = 0, y = 0)
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: `0`): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: `0`): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
