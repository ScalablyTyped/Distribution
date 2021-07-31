package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instruction that reads records. Takes no inputs, produces one output.
  */
trait SchemaReadInstruction extends StObject {
  
  /**
    * The source to read from.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaReadInstruction {
  
  @scala.inline
  def apply(): SchemaReadInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadInstruction]
  }
  
  @scala.inline
  implicit class SchemaReadInstructionMutableBuilder[Self <: SchemaReadInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
