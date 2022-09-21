package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPageviewData extends StObject {
  
  /**
    * The URL of the page that the visitor viewed.
    */
  var pagePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of the page that the visitor viewed.
    */
  var pageTitle: js.UndefOr[String | Null] = js.undefined
}
object SchemaPageviewData {
  
  inline def apply(): SchemaPageviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageviewData]
  }
  
  extension [Self <: SchemaPageviewData](x: Self) {
    
    inline def setPagePath(value: String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
    
    inline def setPagePathNull: Self = StObject.set(x, "pagePath", null)
    
    inline def setPagePathUndefined: Self = StObject.set(x, "pagePath", js.undefined)
    
    inline def setPageTitle(value: String): Self = StObject.set(x, "pageTitle", value.asInstanceOf[js.Any])
    
    inline def setPageTitleNull: Self = StObject.set(x, "pageTitle", null)
    
    inline def setPageTitleUndefined: Self = StObject.set(x, "pageTitle", js.undefined)
  }
}
