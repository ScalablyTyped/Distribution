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
  
  inline def apply(client: vast | googima, creativetype: String, tag: String): AdProgressParam = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], creativetype = creativetype.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdProgressParam]
  }
  
  extension [Self <: AdProgressParam](x: Self) {
    
    inline def setClient(value: vast | googima): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCreativetype(value: String): Self = StObject.set(x, "creativetype", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
