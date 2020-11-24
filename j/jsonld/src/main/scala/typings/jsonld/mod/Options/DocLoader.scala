package typings.jsonld.mod.Options

import typings.jsonld.jsonldSpecMod.RemoteDocument
import typings.jsonld.jsonldSpecMod.Url
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocLoader extends js.Object {
  
  var documentLoader: js.UndefOr[
    js.Function2[
      /* url */ Url, 
      /* callback */ js.Function2[/* err */ Error, /* remoteDoc */ RemoteDocument, Unit], 
      js.Promise[RemoteDocument]
    ]
  ] = js.native
}
object DocLoader {
  
  @scala.inline
  def apply(): DocLoader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocLoader]
  }
  
  @scala.inline
  implicit class DocLoaderOps[Self <: DocLoader] (val x: Self) extends AnyVal {
    
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
    def setDocumentLoader(
      value: (/* url */ Url, /* callback */ js.Function2[/* err */ Error, /* remoteDoc */ RemoteDocument, Unit]) => js.Promise[RemoteDocument]
    ): Self = this.set("documentLoader", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDocumentLoader: Self = this.set("documentLoader", js.undefined)
  }
}
