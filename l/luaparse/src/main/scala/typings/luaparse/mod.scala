package typings.luaparse

import typings.luaparse.anon.PartialOptions
import typings.luaparse.anon.PartialOptionswaittrue
import typings.luaparse.astMod.Chunk
import typings.luaparse.astMod.Identifier
import typings.luaparse.astMod.Node
import typings.luaparse.luaparseBooleans.`false`
import typings.luaparse.luaparseStrings.LuaJIT
import typings.luaparse.luaparseStrings.`5Dot1`
import typings.luaparse.luaparseStrings.`5Dot2`
import typings.luaparse.luaparseStrings.`5Dot3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("luaparse", "parse")
  @js.native
  def parse(): Parser = js.native
  @JSImport("luaparse", "parse")
  @js.native
  def parse(code: String): Chunk = js.native
  @JSImport("luaparse", "parse")
  @js.native
  def parse(code: String, options: PartialOptions): Chunk = js.native
  @JSImport("luaparse", "parse")
  @js.native
  def parse(code: String, options: PartialOptionswaittrue): Parser = js.native
  @JSImport("luaparse", "parse")
  @js.native
  def parse(options: PartialOptions): Parser = js.native
  
  @js.native
  trait Options extends StObject {
    
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
      wait_ : Boolean
    ): Options = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], extendedIdentifiers = extendedIdentifiers.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], luaVersion = luaVersion.asInstanceOf[js.Any], onCreateNode = js.Any.fromFunction1(onCreateNode), onCreateScope = js.Any.fromFunction0(onCreateScope), onDestroyScope = js.Any.fromFunction0(onDestroyScope), onLocalDeclaration = js.Any.fromFunction1(onLocalDeclaration), ranges = ranges.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedIdentifiers(value: `false`): Self = StObject.set(x, "extendedIdentifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLuaVersion(value: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT): Self = StObject.set(x, "luaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCreateNode(value: Node => Unit): Self = StObject.set(x, "onCreateNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCreateScope(value: () => Unit): Self = StObject.set(x, "onCreateScope", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDestroyScope(value: () => Unit): Self = StObject.set(x, "onDestroyScope", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLocalDeclaration(value: Identifier => Unit): Self = StObject.set(x, "onLocalDeclaration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Parser extends StObject {
    
    def end(segment: String): Chunk = js.native
    
    def lex(): Token = js.native
    
    def write(segment: String): Unit = js.native
  }
  object Parser {
    
    @scala.inline
    def apply(end: String => Chunk, lex: () => Token, write: String => Unit): Parser = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), lex = js.Any.fromFunction0(lex), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Parser]
    }
    
    @scala.inline
    implicit class ParserMutableBuilder[Self <: Parser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: String => Chunk): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLex(value: () => Token): Self = StObject.set(x, "lex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Token extends StObject {
    
    var line: Double = js.native
    
    var lineStart: Double = js.native
    
    var range: js.Tuple2[Double, Double] = js.native
    
    var `type`: Double = js.native
    
    var value: String = js.native
  }
  object Token {
    
    @scala.inline
    def apply(line: Double, lineStart: Double, range: js.Tuple2[Double, Double], `type`: Double, value: String): Token = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineStart(value: Double): Self = StObject.set(x, "lineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
