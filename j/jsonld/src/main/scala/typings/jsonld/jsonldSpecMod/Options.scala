package typings.jsonld.jsonldSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var base: js.UndefOr[DOMString | Null] = js.native
  
  var compactArrays: js.UndefOr[Boolean] = js.native
  
  var documentLoader: js.UndefOr[LoadDocumentCallback | Null] = js.native
  
  var expandContext: js.UndefOr[Context | Null] = js.native
  
  var processingMode: js.UndefOr[DOMString] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBase(value: DOMString): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setBaseNull: Self = this.set("base", null)
    
    @scala.inline
    def setCompactArrays(value: Boolean): Self = this.set("compactArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompactArrays: Self = this.set("compactArrays", js.undefined)
    
    @scala.inline
    def setDocumentLoader(value: /* url */ Url => js.Promise[RemoteDocument]): Self = this.set("documentLoader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDocumentLoader: Self = this.set("documentLoader", js.undefined)
    
    @scala.inline
    def setDocumentLoaderNull: Self = this.set("documentLoader", null)
    
    @scala.inline
    def setExpandContextVarargs(value: JsonLdObj*): Self = this.set("expandContext", js.Array(value :_*))
    
    @scala.inline
    def setExpandContext(value: Context): Self = this.set("expandContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandContext: Self = this.set("expandContext", js.undefined)
    
    @scala.inline
    def setExpandContextNull: Self = this.set("expandContext", null)
    
    @scala.inline
    def setProcessingMode(value: DOMString): Self = this.set("processingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingMode: Self = this.set("processingMode", js.undefined)
  }
}
