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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  class PatternCls[T] protected () extends Pattern[T] {
    def this(rule: js.Function1[/* str */ String, T]) = this()
    def this(rule: Pattern[T]) = this()
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
  
  @JSImport("hexo-util", "camelCaseKeys")
  @js.native
  def camelCaseKeys(obj: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  
  @JSImport("hexo-util", "escapeDiacritic")
  @js.native
  def escapeDiacritic(str: String): String = js.native
  
  @JSImport("hexo-util", "escapeHTML")
  @js.native
  def escapeHTML(str: String): String = js.native
  
  @JSImport("hexo-util", "escapeRegExp")
  @js.native
  def escapeRegExp(str: String): String = js.native
  
  @JSImport("hexo-util", "hash")
  @js.native
  def hash(str: String): Buffer = js.native
  @JSImport("hexo-util", "hash")
  @js.native
  def hash(str: ArrayBufferView): Buffer = js.native
  
  @JSImport("hexo-util", "highlight")
  @js.native
  def highlight(str: String): String = js.native
  @JSImport("hexo-util", "highlight")
  @js.native
  def highlight(str: String, options: AutoDetect): String = js.native
  
  @JSImport("hexo-util", "htmlTag")
  @js.native
  def htmlTag(tag: String): String = js.native
  @JSImport("hexo-util", "htmlTag")
  @js.native
  def htmlTag(tag: String, attrs: js.UndefOr[scala.Nothing], text: String): String = js.native
  @JSImport("hexo-util", "htmlTag")
  @js.native
  def htmlTag(tag: String, attrs: js.Array[String]): String = js.native
  @JSImport("hexo-util", "htmlTag")
  @js.native
  def htmlTag(tag: String, attrs: js.Array[String], text: String): String = js.native
  @JSImport("hexo-util", "htmlTag")
  @js.native
  def htmlTag(tag: String, attrs: StringDictionary[js.Any]): String = js.native
  @JSImport("hexo-util", "htmlTag")
  @js.native
  def htmlTag(tag: String, attrs: StringDictionary[js.Any], text: String): String = js.native
  @JSImport("hexo-util", "htmlTag")
  @js.native
  def htmlTag(tag: String, attrs: ArrayLike[String]): String = js.native
  @JSImport("hexo-util", "htmlTag")
  @js.native
  def htmlTag(tag: String, attrs: ArrayLike[String], text: String): String = js.native
  
  @JSImport("hexo-util", "slugize")
  @js.native
  def slugize(str: String): String = js.native
  @JSImport("hexo-util", "slugize")
  @js.native
  def slugize(str: String, options: Separator): String = js.native
  
  @JSImport("hexo-util", "spawn")
  @js.native
  def spawn(command: String): js.Promise[String] = js.native
  @JSImport("hexo-util", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String]): js.Promise[String] = js.native
  @JSImport("hexo-util", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String], options: hexoSpawnDisableEncodingAndOverrideStdioOptions): js.Promise[js.UndefOr[Buffer]] = js.native
  @JSImport("hexo-util", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String], options: hexoSpawnDisableEncodingOptions): js.Promise[Buffer] = js.native
  @JSImport("hexo-util", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String], options: hexoSpawnOptions): js.Promise[String] = js.native
  @JSImport("hexo-util", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String], options: hexoSpawnOverrideStdioOptions): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("hexo-util", "spawn")
  @js.native
  def spawn(command: String, options: hexoSpawnDisableEncodingAndOverrideStdioOptions): js.Promise[js.UndefOr[Buffer]] = js.native
  @JSImport("hexo-util", "spawn")
  @js.native
  def spawn(command: String, options: hexoSpawnDisableEncodingOptions): js.Promise[Buffer] = js.native
  @JSImport("hexo-util", "spawn")
  @js.native
  def spawn(command: String, options: hexoSpawnOptions): js.Promise[String] = js.native
  @JSImport("hexo-util", "spawn")
  @js.native
  def spawn(command: String, options: hexoSpawnOverrideStdioOptions): js.Promise[js.UndefOr[String]] = js.native
  
  @JSImport("hexo-util", "stripHTML")
  @js.native
  def stripHTML(str: String): String = js.native
  
  @JSImport("hexo-util", "truncate")
  @js.native
  def truncate(str: String): String = js.native
  @JSImport("hexo-util", "truncate")
  @js.native
  def truncate(str: String, options: Length): String = js.native
  
  @JSImport("hexo-util", "wordWrap")
  @js.native
  def wordWrap(str: String): String = js.native
  @JSImport("hexo-util", "wordWrap")
  @js.native
  def wordWrap(str: String, options: Width): String = js.native
  
  @js.native
  trait Pattern[T] extends StObject {
    
    def `match`(str: String): T = js.native
    
    def test(str: String): Boolean = js.native
  }
  object Pattern {
    
    @scala.inline
    def apply[T](`match`: String => T, test: String => Boolean): Pattern[T] = {
      val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Pattern[T]]
    }
    
    @scala.inline
    implicit class PatternMutableBuilder[Self <: Pattern[_], T] (val x: Self with Pattern[T]) extends AnyVal {
      
      @scala.inline
      def setMatch(value: String => T): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTest(value: String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait hexoSpawnDisableEncodingAndOverrideStdioOptions extends hexoSpawnDisableEncodingOptions {
    
    @JSName("stdio")
    var stdio_hexoSpawnDisableEncodingAndOverrideStdioOptions: StdioOptions = js.native
  }
  object hexoSpawnDisableEncodingAndOverrideStdioOptions {
    
    @scala.inline
    def apply(stdio: StdioOptions): hexoSpawnDisableEncodingAndOverrideStdioOptions = {
      val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any])
      __obj.asInstanceOf[hexoSpawnDisableEncodingAndOverrideStdioOptions]
    }
    
    @scala.inline
    implicit class hexoSpawnDisableEncodingAndOverrideStdioOptionsMutableBuilder[Self <: hexoSpawnDisableEncodingAndOverrideStdioOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
    }
  }
  
  @js.native
  trait hexoSpawnDisableEncodingOptions extends SpawnOptions {
    
    var encoding: _empty | `false` | Null = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object hexoSpawnDisableEncodingOptions {
    
    @scala.inline
    def apply(): hexoSpawnDisableEncodingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[hexoSpawnDisableEncodingOptions]
    }
    
    @scala.inline
    implicit class hexoSpawnDisableEncodingOptionsMutableBuilder[Self <: hexoSpawnDisableEncodingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: _empty | `false`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait hexoSpawnOptions extends SpawnOptions {
    
    var encoding: js.UndefOr[BufferEncoding] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object hexoSpawnOptions {
    
    @scala.inline
    def apply(): hexoSpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[hexoSpawnOptions]
    }
    
    @scala.inline
    implicit class hexoSpawnOptionsMutableBuilder[Self <: hexoSpawnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait hexoSpawnOverrideStdioOptions extends hexoSpawnOptions {
    
    @JSName("stdio")
    var stdio_hexoSpawnOverrideStdioOptions: StdioOptions = js.native
  }
  object hexoSpawnOverrideStdioOptions {
    
    @scala.inline
    def apply(stdio: StdioOptions): hexoSpawnOverrideStdioOptions = {
      val __obj = js.Dynamic.literal(stdio = stdio.asInstanceOf[js.Any])
      __obj.asInstanceOf[hexoSpawnOverrideStdioOptions]
    }
    
    @scala.inline
    implicit class hexoSpawnOverrideStdioOptionsMutableBuilder[Self <: hexoSpawnOverrideStdioOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
    }
  }
}
