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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("luaparse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Parser]
  inline def parse(code: String): Chunk = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[Chunk]
  inline def parse(code: String, options: PartialOptions): Chunk = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chunk]
  inline def parse(code: String, options: PartialOptionswaittrue): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(options: PartialOptions): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]
  
  trait Options extends StObject {
    
    /** Store comments as an array in the chunk object. */
    var comments: Boolean
    
    /**
      * Whether to allow code points ≥ U+0080 in identifiers, like LuaJIT does.
      * See 'Note on character encodings' below if you wish to use this option.
      * Note: setting luaVersion: 'LuaJIT' currently does not enable this option; this may change in the future.
      */
    var extendedIdentifiers: `false`
    
    /** Store location information on each syntax node. */
    var locations: Boolean
    
    /** The version of Lua the parser will target; supported values are '5.1', '5.2', '5.3' and 'LuaJIT'. */
    var luaVersion: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT
    
    /**
      * A callback which will be invoked when a syntax node has been completed.
      * The node which has been created will be passed as the only parameter.
      */
    def onCreateNode(node: Node): Unit
    
    /** A callback which will be invoked when a new scope is created. */
    def onCreateScope(): Unit
    
    /** A callback which will be invoked when the current scope is destroyed. */
    def onDestroyScope(): Unit
    
    /**
      * A callback which will be invoked when a local variable is declared.
      * The identifier will be passed as the only parameter.
      */
    def onLocalDeclaration(identifier: Identifier): Unit
    
    /** Store the start and end character locations on each syntax node. */
    var ranges: Boolean
    
    /** Track identifier scopes. */
    var scope: Boolean
    
    /** Explicitly tell the parser when the input ends. */
    @JSName("wait")
    var wait_FOptions: Boolean
  }
  object Options {
    
    inline def apply(
      comments: Boolean,
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
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], extendedIdentifiers = false, locations = locations.asInstanceOf[js.Any], luaVersion = luaVersion.asInstanceOf[js.Any], onCreateNode = js.Any.fromFunction1(onCreateNode), onCreateScope = js.Any.fromFunction0(onCreateScope), onDestroyScope = js.Any.fromFunction0(onDestroyScope), onLocalDeclaration = js.Any.fromFunction1(onLocalDeclaration), ranges = ranges.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setExtendedIdentifiers(value: `false`): Self = StObject.set(x, "extendedIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLuaVersion(value: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT): Self = StObject.set(x, "luaVersion", value.asInstanceOf[js.Any])
      
      inline def setOnCreateNode(value: Node => Unit): Self = StObject.set(x, "onCreateNode", js.Any.fromFunction1(value))
      
      inline def setOnCreateScope(value: () => Unit): Self = StObject.set(x, "onCreateScope", js.Any.fromFunction0(value))
      
      inline def setOnDestroyScope(value: () => Unit): Self = StObject.set(x, "onDestroyScope", js.Any.fromFunction0(value))
      
      inline def setOnLocalDeclaration(value: Identifier => Unit): Self = StObject.set(x, "onLocalDeclaration", js.Any.fromFunction1(value))
      
      inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parser extends StObject {
    
    def end(segment: String): Chunk
    
    def lex(): Token
    
    def write(segment: String): Unit
  }
  object Parser {
    
    inline def apply(end: String => Chunk, lex: () => Token, write: String => Unit): Parser = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), lex = js.Any.fromFunction0(lex), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Parser]
    }
    
    extension [Self <: Parser](x: Self) {
      
      inline def setEnd(value: String => Chunk): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setLex(value: () => Token): Self = StObject.set(x, "lex", js.Any.fromFunction0(value))
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait Token extends StObject {
    
    var line: Double
    
    var lineStart: Double
    
    var range: js.Tuple2[Double, Double]
    
    var `type`: Double
    
    var value: String
  }
  object Token {
    
    inline def apply(line: Double, lineStart: Double, range: js.Tuple2[Double, Double], `type`: Double, value: String): Token = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineStart(value: Double): Self = StObject.set(x, "lineStart", value.asInstanceOf[js.Any])
      
      inline def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
