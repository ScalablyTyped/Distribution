package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instruction that writes records. Takes one input, produces no outputs.
  */
@js.native
trait SchemaWriteInstruction extends StObject {
  
  /**
    * The input.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.native
  
  /**
    * The sink to write to.
    */
  var sink: js.UndefOr[SchemaSink] = js.native
}
object SchemaWriteInstruction {
  
  @scala.inline
  def apply(): SchemaWriteInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteInstruction]
  }
  
  @scala.inline
  implicit class SchemaWriteInstructionMutableBuilder[Self <: SchemaWriteInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: SchemaInstructionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setSink(value: SchemaSink): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinkUndefined: Self = StObject.set(x, "sink", js.undefined)
  }
}
