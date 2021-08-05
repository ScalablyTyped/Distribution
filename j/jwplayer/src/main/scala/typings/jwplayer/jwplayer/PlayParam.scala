package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerNumbers.`0`
import typings.jwplayer.jwplayerNumbers.`1`
import typings.jwplayer.jwplayerStrings.buffering
import typings.jwplayer.jwplayerStrings.playing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayParam extends StObject {
  
  var oldstate: buffering | playing
  
  var viewable: `0` | `1`
}
object PlayParam {
  
  inline def apply(oldstate: buffering | playing, viewable: `0` | `1`): PlayParam = {
    val __obj = js.Dynamic.literal(oldstate = oldstate.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayParam]
  }
  
  extension [Self <: PlayParam](x: Self) {
    
    inline def setOldstate(value: buffering | playing): Self = StObject.set(x, "oldstate", value.asInstanceOf[js.Any])
    
    inline def setViewable(value: `0` | `1`): Self = StObject.set(x, "viewable", value.asInstanceOf[js.Any])
  }
}
