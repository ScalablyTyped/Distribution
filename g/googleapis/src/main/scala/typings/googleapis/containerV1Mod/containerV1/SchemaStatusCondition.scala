package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatusCondition describes why a cluster or a node pool has a certain status
  * (e.g., ERROR or DEGRADED).
  */
trait SchemaStatusCondition extends StObject {
  
  /**
    * Machine-friendly representation of the condition
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Human-friendly representation of the condition
    */
  var message: js.UndefOr[String] = js.undefined
}
object SchemaStatusCondition {
  
  inline def apply(): SchemaStatusCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusCondition]
  }
  
  extension [Self <: SchemaStatusCondition](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
