package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.googima
import typings.jwplayer.jwplayerStrings.vast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdProgressParam extends StObject {
  
  var client: vast | googima
  
  var creativetype: String
  
  var tag: String
}
object AdProgressParam {
  
  @scala.inline
  def apply(client: vast | googima, creativetype: String, tag: String): AdProgressParam = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], creativetype = creativetype.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdProgressParam]
  }
  
  @scala.inline
  implicit class AdProgressParamMutableBuilder[Self <: AdProgressParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: vast | googima): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativetype(value: String): Self = StObject.set(x, "creativetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
