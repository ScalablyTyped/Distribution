package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatarurl extends StObject {
  
  var avatar_url: String
  
  var displayname: String
}
object Avatarurl {
  
  inline def apply(avatar_url: String, displayname: String): Avatarurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], displayname = displayname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatarurl]
  }
  
  extension [Self <: Avatarurl](x: Self) {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
  }
}
