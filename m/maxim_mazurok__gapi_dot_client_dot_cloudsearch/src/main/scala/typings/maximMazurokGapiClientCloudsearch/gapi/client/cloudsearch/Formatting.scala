package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatting extends StObject {
  
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /** This indicates that the segment should be rendered as highlighted or visually emphasized. */
  var highlight: js.UndefOr[Boolean] = js.undefined
  
  var italics: js.UndefOr[Boolean] = js.undefined
  
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, this indicates that the segment should be rendered with the specified style. The absence of an explicit style represents "no style", i.e. the segment can be rendered with
    * the default style chosen by the application.
    */
  var style: js.UndefOr[String] = js.undefined
  
  var underline: js.UndefOr[Boolean] = js.undefined
}
object Formatting {
  
  inline def apply(): Formatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Formatting] (val x: Self) extends AnyVal {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
