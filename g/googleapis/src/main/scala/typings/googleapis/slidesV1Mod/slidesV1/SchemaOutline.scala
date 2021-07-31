package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The outline of a PageElement.  If these fields are unset, they may be
  * inherited from a parent placeholder if it exists. If there is no parent,
  * the fields will default to the value used for new page elements created in
  * the Slides editor, which may depend on the page element kind.
  */
trait SchemaOutline extends StObject {
  
  /**
    * The dash style of the outline.
    */
  var dashStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The fill of the outline.
    */
  var outlineFill: js.UndefOr[SchemaOutlineFill] = js.undefined
  
  /**
    * The outline property state.  Updating the outline on a page element will
    * implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no outline on a page element, set
    * this field to `NOT_RENDERED`. In this case, any other outline fields set
    * in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.undefined
  
  /**
    * The thickness of the outline.
    */
  var weight: js.UndefOr[SchemaDimension] = js.undefined
}
object SchemaOutline {
  
  @scala.inline
  def apply(): SchemaOutline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutline]
  }
  
  @scala.inline
  implicit class SchemaOutlineMutableBuilder[Self <: SchemaOutline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setOutlineFill(value: SchemaOutlineFill): Self = StObject.set(x, "outlineFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineFillUndefined: Self = StObject.set(x, "outlineFill", js.undefined)
    
    @scala.inline
    def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    @scala.inline
    def setWeight(value: SchemaDimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
