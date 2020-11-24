package typings.imgDiffJs.mod

import typings.imgDiffJs.anon.IncludeAA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImgDiffOptions extends js.Object {
  
  var actualFilename: String = js.native
  
  var diffFilename: js.UndefOr[String] = js.native
  
  var expectedFilename: String = js.native
  
  /** {default:false} */
  var generateOnlyDiffFile: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[IncludeAA] = js.native
}
object ImgDiffOptions {
  
  @scala.inline
  def apply(actualFilename: String, expectedFilename: String): ImgDiffOptions = {
    val __obj = js.Dynamic.literal(actualFilename = actualFilename.asInstanceOf[js.Any], expectedFilename = expectedFilename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgDiffOptions]
  }
  
  @scala.inline
  implicit class ImgDiffOptionsOps[Self <: ImgDiffOptions] (val x: Self) extends AnyVal {
    
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
    def setActualFilename(value: String): Self = this.set("actualFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedFilename(value: String): Self = this.set("expectedFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffFilename(value: String): Self = this.set("diffFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffFilename: Self = this.set("diffFilename", js.undefined)
    
    @scala.inline
    def setGenerateOnlyDiffFile(value: Boolean): Self = this.set("generateOnlyDiffFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateOnlyDiffFile: Self = this.set("generateOnlyDiffFile", js.undefined)
    
    @scala.inline
    def setOptions(value: IncludeAA): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
