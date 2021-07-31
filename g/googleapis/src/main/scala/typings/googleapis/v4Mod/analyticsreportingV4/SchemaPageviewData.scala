package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents details collected when the visitor views a page.
  */
trait SchemaPageviewData extends StObject {
  
  /**
    * The URL of the page that the visitor viewed.
    */
  var pagePath: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the page that the visitor viewed.
    */
  var pageTitle: js.UndefOr[String] = js.undefined
}
object SchemaPageviewData {
  
  @scala.inline
  def apply(): SchemaPageviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageviewData]
  }
  
  @scala.inline
  implicit class SchemaPageviewDataMutableBuilder[Self <: SchemaPageviewData] (val x: Self) extends AnyVal {
    
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
