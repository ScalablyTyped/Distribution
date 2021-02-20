package typings.hasura.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextColumnBoolExp extends ColumnBoolExp[String] {
  
  var _ilike: js.UndefOr[String] = js.native
  
  var _like: js.UndefOr[String] = js.native
  
  var _nilike: js.UndefOr[String] = js.native
  
  var _nlike: js.UndefOr[String] = js.native
  
  var _nsimilar: js.UndefOr[String] = js.native
  
  var _similar: js.UndefOr[String] = js.native
}
object TextColumnBoolExp {
  
  @scala.inline
  def apply(): TextColumnBoolExp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextColumnBoolExp]
  }
  
  @scala.inline
  implicit class TextColumnBoolExpMutableBuilder[Self <: TextColumnBoolExp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_ilike(value: String): Self = StObject.set(x, "_ilike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ilikeUndefined: Self = StObject.set(x, "_ilike", js.undefined)
    
    @scala.inline
    def set_like(value: String): Self = StObject.set(x, "_like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_likeUndefined: Self = StObject.set(x, "_like", js.undefined)
    
    @scala.inline
    def set_nilike(value: String): Self = StObject.set(x, "_nilike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nilikeUndefined: Self = StObject.set(x, "_nilike", js.undefined)
    
    @scala.inline
    def set_nlike(value: String): Self = StObject.set(x, "_nlike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nlikeUndefined: Self = StObject.set(x, "_nlike", js.undefined)
    
    @scala.inline
    def set_nsimilar(value: String): Self = StObject.set(x, "_nsimilar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nsimilarUndefined: Self = StObject.set(x, "_nsimilar", js.undefined)
    
    @scala.inline
    def set_similar(value: String): Self = StObject.set(x, "_similar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_similarUndefined: Self = StObject.set(x, "_similar", js.undefined)
  }
}
