package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2UserInfo extends StObject {
  
  /**
    * The identifier for this user that can be used with the People API to get more information. For example, people/12345678.
    */
  var person: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2UserInfo {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2UserInfo]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2UserInfo](x: Self) {
    
    inline def setPerson(value: String): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonNull: Self = StObject.set(x, "person", null)
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
