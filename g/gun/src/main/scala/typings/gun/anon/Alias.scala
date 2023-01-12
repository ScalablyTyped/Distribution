package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  var alias: String
  
  var auth: Any
  
  var epub: String
  
  var pub: String
}
object Alias {
  
  inline def apply(alias: String, auth: Any, epub: String, pub: String): Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], epub = epub.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAuth(value: Any): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setEpub(value: String): Self = StObject.set(x, "epub", value.asInstanceOf[js.Any])
    
    inline def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
  }
}
