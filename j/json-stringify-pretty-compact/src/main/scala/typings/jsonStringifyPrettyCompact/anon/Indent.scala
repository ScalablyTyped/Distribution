package typings.jsonStringifyPrettyCompact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indent extends js.Object {
  
  var indent: js.UndefOr[Double | String] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var replacer: js.UndefOr[
    (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String]) | Null
  ] = js.native
}
object Indent {
  
  @scala.inline
  def apply(): Indent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indent]
  }
  
  @scala.inline
  implicit class IndentOps[Self <: Indent] (val x: Self) extends AnyVal {
    
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
    def setIndent(value: Double | String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setReplacerVarargs(value: (Double | String)*): Self = this.set("replacer", js.Array(value :_*))
    
    @scala.inline
    def setReplacerFunction2(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("replacer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplacer(value: (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String])): Self = this.set("replacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    
    @scala.inline
    def setReplacerNull: Self = this.set("replacer", null)
  }
}
