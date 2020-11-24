package typings.hasura.mod

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
  implicit class TextColumnBoolExpOps[Self <: TextColumnBoolExp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_ilike(value: String): Self = this.set("_ilike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_ilike: Self = this.set("_ilike", js.undefined)
    
    @scala.inline
    def set_like(value: String): Self = this.set("_like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_like: Self = this.set("_like", js.undefined)
    
    @scala.inline
    def set_nilike(value: String): Self = this.set("_nilike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_nilike: Self = this.set("_nilike", js.undefined)
    
    @scala.inline
    def set_nlike(value: String): Self = this.set("_nlike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_nlike: Self = this.set("_nlike", js.undefined)
    
    @scala.inline
    def set_nsimilar(value: String): Self = this.set("_nsimilar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_nsimilar: Self = this.set("_nsimilar", js.undefined)
    
    @scala.inline
    def set_similar(value: String): Self = this.set("_similar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_similar: Self = this.set("_similar", js.undefined)
  }
}
