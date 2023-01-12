package typings.kakaoJsSdk.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var container: String | HTMLElement
  
  var id: String
  
  var showFollowerCount: js.UndefOr[Boolean] = js.undefined
  
  // default true;
  var `type`: js.UndefOr[String] = js.undefined
}
object Id {
  
  inline def apply(container: String | HTMLElement, id: String): Id = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setShowFollowerCount(value: Boolean): Self = StObject.set(x, "showFollowerCount", value.asInstanceOf[js.Any])
    
    inline def setShowFollowerCountUndefined: Self = StObject.set(x, "showFollowerCount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
