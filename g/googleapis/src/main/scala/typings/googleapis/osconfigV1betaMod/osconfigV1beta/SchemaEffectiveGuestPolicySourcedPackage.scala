package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEffectiveGuestPolicySourcedPackage extends StObject {
  
  /**
    * A software package to configure on the VM instance.
    */
  @JSName("package")
  var _package: js.UndefOr[SchemaPackage] = js.undefined
  
  /**
    * Name of the guest policy providing this config.
    */
  var source: js.UndefOr[String | Null] = js.undefined
}
object SchemaEffectiveGuestPolicySourcedPackage {
  
  inline def apply(): SchemaEffectiveGuestPolicySourcedPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEffectiveGuestPolicySourcedPackage]
  }
  
  extension [Self <: SchemaEffectiveGuestPolicySourcedPackage](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def set_package(value: SchemaPackage): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
