package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistory extends StObject {
  
  /**
    * A short human-readable (plain text) name to display in the UI. Maximum of 100 characters. - In response: present if set during create. - In create request: optional
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A unique identifier within a project for this History. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create request: never set
    */
  var historyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A name to uniquely identify a history within a project. Maximum of 200 characters. - In response always set - In create request: always set
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The platform of the test history. - In response: always set. Returns the platform of the last execution if unknown.
    */
  var testPlatform: js.UndefOr[String | Null] = js.undefined
}
object SchemaHistory {
  
  inline def apply(): SchemaHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistory]
  }
  
  extension [Self <: SchemaHistory](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdNull: Self = StObject.set(x, "historyId", null)
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTestPlatform(value: String): Self = StObject.set(x, "testPlatform", value.asInstanceOf[js.Any])
    
    inline def setTestPlatformNull: Self = StObject.set(x, "testPlatform", null)
    
    inline def setTestPlatformUndefined: Self = StObject.set(x, "testPlatform", js.undefined)
  }
}
