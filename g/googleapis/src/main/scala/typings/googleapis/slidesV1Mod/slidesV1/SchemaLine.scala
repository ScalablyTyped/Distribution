package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PageElement kind representing a non-connector line, straight connector,
  * curved connector, or bent connector.
  */
trait SchemaLine extends StObject {
  
  /**
    * The category of the line.  It matches the `category` specified in
    * CreateLineRequest, and can be updated with UpdateLineCategoryRequest.
    */
  var lineCategory: js.UndefOr[String] = js.undefined
  
  /**
    * The properties of the line.
    */
  var lineProperties: js.UndefOr[SchemaLineProperties] = js.undefined
  
  /**
    * The type of the line.
    */
  var lineType: js.UndefOr[String] = js.undefined
}
object SchemaLine {
  
  inline def apply(): SchemaLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLine]
  }
  
  extension [Self <: SchemaLine](x: Self) {
    
    inline def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
    
    inline def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
    
    inline def setLineProperties(value: SchemaLineProperties): Self = StObject.set(x, "lineProperties", value.asInstanceOf[js.Any])
    
    inline def setLinePropertiesUndefined: Self = StObject.set(x, "lineProperties", js.undefined)
    
    inline def setLineType(value: String): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
    
    inline def setLineTypeUndefined: Self = StObject.set(x, "lineType", js.undefined)
  }
}
