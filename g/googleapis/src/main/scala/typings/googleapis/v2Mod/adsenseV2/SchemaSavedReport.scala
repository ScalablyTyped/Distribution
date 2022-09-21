package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSavedReport extends StObject {
  
  /**
    * Output only. Resource name of the report. Format: accounts/{account\}/reports/{report\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Report title as specified by publisher.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaSavedReport {
  
  inline def apply(): SchemaSavedReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedReport]
  }
  
  extension [Self <: SchemaSavedReport](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
