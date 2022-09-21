package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetReleaseExecutableResponse extends StObject {
  
  /**
    * Executable view of the `Ruleset` referenced by the `Release`.
    */
  var executable: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Rules runtime version of the executable.
    */
  var executableVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * `Language` used to generate the executable bytes.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * `Ruleset` name associated with the `Release` executable.
    */
  var rulesetName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional, indicates the freshness of the result. The response is guaranteed to be the latest within an interval up to the sync_time (inclusive).
    */
  var syncTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp for the most recent `Release.update_time`.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetReleaseExecutableResponse {
  
  inline def apply(): SchemaGetReleaseExecutableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetReleaseExecutableResponse]
  }
  
  extension [Self <: SchemaGetReleaseExecutableResponse](x: Self) {
    
    inline def setExecutable(value: String): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
    
    inline def setExecutableNull: Self = StObject.set(x, "executable", null)
    
    inline def setExecutableUndefined: Self = StObject.set(x, "executable", js.undefined)
    
    inline def setExecutableVersion(value: String): Self = StObject.set(x, "executableVersion", value.asInstanceOf[js.Any])
    
    inline def setExecutableVersionNull: Self = StObject.set(x, "executableVersion", null)
    
    inline def setExecutableVersionUndefined: Self = StObject.set(x, "executableVersion", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setRulesetName(value: String): Self = StObject.set(x, "rulesetName", value.asInstanceOf[js.Any])
    
    inline def setRulesetNameNull: Self = StObject.set(x, "rulesetName", null)
    
    inline def setRulesetNameUndefined: Self = StObject.set(x, "rulesetName", js.undefined)
    
    inline def setSyncTime(value: String): Self = StObject.set(x, "syncTime", value.asInstanceOf[js.Any])
    
    inline def setSyncTimeNull: Self = StObject.set(x, "syncTime", null)
    
    inline def setSyncTimeUndefined: Self = StObject.set(x, "syncTime", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
