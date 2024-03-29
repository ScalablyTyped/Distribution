package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlaceholder extends StObject {
  
  /**
    * The index of the placeholder. If the same placeholder types are present in the same page, they would have different index values.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The object ID of this shape's parent placeholder. If unset, the parent placeholder shape does not exist, so the shape does not inherit properties from any other shape.
    */
  var parentObjectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the placeholder.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlaceholder {
  
  inline def apply(): SchemaPlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaceholder]
  }
  
  extension [Self <: SchemaPlaceholder](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setParentObjectId(value: String): Self = StObject.set(x, "parentObjectId", value.asInstanceOf[js.Any])
    
    inline def setParentObjectIdNull: Self = StObject.set(x, "parentObjectId", null)
    
    inline def setParentObjectIdUndefined: Self = StObject.set(x, "parentObjectId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
