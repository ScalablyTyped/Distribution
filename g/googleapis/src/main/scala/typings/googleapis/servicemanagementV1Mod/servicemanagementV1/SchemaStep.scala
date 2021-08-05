package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the status of one operation step.
  */
trait SchemaStep extends StObject {
  
  /**
    * The short description of the step.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The status code.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaStep {
  
  inline def apply(): SchemaStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStep]
  }
  
  extension [Self <: SchemaStep](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
