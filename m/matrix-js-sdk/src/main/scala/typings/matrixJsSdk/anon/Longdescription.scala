package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Longdescription extends StObject {
  
  // <optional> Name of the group
  var avatar_url: String
  
  // <optional> A short description of the room
  var long_description: String
  
  var name: String
  
  // <optional> MXC avatar URL
  var short_description: String
}
object Longdescription {
  
  inline def apply(avatar_url: String, long_description: String, name: String, short_description: String): Longdescription = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], long_description = long_description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_description = short_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Longdescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Longdescription] (val x: Self) extends AnyVal {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setLong_description(value: String): Self = StObject.set(x, "long_description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShort_description(value: String): Self = StObject.set(x, "short_description", value.asInstanceOf[js.Any])
  }
}
