package typings.jsYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-yaml", "safeLoadAll")
@js.native
object safeLoadAll extends js.Object {
  
  def apply(str: String): js.Array[_] = js.native
  def apply(str: String, iterator: js.UndefOr[scala.Nothing], opts: LoadOptions): js.Array[_] = js.native
  def apply(str: String, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = js.native
  def apply(str: String, iterator: js.Function1[/* doc */ js.Any, Unit], opts: LoadOptions): Unit = js.native
  def apply(str: String, iterator: Null, opts: LoadOptions): js.Array[_] = js.native
}
