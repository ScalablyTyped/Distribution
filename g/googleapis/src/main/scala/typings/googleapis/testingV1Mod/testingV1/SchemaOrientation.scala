package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrientation extends StObject {
  
  /**
    * The id for this orientation. Example: "portrait".
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A human-friendly name for this orientation. Example: "portrait".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tags for this dimension. Example: "default".
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaOrientation {
  
  inline def apply(): SchemaOrientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrientation]
  }
  
  extension [Self <: SchemaOrientation](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
