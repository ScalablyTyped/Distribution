package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHtmlContent extends StObject {
  
  /**
    * The height of the HTML snippet in pixels. Can be used to filter the response of the creatives.list method.
    */
  var height: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The HTML snippet that displays the ad when inserted in the web page.
    */
  var snippet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The width of the HTML snippet in pixels. Can be used to filter the response of the creatives.list method.
    */
  var width: js.UndefOr[Double | Null] = js.undefined
}
object SchemaHtmlContent {
  
  inline def apply(): SchemaHtmlContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHtmlContent]
  }
  
  extension [Self <: SchemaHtmlContent](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetNull: Self = StObject.set(x, "snippet", null)
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
