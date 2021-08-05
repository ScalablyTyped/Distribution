package typings.jsonPatchGen

import typings.jsonPatchGen.mod.PatchOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonPatchGenStrings {
  
  @js.native
  sealed trait add
    extends StObject
       with PatchOperation
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait remove
    extends StObject
       with PatchOperation
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait replace
    extends StObject
       with PatchOperation
  inline def replace: replace = "replace".asInstanceOf[replace]
}
