package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Displayname extends StObject {
  
  var avatar_url: js.UndefOr[/* template literal string: mxc://${string} */ String] = js.undefined
  
  var displayname: js.UndefOr[String] = js.undefined
  
  var external_url: js.UndefOr[String] = js.undefined
  
  var id: String
}
object Displayname {
  
  inline def apply(id: String): Displayname = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Displayname] (val x: Self) extends AnyVal {
    
    inline def setAvatar_url(value: /* template literal string: mxc://${string} */ String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
    
    inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
    
    inline def setDisplaynameUndefined: Self = StObject.set(x, "displayname", js.undefined)
    
    inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
    
    inline def setExternal_urlUndefined: Self = StObject.set(x, "external_url", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
