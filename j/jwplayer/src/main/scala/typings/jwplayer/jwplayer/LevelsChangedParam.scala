package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelsChangedParam extends StObject {
  
  var currentQuality: Double
}
object LevelsChangedParam {
  
  @scala.inline
  def apply(currentQuality: Double): LevelsChangedParam = {
    val __obj = js.Dynamic.literal(currentQuality = currentQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelsChangedParam]
  }
  
  @scala.inline
  implicit class LevelsChangedParamMutableBuilder[Self <: LevelsChangedParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentQuality(value: Double): Self = StObject.set(x, "currentQuality", value.asInstanceOf[js.Any])
  }
}
