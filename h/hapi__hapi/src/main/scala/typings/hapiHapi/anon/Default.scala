package typings.hapiHapi.anon

import typings.hapiHapi.libTypesServerAuthMod.ServerAuthConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: ServerAuthConfig
}
object Default {
  
  inline def apply(default: ServerAuthConfig): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: ServerAuthConfig): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
