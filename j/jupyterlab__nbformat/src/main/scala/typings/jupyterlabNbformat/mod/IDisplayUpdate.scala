package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.update_display_data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisplayUpdate
  extends StObject
     with IBaseOutput {
  
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
  var output_type_IDisplayUpdate: update_display_data
}
object IDisplayUpdate {
  
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata): IDisplayUpdate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = "update_display_data")
    __obj.asInstanceOf[IDisplayUpdate]
  }
  
  @scala.inline
  implicit class IDisplayUpdateMutableBuilder[Self <: IDisplayUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IMimeBundle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: OutputMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_type(value: update_display_data): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}
