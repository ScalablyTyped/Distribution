package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkippableSetting extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#skippableSetting". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Amount of time to play videos served to this placement before counting a view. Applicable when skippable is true. */
  var progressOffset: js.UndefOr[VideoOffset] = js.undefined
  
  /** Amount of time to play videos served to this placement before the skip button should appear. Applicable when skippable is true. */
  var skipOffset: js.UndefOr[VideoOffset] = js.undefined
  
  /** Whether the user can skip creatives served to this placement. */
  var skippable: js.UndefOr[Boolean] = js.undefined
}
object SkippableSetting {
  
  inline def apply(): SkippableSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkippableSetting]
  }
  
  extension [Self <: SkippableSetting](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProgressOffset(value: VideoOffset): Self = StObject.set(x, "progressOffset", value.asInstanceOf[js.Any])
    
    inline def setProgressOffsetUndefined: Self = StObject.set(x, "progressOffset", js.undefined)
    
    inline def setSkipOffset(value: VideoOffset): Self = StObject.set(x, "skipOffset", value.asInstanceOf[js.Any])
    
    inline def setSkipOffsetUndefined: Self = StObject.set(x, "skipOffset", js.undefined)
    
    inline def setSkippable(value: Boolean): Self = StObject.set(x, "skippable", value.asInstanceOf[js.Any])
    
    inline def setSkippableUndefined: Self = StObject.set(x, "skippable", js.undefined)
  }
}
