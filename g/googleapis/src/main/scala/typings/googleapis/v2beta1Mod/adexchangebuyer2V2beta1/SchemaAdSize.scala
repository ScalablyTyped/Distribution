package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents size of a single ad slot, or a creative.
  */
trait SchemaAdSize extends StObject {
  
  /**
    * The height of the ad slot in pixels. This field will be present only when
    * size type is `PIXEL`.
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * The size type of the ad slot.
    */
  var sizeType: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the ad slot in pixels. This field will be present only when
    * size type is `PIXEL`.
    */
  var width: js.UndefOr[String] = js.undefined
}
object SchemaAdSize {
  
  @scala.inline
  def apply(): SchemaAdSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdSize]
  }
  
  @scala.inline
  implicit class SchemaAdSizeMutableBuilder[Self <: SchemaAdSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSizeType(value: String): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
