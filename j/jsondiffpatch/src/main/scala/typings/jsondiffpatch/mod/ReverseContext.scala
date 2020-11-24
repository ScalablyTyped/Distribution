package typings.jsondiffpatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsondiffpatch", "ReverseContext")
@js.native
class ReverseContext ()
  extends Context
     with FilterContext {
  
  var delta: Delta = js.native
  
  var pipe: typings.jsondiffpatch.jsondiffpatchStrings.reverse = js.native
}
