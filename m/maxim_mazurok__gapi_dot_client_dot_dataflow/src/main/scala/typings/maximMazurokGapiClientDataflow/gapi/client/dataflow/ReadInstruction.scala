package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadInstruction extends StObject {
  
  /** The source to read from. */
  var source: js.UndefOr[Source] = js.undefined
}
object ReadInstruction {
  
  inline def apply(): ReadInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadInstruction]
  }
  
  extension [Self <: ReadInstruction](x: Self) {
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
