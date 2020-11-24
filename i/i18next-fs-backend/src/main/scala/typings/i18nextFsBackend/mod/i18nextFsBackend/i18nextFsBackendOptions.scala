package typings.i18nextFsBackend.mod.i18nextFsBackend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait i18nextFsBackendOptions extends js.Object {
  
  var addPath: js.UndefOr[String] = js.native
  
  var ident: js.UndefOr[Double] = js.native
  
  var loadPath: js.UndefOr[String | loadPathFunction] = js.native
  
  var parse: js.UndefOr[js.Function1[/* data */ String, _]] = js.native
  
  var stringify: js.UndefOr[js.Function1[/* data */ js.Any, String]] = js.native
}
object i18nextFsBackendOptions {
  
  @scala.inline
  def apply(): i18nextFsBackendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[i18nextFsBackendOptions]
  }
  
  @scala.inline
  implicit class i18nextFsBackendOptionsOps[Self <: i18nextFsBackendOptions] (val x: Self) extends AnyVal {
    
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
    def setAddPath(value: String): Self = this.set("addPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddPath: Self = this.set("addPath", js.undefined)
    
    @scala.inline
    def setIdent(value: Double): Self = this.set("ident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdent: Self = this.set("ident", js.undefined)
    
    @scala.inline
    def setLoadPathFunction2(value: (/* language */ String, /* namespace */ String) => String): Self = this.set("loadPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadPath(value: String | loadPathFunction): Self = this.set("loadPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadPath: Self = this.set("loadPath", js.undefined)
    
    @scala.inline
    def setParse(value: /* data */ String => _): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setStringify(value: /* data */ js.Any => String): Self = this.set("stringify", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
  }
}
