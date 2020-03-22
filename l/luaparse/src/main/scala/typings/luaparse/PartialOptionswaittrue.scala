package typings.luaparse

import typings.luaparse.astMod.Identifier
import typings.luaparse.astMod.Node
import typings.luaparse.luaparseBooleans.`false`
import typings.luaparse.luaparseBooleans.`true`
import typings.luaparse.luaparseStrings.LuaJIT
import typings.luaparse.luaparseStrings.`5Dot1`
import typings.luaparse.luaparseStrings.`5Dot2`
import typings.luaparse.luaparseStrings.`5Dot3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<luaparse.luaparse.Options> & {  wait  :true} */
trait PartialOptionswaittrue extends js.Object {
  var comments: js.UndefOr[Boolean] = js.undefined
  var extendedIdentifiers: js.UndefOr[`false`] = js.undefined
  var locations: js.UndefOr[Boolean] = js.undefined
  var luaVersion: js.UndefOr[`5Dot1` | `5Dot2` | `5Dot3` | LuaJIT] = js.undefined
  var onCreateNode: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var onCreateScope: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDestroyScope: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLocalDeclaration: js.UndefOr[js.Function1[/* identifier */ Identifier, Unit]] = js.undefined
  var ranges: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[Boolean] = js.undefined
  @JSName("wait")
  var wait_FPartialOptionswaittrue: js.UndefOr[Boolean with `true`] = js.undefined
}

object PartialOptionswaittrue {
  @scala.inline
  def apply(
    comments: js.UndefOr[Boolean] = js.undefined,
    extendedIdentifiers: `false` = null,
    locations: js.UndefOr[Boolean] = js.undefined,
    luaVersion: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT = null,
    onCreateNode: /* node */ Node => Unit = null,
    onCreateScope: () => Unit = null,
    onDestroyScope: () => Unit = null,
    onLocalDeclaration: /* identifier */ Identifier => Unit = null,
    ranges: js.UndefOr[Boolean] = js.undefined,
    scope: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean with `true`] = js.undefined
  ): PartialOptionswaittrue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (extendedIdentifiers != null) __obj.updateDynamic("extendedIdentifiers")(extendedIdentifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(locations)) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (luaVersion != null) __obj.updateDynamic("luaVersion")(luaVersion.asInstanceOf[js.Any])
    if (onCreateNode != null) __obj.updateDynamic("onCreateNode")(js.Any.fromFunction1(onCreateNode))
    if (onCreateScope != null) __obj.updateDynamic("onCreateScope")(js.Any.fromFunction0(onCreateScope))
    if (onDestroyScope != null) __obj.updateDynamic("onDestroyScope")(js.Any.fromFunction0(onDestroyScope))
    if (onLocalDeclaration != null) __obj.updateDynamic("onLocalDeclaration")(js.Any.fromFunction1(onLocalDeclaration))
    if (!js.isUndefined(ranges)) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (!js.isUndefined(scope)) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionswaittrue]
  }
}

