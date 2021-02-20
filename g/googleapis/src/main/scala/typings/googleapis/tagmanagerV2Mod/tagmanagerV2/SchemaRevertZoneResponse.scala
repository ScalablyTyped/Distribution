package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of reverting a zone in a workspace.
  */
@js.native
trait SchemaRevertZoneResponse extends StObject {
  
  /**
    * Zone as it appears in the latest container version since the last
    * workspace synchronization operation. If no zone is present, that means
    * the zone was deleted in the latest container version.
    */
  var zone: js.UndefOr[SchemaZone] = js.native
}
object SchemaRevertZoneResponse {
  
  @scala.inline
  def apply(): SchemaRevertZoneResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertZoneResponse]
  }
  
  @scala.inline
  implicit class SchemaRevertZoneResponseMutableBuilder[Self <: SchemaRevertZoneResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZone(value: SchemaZone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
