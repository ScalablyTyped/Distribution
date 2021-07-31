package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A condition to be met.
  */
trait SchemaCondition extends StObject {
  
  /**
    * Trusted attributes supplied by the IAM system.
    */
  var iam: js.UndefOr[String] = js.undefined
  
  /**
    * An operator to apply the subject with.
    */
  var op: js.UndefOr[String] = js.undefined
  
  /**
    * Trusted attributes discharged by the service.
    */
  var svc: js.UndefOr[String] = js.undefined
  
  /**
    * Trusted attributes supplied by any service that owns resources and uses
    * the IAM system for access control.
    */
  var sys: js.UndefOr[String] = js.undefined
  
  /**
    * The objects of the condition.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCondition {
  
  @scala.inline
  def apply(): SchemaCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCondition]
  }
  
  @scala.inline
  implicit class SchemaConditionMutableBuilder[Self <: SchemaCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIam(value: String): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
    
    @scala.inline
    def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    @scala.inline
    def setSvc(value: String): Self = StObject.set(x, "svc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvcUndefined: Self = StObject.set(x, "svc", js.undefined)
    
    @scala.inline
    def setSys(value: String): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysUndefined: Self = StObject.set(x, "sys", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
