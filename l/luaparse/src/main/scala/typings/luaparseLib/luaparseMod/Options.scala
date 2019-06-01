package typings
package luaparseLib.luaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Store comments as an array in the chunk object. */
  var comments: scala.Boolean
  /**
    * Whether to allow code points ≥ U+0080 in identifiers, like LuaJIT does.
    * See 'Note on character encodings' below if you wish to use this option.
    * Note: setting luaVersion: 'LuaJIT' currently does not enable this option; this may change in the future.
    */
  var extendedIdentifiers: luaparseLib.luaparseLibNumbers.`false`
  /** Store location information on each syntax node. */
  var locations: scala.Boolean
  /** The version of Lua the parser will target; supported values are '5.1', '5.2', '5.3' and 'LuaJIT'. */
  var luaVersion: luaparseLib.luaparseLibStrings.`5DOT1` | luaparseLib.luaparseLibStrings.`5DOT2` | luaparseLib.luaparseLibStrings.`5DOT3` | luaparseLib.luaparseLibStrings.LuaJIT
  /** Store the start and end character locations on each syntax node. */
  var ranges: scala.Boolean
  /** Track identifier scopes. */
  var scope: scala.Boolean
  /** Explicitly tell the parser when the input ends. */
  @JSName("wait")
  var wait_FOptions: scala.Boolean
  /**
    * A callback which will be invoked when a syntax node has been completed.
    * The node which has been created will be passed as the only parameter.
    */
  def onCreateNode(node: luaparseLib.libAstMod.Node): scala.Unit
  /** A callback which will be invoked when a new scope is created. */
  def onCreateScope(): scala.Unit
  /** A callback which will be invoked when the current scope is destroyed. */
  def onDestroyScope(): scala.Unit
  /**
    * A callback which will be invoked when a local variable is declared.
    * The identifier will be passed as the only parameter.
    */
  def onLocalDeclaration(identifier: luaparseLib.libAstMod.Identifier): scala.Unit
}

object Options {
  @scala.inline
  def apply(
    comments: scala.Boolean,
    extendedIdentifiers: luaparseLib.luaparseLibNumbers.`false`,
    locations: scala.Boolean,
    luaVersion: luaparseLib.luaparseLibStrings.`5DOT1` | luaparseLib.luaparseLibStrings.`5DOT2` | luaparseLib.luaparseLibStrings.`5DOT3` | luaparseLib.luaparseLibStrings.LuaJIT,
    onCreateNode: luaparseLib.libAstMod.Node => scala.Unit,
    onCreateScope: () => scala.Unit,
    onDestroyScope: () => scala.Unit,
    onLocalDeclaration: luaparseLib.libAstMod.Identifier => scala.Unit,
    ranges: scala.Boolean,
    scope: scala.Boolean,
    wait: scala.Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(comments = comments, extendedIdentifiers = extendedIdentifiers, locations = locations, luaVersion = luaVersion.asInstanceOf[js.Any], onCreateNode = js.Any.fromFunction1(onCreateNode), onCreateScope = js.Any.fromFunction0(onCreateScope), onDestroyScope = js.Any.fromFunction0(onDestroyScope), onLocalDeclaration = js.Any.fromFunction1(onLocalDeclaration), ranges = ranges, scope = scope, wait = wait)
  
    __obj.asInstanceOf[Options]
  }
}

