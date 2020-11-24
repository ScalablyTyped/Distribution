package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for adapter.getObjectView */
@js.native
trait GetObjectViewParams extends js.Object {
  
  /** Last id to include in the return list */
  var endkey: js.UndefOr[String] = js.native
  
  /** Whether docs should be included in the return list */ // TODO: What are docs?
  var include_docs: js.UndefOr[Boolean] = js.native
  
  /** First id to include in the return list */
  var startkey: js.UndefOr[String] = js.native
}
object GetObjectViewParams {
  
  @scala.inline
  def apply(): GetObjectViewParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectViewParams]
  }
  
  @scala.inline
  implicit class GetObjectViewParamsOps[Self <: GetObjectViewParams] (val x: Self) extends AnyVal {
    
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
    def setEndkey(value: String): Self = this.set("endkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndkey: Self = this.set("endkey", js.undefined)
    
    @scala.inline
    def setInclude_docs(value: Boolean): Self = this.set("include_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_docs: Self = this.set("include_docs", js.undefined)
    
    @scala.inline
    def setStartkey(value: String): Self = this.set("startkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartkey: Self = this.set("startkey", js.undefined)
  }
}
