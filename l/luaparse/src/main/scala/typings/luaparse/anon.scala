package typings.luaparse

import typings.luaparse.libAstMod.Identifier
import typings.luaparse.libAstMod.Node
import typings.luaparse.luaparseBooleans.`false`
import typings.luaparse.luaparseStrings.LuaJIT
import typings.luaparse.luaparseStrings.`5Dot1`
import typings.luaparse.luaparseStrings.`5Dot2`
import typings.luaparse.luaparseStrings.`5Dot3`
import typings.luaparse.luaparseStrings.`pseudo-latin1`
import typings.luaparse.luaparseStrings.`x-user-defined`
import typings.luaparse.luaparseStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Column
    
    var start: Column
  }
  object End {
    
    inline def apply(end: Column, start: Column): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<luaparse.luaparse.Options> */
  trait PartialOptions extends StObject {
    
    var comments: js.UndefOr[Boolean] = js.undefined
    
    var encodingMode: js.UndefOr[`pseudo-latin1` | `x-user-defined` | none] = js.undefined
    
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
    var wait_FPartialOptions: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setEncodingMode(value: `pseudo-latin1` | `x-user-defined` | none): Self = StObject.set(x, "encodingMode", value.asInstanceOf[js.Any])
      
      inline def setEncodingModeUndefined: Self = StObject.set(x, "encodingMode", js.undefined)
      
      inline def setExtendedIdentifiers(value: `false`): Self = StObject.set(x, "extendedIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setExtendedIdentifiersUndefined: Self = StObject.set(x, "extendedIdentifiers", js.undefined)
      
      inline def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      inline def setLuaVersion(value: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT): Self = StObject.set(x, "luaVersion", value.asInstanceOf[js.Any])
      
      inline def setLuaVersionUndefined: Self = StObject.set(x, "luaVersion", js.undefined)
      
      inline def setOnCreateNode(value: /* node */ Node => Unit): Self = StObject.set(x, "onCreateNode", js.Any.fromFunction1(value))
      
      inline def setOnCreateNodeUndefined: Self = StObject.set(x, "onCreateNode", js.undefined)
      
      inline def setOnCreateScope(value: () => Unit): Self = StObject.set(x, "onCreateScope", js.Any.fromFunction0(value))
      
      inline def setOnCreateScopeUndefined: Self = StObject.set(x, "onCreateScope", js.undefined)
      
      inline def setOnDestroyScope(value: () => Unit): Self = StObject.set(x, "onDestroyScope", js.Any.fromFunction0(value))
      
      inline def setOnDestroyScopeUndefined: Self = StObject.set(x, "onDestroyScope", js.undefined)
      
      inline def setOnLocalDeclaration(value: /* identifier */ Identifier => Unit): Self = StObject.set(x, "onLocalDeclaration", js.Any.fromFunction1(value))
      
      inline def setOnLocalDeclarationUndefined: Self = StObject.set(x, "onLocalDeclaration", js.undefined)
      
      inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  /* Inlined std.Partial<luaparse.luaparse.Options> & {  wait :true} */
  trait PartialOptionswaittrue extends StObject {
    
    var comments: js.UndefOr[Boolean] = js.undefined
    
    var encodingMode: js.UndefOr[`pseudo-latin1` | `x-user-defined` | none] = js.undefined
    
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
    var wait_FPartialOptionswaittrue: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptionswaittrue {
    
    inline def apply(): PartialOptionswaittrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionswaittrue]
    }
    
    extension [Self <: PartialOptionswaittrue](x: Self) {
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setEncodingMode(value: `pseudo-latin1` | `x-user-defined` | none): Self = StObject.set(x, "encodingMode", value.asInstanceOf[js.Any])
      
      inline def setEncodingModeUndefined: Self = StObject.set(x, "encodingMode", js.undefined)
      
      inline def setExtendedIdentifiers(value: `false`): Self = StObject.set(x, "extendedIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setExtendedIdentifiersUndefined: Self = StObject.set(x, "extendedIdentifiers", js.undefined)
      
      inline def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      inline def setLuaVersion(value: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT): Self = StObject.set(x, "luaVersion", value.asInstanceOf[js.Any])
      
      inline def setLuaVersionUndefined: Self = StObject.set(x, "luaVersion", js.undefined)
      
      inline def setOnCreateNode(value: /* node */ Node => Unit): Self = StObject.set(x, "onCreateNode", js.Any.fromFunction1(value))
      
      inline def setOnCreateNodeUndefined: Self = StObject.set(x, "onCreateNode", js.undefined)
      
      inline def setOnCreateScope(value: () => Unit): Self = StObject.set(x, "onCreateScope", js.Any.fromFunction0(value))
      
      inline def setOnCreateScopeUndefined: Self = StObject.set(x, "onCreateScope", js.undefined)
      
      inline def setOnDestroyScope(value: () => Unit): Self = StObject.set(x, "onDestroyScope", js.Any.fromFunction0(value))
      
      inline def setOnDestroyScopeUndefined: Self = StObject.set(x, "onDestroyScope", js.undefined)
      
      inline def setOnLocalDeclaration(value: /* identifier */ Identifier => Unit): Self = StObject.set(x, "onLocalDeclaration", js.Any.fromFunction1(value))
      
      inline def setOnLocalDeclarationUndefined: Self = StObject.set(x, "onLocalDeclaration", js.undefined)
      
      inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
