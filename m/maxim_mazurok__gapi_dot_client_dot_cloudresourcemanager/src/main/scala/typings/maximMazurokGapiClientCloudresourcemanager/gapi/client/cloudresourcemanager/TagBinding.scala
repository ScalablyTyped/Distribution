package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagBinding extends StObject {
  
  /**
    * Output only. The name of the TagBinding. This is a String of the form: `tagBindings/{full-resource-name}/{tag-value-name}` (e.g.
    * `tagBindings/%2F%2Fcloudresourcemanager.googleapis.com%2Fprojects%2F123/tagValues/456`).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The full resource name of the resource the TagValue is bound to. E.g. `//cloudresourcemanager.googleapis.com/projects/123` */
  var parent: js.UndefOr[String] = js.undefined
  
  /** The TagValue of the TagBinding. Must be of the form `tagValues/456`. */
  var tagValue: js.UndefOr[String] = js.undefined
}
object TagBinding {
  
  inline def apply(): TagBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagBinding] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setTagValue(value: String): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
    
    inline def setTagValueUndefined: Self = StObject.set(x, "tagValue", js.undefined)
  }
}
