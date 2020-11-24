package typings.htmlWebpackPlugin.anon

import typings.htmlWebpackPlugin.mod.HtmlTagObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends js.Object {
  
  var meta: js.Array[HtmlTagObject] = js.native
  
  var scripts: js.Array[HtmlTagObject] = js.native
  
  var styles: js.Array[HtmlTagObject] = js.native
}
object Meta {
  
  @scala.inline
  def apply(meta: js.Array[HtmlTagObject], scripts: js.Array[HtmlTagObject], styles: js.Array[HtmlTagObject]): Meta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    
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
    def setMetaVarargs(value: HtmlTagObject*): Self = this.set("meta", js.Array(value :_*))
    
    @scala.inline
    def setMeta(value: js.Array[HtmlTagObject]): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptsVarargs(value: HtmlTagObject*): Self = this.set("scripts", js.Array(value :_*))
    
    @scala.inline
    def setScripts(value: js.Array[HtmlTagObject]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: HtmlTagObject*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[HtmlTagObject]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
}
