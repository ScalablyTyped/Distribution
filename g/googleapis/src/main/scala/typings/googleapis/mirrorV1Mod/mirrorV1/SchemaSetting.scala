package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A setting for Glass.
  */
trait SchemaSetting extends StObject {
  
  /**
    * The setting&#39;s ID. The following IDs are valid:   - locale - The key
    * to the user’s language/locale (BCP 47 identifier) that Glassware should
    * use to render localized content.   - timezone - The key to the user’s
    * current time zone region as defined in the tz database. Example:
    * America/Los_Angeles.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The type of resource. This is always mirror#setting.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The setting value, as a string.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaSetting {
  
  inline def apply(): SchemaSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetting]
  }
  
  extension [Self <: SchemaSetting](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
