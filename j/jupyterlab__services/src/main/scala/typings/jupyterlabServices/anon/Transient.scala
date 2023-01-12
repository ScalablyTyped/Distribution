package typings.jupyterlabServices.anon

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabNbformat.mod.OutputMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transient extends StObject {
  
  var data: IMimeBundle
  
  var execution_count: ExecutionCount
  
  var metadata: OutputMetadata
  
  var transient: js.UndefOr[Displayid] = js.undefined
}
object Transient {
  
  inline def apply(data: IMimeBundle, metadata: OutputMetadata): Transient = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], execution_count = null)
    __obj.asInstanceOf[Transient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transient] (val x: Self) extends AnyVal {
    
    inline def setData(value: IMimeBundle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setExecution_count(value: ExecutionCount): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    inline def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
    
    inline def setMetadata(value: OutputMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setTransient(value: Displayid): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
    
    inline def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
  }
}
