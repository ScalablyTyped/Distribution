package typings.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ViewModels
@js.native
trait ViewModelOptions extends js.Object {
  
  var extend: js.UndefOr[Hash[_]] = js.native
  
  /* ViewModel options hash */
  // getters?: string[] | ;
  var getters: js.UndefOr[js.Array[_]] = js.native
  
  var id: js.UndefOr[String | (js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean])] = js.native
}
object ViewModelOptions {
  
  @scala.inline
  def apply(): ViewModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewModelOptions]
  }
  
  @scala.inline
  implicit class ViewModelOptionsOps[Self <: ViewModelOptions] (val x: Self) extends AnyVal {
    
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
    def setExtend(value: Hash[_]): Self = this.set("extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    
    @scala.inline
    def setGettersVarargs(value: js.Any*): Self = this.set("getters", js.Array(value :_*))
    
    @scala.inline
    def setGetters(value: js.Array[_]): Self = this.set("getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetters: Self = this.set("getters", js.undefined)
    
    @scala.inline
    def setIdFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = this.set("id", js.Any.fromFunction2(value))
    
    @scala.inline
    def setId(value: String | (js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean])): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
