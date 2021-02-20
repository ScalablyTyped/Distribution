package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.display_data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDisplayData
  extends IBaseOutput
     with _IOutput {
  
  /**
    * A mime-type keyed dictionary of data.
    */
  var data: IMimeBundle = js.native
  
  /**
    * Cell output metadata.
    */
  var metadata: OutputMetadata = js.native
  
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IDisplayData: display_data = js.native
}
object IDisplayData {
  
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata, output_type: display_data): IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayData]
  }
  
  @scala.inline
  implicit class IDisplayDataMutableBuilder[Self <: IDisplayData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IMimeBundle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: OutputMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_type(value: display_data): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}
