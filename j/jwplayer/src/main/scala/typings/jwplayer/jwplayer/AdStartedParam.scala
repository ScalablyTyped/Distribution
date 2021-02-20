package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdStartedParam extends StObject {
  
  var creativetype: String = js.native
  
  var tag: String = js.native
}
object AdStartedParam {
  
  @scala.inline
  def apply(creativetype: String, tag: String): AdStartedParam = {
    val __obj = js.Dynamic.literal(creativetype = creativetype.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdStartedParam]
  }
  
  @scala.inline
  implicit class AdStartedParamMutableBuilder[Self <: AdStartedParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativetype(value: String): Self = StObject.set(x, "creativetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
