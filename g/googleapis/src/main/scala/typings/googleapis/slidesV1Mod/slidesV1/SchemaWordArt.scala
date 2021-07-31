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
  
  @scala.inline
  def apply(): SchemaWordArt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWordArt]
  }
  
  @scala.inline
  implicit class SchemaWordArtMutableBuilder[Self <: SchemaWordArt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderedText(value: String): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedTextUndefined: Self = StObject.set(x, "renderedText", js.undefined)
  }
}
