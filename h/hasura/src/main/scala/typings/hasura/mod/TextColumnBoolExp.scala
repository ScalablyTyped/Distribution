package typings.hasura.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextColumnBoolExp
  extends StObject
     with ColumnBoolExp[String] {
  
  var _ilike: js.UndefOr[String] = js.undefined
  
  var _like: js.UndefOr[String] = js.undefined
  
  var _nilike: js.UndefOr[String] = js.undefined
  
  var _nlike: js.UndefOr[String] = js.undefined
  
  var _nsimilar: js.UndefOr[String] = js.undefined
  
  var _similar: js.UndefOr[String] = js.undefined
}
object TextColumnBoolExp {
  
  inline def apply(): TextColumnBoolExp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextColumnBoolExp]
  }
  
  extension [Self <: TextColumnBoolExp](x: Self) {
    
    inline def set_ilike(value: String): Self = StObject.set(x, "_ilike", value.asInstanceOf[js.Any])
    
    inline def set_ilikeUndefined: Self = StObject.set(x, "_ilike", js.undefined)
    
    inline def set_like(value: String): Self = StObject.set(x, "_like", value.asInstanceOf[js.Any])
    
    inline def set_likeUndefined: Self = StObject.set(x, "_like", js.undefined)
    
    inline def set_nilike(value: String): Self = StObject.set(x, "_nilike", value.asInstanceOf[js.Any])
    
    inline def set_nilikeUndefined: Self = StObject.set(x, "_nilike", js.undefined)
    
    inline def set_nlike(value: String): Self = StObject.set(x, "_nlike", value.asInstanceOf[js.Any])
    
    inline def set_nlikeUndefined: Self = StObject.set(x, "_nlike", js.undefined)
    
    inline def set_nsimilar(value: String): Self = StObject.set(x, "_nsimilar", value.asInstanceOf[js.Any])
    
    inline def set_nsimilarUndefined: Self = StObject.set(x, "_nsimilar", js.undefined)
    
    inline def set_similar(value: String): Self = StObject.set(x, "_similar", value.asInstanceOf[js.Any])
    
    inline def set_similarUndefined: Self = StObject.set(x, "_similar", js.undefined)
  }
}
