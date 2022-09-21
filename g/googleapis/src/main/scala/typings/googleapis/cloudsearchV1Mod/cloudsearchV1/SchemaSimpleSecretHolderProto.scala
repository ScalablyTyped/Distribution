package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSimpleSecretHolderProto extends StObject {
  
  /**
    * A descriptive label to help identify a relevant ACL entry or otherwise disambiguate this instance.
    */
  var label: js.UndefOr[SchemaSimpleSecretLabelProto] = js.undefined
}
object SchemaSimpleSecretHolderProto {
  
  inline def apply(): SchemaSimpleSecretHolderProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSimpleSecretHolderProto]
  }
  
  extension [Self <: SchemaSimpleSecretHolderProto](x: Self) {
    
    inline def setLabel(value: SchemaSimpleSecretLabelProto): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
