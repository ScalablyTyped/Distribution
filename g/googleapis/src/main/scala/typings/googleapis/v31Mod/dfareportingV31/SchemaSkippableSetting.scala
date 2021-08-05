package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Skippable Settings
  */
trait SchemaSkippableSetting extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#skippableSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Amount of time to play videos served to this placement before counting a
    * view. Applicable when skippable is true.
    */
  var progressOffset: js.UndefOr[SchemaVideoOffset] = js.undefined
  
  /**
    * Amount of time to play videos served to this placement before the skip
    * button should appear. Applicable when skippable is true.
    */
  var skipOffset: js.UndefOr[SchemaVideoOffset] = js.undefined
  
  /**
    * Whether the user can skip creatives served to this placement.
    */
  var skippable: js.UndefOr[Boolean] = js.undefined
}
object SchemaSkippableSetting {
  
  inline def apply(): SchemaSkippableSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSkippableSetting]
  }
  
  extension [Self <: SchemaSkippableSetting](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProgressOffset(value: SchemaVideoOffset): Self = StObject.set(x, "progressOffset", value.asInstanceOf[js.Any])
    
    inline def setProgressOffsetUndefined: Self = StObject.set(x, "progressOffset", js.undefined)
    
    inline def setSkipOffset(value: SchemaVideoOffset): Self = StObject.set(x, "skipOffset", value.asInstanceOf[js.Any])
    
    inline def setSkipOffsetUndefined: Self = StObject.set(x, "skipOffset", js.undefined)
    
    inline def setSkippable(value: Boolean): Self = StObject.set(x, "skippable", value.asInstanceOf[js.Any])
    
    inline def setSkippableUndefined: Self = StObject.set(x, "skippable", js.undefined)
  }
}
