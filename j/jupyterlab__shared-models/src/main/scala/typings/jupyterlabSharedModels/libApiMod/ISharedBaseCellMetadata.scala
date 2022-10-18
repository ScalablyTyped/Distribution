package typings.jupyterlabSharedModels.libApiMod

import typings.jupyterlabNbformat.anon.PartialIBaseCellJupyterMe
import typings.jupyterlabNbformat.mod.IBaseCellMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedBaseCellMetadata
  extends StObject
     with IBaseCellMetadata
object ISharedBaseCellMetadata {
  
  inline def apply(jupyter: PartialIBaseCellJupyterMe, name: String, tags: js.Array[String], trusted: Boolean): ISharedBaseCellMetadata = {
    val __obj = js.Dynamic.literal(jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISharedBaseCellMetadata]
  }
}
