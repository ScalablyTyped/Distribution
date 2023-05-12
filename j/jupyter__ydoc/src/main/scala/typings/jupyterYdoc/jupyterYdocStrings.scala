package typings.jupyterYdoc

import typings.jupyterYdoc.libApiMod.MapChangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterYdocStrings {
  
  @js.native
  sealed trait add
    extends StObject
       with MapChangeType
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait change
    extends StObject
       with MapChangeType
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait code extends StObject
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait markdown extends StObject
  inline def markdown: markdown = "markdown".asInstanceOf[markdown]
  
  @js.native
  sealed trait raw extends StObject
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait remove
    extends StObject
       with MapChangeType
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait update extends StObject
  inline def update: update = "update".asInstanceOf[update]
}
