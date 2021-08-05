package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlContent extends StObject {
  
  /** The height of the HTML snippet in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The HTML snippet that displays the ad when inserted in the web page. */
  var snippet: js.UndefOr[String] = js.undefined
  
  /** The width of the HTML snippet in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}
object HtmlContent {
  
  inline def apply(): HtmlContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlContent]
  }
  
  extension [Self <: HtmlContent](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
