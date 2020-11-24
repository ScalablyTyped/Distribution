package typings.htmlWebpackTagsPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonOptions extends js.Object {
  
  var addHash: js.UndefOr[AddHashFunction] = js.native
  
  var addPublicPath: js.UndefOr[AddPublicPathFunction] = js.native
  
  var append: js.UndefOr[Boolean] = js.native
  
  var hash: js.UndefOr[Boolean | String | AddHashFunction] = js.native
  
  var publicPath: js.UndefOr[Boolean | String | AddPublicPathFunction] = js.native
  
  var useHash: js.UndefOr[Boolean] = js.native
  
  var usePublicPath: js.UndefOr[Boolean] = js.native
}
object CommonOptions {
  
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    
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
    def setAddHash(value: (/* assetPath */ String, /* hash */ String) => String): Self = this.set("addHash", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAddHash: Self = this.set("addHash", js.undefined)
    
    @scala.inline
    def setAddPublicPath(value: (/* assetPath */ String, /* publicPath */ String) => String): Self = this.set("addPublicPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAddPublicPath: Self = this.set("addPublicPath", js.undefined)
    
    @scala.inline
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    
    @scala.inline
    def setHashFunction2(value: (/* assetPath */ String, /* hash */ String) => String): Self = this.set("hash", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHash(value: Boolean | String | AddHashFunction): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setPublicPathFunction2(value: (/* assetPath */ String, /* publicPath */ String) => String): Self = this.set("publicPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPublicPath(value: Boolean | String | AddPublicPathFunction): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setUseHash(value: Boolean): Self = this.set("useHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHash: Self = this.set("useHash", js.undefined)
    
    @scala.inline
    def setUsePublicPath(value: Boolean): Self = this.set("usePublicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePublicPath: Self = this.set("usePublicPath", js.undefined)
  }
}
