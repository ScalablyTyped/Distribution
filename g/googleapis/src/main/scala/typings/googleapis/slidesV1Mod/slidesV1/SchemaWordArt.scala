package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PageElement kind representing word art.
  */
trait SchemaWordArt extends StObject {
  
  /**
    * The text rendered as word art.
    */
  var renderedText: js.UndefOr[String] = js.undefined
}
object SchemaWordArt {
  
  inline def apply(): SchemaWordArt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWordArt]
  }
  
  extension [Self <: SchemaWordArt](x: Self) {
    
    inline def setRenderedText(value: String): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
    
    inline def setRenderedTextUndefined: Self = StObject.set(x, "renderedText", js.undefined)
  }
}
