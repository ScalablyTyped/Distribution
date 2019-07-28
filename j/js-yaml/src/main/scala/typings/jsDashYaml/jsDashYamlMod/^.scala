package typings.jsDashYaml.jsDashYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-yaml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CORE_SCHEMA: Schema = js.native
  var DEFAULT_FULL_SCHEMA: Schema = js.native
  var DEFAULT_SAFE_SCHEMA: Schema = js.native
  var FAILSAFE_SCHEMA: Schema = js.native
  var JSON_SCHEMA: Schema = js.native
  var MINIMAL_SCHEMA: Schema = js.native
  var SAFE_SCHEMA: Schema = js.native
  def dump(obj: js.Any): String = js.native
  def dump(obj: js.Any, opts: DumpOptions): String = js.native
  def load(str: String): js.Any = js.native
  def load(str: String, opts: LoadOptions): js.Any = js.native
  def loadAll(str: String): js.Array[_] = js.native
  def loadAll(str: String, iterator: js.UndefOr[scala.Nothing], opts: LoadOptions): js.Array[_] = js.native
  def loadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit]): js.UndefOr[scala.Nothing] = js.native
  def loadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit], opts: LoadOptions): js.UndefOr[scala.Nothing] = js.native
  def safeDump(obj: js.Any): String = js.native
  def safeDump(obj: js.Any, opts: DumpOptions): String = js.native
  def safeLoad(str: String): js.Any = js.native
  def safeLoad(str: String, opts: LoadOptions): js.Any = js.native
  def safeLoadAll(str: String): js.Array[_] = js.native
  def safeLoadAll(str: String, iterator: js.UndefOr[scala.Nothing], opts: LoadOptions): js.Array[_] = js.native
  def safeLoadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit]): js.UndefOr[scala.Nothing] = js.native
  def safeLoadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit], opts: LoadOptions): js.UndefOr[scala.Nothing] = js.native
}

