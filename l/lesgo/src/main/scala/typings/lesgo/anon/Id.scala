package typings.lesgo.anon

import typings.lesgo.servicesElasticsearchServiceMod.ProfileId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var _id: ProfileId
  
  var _index: String | js.Array[String]
  
  var _type: String | js.Array[String]
}
object Id {
  
  inline def apply(_id: ProfileId, _index: String | js.Array[String], _type: String | js.Array[String]): Id = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def set_id(value: ProfileId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: String | js.Array[String]): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_indexVarargs(value: String*): Self = StObject.set(x, "_index", js.Array(value*))
    
    inline def set_type(value: String | js.Array[String]): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeVarargs(value: String*): Self = StObject.set(x, "_type", js.Array(value*))
  }
}
