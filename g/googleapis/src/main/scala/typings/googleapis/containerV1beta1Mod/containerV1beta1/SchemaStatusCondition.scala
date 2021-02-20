package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatusCondition describes why a cluster or a node pool has a certain status
  * (e.g., ERROR or DEGRADED).
  */
@js.native
trait SchemaStatusCondition extends StObject {
  
  /**
    * Machine-friendly representation of the condition
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * Human-friendly representation of the condition
    */
  var message: js.UndefOr[String] = js.native
}
object SchemaStatusCondition {
  
  @scala.inline
  def apply(): SchemaStatusCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusCondition]
  }
  
  @scala.inline
  implicit class SchemaStatusConditionMutableBuilder[Self <: SchemaStatusCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
