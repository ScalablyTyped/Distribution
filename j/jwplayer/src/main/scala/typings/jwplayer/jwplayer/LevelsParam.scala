package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelsParam extends StObject {
  
  var levels: js.Array[_] = js.native
  
  var width: Double = js.native
}
object LevelsParam {
  
  @scala.inline
  def apply(levels: js.Array[_], width: Double): LevelsParam = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelsParam]
  }
  
  @scala.inline
  implicit class LevelsParamMutableBuilder[Self <: LevelsParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevels(value: js.Array[_]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsVarargs(value: js.Any*): Self = StObject.set(x, "levels", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
