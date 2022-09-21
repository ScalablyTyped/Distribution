package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.anon.PartialIBaseCellJupyterMe
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBaseCellMetadata
  extends StObject
     with PartialJSONObject
     with ICellMetadata {
  
  /**
    * The Jupyter metadata namespace
    */
  var jupyter: PartialIBaseCellJupyterMe
  
  /**
    * The cell's name. If present, must be a non-empty string.
    */
  var name: String
  
  /**
    * The cell's tags. Tags must be unique, and must not contain commas.
    */
  var tags: js.Array[String]
  
  /**
    * Whether the cell is trusted.
    *
    * #### Notes
    * This is not strictly part of the nbformat spec, but it is added by
    * the contents manager.
    *
    * See https://jupyter-server.readthedocs.io/en/latest/operators/security.html.
    */
  var trusted: Boolean
}
object IBaseCellMetadata {
  
  inline def apply(jupyter: PartialIBaseCellJupyterMe, name: String, tags: js.Array[String], trusted: Boolean): IBaseCellMetadata = {
    val __obj = js.Dynamic.literal(jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseCellMetadata]
  }
  
  extension [Self <: IBaseCellMetadata](x: Self) {
    
    inline def setJupyter(value: PartialIBaseCellJupyterMe): Self = StObject.set(x, "jupyter", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
  }
}
