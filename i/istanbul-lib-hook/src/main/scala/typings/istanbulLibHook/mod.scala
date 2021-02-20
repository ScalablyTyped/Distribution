package typings.istanbulLibHook

import typings.istanbulLibHook.anon.PartialHookRequireOptions
import typings.istanbulLibHook.anon.PartialHookRunInContextOp
import typings.istanbulLibHook.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-hook", "hookCreateScript")
  @js.native
  def hookCreateScript(matcher: Matcher, transformer: Transformer): Unit = js.native
  @JSImport("istanbul-lib-hook", "hookCreateScript")
  @js.native
  def hookCreateScript(matcher: Matcher, transformer: Transformer, options: PartialOptions): Unit = js.native
  
  @JSImport("istanbul-lib-hook", "hookRequire")
  @js.native
  def hookRequire(matcher: Matcher, transformer: Transformer): js.Function0[Unit] = js.native
  @JSImport("istanbul-lib-hook", "hookRequire")
  @js.native
  def hookRequire(matcher: Matcher, transformer: Transformer, options: PartialHookRequireOptions): js.Function0[Unit] = js.native
  
  @JSImport("istanbul-lib-hook", "hookRunInContext")
  @js.native
  def hookRunInContext(matcher: Matcher, transformer: Transformer): Unit = js.native
  @JSImport("istanbul-lib-hook", "hookRunInContext")
  @js.native
  def hookRunInContext(matcher: Matcher, transformer: Transformer, options: PartialHookRunInContextOp): Unit = js.native
  
  @JSImport("istanbul-lib-hook", "hookRunInThisContext")
  @js.native
  def hookRunInThisContext(matcher: Matcher, transformer: Transformer): Unit = js.native
  @JSImport("istanbul-lib-hook", "hookRunInThisContext")
  @js.native
  def hookRunInThisContext(matcher: Matcher, transformer: Transformer, options: PartialOptions): Unit = js.native
  
  @JSImport("istanbul-lib-hook", "unhookCreateScript")
  @js.native
  def unhookCreateScript(): Unit = js.native
  
  @JSImport("istanbul-lib-hook", "unhookRunInContext")
  @js.native
  def unhookRunInContext(): Unit = js.native
  
  @JSImport("istanbul-lib-hook", "unhookRunInThisContext")
  @js.native
  def unhookRunInThisContext(): Unit = js.native
  
  @JSImport("istanbul-lib-hook", "unloadRequireCache")
  @js.native
  def unloadRequireCache(matcher: Matcher): Unit = js.native
  
  @js.native
  trait HookRequireOptions extends Options {
    
    var extensions: js.Array[String] = js.native
    
    def postLoadHook(filename: String): Unit = js.native
  }
  object HookRequireOptions {
    
    @scala.inline
    def apply(extensions: js.Array[String], postLoadHook: String => Unit, verbose: Boolean): HookRequireOptions = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], postLoadHook = js.Any.fromFunction1(postLoadHook), verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookRequireOptions]
    }
    
    @scala.inline
    implicit class HookRequireOptionsMutableBuilder[Self <: HookRequireOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setPostLoadHook(value: String => Unit): Self = StObject.set(x, "postLoadHook", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait HookRunInContextOptions extends Options {
    
    var coverageVariable: String = js.native
  }
  object HookRunInContextOptions {
    
    @scala.inline
    def apply(coverageVariable: String, verbose: Boolean): HookRunInContextOptions = {
      val __obj = js.Dynamic.literal(coverageVariable = coverageVariable.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookRunInContextOptions]
    }
    
    @scala.inline
    implicit class HookRunInContextOptionsMutableBuilder[Self <: HookRunInContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
    }
  }
  
  type Matcher = js.Function1[/* filename */ String, Boolean]
  
  @js.native
  trait Options extends StObject {
    
    var verbose: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(verbose: Boolean): Options = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  type Transformer = js.Function2[/* code */ String, /* options */ TransformerOptions, String]
  
  @js.native
  trait TransformerOptions extends StObject {
    
    var filename: String = js.native
  }
  object TransformerOptions {
    
    @scala.inline
    def apply(filename: String): TransformerOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformerOptions]
    }
    
    @scala.inline
    implicit class TransformerOptionsMutableBuilder[Self <: TransformerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
}
