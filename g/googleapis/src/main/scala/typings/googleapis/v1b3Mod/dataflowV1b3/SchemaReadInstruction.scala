package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReadInstruction extends StObject {
  
  /**
    * The source to read from.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaReadInstruction {
  
  inline def apply(): SchemaReadInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadInstruction]
  }
  
  extension [Self <: SchemaReadInstruction](x: Self) {
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
