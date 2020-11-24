package typings.jsonPatchGen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jsonPatchGen.jsonPatchGenStrings.replace
  - typings.jsonPatchGen.jsonPatchGenStrings.add
  - typings.jsonPatchGen.jsonPatchGenStrings.remove
*/
trait PatchOperation extends js.Object
object PatchOperation {
  
  @scala.inline
  def add: typings.jsonPatchGen.jsonPatchGenStrings.add = "add".asInstanceOf[typings.jsonPatchGen.jsonPatchGenStrings.add]
  
  @scala.inline
  def remove: typings.jsonPatchGen.jsonPatchGenStrings.remove = "remove".asInstanceOf[typings.jsonPatchGen.jsonPatchGenStrings.remove]
  
  @scala.inline
  def replace: typings.jsonPatchGen.jsonPatchGenStrings.replace = "replace".asInstanceOf[typings.jsonPatchGen.jsonPatchGenStrings.replace]
}
