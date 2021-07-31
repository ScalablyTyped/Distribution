package typings.luaparse

import typings.luaparse.astMod.Identifier
import typings.luaparse.astMod.Node
import typings.luaparse.luaparseBooleans.`false`
import typings.luaparse.luaparseBooleans.`true`
import typings.luaparse.luaparseStrings.LuaJIT
import typings.luaparse.luaparseStrings.`5Dot1`
import typings.luaparse.luaparseStrings.`5Dot2`
import typings.luaparse.luaparseStrings.`5Dot3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    @scala.inline
    def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Column
    
    var start: Column
  }
  object End {
    
    @scala.inline
    def apply(end: Column, start: Column): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<luaparse.luaparse.Options> */
  trait PartialOptions extends StObject {
    
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
    var wait_FPartialOptions: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setExtendedIdentifiers(value: `false`): Self = StObject.set(x, "extendedIdentifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedIdentifiersUndefined: Self = StObject.set(x, "extendedIdentifiers", js.undefined)
      
      @scala.inline
      def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      @scala.inline
      def setLuaVersion(value: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT): Self = StObject.set(x, "luaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLuaVersionUndefined: Self = StObject.set(x, "luaVersion", js.undefined)
      
      @scala.inline
      def setOnCreateNode(value: /* node */ Node => Unit): Self = StObject.set(x, "onCreateNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCreateNodeUndefined: Self = StObject.set(x, "onCreateNode", js.undefined)
      
      @scala.inline
      def setOnCreateScope(value: () => Unit): Self = StObject.set(x, "onCreateScope", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCreateScopeUndefined: Self = StObject.set(x, "onCreateScope", js.undefined)
      
      @scala.inline
      def setOnDestroyScope(value: () => Unit): Self = StObject.set(x, "onDestroyScope", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDestroyScopeUndefined: Self = StObject.set(x, "onDestroyScope", js.undefined)
      
      @scala.inline
      def setOnLocalDeclaration(value: /* identifier */ Identifier => Unit): Self = StObject.set(x, "onLocalDeclaration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLocalDeclarationUndefined: Self = StObject.set(x, "onLocalDeclaration", js.undefined)
      
      @scala.inline
      def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  /* Inlined std.Partial<luaparse.luaparse.Options> & {  wait :true} */
  trait PartialOptionswaittrue extends StObject {
    
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
    var wait_FPartialOptionswaittrue: js.UndefOr[Boolean] & `true`
  }
  object PartialOptionswaittrue {
    
    @scala.inline
    def apply(wait_ : js.UndefOr[Boolean] & `true`): PartialOptionswaittrue = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialOptionswaittrue]
    }
    
    @scala.inline
    implicit class PartialOptionswaittrueMutableBuilder[Self <: PartialOptionswaittrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setExtendedIdentifiers(value: `false`): Self = StObject.set(x, "extendedIdentifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedIdentifiersUndefined: Self = StObject.set(x, "extendedIdentifiers", js.undefined)
      
      @scala.inline
      def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
      
      @scala.inline
      def setLuaVersion(value: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT): Self = StObject.set(x, "luaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLuaVersionUndefined: Self = StObject.set(x, "luaVersion", js.undefined)
      
      @scala.inline
      def setOnCreateNode(value: /* node */ Node => Unit): Self = StObject.set(x, "onCreateNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCreateNodeUndefined: Self = StObject.set(x, "onCreateNode", js.undefined)
      
      @scala.inline
      def setOnCreateScope(value: () => Unit): Self = StObject.set(x, "onCreateScope", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCreateScopeUndefined: Self = StObject.set(x, "onCreateScope", js.undefined)
      
      @scala.inline
      def setOnDestroyScope(value: () => Unit): Self = StObject.set(x, "onDestroyScope", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDestroyScopeUndefined: Self = StObject.set(x, "onDestroyScope", js.undefined)
      
      @scala.inline
      def setOnLocalDeclaration(value: /* identifier */ Identifier => Unit): Self = StObject.set(x, "onLocalDeclaration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLocalDeclarationUndefined: Self = StObject.set(x, "onLocalDeclaration", js.undefined)
      
      @scala.inline
      def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setWait_(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    }
  }
}
