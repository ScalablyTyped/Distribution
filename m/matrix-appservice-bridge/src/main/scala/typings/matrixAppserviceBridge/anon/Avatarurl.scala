package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatarurl extends StObject {
  
  var avatar_url: String
  
  var display_name: String
}
object Avatarurl {
  
  inline def apply(avatar_url: String, display_name: String): Avatarurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatarurl]
  }
  
  extension [Self <: Avatarurl](x: Self) {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
  }
}
