package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTML content for a creative.
  */
trait SchemaHtmlContent extends StObject {
  
  /**
    * The height of the HTML snippet in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The HTML snippet that displays the ad when inserted in the web page.
    */
  var snippet: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the HTML snippet in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SchemaHtmlContent {
  
  @scala.inline
  def apply(): SchemaHtmlContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHtmlContent]
  }
  
  @scala.inline
  implicit class SchemaHtmlContentMutableBuilder[Self <: SchemaHtmlContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
