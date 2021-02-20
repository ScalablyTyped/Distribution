package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseOutput extends PartialJSONObject {
  
  /**
    * Type of cell output.
    */
  var output_type: String = js.native
}
object IBaseOutput {
  
  @scala.inline
  def apply(output_type: String): IBaseOutput = {
    val __obj = js.Dynamic.literal(output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseOutput]
  }
  
  @scala.inline
  implicit class IBaseOutputMutableBuilder[Self <: IBaseOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput_type(value: String): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}
