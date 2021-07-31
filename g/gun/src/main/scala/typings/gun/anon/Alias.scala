package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  var alias: String
  
  var auth: js.Any
  
  var epub: String
  
  var pub: String
}
object Alias {
  
  @scala.inline
  def apply(alias: String, auth: js.Any, epub: String, pub: String): Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], epub = epub.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit class AliasMutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth(value: js.Any): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpub(value: String): Self = StObject.set(x, "epub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
  }
}
