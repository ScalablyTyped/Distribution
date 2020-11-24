package typings.jupyterlabNbformat.anon

import typings.jupyterlabNbformat.jupyterlabNbformatStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCellMetadata> */
@js.native
trait PartialICodeCellMetadata extends js.Object {
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var jupyter: js.UndefOr[PartialICodeCellJupyterMe] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var scrolled: js.UndefOr[Boolean | auto] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  var trusted: js.UndefOr[Boolean] = js.native
}
object PartialICodeCellMetadata {
  
  @scala.inline
  def apply(): PartialICodeCellMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialICodeCellMetadata]
  }
  
  @scala.inline
  implicit class PartialICodeCellMetadataOps[Self <: PartialICodeCellMetadata] (val x: Self) extends AnyVal {
    
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setJupyter(value: PartialICodeCellJupyterMe): Self = this.set("jupyter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJupyter: Self = this.set("jupyter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScrolled(value: Boolean | auto): Self = this.set("scrolled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrolled: Self = this.set("scrolled", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTrusted(value: Boolean): Self = this.set("trusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrusted: Self = this.set("trusted", js.undefined)
  }
}
