package typings.jupyterlabServices.anon

import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabNbformat.mod.OutputMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends StObject {
  
  var data: IMimeBundle = js.native
  
  var metadata: OutputMetadata = js.native
  
  var transient: js.UndefOr[Displayid] = js.native
}
object Metadata {
  
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata): Metadata = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IMimeBundle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: OutputMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransient(value: Displayid): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
  }
}
