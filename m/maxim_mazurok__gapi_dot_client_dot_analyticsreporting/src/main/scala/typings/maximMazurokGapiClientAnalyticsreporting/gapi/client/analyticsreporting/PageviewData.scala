package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageviewData extends StObject {
  
  /** The URL of the page that the visitor viewed. */
  var pagePath: js.UndefOr[String] = js.undefined
  
  /** The title of the page that the visitor viewed. */
  var pageTitle: js.UndefOr[String] = js.undefined
}
object PageviewData {
  
  inline def apply(): PageviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageviewData]
  }
  
  extension [Self <: PageviewData](x: Self) {
    
    inline def setPagePath(value: String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
    
    inline def setPagePathUndefined: Self = StObject.set(x, "pagePath", js.undefined)
    
    inline def setPageTitle(value: String): Self = StObject.set(x, "pageTitle", value.asInstanceOf[js.Any])
    
    inline def setPageTitleUndefined: Self = StObject.set(x, "pageTitle", js.undefined)
  }
}
