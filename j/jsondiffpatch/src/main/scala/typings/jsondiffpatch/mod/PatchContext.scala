package typings.jsondiffpatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsondiffpatch", "PatchContext")
@js.native
class PatchContext ()
  extends Context
     with FilterContext {
  
  var delta: Delta = js.native
  
  var left: js.Any = js.native
  
  var pipe: typings.jsondiffpatch.jsondiffpatchStrings.patch = js.native
}
