package typings.hexoUtil

import org.scalablytyped.runtime.StringDictionary
import typings.hexoUtil.anon.AutoDetect
import typings.hexoUtil.anon.Length
import typings.hexoUtil.anon.Segments
import typings.hexoUtil.anon.Separator
import typings.hexoUtil.anon.Width
import typings.hexoUtil.hexoUtilBooleans.`false`
import typings.hexoUtil.hexoUtilStrings._empty
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.StdioOptions
import typings.node.nodeStrings.ignore
import typings.node.nodeStrings.inherit
import typings.node.nodeStrings.ipc
import typings.node.nodeStrings.pipe
import typings.node.streamMod.Stream
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.std.ArrayBufferView
import typings.std.ArrayLike
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hexo-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hexo-util", "CacheStream")
  @js.native
  class CacheStream () extends Transform {
    def this(opts: TransformOptions) = this()
    
    def getCache(): Buffer = js.native
  }
  
  @JSImport("hexo-util", "HashStream")
  @js.native
  class HashStream () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("hexo-util", "Pattern")
  @js.native
  class PatternCls[T] protected ()
    extends StObject
       with Pattern[T] {
    def this(rule: js.Function1[/* str */ String, T]) = this()
    def this(rule: Pattern[T]) = this()
    
    /* CompleteClass */
    override def `match`(str: String): T = js.native
    
    /* CompleteClass */
    override def test(str: String): Boolean = js.native
  }
  
  @JSImport("hexo-util", "Permalink")
  @js.native
  class Permalink protected () extends StObject {
    def this(rule: String) = this()
    def this(rule: String, options: Segments) = this()
    
    var params: js.Array[String] = js.native
    
    def parse(str: String): js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var regex: RegExp = js.native
    
    var rule: String = js.native
    
    def stringify(data: StringDictionary[String]): String = js.native
    
    def test(str: String): Boolean = js.native
  }
  
  inline def camelCaseKeys(obj: StringDictionary[js.Any]): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCaseKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  
  inline def escapeDiacritic(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeDiacritic")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeHTML(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHTML")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeRegExp(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegExp")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hash(str: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(str.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def hash(str: ArrayBufferView): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(str.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def highlight(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def highlight(str: String, options: AutoDetect): String = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def htmlTag(tag: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlTag")(tag.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def htmlTag(tag: String, attrs: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlTag")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def htmlTag(tag: String, attrs: js.Array[String], text: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlTag")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def htmlTag(tag: String, attrs: StringDictionary[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlTag")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def htmlTag(tag: String, attrs: StringDictionary[js.Any], text: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlTag")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def htmlTag(tag: String, attrs: Unit, text: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlTag")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def htmlTag(tag: String, attrs: ArrayLike[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlTag")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def htmlTag(tag: String, attrs: ArrayLike[String], text: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlTag")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def slugize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slugize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def slugize(str: String, options: Separator): String = (^.asInstanceOf[js.Dynamic].applyDynamic("slugize")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def spawn(command: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def spawn(command: String, args: js.Array[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawn(command: String, args: js.Array[String], options: hexoSpawnDisableEncodingAndOverrideStdioOptions): js.Promise[js.UndefOr[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Buffer]]]
  inline def spawn(command: String, args: js.Array[String], options: hexoSpawnDisableEncodingOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def spawn(command: String, args: js.Array[String], options: hexoSpawnOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawn(command: String, args: js.Array[String], options: hexoSpawnOverrideStdioOptions): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def spawn(command: String, options: hexoSpawnDisableEncodingAndOverrideStdioOptions): js.Promise[js.UndefOr[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Buffer]]]
  inline def spawn(command: String, options: hexoSpawnDisableEncodingOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def spawn(command: String, options: hexoSpawnOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawn(command: String, options: hexoSpawnOverrideStdioOptions): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def stripHTML(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripHTML")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def truncate(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def truncate(str: String, options: Length): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def wordWrap(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def wordWrap(str: String, options: Width): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordWrap")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Pattern[T] extends StObject {
    
    def `match`(str: String): T
    
    def test(str: String): Boolean
  }
  object Pattern {
    
    inline def apply[T](`match`: String => T, test: String => Boolean): Pattern[T] = {
      val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Pattern[T]]
    }
    
    extension [Self <: Pattern[?], T](x: Self & Pattern[T]) {
      
      inline def setMatch(value: String => T): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setTest(value: String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  trait hexoSpawnDisableEncodingAndOverrideStdioOptions
    extends StObject
       with hexoSpawnDisableEncodingOptions {
    
    @JSName("stdio")
    var stdio_hexoSpawnDisableEncodingAndOverrideStdioOptions: StdioOptions
  }
  object hexoSpawnDisableEncodingAndOverrideStdioOptions {
    
    inline def apply(stdio: StdioOptions): hexoSpawnDisableEncodingAndOverrideStdioOptions = {
      val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any], encoding = null)
      __obj.asInstanceOf[hexoSpawnDisableEncodingAndOverrideStdioOptions]
    }
    
    extension [Self <: hexoSpawnDisableEncodingAndOverrideStdioOptions](x: Self) {
      
      inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
    }
  }
  
  trait hexoSpawnDisableEncodingOptions
    extends StObject
       with SpawnOptions {
    
    var encoding: _empty | `false` | Null
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object hexoSpawnDisableEncodingOptions {
    
    inline def apply(): hexoSpawnDisableEncodingOptions = {
      val __obj = js.Dynamic.literal(encoding = null)
      __obj.asInstanceOf[hexoSpawnDisableEncodingOptions]
    }
    
    extension [Self <: hexoSpawnDisableEncodingOptions](x: Self) {
      
      inline def setEncoding(value: _empty | `false`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait hexoSpawnOptions
    extends StObject
       with SpawnOptions {
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object hexoSpawnOptions {
    
    inline def apply(): hexoSpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[hexoSpawnOptions]
    }
    
    extension [Self <: hexoSpawnOptions](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait hexoSpawnOverrideStdioOptions
    extends StObject
       with hexoSpawnOptions {
    
    @JSName("stdio")
    var stdio_hexoSpawnOverrideStdioOptions: StdioOptions
  }
  object hexoSpawnOverrideStdioOptions {
    
    inline def apply(stdio: StdioOptions): hexoSpawnOverrideStdioOptions = {
      val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any])
      __obj.asInstanceOf[hexoSpawnOverrideStdioOptions]
    }
    
    extension [Self <: hexoSpawnOverrideStdioOptions](x: Self) {
      
      inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
    }
  }
}
