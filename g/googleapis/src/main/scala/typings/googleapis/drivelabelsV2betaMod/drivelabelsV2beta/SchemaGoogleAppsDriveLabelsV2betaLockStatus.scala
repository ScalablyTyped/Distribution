package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaLockStatus extends StObject {
  
  /**
    * Output only. Indicates whether this label component is the (direct) target of a LabelLock. A label component can be implicitly locked even if it's not the direct target of a LabelLock, in which case this field is set to false.
    */
  var locked: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaLockStatus {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaLockStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaLockStatus]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaLockStatus](x: Self) {
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedNull: Self = StObject.set(x, "locked", null)
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}
