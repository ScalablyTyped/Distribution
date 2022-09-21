package typings.googleapis.dnsV2Mod.dnsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponsePolicyRuleLocalData extends StObject {
  
  /**
    * All resource record sets for this selector, one per resource record type. The name must match the dns_name.
    */
  var localDatas: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.undefined
}
object SchemaResponsePolicyRuleLocalData {
  
  inline def apply(): SchemaResponsePolicyRuleLocalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponsePolicyRuleLocalData]
  }
  
  extension [Self <: SchemaResponsePolicyRuleLocalData](x: Self) {
    
    inline def setLocalDatas(value: js.Array[SchemaResourceRecordSet]): Self = StObject.set(x, "localDatas", value.asInstanceOf[js.Any])
    
    inline def setLocalDatasUndefined: Self = StObject.set(x, "localDatas", js.undefined)
    
    inline def setLocalDatasVarargs(value: SchemaResourceRecordSet*): Self = StObject.set(x, "localDatas", js.Array(value*))
  }
}
