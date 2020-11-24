package typings.hapiJoi.mod

import typings.hapiJoi.hapiJoiStrings.schema
import typings.hapiJoi.hapiJoiStrings.single
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionTerm extends js.Object {
  
  var init: js.Array[_] | Null = js.native
  
  var manifest: js.UndefOr[Record[String, schema | single | ExtensionTermManifest]] = js.native
  
  var register: js.UndefOr[js.Any] = js.native
}
object ExtensionTerm {
  
  @scala.inline
  def apply(): ExtensionTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionTerm]
  }
  
  @scala.inline
  implicit class ExtensionTermOps[Self <: ExtensionTerm] (val x: Self) extends AnyVal {
    
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
    def setInitVarargs(value: js.Any*): Self = this.set("init", js.Array(value :_*))
    
    @scala.inline
    def setInit(value: js.Array[_]): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitNull: Self = this.set("init", null)
    
    @scala.inline
    def setManifest(value: Record[String, schema | single | ExtensionTermManifest]): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    
    @scala.inline
    def setRegister(value: js.Any): Self = this.set("register", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
  }
}
