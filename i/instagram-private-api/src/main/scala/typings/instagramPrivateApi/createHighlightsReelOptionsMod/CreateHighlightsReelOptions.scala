package typings.instagramPrivateApi.createHighlightsReelOptionsMod

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHighlightsReelOptions extends js.Object {
  
  var coverId: js.UndefOr[String] = js.native
  
  var mediaIds: js.Array[String] = js.native
  
  var source: js.UndefOr[IgAppModule] = js.native
  
  var title: String = js.native
}
object CreateHighlightsReelOptions {
  
  @scala.inline
  def apply(mediaIds: js.Array[String], title: String): CreateHighlightsReelOptions = {
    val __obj = js.Dynamic.literal(mediaIds = mediaIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHighlightsReelOptions]
  }
  
  @scala.inline
  implicit class CreateHighlightsReelOptionsOps[Self <: CreateHighlightsReelOptions] (val x: Self) extends AnyVal {
    
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
    def setMediaIdsVarargs(value: String*): Self = this.set("mediaIds", js.Array(value :_*))
    
    @scala.inline
    def setMediaIds(value: js.Array[String]): Self = this.set("mediaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverId(value: String): Self = this.set("coverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverId: Self = this.set("coverId", js.undefined)
    
    @scala.inline
    def setSource(value: IgAppModule): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
