package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.anon.PartialIBaseCellJupyterMe
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseCellMetadata
  extends PartialJSONObject
     with ICellMetadata {
  
  /**
    * The Jupyter metadata namespace
    */
  var jupyter: PartialIBaseCellJupyterMe = js.native
  
  /**
    * The cell's name. If present, must be a non-empty string.
    */
  var name: String = js.native
  
  /**
    * The cell's tags. Tags must be unique, and must not contain commas.
    */
  var tags: js.Array[String] = js.native
  
  /**
    * Whether the cell is trusted.
    *
    * #### Notes
    * This is not strictly part of the nbformat spec, but it is added by
    * the contents manager.
    *
    * See https://jupyter-notebook.readthedocs.io/en/latest/security.html.
    */
  var trusted: Boolean = js.native
}
object IBaseCellMetadata {
  
  @scala.inline
  def apply(jupyter: PartialIBaseCellJupyterMe, name: String, tags: js.Array[String], trusted: Boolean): IBaseCellMetadata = {
    val __obj = js.Dynamic.literal(jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseCellMetadata]
  }
  
  @scala.inline
  implicit class IBaseCellMetadataOps[Self <: IBaseCellMetadata] (val x: Self) extends AnyVal {
    
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
    def setJupyter(value: PartialIBaseCellJupyterMe): Self = this.set("jupyter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrusted(value: Boolean): Self = this.set("trusted", value.asInstanceOf[js.Any])
  }
}
