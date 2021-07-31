package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdCompanionsParam extends StObject {
  
  var companions: js.Array[js.Any]
  
  var tag: String
}
object AdCompanionsParam {
  
  @scala.inline
  def apply(companions: js.Array[js.Any], tag: String): AdCompanionsParam = {
    val __obj = js.Dynamic.literal(companions = companions.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdCompanionsParam]
  }
  
  @scala.inline
  implicit class AdCompanionsParamMutableBuilder[Self <: AdCompanionsParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanions(value: js.Array[js.Any]): Self = StObject.set(x, "companions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionsVarargs(value: js.Any*): Self = StObject.set(x, "companions", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
