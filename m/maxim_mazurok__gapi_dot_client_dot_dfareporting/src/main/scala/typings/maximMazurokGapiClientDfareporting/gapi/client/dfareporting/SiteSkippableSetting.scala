package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SiteSkippableSetting extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#siteSkippableSetting". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Amount of time to play videos served to this site template before counting a view. Applicable when skippable is true. */
  var progressOffset: js.UndefOr[VideoOffset] = js.undefined
  
  /** Amount of time to play videos served to this site before the skip button should appear. Applicable when skippable is true. */
  var skipOffset: js.UndefOr[VideoOffset] = js.undefined
  
  /** Whether the user can skip creatives served to this site. This will act as default for new placements created under this site. */
  var skippable: js.UndefOr[Boolean] = js.undefined
}
object SiteSkippableSetting {
  
  inline def apply(): SiteSkippableSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteSkippableSetting]
  }
  
  extension [Self <: SiteSkippableSetting](x: Self) {
    
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
