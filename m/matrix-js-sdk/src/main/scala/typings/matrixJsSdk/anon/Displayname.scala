package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Displayname extends StObject {
  
  var avatar_url: js.UndefOr[String] = js.undefined
  
  var displayname: js.UndefOr[String] = js.undefined
}
object Displayname {
  
  inline def apply(): Displayname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Displayname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Displayname] (val x: Self) extends AnyVal {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
    
    inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
    
    inline def setDisplaynameUndefined: Self = StObject.set(x, "displayname", js.undefined)
  }
}
