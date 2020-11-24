package typings.luaparse.anon

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<luaparse.luaparse.Options> & {  wait :true} */
@js.native
trait PartialOptionswaittrue extends js.Object {
  
  var comments: js.UndefOr[Boolean] = js.native
  
  var extendedIdentifiers: js.UndefOr[`false`] = js.native
  
  var locations: js.UndefOr[Boolean] = js.native
  
  var luaVersion: js.UndefOr[`5Dot1` | `5Dot2` | `5Dot3` | LuaJIT] = js.native
  
  var onCreateNode: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  
  var onCreateScope: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onDestroyScope: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLocalDeclaration: js.UndefOr[js.Function1[/* identifier */ Identifier, Unit]] = js.native
  
  var ranges: js.UndefOr[Boolean] = js.native
  
  var scope: js.UndefOr[Boolean] = js.native
  
  @JSName("wait")
  var wait_FPartialOptionswaittrue: js.UndefOr[Boolean] with `true` = js.native
}
object PartialOptionswaittrue {
  
  @scala.inline
  def apply(wait: js.UndefOr[Boolean] with `true`): PartialOptionswaittrue = {
    val __obj = js.Dynamic.literal(wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionswaittrue]
  }
  
  @scala.inline
  implicit class PartialOptionswaittrueOps[Self <: PartialOptionswaittrue] (val x: Self) extends AnyVal {
    
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
    def setWait(value: js.UndefOr[Boolean] with `true`): Self = this.set("wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setExtendedIdentifiers(value: `false`): Self = this.set("extendedIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedIdentifiers: Self = this.set("extendedIdentifiers", js.undefined)
    
    @scala.inline
    def setLocations(value: Boolean): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setLuaVersion(value: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT): Self = this.set("luaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLuaVersion: Self = this.set("luaVersion", js.undefined)
    
    @scala.inline
    def setOnCreateNode(value: /* node */ Node => Unit): Self = this.set("onCreateNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCreateNode: Self = this.set("onCreateNode", js.undefined)
    
    @scala.inline
    def setOnCreateScope(value: () => Unit): Self = this.set("onCreateScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCreateScope: Self = this.set("onCreateScope", js.undefined)
    
    @scala.inline
    def setOnDestroyScope(value: () => Unit): Self = this.set("onDestroyScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDestroyScope: Self = this.set("onDestroyScope", js.undefined)
    
    @scala.inline
    def setOnLocalDeclaration(value: /* identifier */ Identifier => Unit): Self = this.set("onLocalDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLocalDeclaration: Self = this.set("onLocalDeclaration", js.undefined)
    
    @scala.inline
    def setRanges(value: Boolean): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setScope(value: Boolean): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
