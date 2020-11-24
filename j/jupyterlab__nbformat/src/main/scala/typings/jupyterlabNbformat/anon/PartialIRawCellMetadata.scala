package typings.jupyterlabNbformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.IRawCellMetadata> */
@js.native
trait PartialIRawCellMetadata extends js.Object {
  
  var format: js.UndefOr[String] = js.native
  
  var jupyter: js.UndefOr[PartialIBaseCellJupyterMe] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  var trusted: js.UndefOr[Boolean] = js.native
}
object PartialIRawCellMetadata {
  
  @scala.inline
  def apply(): PartialIRawCellMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIRawCellMetadata]
  }
  
  @scala.inline
  implicit class PartialIRawCellMetadataOps[Self <: PartialIRawCellMetadata] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setJupyter(value: PartialIBaseCellJupyterMe): Self = this.set("jupyter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJupyter: Self = this.set("jupyter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
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
