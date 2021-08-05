package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBaseOutput
  extends StObject
     with PartialJSONObject {
  
  /**
    * Type of cell output.
    */
  var output_type: String
}
object IBaseOutput {
  
  inline def apply(output_type: String): IBaseOutput = {
    val __obj = js.Dynamic.literal(output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseOutput]
  }
  
  extension [Self <: IBaseOutput](x: Self) {
    
    inline def setOutput_type(value: String): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}
