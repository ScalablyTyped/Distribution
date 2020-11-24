package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information for a creative that is associated with a
  * Programmatic Guaranteed/Preferred Deal in Ad Manager.
  */
@js.native
trait SchemaCreativeSpecification extends js.Object {
  
  /**
    * Companion sizes may be filled in only when this is a video creative.
    */
  var creativeCompanionSizes: js.UndefOr[js.Array[SchemaAdSize]] = js.native
  
  /**
    * The size of the creative.
    */
  var creativeSize: js.UndefOr[SchemaAdSize] = js.native
}
object SchemaCreativeSpecification {
  
  @scala.inline
  def apply(): SchemaCreativeSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeSpecification]
  }
  
  @scala.inline
  implicit class SchemaCreativeSpecificationOps[Self <: SchemaCreativeSpecification] (val x: Self) extends AnyVal {
    
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
    def setCreativeCompanionSizesVarargs(value: SchemaAdSize*): Self = this.set("creativeCompanionSizes", js.Array(value :_*))
    
    @scala.inline
    def setCreativeCompanionSizes(value: js.Array[SchemaAdSize]): Self = this.set("creativeCompanionSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeCompanionSizes: Self = this.set("creativeCompanionSizes", js.undefined)
    
    @scala.inline
    def setCreativeSize(value: SchemaAdSize): Self = this.set("creativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeSize: Self = this.set("creativeSize", js.undefined)
  }
}
