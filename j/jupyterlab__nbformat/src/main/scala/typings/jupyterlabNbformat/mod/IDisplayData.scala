package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.display_data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisplayData
  extends StObject
     with IBaseOutput
     with _IOutput {
  
  /**
    * A mime-type keyed dictionary of data.
    */
  var data: IMimeBundle
  
  /**
    * Cell output metadata.
    */
  var metadata: OutputMetadata
  
  /**
    * Type of cell output.
    */
  @JSName("output_type")
  var output_type_IDisplayData: display_data
}
object IDisplayData {
  
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata): IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = "display_data")
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
