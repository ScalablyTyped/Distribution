package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatarurl extends StObject {
  
  var avatar_url: js.UndefOr[String] = js.undefined
  
  var display_name: js.UndefOr[String] = js.undefined
}
object Avatarurl {
  
  inline def apply(): Avatarurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avatarurl]
  }
  
  extension [Self <: Avatarurl](x: Self) {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
  }
}
