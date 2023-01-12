package typings.gulpHtmlhint

import org.scalablytyped.runtime.Shortcut
import typings.gulpHtmlhint.mod.gulpHtmlhint.Plugin
import typings.htmlhint.typesMod.Rule
import typings.node.streamMod.Transform
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-htmlhint", JSImport.Namespace)
  @js.native
  val ^ : Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin = ^
  
  object gulpHtmlhint {
    
    trait FailOnErrorOptions extends StObject {
      
      /**
        * @default false
        */
      var suppress: Boolean
    }
    object FailOnErrorOptions {
      
      inline def apply(suppress: Boolean): FailOnErrorOptions = {
        val __obj = js.Dynamic.literal(suppress = suppress.asInstanceOf[js.Any])
        __obj.asInstanceOf[FailOnErrorOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FailOnErrorOptions] (val x: Self) extends AnyVal {
        
        inline def setSuppress(value: Boolean): Self = StObject.set(x, "suppress", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      var htmlhintrc: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setHtmlhintrc(value: String): Self = StObject.set(x, "htmlhintrc", value.asInstanceOf[js.Any])
        
        inline def setHtmlhintrcUndefined: Self = StObject.set(x, "htmlhintrc", js.undefined)
      }
    }
    
    @js.native
    trait Plugin extends StObject {
      
      def apply(): Transform = js.native
      def apply(customRules: js.Array[Rule]): Transform = js.native
      def apply(options: String): Transform = js.native
      def apply(options: String, customRules: js.Array[Rule]): Transform = js.native
      def apply(options: Unit, customRules: js.Array[Rule]): Transform = js.native
      def apply(options: Options): Transform = js.native
      def apply(options: Options, customRules: js.Array[Rule]): Transform = js.native
      
      def addRule(rule: Rule): Unit = js.native
      
      def failAfterError(): Transform = js.native
      def failAfterError(options: Record[String, Any]): Transform = js.native
      
      def failOnError(): Transform = js.native
      def failOnError(options: FailOnErrorOptions): Transform = js.native
      
      def failReporter(): Transform = js.native
      def failReporter(options: Record[String, Any]): Transform = js.native
      
      // Backward compatibility
      def reporter(): Transform = js.native
      def reporter(customReporter: String): Transform = js.native
      def reporter(customReporter: String, options: Record[String, Any]): Transform = js.native
      def reporter(customReporter: Unit, options: Record[String, Any]): Transform = js.native
      def reporter(customReporter: Reported): Transform = js.native
      def reporter(customReporter: Reported, options: Record[String, Any]): Transform = js.native
      def reporter(customReporter: ReporterFunction): Transform = js.native
      def reporter(customReporter: ReporterFunction, options: Record[String, Any]): Transform = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.gulpHtmlhint.gulpHtmlhintStrings.fail
      - typings.gulpHtmlhint.gulpHtmlhintStrings.failOn
      - typings.gulpHtmlhint.gulpHtmlhintStrings.failAfter
    */
    trait Reported extends StObject
    object Reported {
      
      inline def fail: typings.gulpHtmlhint.gulpHtmlhintStrings.fail = "fail".asInstanceOf[typings.gulpHtmlhint.gulpHtmlhintStrings.fail]
      
      inline def failAfter: typings.gulpHtmlhint.gulpHtmlhintStrings.failAfter = "failAfter".asInstanceOf[typings.gulpHtmlhint.gulpHtmlhintStrings.failAfter]
      
      inline def failOn: typings.gulpHtmlhint.gulpHtmlhintStrings.failOn = "failOn".asInstanceOf[typings.gulpHtmlhint.gulpHtmlhintStrings.failOn]
    }
    
    type ReporterFunction = js.Function0[Unit]
  }
}
