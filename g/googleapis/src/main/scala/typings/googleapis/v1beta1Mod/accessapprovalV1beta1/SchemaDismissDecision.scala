package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDismissDecision extends StObject {
  
  /**
    * The time at which the approval request was dismissed.
    */
  var dismissTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaDismissDecision {
  
  inline def apply(): SchemaDismissDecision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDismissDecision]
  }
  
  extension [Self <: SchemaDismissDecision](x: Self) {
    
    inline def setDismissTime(value: String): Self = StObject.set(x, "dismissTime", value.asInstanceOf[js.Any])
    
    inline def setDismissTimeNull: Self = StObject.set(x, "dismissTime", null)
    
    inline def setDismissTimeUndefined: Self = StObject.set(x, "dismissTime", js.undefined)
  }
}
