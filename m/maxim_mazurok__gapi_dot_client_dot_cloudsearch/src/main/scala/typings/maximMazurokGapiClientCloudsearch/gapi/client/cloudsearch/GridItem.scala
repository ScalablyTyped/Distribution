package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridItem extends StObject {
  
  /** A user-specified identifier for this grid item. This identifier will be returned in the parent Grid's on_click callback's parameters. */
  var identifier: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[ImageComponent] = js.undefined
  
  var layout: js.UndefOr[String] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var textAlignment: js.UndefOr[String] = js.undefined
  
  /** Text properties. */
  var title: js.UndefOr[String] = js.undefined
}
object GridItem {
  
  inline def apply(): GridItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridItem]
  }
  
  extension [Self <: GridItem](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setImage(value: ImageComponent): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTextAlignment(value: String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
    
    inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
