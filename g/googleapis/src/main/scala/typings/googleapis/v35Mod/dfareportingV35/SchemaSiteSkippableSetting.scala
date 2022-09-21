package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSiteSkippableSetting extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#siteSkippableSetting".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Amount of time to play videos served to this site template before counting a view. Applicable when skippable is true.
    */
  var progressOffset: js.UndefOr[SchemaVideoOffset] = js.undefined
  
  /**
    * Amount of time to play videos served to this site before the skip button should appear. Applicable when skippable is true.
    */
  var skipOffset: js.UndefOr[SchemaVideoOffset] = js.undefined
  
  /**
    * Whether the user can skip creatives served to this site. This will act as default for new placements created under this site.
    */
  var skippable: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSiteSkippableSetting {
  
  inline def apply(): SchemaSiteSkippableSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteSkippableSetting]
  }
  
  extension [Self <: SchemaSiteSkippableSetting](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProgressOffset(value: SchemaVideoOffset): Self = StObject.set(x, "progressOffset", value.asInstanceOf[js.Any])
    
    inline def setProgressOffsetUndefined: Self = StObject.set(x, "progressOffset", js.undefined)
    
    inline def setSkipOffset(value: SchemaVideoOffset): Self = StObject.set(x, "skipOffset", value.asInstanceOf[js.Any])
    
    inline def setSkipOffsetUndefined: Self = StObject.set(x, "skipOffset", js.undefined)
    
    inline def setSkippable(value: Boolean): Self = StObject.set(x, "skippable", value.asInstanceOf[js.Any])
    
    inline def setSkippableNull: Self = StObject.set(x, "skippable", null)
    
    inline def setSkippableUndefined: Self = StObject.set(x, "skippable", js.undefined)
  }
}
