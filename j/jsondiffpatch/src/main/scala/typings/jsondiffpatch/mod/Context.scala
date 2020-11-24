package typings.jsondiffpatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsondiffpatch", "Context")
@js.native
class Context () extends js.Object {
  
  var childName: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[js.Array[PatchContext]] = js.native
  
  def exit(): Context = js.native
  
  var exiting: js.UndefOr[Boolean] = js.native
  
  var hasResult: Boolean = js.native
  
  var nested: Boolean = js.native
  
  var next: js.UndefOr[PatchContext] = js.native
  
  var nextAfterChildren: js.UndefOr[PatchContext] = js.native
  
  var options: Config = js.native
  
  var parent: js.UndefOr[PatchContext] = js.native
  
  var root: js.UndefOr[PatchContext] = js.native
  
  def setResult(result: js.Any): Context = js.native
}
