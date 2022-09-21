package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedReport extends StObject {
  
  /** Output only. Resource name of the report. Format: accounts/{account}/reports/{report} */
  var name: js.UndefOr[String] = js.undefined
  
  /** Report title as specified by publisher. */
  var title: js.UndefOr[String] = js.undefined
}
object SavedReport {
  
  inline def apply(): SavedReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavedReport]
  }
  
  extension [Self <: SavedReport](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
