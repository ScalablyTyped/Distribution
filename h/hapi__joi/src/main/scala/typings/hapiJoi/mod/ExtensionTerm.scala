package typings.hapiJoi.mod

import typings.hapiJoi.hapiJoiStrings.schema
import typings.hapiJoi.hapiJoiStrings.single
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionTerm extends StObject {
  
  var init: js.Array[js.Any] | Null
  
  var manifest: js.UndefOr[Record[String, schema | single | ExtensionTermManifest]] = js.undefined
  
  var register: js.UndefOr[js.Any] = js.undefined
}
object ExtensionTerm {
  
  @scala.inline
  def apply(): ExtensionTerm = {
    val __obj = js.Dynamic.literal(init = null)
    __obj.asInstanceOf[ExtensionTerm]
  }
  
  @scala.inline
  implicit class ExtensionTermMutableBuilder[Self <: ExtensionTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: js.Array[js.Any]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitNull: Self = StObject.set(x, "init", null)
    
    @scala.inline
    def setInitVarargs(value: js.Any*): Self = StObject.set(x, "init", js.Array(value :_*))
    
    @scala.inline
    def setManifest(value: Record[String, schema | single | ExtensionTermManifest]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    @scala.inline
    def setRegister(value: js.Any): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
  }
}
