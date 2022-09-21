package typings.googleapis.gameservicesV1Mod.gameservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCondition extends StObject {
  
  /**
    * Trusted attributes supplied by the IAM system.
    */
  var iam: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An operator to apply the subject with.
    */
  var op: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Trusted attributes discharged by the service.
    */
  var svc: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
    */
  var sys: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The objects of the condition.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCondition {
  
  inline def apply(): SchemaCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCondition]
  }
  
  extension [Self <: SchemaCondition](x: Self) {
    
    inline def setIam(value: String): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    inline def setIamNull: Self = StObject.set(x, "iam", null)
    
    inline def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpNull: Self = StObject.set(x, "op", null)
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setSvc(value: String): Self = StObject.set(x, "svc", value.asInstanceOf[js.Any])
    
    inline def setSvcNull: Self = StObject.set(x, "svc", null)
    
    inline def setSvcUndefined: Self = StObject.set(x, "svc", js.undefined)
    
    inline def setSys(value: String): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    inline def setSysNull: Self = StObject.set(x, "sys", null)
    
    inline def setSysUndefined: Self = StObject.set(x, "sys", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
