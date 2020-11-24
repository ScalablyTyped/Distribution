package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The outline of a PageElement.  If these fields are unset, they may be
  * inherited from a parent placeholder if it exists. If there is no parent,
  * the fields will default to the value used for new page elements created in
  * the Slides editor, which may depend on the page element kind.
  */
@js.native
trait SchemaOutline extends js.Object {
  
  /**
    * The dash style of the outline.
    */
  var dashStyle: js.UndefOr[String] = js.native
  
  /**
    * The fill of the outline.
    */
  var outlineFill: js.UndefOr[SchemaOutlineFill] = js.native
  
  /**
    * The outline property state.  Updating the outline on a page element will
    * implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no outline on a page element, set
    * this field to `NOT_RENDERED`. In this case, any other outline fields set
    * in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  
  /**
    * The thickness of the outline.
    */
  var weight: js.UndefOr[SchemaDimension] = js.native
}
object SchemaOutline {
  
  @scala.inline
  def apply(): SchemaOutline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutline]
  }
  
  @scala.inline
  implicit class SchemaOutlineOps[Self <: SchemaOutline] (val x: Self) extends AnyVal {
    
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
    def setDashStyle(value: String): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    
    @scala.inline
    def setOutlineFill(value: SchemaOutlineFill): Self = this.set("outlineFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineFill: Self = this.set("outlineFill", js.undefined)
    
    @scala.inline
    def setPropertyState(value: String): Self = this.set("propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyState: Self = this.set("propertyState", js.undefined)
    
    @scala.inline
    def setWeight(value: SchemaDimension): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
