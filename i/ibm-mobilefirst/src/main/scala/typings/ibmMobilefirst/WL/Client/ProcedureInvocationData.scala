package typings.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcedureInvocationData extends js.Object {
  
  var adapter: String = js.native
  
  var compressResponse: js.UndefOr[Boolean] = js.native
  
  var parameters: js.UndefOr[js.Array[_]] = js.native
  
  var procedure: String = js.native
}
object ProcedureInvocationData {
  
  @scala.inline
  def apply(adapter: String, procedure: String): ProcedureInvocationData = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureInvocationData]
  }
  
  @scala.inline
  implicit class ProcedureInvocationDataOps[Self <: ProcedureInvocationData] (val x: Self) extends AnyVal {
    
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
    def setAdapter(value: String): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcedure(value: String): Self = this.set("procedure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressResponse(value: Boolean): Self = this.set("compressResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressResponse: Self = this.set("compressResponse", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: js.Any*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[_]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
