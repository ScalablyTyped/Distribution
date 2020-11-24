package typings.koaCacheControl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxAge extends js.Object {
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var mustRevalidate: js.UndefOr[Boolean] = js.native
  
  var noCache: js.UndefOr[Boolean] = js.native
  
  var noStore: js.UndefOr[Boolean] = js.native
  
  var noTransform: js.UndefOr[Boolean] = js.native
  
  var `private`: js.UndefOr[Boolean] = js.native
  
  var public: js.UndefOr[Boolean] = js.native
  
  var sMaxAge: js.UndefOr[Double] = js.native
  
  var staleIfError: js.UndefOr[Double] = js.native
  
  var staleWhileRevalidate: js.UndefOr[Double] = js.native
}
object MaxAge {
  
  @scala.inline
  def apply(): MaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxAge]
  }
  
  @scala.inline
  implicit class MaxAgeOps[Self <: MaxAge] (val x: Self) extends AnyVal {
    
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
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setMustRevalidate(value: Boolean): Self = this.set("mustRevalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMustRevalidate: Self = this.set("mustRevalidate", js.undefined)
    
    @scala.inline
    def setNoCache(value: Boolean): Self = this.set("noCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCache: Self = this.set("noCache", js.undefined)
    
    @scala.inline
    def setNoStore(value: Boolean): Self = this.set("noStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoStore: Self = this.set("noStore", js.undefined)
    
    @scala.inline
    def setNoTransform(value: Boolean): Self = this.set("noTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoTransform: Self = this.set("noTransform", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setSMaxAge(value: Double): Self = this.set("sMaxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSMaxAge: Self = this.set("sMaxAge", js.undefined)
    
    @scala.inline
    def setStaleIfError(value: Double): Self = this.set("staleIfError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaleIfError: Self = this.set("staleIfError", js.undefined)
    
    @scala.inline
    def setStaleWhileRevalidate(value: Double): Self = this.set("staleWhileRevalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaleWhileRevalidate: Self = this.set("staleWhileRevalidate", js.undefined)
  }
}
