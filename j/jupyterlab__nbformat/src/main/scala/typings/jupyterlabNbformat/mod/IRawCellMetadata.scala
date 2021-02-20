package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.anon.PartialIBaseCellJupyterMe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jupyterlabNbformat.mod.ICellMetadata because Already inherited */ @js.native
trait IRawCellMetadata extends IBaseCellMetadata {
  
  /**
    * Raw cell metadata format for nbconvert.
    */
  var format: String = js.native
}
object IRawCellMetadata {
  
  @scala.inline
  def apply(
    format: String,
    jupyter: PartialIBaseCellJupyterMe,
    name: String,
    tags: js.Array[String],
    trusted: Boolean
  ): IRawCellMetadata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawCellMetadata]
  }
  
  @scala.inline
  implicit class IRawCellMetadataMutableBuilder[Self <: IRawCellMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
