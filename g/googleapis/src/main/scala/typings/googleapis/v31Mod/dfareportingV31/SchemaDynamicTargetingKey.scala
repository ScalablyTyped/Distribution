package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a dynamic targeting key. Dynamic targeting keys are
  * unique, user-friendly labels, created at the advertiser level in DCM, that
  * can be assigned to ads, creatives, and placements and used for targeting
  * with Studio dynamic creatives. Use these labels instead of numeric Campaign
  * Manager IDs (such as placement IDs) to save time and avoid errors in your
  * dynamic feeds.
  */
@js.native
trait SchemaDynamicTargetingKey extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#dynamicTargetingKey&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this dynamic targeting key. This is a required field. Must be
    * less than 256 characters long and cannot contain commas. All characters
    * are converted to lowercase.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * ID of the object of this dynamic targeting key. This is a required field.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * Type of the object of this dynamic targeting key. This is a required
    * field.
    */
  var objectType: js.UndefOr[String] = js.native
}
object SchemaDynamicTargetingKey {
  
  @scala.inline
  def apply(): SchemaDynamicTargetingKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicTargetingKey]
  }
  
  @scala.inline
  implicit class SchemaDynamicTargetingKeyMutableBuilder[Self <: SchemaDynamicTargetingKey] (val x: Self) extends AnyVal {
    
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
