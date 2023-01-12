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
    
    trait FailReporterOptions extends StObject {
      
      var failOnWarning: `true`
    }
    object FailReporterOptions {
      
      inline def apply(): FailReporterOptions = {
        val __obj = js.Dynamic.literal(failOnWarning = true)
        __obj.asInstanceOf[FailReporterOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FailReporterOptions] (val x: Self) extends AnyVal {
        
        inline def setFailOnWarning(value: `true`): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      var config: js.UndefOr[String] = js.undefined
      
      var reporter: js.UndefOr[Any] = js.undefined
      
      var rules: js.UndefOr[StringDictionary[Any]] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
        
        inline def setReporter(value: Any): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
        
        inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
        
        inline def setRules(value: StringDictionary[Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
        
        inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      }
    }
    
    trait ReporterOptions extends StObject {
      
      var logger: js.UndefOr[js.Function0[Unit]] = js.undefined
    }
    object ReporterOptions {
      
      inline def apply(): ReporterOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReporterOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ReporterOptions] (val x: Self) extends AnyVal {
        
        inline def setLogger(value: () => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction0(value))
        
        inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      }
    }
  }
  
  type _To = GulpStylint
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpStylint = ^
}
