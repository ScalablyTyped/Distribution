package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistItemParam extends StObject {
  
  var index: Double
  
  var item: js.Any
}
object PlaylistItemParam {
  
  @scala.inline
  def apply(index: Double, item: js.Any): PlaylistItemParam = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItemParam]
  }
  
  @scala.inline
  implicit class PlaylistItemParamMutableBuilder[Self <: PlaylistItemParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
