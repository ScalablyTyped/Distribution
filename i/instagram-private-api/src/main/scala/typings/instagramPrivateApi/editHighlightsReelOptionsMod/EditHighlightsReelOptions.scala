package typings.instagramPrivateApi.editHighlightsReelOptionsMod

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditHighlightsReelOptions extends js.Object {
  
  var added: js.UndefOr[js.Array[String]] = js.native
  
  var coverId: String = js.native
  
  var highlightId: String = js.native
  
  var removed: js.UndefOr[js.Array[String]] = js.native
  
  var source: js.UndefOr[IgAppModule] = js.native
  
  var title: String = js.native
}
object EditHighlightsReelOptions {
  
  @scala.inline
  def apply(coverId: String, highlightId: String, title: String): EditHighlightsReelOptions = {
    val __obj = js.Dynamic.literal(coverId = coverId.asInstanceOf[js.Any], highlightId = highlightId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditHighlightsReelOptions]
  }
  
  @scala.inline
  implicit class EditHighlightsReelOptionsOps[Self <: EditHighlightsReelOptions] (val x: Self) extends AnyVal {
    
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
    def setCoverId(value: String): Self = this.set("coverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightId(value: String): Self = this.set("highlightId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedVarargs(value: String*): Self = this.set("added", js.Array(value :_*))
    
    @scala.inline
    def setAdded(value: js.Array[String]): Self = this.set("added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdded: Self = this.set("added", js.undefined)
    
    @scala.inline
    def setRemovedVarargs(value: String*): Self = this.set("removed", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[String]): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
    
    @scala.inline
    def setSource(value: IgAppModule): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
