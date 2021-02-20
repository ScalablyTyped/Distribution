package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkippableSetting extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#skippableSetting". */
  var kind: js.UndefOr[String] = js.native
  
  /** Amount of time to play videos served to this placement before counting a view. Applicable when skippable is true. */
  var progressOffset: js.UndefOr[VideoOffset] = js.native
  
  /** Amount of time to play videos served to this placement before the skip button should appear. Applicable when skippable is true. */
  var skipOffset: js.UndefOr[VideoOffset] = js.native
  
  /** Whether the user can skip creatives served to this placement. */
  var skippable: js.UndefOr[Boolean] = js.native
}
object SkippableSetting {
  
  @scala.inline
  def apply(): SkippableSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkippableSetting]
  }
  
  @scala.inline
  implicit class SkippableSettingMutableBuilder[Self <: SkippableSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProgressOffset(value: VideoOffset): Self = StObject.set(x, "progressOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressOffsetUndefined: Self = StObject.set(x, "progressOffset", js.undefined)
    
    @scala.inline
    def setSkipOffset(value: VideoOffset): Self = StObject.set(x, "skipOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipOffsetUndefined: Self = StObject.set(x, "skipOffset", js.undefined)
    
    @scala.inline
    def setSkippable(value: Boolean): Self = StObject.set(x, "skippable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippableUndefined: Self = StObject.set(x, "skippable", js.undefined)
  }
}
