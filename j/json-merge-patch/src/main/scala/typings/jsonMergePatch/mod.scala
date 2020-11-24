package typings.jsonMergePatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-merge-patch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @JSName("apply")
  def apply(target: js.Object, patch: js.Object): js.Object = js.native
  
  def generate(before: js.Object, after: js.Object): js.Object = js.native
  
  def merge(patch1: js.Object, patch2: js.Object): js.Object = js.native
}
