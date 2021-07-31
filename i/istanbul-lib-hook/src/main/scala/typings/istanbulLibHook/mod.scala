package typings.istanbulLibHook

import typings.istanbulLibHook.anon.PartialHookRequireOptions
import typings.istanbulLibHook.anon.PartialHookRunInContextOp
import typings.istanbulLibHook.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hookCreateScript(matcher: Matcher, transformer: Transformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookCreateScript")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def hookCreateScript(matcher: Matcher, transformer: Transformer, options: PartialOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookCreateScript")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def hookRequire(matcher: Matcher, transformer: Transformer): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRequire")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def hookRequire(matcher: Matcher, transformer: Transformer, options: PartialHookRequireOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRequire")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def hookRunInContext(matcher: Matcher, transformer: Transformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRunInContext")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def hookRunInContext(matcher: Matcher, transformer: Transformer, options: PartialHookRunInContextOp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRunInContext")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def hookRunInThisContext(matcher: Matcher, transformer: Transformer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRunInThisContext")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def hookRunInThisContext(matcher: Matcher, transformer: Transformer, options: PartialOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookRunInThisContext")(matcher.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unhookCreateScript(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unhookCreateScript")().asInstanceOf[Unit]
  
  @scala.inline
  def unhookRunInContext(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unhookRunInContext")().asInstanceOf[Unit]
  
  @scala.inline
  def unhookRunInThisContext(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unhookRunInThisContext")().asInstanceOf[Unit]
  
  @scala.inline
  def unloadRequireCache(matcher: Matcher): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadRequireCache")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait HookRequireOptions
    extends StObject
       with Options {
    
    var extensions: js.Array[String]
    
    def postLoadHook(filename: String): Unit
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
  
  trait HookRunInContextOptions
    extends StObject
       with Options {
    
    var coverageVariable: String
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
  
  trait Options extends StObject {
    
    var verbose: Boolean
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
  
  trait TransformerOptions extends StObject {
    
    var filename: String
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
