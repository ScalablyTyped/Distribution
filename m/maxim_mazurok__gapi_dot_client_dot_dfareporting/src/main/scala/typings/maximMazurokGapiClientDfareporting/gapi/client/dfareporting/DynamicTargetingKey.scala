package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicTargetingKey extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#dynamicTargetingKey". */
  var kind: js.UndefOr[String] = js.native
  
  /** Name of this dynamic targeting key. This is a required field. Must be less than 256 characters long and cannot contain commas. All characters are converted to lowercase. */
  var name: js.UndefOr[String] = js.native
  
  /** ID of the object of this dynamic targeting key. This is a required field. */
  var objectId: js.UndefOr[String] = js.native
  
  /** Type of the object of this dynamic targeting key. This is a required field. */
  var objectType: js.UndefOr[String] = js.native
}
object DynamicTargetingKey {
  
  @scala.inline
  def apply(): DynamicTargetingKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicTargetingKey]
  }
  
  @scala.inline
  implicit class DynamicTargetingKeyMutableBuilder[Self <: DynamicTargetingKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
  }
}
