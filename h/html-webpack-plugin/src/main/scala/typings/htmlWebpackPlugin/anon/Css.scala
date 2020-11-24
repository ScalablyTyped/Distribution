package typings.htmlWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Css extends js.Object {
  
  var css: js.Array[String] = js.native
  
  var favicon: js.UndefOr[String] = js.native
  
  @JSName("js")
  var js_ : js.Array[String] = js.native
  
  var manifest: js.UndefOr[String] = js.native
  
  var publicPath: String = js.native
}
object Css {
  
  @scala.inline
  def apply(css: js.Array[String], js_ : js.Array[String], publicPath: String): Css = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit class CssOps[Self <: Css] (val x: Self) extends AnyVal {
    
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
    def setCssVarargs(value: String*): Self = this.set("css", js.Array(value :_*))
    
    @scala.inline
    def setCss(value: js.Array[String]): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJs_Varargs(value: String*): Self = this.set("js", js.Array(value :_*))
    
    @scala.inline
    def setJs_(value: js.Array[String]): Self = this.set("js", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavicon(value: String): Self = this.set("favicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavicon: Self = this.set("favicon", js.undefined)
    
    @scala.inline
    def setManifest(value: String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
  }
}
