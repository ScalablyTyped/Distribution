package typings.grammarkdown.grammarkdownMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostBaseOptions extends js.Object {
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var knownGrammars: js.UndefOr[Record[String, String]] = js.native
  
  var useBuiltinGrammars: js.UndefOr[Boolean] = js.native
}
object HostBaseOptions {
  
  @scala.inline
  def apply(): HostBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostBaseOptions]
  }
  
  @scala.inline
  implicit class HostBaseOptionsOps[Self <: HostBaseOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    
    @scala.inline
    def setKnownGrammars(value: Record[String, String]): Self = this.set("knownGrammars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKnownGrammars: Self = this.set("knownGrammars", js.undefined)
    
    @scala.inline
    def setUseBuiltinGrammars(value: Boolean): Self = this.set("useBuiltinGrammars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBuiltinGrammars: Self = this.set("useBuiltinGrammars", js.undefined)
  }
}
