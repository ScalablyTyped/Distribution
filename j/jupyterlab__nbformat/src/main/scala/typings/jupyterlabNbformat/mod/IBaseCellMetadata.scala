package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.PartialIBaseCellJupyterMe
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseCellMetadata
  extends PartialJSONObject
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
    * See https://jupyter-notebook.readthedocs.io/en/latest/security.html.
    */
  var trusted: Boolean
}

object IBaseCellMetadata {
  @scala.inline
  def apply(jupyter: PartialIBaseCellJupyterMe, name: String, tags: js.Array[String], trusted: Boolean): IBaseCellMetadata = {
    val __obj = js.Dynamic.literal(jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBaseCellMetadata]
  }
}

