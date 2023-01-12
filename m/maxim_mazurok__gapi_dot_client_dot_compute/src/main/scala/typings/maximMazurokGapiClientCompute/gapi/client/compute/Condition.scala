package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /** This is deprecated and has no effect. Do not use. */
  var iam: js.UndefOr[String] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var op: js.UndefOr[String] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var svc: js.UndefOr[String] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var sys: js.UndefOr[String] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object Condition {
  
  inline def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    inline def setIam(value: String): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    inline def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setSvc(value: String): Self = StObject.set(x, "svc", value.asInstanceOf[js.Any])
    
    inline def setSvcUndefined: Self = StObject.set(x, "svc", js.undefined)
    
    inline def setSys(value: String): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    inline def setSysUndefined: Self = StObject.set(x, "sys", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
