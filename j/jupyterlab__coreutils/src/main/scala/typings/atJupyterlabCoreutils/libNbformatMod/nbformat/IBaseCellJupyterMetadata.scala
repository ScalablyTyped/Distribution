package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Jupyter metadata namespace.
  */
trait IBaseCellJupyterMetadata extends JSONObject {
  /**
    * Whether the source is hidden.
    */
  var source_hidden: Boolean
}

object IBaseCellJupyterMetadata {
  @scala.inline
  def apply(source_hidden: Boolean): IBaseCellJupyterMetadata = {
    val __obj = js.Dynamic.literal(source_hidden = source_hidden.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBaseCellJupyterMetadata]
  }
}

