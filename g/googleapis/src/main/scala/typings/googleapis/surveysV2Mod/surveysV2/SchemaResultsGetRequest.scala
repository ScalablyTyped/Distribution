package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResultsGetRequest extends js.Object {
  
  var resultMask: js.UndefOr[SchemaResultsMask] = js.native
}
object SchemaResultsGetRequest {
  
  @scala.inline
  def apply(): SchemaResultsGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultsGetRequest]
  }
  
  @scala.inline
  implicit class SchemaResultsGetRequestOps[Self <: SchemaResultsGetRequest] (val x: Self) extends AnyVal {
    
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
    def setResultMask(value: SchemaResultsMask): Self = this.set("resultMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultMask: Self = this.set("resultMask", js.undefined)
  }
}
