package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the dimensions of ads, placements, creatives, or creative
  * assets.
  */
trait SchemaSize extends StObject {
  
  /**
    * Height of this size. Acceptable values are 0 to 32767, inclusive.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * IAB standard size. This is a read-only, auto-generated field.
    */
  var iab: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ID of this size. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#size&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Width of this size. Acceptable values are 0 to 32767, inclusive.
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
    
    inline def setIab(value: Boolean): Self = StObject.set(x, "iab", value.asInstanceOf[js.Any])
    
    inline def setIabUndefined: Self = StObject.set(x, "iab", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
