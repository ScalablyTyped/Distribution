package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeSpecification extends js.Object {
  
  /** Companion sizes may be filled in only when this is a video creative. */
  var creativeCompanionSizes: js.UndefOr[js.Array[AdSize]] = js.native
  
  /** The size of the creative. */
  var creativeSize: js.UndefOr[AdSize] = js.native
}
object CreativeSpecification {
  
  @scala.inline
  def apply(): CreativeSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeSpecification]
  }
  
  @scala.inline
  implicit class CreativeSpecificationOps[Self <: CreativeSpecification] (val x: Self) extends AnyVal {
    
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
    def setCreativeCompanionSizesVarargs(value: AdSize*): Self = this.set("creativeCompanionSizes", js.Array(value :_*))
    
    @scala.inline
    def setCreativeCompanionSizes(value: js.Array[AdSize]): Self = this.set("creativeCompanionSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeCompanionSizes: Self = this.set("creativeCompanionSizes", js.undefined)
    
    @scala.inline
    def setCreativeSize(value: AdSize): Self = this.set("creativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeSize: Self = this.set("creativeSize", js.undefined)
  }
}
