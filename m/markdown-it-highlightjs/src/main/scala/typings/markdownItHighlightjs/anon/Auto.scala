package typings.markdownItHighlightjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.highlightJs.HLJSApi
import typings.highlightJs.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auto extends js.Object {
  
  /**
    * Whether to automatically detect language if not specified.
    */
  var auto: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to add the `hljs` class to raw code blocks (not fenced blocks).
    */
  var code: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to highlight inline code.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  
  /**
    * Register other languages which are not included in the standard pack.
    */
  var register: js.UndefOr[StringDictionary[js.Function1[/* hljs */ js.UndefOr[HLJSApi], Language]]] = js.native
}
object Auto {
  
  @scala.inline
  def apply(): Auto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auto]
  }
  
  @scala.inline
  implicit class AutoOps[Self <: Auto] (val x: Self) extends AnyVal {
    
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
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    
    @scala.inline
    def setCode(value: Boolean): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setRegister(value: StringDictionary[js.Function1[/* hljs */ js.UndefOr[HLJSApi], Language]]): Self = this.set("register", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
  }
}
