package typings.luaparse.mod

import typings.luaparse.astMod.Identifier
import typings.luaparse.astMod.Node
import typings.luaparse.luaparseBooleans.`false`
import typings.luaparse.luaparseStrings.LuaJIT
import typings.luaparse.luaparseStrings.`5Dot1`
import typings.luaparse.luaparseStrings.`5Dot2`
import typings.luaparse.luaparseStrings.`5Dot3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** Store comments as an array in the chunk object. */
  var comments: Boolean = js.native
  
  /**
    * Whether to allow code points ≥ U+0080 in identifiers, like LuaJIT does.
    * See 'Note on character encodings' below if you wish to use this option.
    * Note: setting luaVersion: 'LuaJIT' currently does not enable this option; this may change in the future.
    */
  var extendedIdentifiers: `false` = js.native
  
  /** Store location information on each syntax node. */
  var locations: Boolean = js.native
  
  /** The version of Lua the parser will target; supported values are '5.1', '5.2', '5.3' and 'LuaJIT'. */
  var luaVersion: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT = js.native
  
  /**
    * A callback which will be invoked when a syntax node has been completed.
    * The node which has been created will be passed as the only parameter.
    */
  def onCreateNode(node: Node): Unit = js.native
  
  /** A callback which will be invoked when a new scope is created. */
  def onCreateScope(): Unit = js.native
  
  /** A callback which will be invoked when the current scope is destroyed. */
  def onDestroyScope(): Unit = js.native
  
  /**
    * A callback which will be invoked when a local variable is declared.
    * The identifier will be passed as the only parameter.
    */
  def onLocalDeclaration(identifier: Identifier): Unit = js.native
  
  /** Store the start and end character locations on each syntax node. */
  var ranges: Boolean = js.native
  
  /** Track identifier scopes. */
  var scope: Boolean = js.native
  
  /** Explicitly tell the parser when the input ends. */
  @JSName("wait")
  var wait_FOptions: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(
    comments: Boolean,
    extendedIdentifiers: `false`,
    locations: Boolean,
    luaVersion: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT,
    onCreateNode: Node => Unit,
    onCreateScope: () => Unit,
    onDestroyScope: () => Unit,
    onLocalDeclaration: Identifier => Unit,
    ranges: Boolean,
    scope: Boolean,
    wait: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], extendedIdentifiers = extendedIdentifiers.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], luaVersion = luaVersion.asInstanceOf[js.Any], onCreateNode = js.Any.fromFunction1(onCreateNode), onCreateScope = js.Any.fromFunction0(onCreateScope), onDestroyScope = js.Any.fromFunction0(onDestroyScope), onLocalDeclaration = js.Any.fromFunction1(onLocalDeclaration), ranges = ranges.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedIdentifiers(value: `false`): Self = this.set("extendedIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: Boolean): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLuaVersion(value: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT): Self = this.set("luaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCreateNode(value: Node => Unit): Self = this.set("onCreateNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCreateScope(value: () => Unit): Self = this.set("onCreateScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDestroyScope(value: () => Unit): Self = this.set("onDestroyScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLocalDeclaration(value: Identifier => Unit): Self = this.set("onLocalDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRanges(value: Boolean): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Boolean): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
  }
}
