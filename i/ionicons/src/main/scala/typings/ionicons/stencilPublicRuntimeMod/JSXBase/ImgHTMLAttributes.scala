package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import typings.ionicons.ioniconsStrings.`lazy`
import typings.ionicons.ioniconsStrings.async
import typings.ionicons.ioniconsStrings.auto
import typings.ionicons.ioniconsStrings.eager
import typings.ionicons.ioniconsStrings.high
import typings.ionicons.ioniconsStrings.low
import typings.ionicons.ioniconsStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImgHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var alt: js.UndefOr[String] = js.native
  
  var decoding: js.UndefOr[async | auto | sync] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var importance: js.UndefOr[low | auto | high] = js.native
  
  var loading: js.UndefOr[`lazy` | auto | eager] = js.native
  
  var sizes: js.UndefOr[String] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var srcSet: js.UndefOr[String] = js.native
  
  var srcset: js.UndefOr[String] = js.native
  
  var useMap: js.UndefOr[String] = js.native
  
  var usemap: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object ImgHTMLAttributes {
  
  @scala.inline
  def apply[T](): ImgHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ImgHTMLAttributesOps[Self <: ImgHTMLAttributes[_], T] (val x: Self with ImgHTMLAttributes[T]) extends AnyVal {
    
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setDecoding(value: async | auto | sync): Self = this.set("decoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecoding: Self = this.set("decoding", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImportance(value: low | auto | high): Self = this.set("importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    
    @scala.inline
    def setLoading(value: `lazy` | auto | eager): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setSrcSet(value: String): Self = this.set("srcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcSet: Self = this.set("srcSet", js.undefined)
    
    @scala.inline
    def setUseMap(value: String): Self = this.set("useMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMap: Self = this.set("useMap", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
