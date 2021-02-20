package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Common properties for a page element.  Note: When you initially create a
  * PageElement, the API may modify the values of both `size` and `transform`,
  * but the visual size will be unchanged.
  */
@js.native
trait SchemaPageElementProperties extends StObject {
  
  /**
    * The object ID of the page where the element is located.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  
  /**
    * The size of the element.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  
  /**
    * The transform for the element.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.native
}
object SchemaPageElementProperties {
  
  @scala.inline
  def apply(): SchemaPageElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageElementProperties]
  }
  
  @scala.inline
  implicit class SchemaPageElementPropertiesMutableBuilder[Self <: SchemaPageElementProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
    
    @scala.inline
    def setSize(value: SchemaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTransform(value: SchemaAffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
