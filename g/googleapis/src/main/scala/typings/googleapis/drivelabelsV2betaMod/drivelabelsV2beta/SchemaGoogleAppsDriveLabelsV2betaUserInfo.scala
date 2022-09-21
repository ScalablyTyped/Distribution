package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaUserInfo extends StObject {
  
  /**
    * The identifier for this user that can be used with the People API to get more information. For example, people/12345678.
    */
  var person: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaUserInfo {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaUserInfo]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaUserInfo](x: Self) {
    
    inline def setPerson(value: String): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonNull: Self = StObject.set(x, "person", null)
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
