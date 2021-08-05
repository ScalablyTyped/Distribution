package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a dynamic targeting key. Dynamic targeting keys are
  * unique, user-friendly labels, created at the advertiser level in DCM, that
  * can be assigned to ads, creatives, and placements and used for targeting
  * with Studio dynamic creatives. Use these labels instead of numeric Campaign
  * Manager IDs (such as placement IDs) to save time and avoid errors in your
  * dynamic feeds.
  */
trait SchemaDynamicTargetingKey extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#dynamicTargetingKey&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this dynamic targeting key. This is a required field. Must be
    * less than 256 characters long and cannot contain commas. All characters
    * are converted to lowercase.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the object of this dynamic targeting key. This is a required field.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the object of this dynamic targeting key. This is a required
    * field.
    */
  var objectType: js.UndefOr[String] = js.undefined
}
object SchemaDynamicTargetingKey {
  
  inline def apply(): SchemaDynamicTargetingKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicTargetingKey]
  }
  
  extension [Self <: SchemaDynamicTargetingKey](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
  }
}
