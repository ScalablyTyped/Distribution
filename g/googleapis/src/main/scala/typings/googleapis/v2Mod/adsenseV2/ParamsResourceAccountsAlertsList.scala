package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAlertsList
  extends StObject
     with StandardParameters {
  
  /**
    * The language to use for translating alert messages. If unspecified, this defaults to the user's display language. If the given language is not supported, alerts will be returned in English. The language is specified as an [IETF BCP-47 language code](https://en.wikipedia.org/wiki/IETF_language_tag).
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The account which owns the collection of alerts. Format: accounts/{account\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAlertsList {
  
  inline def apply(): ParamsResourceAccountsAlertsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAlertsList]
  }
  
  extension [Self <: ParamsResourceAccountsAlertsList](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
