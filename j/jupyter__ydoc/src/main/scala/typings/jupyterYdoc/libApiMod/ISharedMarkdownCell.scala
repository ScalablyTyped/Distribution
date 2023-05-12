package typings.jupyterYdoc.libApiMod

import typings.jupyterYdoc.jupyterYdocStrings.markdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedMarkdownCell
  extends StObject
     with ISharedAttachmentsCell
     with ISharedCell {
  
  /**
    * String identifying the type of cell.
    */
  @JSName("cell_type")
  var cell_type_ISharedMarkdownCell: markdown = js.native
}
