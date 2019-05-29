package typings
package jsDashYamlLib.jsDashYamlMod

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
  def dump(obj: js.Any): java.lang.String = js.native
  def dump(obj: js.Any, opts: DumpOptions): java.lang.String = js.native
  def load(str: java.lang.String): js.Any = js.native
  def load(str: java.lang.String, opts: LoadOptions): js.Any = js.native
  def loadAll(str: java.lang.String): js.Array[_] = js.native
  def loadAll(str: java.lang.String, iterator: js.UndefOr[scala.Nothing], opts: LoadOptions): js.Array[_] = js.native
  def loadAll(str: java.lang.String, iterator: js.Function1[/* doc */ js.Any, scala.Unit]): js.UndefOr[scala.Nothing] = js.native
  def loadAll(str: java.lang.String, iterator: js.Function1[/* doc */ js.Any, scala.Unit], opts: LoadOptions): js.UndefOr[scala.Nothing] = js.native
  def safeDump(obj: js.Any): java.lang.String = js.native
  def safeDump(obj: js.Any, opts: DumpOptions): java.lang.String = js.native
  def safeLoad(str: java.lang.String): js.Any = js.native
  def safeLoad(str: java.lang.String, opts: LoadOptions): js.Any = js.native
  def safeLoadAll(str: java.lang.String): js.Array[_] = js.native
  def safeLoadAll(str: java.lang.String, iterator: js.UndefOr[scala.Nothing], opts: LoadOptions): js.Array[_] = js.native
  def safeLoadAll(str: java.lang.String, iterator: js.Function1[/* doc */ js.Any, scala.Unit]): js.UndefOr[scala.Nothing] = js.native
  def safeLoadAll(str: java.lang.String, iterator: js.Function1[/* doc */ js.Any, scala.Unit], opts: LoadOptions): js.UndefOr[scala.Nothing] = js.native
}

