package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteVideoCallMetadata extends StObject {
  
  /** Thor meeting space. */
  var meetingSpace: js.UndefOr[MeetingSpace] = js.undefined
  
  /** If this field is set to true, server should still contact external backends to get metadata for search but clients should not render this chip. */
  var shouldNotRender: js.UndefOr[Boolean] = js.undefined
  
  /** Whether this meeting space was created via Dynamite in this Dynamite group. */
  var wasCreatedInCurrentGroup: js.UndefOr[Boolean] = js.undefined
}
object AppsDynamiteVideoCallMetadata {
  
  inline def apply(): AppsDynamiteVideoCallMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteVideoCallMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteVideoCallMetadata] (val x: Self) extends AnyVal {
    
    inline def setMeetingSpace(value: MeetingSpace): Self = StObject.set(x, "meetingSpace", value.asInstanceOf[js.Any])
    
    inline def setMeetingSpaceUndefined: Self = StObject.set(x, "meetingSpace", js.undefined)
    
    inline def setShouldNotRender(value: Boolean): Self = StObject.set(x, "shouldNotRender", value.asInstanceOf[js.Any])
    
    inline def setShouldNotRenderUndefined: Self = StObject.set(x, "shouldNotRender", js.undefined)
    
    inline def setWasCreatedInCurrentGroup(value: Boolean): Self = StObject.set(x, "wasCreatedInCurrentGroup", value.asInstanceOf[js.Any])
    
    inline def setWasCreatedInCurrentGroupUndefined: Self = StObject.set(x, "wasCreatedInCurrentGroup", js.undefined)
  }
}
