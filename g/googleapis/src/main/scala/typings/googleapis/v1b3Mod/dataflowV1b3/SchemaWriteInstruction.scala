package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWriteInstruction extends StObject {
  
  /**
    * The input.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.undefined
  
  /**
    * The sink to write to.
    */
  var sink: js.UndefOr[SchemaSink] = js.undefined
}
object SchemaWriteInstruction {
  
  inline def apply(): SchemaWriteInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteInstruction]
  }
  
  extension [Self <: SchemaWriteInstruction](x: Self) {
    
    inline def setInput(value: SchemaInstructionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setSink(value: SchemaSink): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setSinkUndefined: Self = StObject.set(x, "sink", js.undefined)
  }
}
