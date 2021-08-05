package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information for a creative that is associated with a
  * Programmatic Guaranteed/Preferred Deal in Ad Manager.
  */
trait SchemaCreativeSpecification extends StObject {
  
  /**
    * Companion sizes may be filled in only when this is a video creative.
    */
  var creativeCompanionSizes: js.UndefOr[js.Array[SchemaAdSize]] = js.undefined
  
  /**
    * The size of the creative.
    */
  var creativeSize: js.UndefOr[SchemaAdSize] = js.undefined
}
object SchemaCreativeSpecification {
  
  inline def apply(): SchemaCreativeSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeSpecification]
  }
  
  extension [Self <: SchemaCreativeSpecification](x: Self) {
    
    inline def setCreativeCompanionSizes(value: js.Array[SchemaAdSize]): Self = StObject.set(x, "creativeCompanionSizes", value.asInstanceOf[js.Any])
    
    inline def setCreativeCompanionSizesUndefined: Self = StObject.set(x, "creativeCompanionSizes", js.undefined)
    
    inline def setCreativeCompanionSizesVarargs(value: SchemaAdSize*): Self = StObject.set(x, "creativeCompanionSizes", js.Array(value :_*))
    
    inline def setCreativeSize(value: SchemaAdSize): Self = StObject.set(x, "creativeSize", value.asInstanceOf[js.Any])
    
    inline def setCreativeSizeUndefined: Self = StObject.set(x, "creativeSize", js.undefined)
  }
}
