package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the properties of a Page.
  */
@js.native
trait SchemaUpdatePagePropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `pageProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the page background solid fill color, set `fields`
    * to `&quot;pageBackgroundFill.solidFill.color&quot;`.  To reset a property
    * to its default value, include its field name in the field mask but leave
    * the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The object ID of the page the update is applied to.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The page properties to update.
    */
  var pageProperties: js.UndefOr[SchemaPageProperties] = js.native
}
object SchemaUpdatePagePropertiesRequest {
  
  @scala.inline
  def apply(): SchemaUpdatePagePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePagePropertiesRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdatePagePropertiesRequestMutableBuilder[Self <: SchemaUpdatePagePropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setPageProperties(value: SchemaPageProperties): Self = StObject.set(x, "pageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagePropertiesUndefined: Self = StObject.set(x, "pageProperties", js.undefined)
  }
}
