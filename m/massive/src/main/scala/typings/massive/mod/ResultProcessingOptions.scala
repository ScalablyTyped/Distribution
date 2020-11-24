package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultProcessingOptions extends js.Object {
  
  var build: js.UndefOr[Boolean] = js.native
  
  var decompose: js.UndefOr[DecomposeOptions] = js.native
  
  var document: js.UndefOr[Boolean] = js.native
  
  var single: js.UndefOr[Boolean] = js.native
  
  var stream: js.UndefOr[Boolean] = js.native
}
object ResultProcessingOptions {
  
  @scala.inline
  def apply(): ResultProcessingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultProcessingOptions]
  }
  
  @scala.inline
  implicit class ResultProcessingOptionsOps[Self <: ResultProcessingOptions] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: Boolean): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    
    @scala.inline
    def setDecompose(value: DecomposeOptions): Self = this.set("decompose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecompose: Self = this.set("decompose", js.undefined)
    
    @scala.inline
    def setDocument(value: Boolean): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    
    @scala.inline
    def setSingle(value: Boolean): Self = this.set("single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingle: Self = this.set("single", js.undefined)
    
    @scala.inline
    def setStream(value: Boolean): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
}
