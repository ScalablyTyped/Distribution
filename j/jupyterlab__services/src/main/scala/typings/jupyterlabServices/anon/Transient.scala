package typings.jupyterlabServices.anon

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabNbformat.mod.OutputMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transient extends js.Object {
  
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
  implicit class TransientOps[Self <: Transient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: IMimeBundle): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: OutputMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_count(value: ExecutionCount): Self = this.set("execution_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_countNull: Self = this.set("execution_count", null)
    
    @scala.inline
    def setTransient(value: Displayid): Self = this.set("transient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransient: Self = this.set("transient", js.undefined)
  }
}
