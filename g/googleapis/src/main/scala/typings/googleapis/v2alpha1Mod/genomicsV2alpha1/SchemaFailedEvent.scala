package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFailedEvent extends StObject {
  
  /**
    * The human-readable description of the cause of the failure.
    */
  var cause: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google standard error code that best describes this failure.
    */
  var code: js.UndefOr[String | Null] = js.undefined
}
object SchemaFailedEvent {
  
  inline def apply(): SchemaFailedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailedEvent]
  }
  
  extension [Self <: SchemaFailedEvent](x: Self) {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseNull: Self = StObject.set(x, "cause", null)
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
