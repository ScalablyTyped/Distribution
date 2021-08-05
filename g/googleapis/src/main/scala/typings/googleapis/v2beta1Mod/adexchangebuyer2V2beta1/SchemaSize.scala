package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message depicting the size of the creative. The units of width and height
  * depend on the type of the targeting.
  */
trait SchemaSize extends StObject {
  
  /**
    * The height of the creative.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the creative
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SchemaSize {
  
  inline def apply(): SchemaSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSize]
  }
  
  extension [Self <: SchemaSize](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
