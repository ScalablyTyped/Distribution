package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.buffering
import typings.jwplayer.jwplayerStrings.paused
import typings.jwplayer.jwplayerStrings.playing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleParam extends StObject {
  
  var oldstate: buffering | playing | paused
}
object IdleParam {
  
  @scala.inline
  def apply(oldstate: buffering | playing | paused): IdleParam = {
    val __obj = js.Dynamic.literal(oldstate = oldstate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleParam]
  }
  
  @scala.inline
  implicit class IdleParamMutableBuilder[Self <: IdleParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldstate(value: buffering | playing | paused): Self = StObject.set(x, "oldstate", value.asInstanceOf[js.Any])
  }
}
