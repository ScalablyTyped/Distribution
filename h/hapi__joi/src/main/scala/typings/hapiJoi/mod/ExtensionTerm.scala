package typings.hapiJoi.mod

import typings.hapiJoi.hapiJoiStrings.schema
import typings.hapiJoi.hapiJoiStrings.single
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionTerm extends StObject {
  
  var init: js.Array[Any] | Null
  
  var manifest: js.UndefOr[Record[String, schema | single | ExtensionTermManifest]] = js.undefined
  
  var register: js.UndefOr[Any] = js.undefined
}
object ExtensionTerm {
  
  inline def apply(): ExtensionTerm = {
    val __obj = js.Dynamic.literal(init = null)
    __obj.asInstanceOf[ExtensionTerm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionTerm] (val x: Self) extends AnyVal {
    
    inline def setInit(value: js.Array[Any]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitNull: Self = StObject.set(x, "init", null)
    
    inline def setInitVarargs(value: Any*): Self = StObject.set(x, "init", js.Array(value*))
    
    inline def setManifest(value: Record[String, schema | single | ExtensionTermManifest]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setRegister(value: Any): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
    
    inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
  }
}
