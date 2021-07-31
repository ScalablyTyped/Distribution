package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerNumbers.`0`
import typings.jwplayer.jwplayerNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadyParam extends StObject {
  
  var setupTime: Double
  
  var viewable: `0` | `1`
}
object ReadyParam {
  
  @scala.inline
  def apply(setupTime: Double, viewable: `0` | `1`): ReadyParam = {
    val __obj = js.Dynamic.literal(setupTime = setupTime.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadyParam]
  }
  
  @scala.inline
  implicit class ReadyParamMutableBuilder[Self <: ReadyParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetupTime(value: Double): Self = StObject.set(x, "setupTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewable(value: `0` | `1`): Self = StObject.set(x, "viewable", value.asInstanceOf[js.Any])
  }
}
