package typings.jupyterlabServices.anon

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabNbformat.mod.OutputMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transient extends StObject {
  
  var data: IMimeBundle = js.native
  
  var execution_count: ExecutionCount = js.native
  
  var metadata: OutputMetadata = js.native
  
  var transient: js.UndefOr[Displayid] = js.native
}
object Transient {
  
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata): Transient = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transient]
  }
  
  @scala.inline
  implicit class TransientMutableBuilder[Self <: Transient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IMimeBundle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_count(value: ExecutionCount): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
    
    @scala.inline
    def setMetadata(value: OutputMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransient(value: Displayid): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
  }
}
