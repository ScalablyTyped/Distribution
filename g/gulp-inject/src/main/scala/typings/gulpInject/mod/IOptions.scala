package typings.gulpInject.mod

import typings.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  var addPrefix: js.UndefOr[String] = js.native
  
  var addRootSlash: js.UndefOr[Boolean] = js.native
  
  var addSuffix: js.UndefOr[String] = js.native
  
  var empty: js.UndefOr[Boolean] = js.native
  
  var endtag: js.UndefOr[String | ITagFunction] = js.native
  
  var ignorePath: js.UndefOr[String | js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var relative: js.UndefOr[Boolean] = js.native
  
  var removeTags: js.UndefOr[Boolean] = js.native
  
  var selfClosingTag: js.UndefOr[Boolean] = js.native
  
  var starttag: js.UndefOr[String | ITagFunction] = js.native
  
  var transform: js.UndefOr[ITransformFunction] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setAddPrefix(value: String): Self = this.set("addPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddPrefix: Self = this.set("addPrefix", js.undefined)
    
    @scala.inline
    def setAddRootSlash(value: Boolean): Self = this.set("addRootSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddRootSlash: Self = this.set("addRootSlash", js.undefined)
    
    @scala.inline
    def setAddSuffix(value: String): Self = this.set("addSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddSuffix: Self = this.set("addSuffix", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setEndtagFunction2(value: (/* targetExt */ String, /* sourceExt */ String) => String): Self = this.set("endtag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndtag(value: String | ITagFunction): Self = this.set("endtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndtag: Self = this.set("endtag", js.undefined)
    
    @scala.inline
    def setIgnorePathVarargs(value: String*): Self = this.set("ignorePath", js.Array(value :_*))
    
    @scala.inline
    def setIgnorePath(value: String | js.Array[String]): Self = this.set("ignorePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePath: Self = this.set("ignorePath", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    
    @scala.inline
    def setRemoveTags(value: Boolean): Self = this.set("removeTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveTags: Self = this.set("removeTags", js.undefined)
    
    @scala.inline
    def setSelfClosingTag(value: Boolean): Self = this.set("selfClosingTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfClosingTag: Self = this.set("selfClosingTag", js.undefined)
    
    @scala.inline
    def setStarttagFunction2(value: (/* targetExt */ String, /* sourceExt */ String) => String): Self = this.set("starttag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStarttag(value: String | ITagFunction): Self = this.set("starttag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarttag: Self = this.set("starttag", js.undefined)
    
    @scala.inline
    def setTransform(
      value: (/* filepath */ String, /* file */ js.UndefOr[File], /* index */ js.UndefOr[Double], /* length */ js.UndefOr[Double], /* targetFile */ js.UndefOr[File]) => String
    ): Self = this.set("transform", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
