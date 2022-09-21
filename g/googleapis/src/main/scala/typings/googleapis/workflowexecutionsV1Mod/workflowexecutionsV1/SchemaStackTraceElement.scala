package typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStackTraceElement extends StObject {
  
  /**
    * The source position information of the stack trace element.
    */
  var position: js.UndefOr[SchemaPosition] = js.undefined
  
  /**
    * The routine where the error occurred.
    */
  var routine: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The step the error occurred at.
    */
  var step: js.UndefOr[String | Null] = js.undefined
}
object SchemaStackTraceElement {
  
  inline def apply(): SchemaStackTraceElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackTraceElement]
  }
  
  extension [Self <: SchemaStackTraceElement](x: Self) {
    
    inline def setPosition(value: SchemaPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRoutine(value: String): Self = StObject.set(x, "routine", value.asInstanceOf[js.Any])
    
    inline def setRoutineNull: Self = StObject.set(x, "routine", null)
    
    inline def setRoutineUndefined: Self = StObject.set(x, "routine", js.undefined)
    
    inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
