package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadInstruction extends StObject {
  
  /** The source to read from. */
  var source: js.UndefOr[Source] = js.undefined
}
object ReadInstruction {
  
  @scala.inline
  def apply(): ReadInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadInstruction]
  }
  
  @scala.inline
  implicit class ReadInstructionMutableBuilder[Self <: ReadInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
