package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageviewData extends StObject {
  
  /** The URL of the page that the visitor viewed. */
  var pagePath: js.UndefOr[String] = js.native
  
  /** The title of the page that the visitor viewed. */
  var pageTitle: js.UndefOr[String] = js.native
}
object PageviewData {
  
  @scala.inline
  def apply(): PageviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageviewData]
  }
  
  @scala.inline
  implicit class PageviewDataMutableBuilder[Self <: PageviewData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPagePath(value: String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagePathUndefined: Self = StObject.set(x, "pagePath", js.undefined)
    
    @scala.inline
    def setPageTitle(value: String): Self = StObject.set(x, "pageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTitleUndefined: Self = StObject.set(x, "pageTitle", js.undefined)
  }
}
