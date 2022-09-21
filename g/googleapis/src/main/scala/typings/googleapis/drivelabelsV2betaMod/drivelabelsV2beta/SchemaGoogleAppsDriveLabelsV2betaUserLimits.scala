package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaUserLimits extends StObject {
  
  /**
    * Limits for list-variant of a Field type.
    */
  var listLimits: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaListLimits] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaUserLimits {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaUserLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaUserLimits]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaUserLimits](x: Self) {
    
    inline def setListLimits(value: SchemaGoogleAppsDriveLabelsV2betaListLimits): Self = StObject.set(x, "listLimits", value.asInstanceOf[js.Any])
    
    inline def setListLimitsUndefined: Self = StObject.set(x, "listLimits", js.undefined)
  }
}
