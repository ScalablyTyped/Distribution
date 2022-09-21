package typings.lyricist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author extends StObject {
  
  var attribution: Double
  
  var pinned_role: js.UndefOr[Any] = js.undefined
  
  var user: User
}
object Author {
  
  inline def apply(attribution: Double, user: User): Author = {
    val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  extension [Self <: Author](x: Self) {
    
    inline def setAttribution(value: Double): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setPinned_role(value: Any): Self = StObject.set(x, "pinned_role", value.asInstanceOf[js.Any])
    
    inline def setPinned_roleUndefined: Self = StObject.set(x, "pinned_role", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
