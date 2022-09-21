package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoCallMetadata extends StObject {
  
  /**
    * Thor meeting space.
    */
  var meetingSpace: js.UndefOr[SchemaMeetingSpace] = js.undefined
  
  /**
    * If this field is set to true, server should still contact external backends to get metadata for search but clients should not render this chip.
    */
  var shouldNotRender: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this meeting space was created via Dynamite in this Dynamite group.
    */
  var wasCreatedInCurrentGroup: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaVideoCallMetadata {
  
  inline def apply(): SchemaVideoCallMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoCallMetadata]
  }
  
  extension [Self <: SchemaVideoCallMetadata](x: Self) {
    
    inline def setMeetingSpace(value: SchemaMeetingSpace): Self = StObject.set(x, "meetingSpace", value.asInstanceOf[js.Any])
    
    inline def setMeetingSpaceUndefined: Self = StObject.set(x, "meetingSpace", js.undefined)
    
    inline def setShouldNotRender(value: Boolean): Self = StObject.set(x, "shouldNotRender", value.asInstanceOf[js.Any])
    
    inline def setShouldNotRenderNull: Self = StObject.set(x, "shouldNotRender", null)
    
    inline def setShouldNotRenderUndefined: Self = StObject.set(x, "shouldNotRender", js.undefined)
    
    inline def setWasCreatedInCurrentGroup(value: Boolean): Self = StObject.set(x, "wasCreatedInCurrentGroup", value.asInstanceOf[js.Any])
    
    inline def setWasCreatedInCurrentGroupNull: Self = StObject.set(x, "wasCreatedInCurrentGroup", null)
    
    inline def setWasCreatedInCurrentGroupUndefined: Self = StObject.set(x, "wasCreatedInCurrentGroup", js.undefined)
  }
}
