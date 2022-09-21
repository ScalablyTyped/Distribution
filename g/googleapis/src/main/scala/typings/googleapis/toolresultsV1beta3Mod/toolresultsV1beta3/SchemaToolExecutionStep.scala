package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaToolExecutionStep extends StObject {
  
  /**
    * A Tool execution. - In response: present if set by create/update request - In create/update request: optional
    */
  var toolExecution: js.UndefOr[SchemaToolExecution] = js.undefined
}
object SchemaToolExecutionStep {
  
  inline def apply(): SchemaToolExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolExecutionStep]
  }
  
  extension [Self <: SchemaToolExecutionStep](x: Self) {
    
    inline def setToolExecution(value: SchemaToolExecution): Self = StObject.set(x, "toolExecution", value.asInstanceOf[js.Any])
    
    inline def setToolExecutionUndefined: Self = StObject.set(x, "toolExecution", js.undefined)
  }
}
