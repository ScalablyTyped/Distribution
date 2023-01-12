package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.typesJsonMod.PartialJSONObject
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBaseOutput] (val x: Self) extends AnyVal {
    
    inline def setOutput_type(value: String): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}
