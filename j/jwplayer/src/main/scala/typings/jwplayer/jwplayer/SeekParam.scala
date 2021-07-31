package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeekParam extends StObject {
  
  var offset: Double
  
  var position: Double
}
object SeekParam {
  
  @scala.inline
  def apply(offset: Double, position: Double): SeekParam = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekParam]
  }
  
  @scala.inline
  implicit class SeekParamMutableBuilder[Self <: SeekParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
