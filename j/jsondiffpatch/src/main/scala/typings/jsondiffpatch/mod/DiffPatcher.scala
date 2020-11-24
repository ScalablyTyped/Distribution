package typings.jsondiffpatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsondiffpatch", "DiffPatcher")
@js.native
class DiffPatcher () extends js.Object {
  def this(options: Config) = this()
  
  def clone(value: js.Any): js.Any = js.native
  
  def diff(left: js.Any, right: js.Any): js.UndefOr[Delta] = js.native
  
  def patch(left: js.Any, delta: Delta): js.Any = js.native
  
  var processor: Processor = js.native
  
  def reverse(delta: Delta): js.UndefOr[Delta] = js.native
  
  def unpatch(right: js.Any, delta: Delta): js.Any = js.native
}
