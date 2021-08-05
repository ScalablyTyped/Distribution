package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.MediaPlayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMediaPlayer extends StObject {
  
  /* static member */
  def extend(proto: js.Object): MediaPlayer
  
  /* static member */
  var fn: MediaPlayer
}
object TypeofMediaPlayer {
  
  inline def apply(extend: js.Object => MediaPlayer, fn: MediaPlayer): TypeofMediaPlayer = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMediaPlayer]
  }
  
  extension [Self <: TypeofMediaPlayer](x: Self) {
    
    inline def setExtend(value: js.Object => MediaPlayer): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: MediaPlayer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
