package typings.gulpStylint

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.gulpStylint.anon.FailOnWarning
import typings.gulpStylint.gulpStylintBooleans.`true`
import typings.gulpStylint.gulpStylintStrings.fail
import typings.gulpStylint.mod.GulpStylint.Options
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-stylint", JSImport.Namespace)
  @js.native
  val ^ : GulpStylint = js.native
  
  @js.native
  trait GulpStylint extends StObject {
    
    def apply(): ReadWriteStream = js.native
    def apply(options: Options): ReadWriteStream = js.native
    
    def reporter(): ReadWriteStream = js.native
    def reporter(options: GulpStylint): ReadWriteStream = js.native
    @JSName("reporter")
    def reporter_fail(identifier: fail): ReadWriteStream = js.native
    @JSName("reporter")
    def reporter_fail(identifier: fail, options: FailOnWarning): ReadWriteStream = js.native
  }
  object GulpStylint {
    
    @js.native
    trait FailReporterOptions extends StObject {
      
      var failOnWarning: `true` = js.native
    }
    object FailReporterOptions {
      
      @scala.inline
      def apply(failOnWarning: `true`): FailReporterOptions = {
        val __obj = js.Dynamic.literal(failOnWarning = failOnWarning.asInstanceOf[js.Any])
        __obj.asInstanceOf[FailReporterOptions]
      }
      
      @scala.inline
      implicit class FailReporterOptionsMutableBuilder[Self <: FailReporterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFailOnWarning(value: `true`): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Options extends StObject {
      
      var config: js.UndefOr[String] = js.native
      
      var reporter: js.UndefOr[js.Any] = js.native
      
      var rules: js.UndefOr[StringDictionary[js.Any]] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
        
        @scala.inline
        def setReporter(value: js.Any): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
        
        @scala.inline
        def setRules(value: StringDictionary[js.Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      }
    }
    
    @js.native
    trait ReporterOptions extends StObject {
      
      var logger: js.UndefOr[js.Function0[Unit]] = js.native
    }
    object ReporterOptions {
      
      @scala.inline
      def apply(): ReporterOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReporterOptions]
      }
      
      @scala.inline
      implicit class ReporterOptionsMutableBuilder[Self <: ReporterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLogger(value: () => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction0(value))
        
        @scala.inline
        def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      }
    }
  }
  
  type _To = GulpStylint
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpStylint = ^
}
