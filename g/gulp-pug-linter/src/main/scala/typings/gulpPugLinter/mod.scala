package typings.gulpPugLinter

import org.scalablytyped.runtime.Shortcut
import typings.gulpPugLinter.mod.GulpPugLinter.Options
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-pug-linter", JSImport.Namespace)
  @js.native
  val ^ : GulpPugLinter = js.native
  
  object GulpPugLinter {
    
    trait Options extends StObject {
      
      var failAfterError: js.UndefOr[Boolean] = js.undefined
      
      var reporter: js.UndefOr[js.Any] = js.undefined
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
        def setFailAfterError(value: Boolean): Self = StObject.set(x, "failAfterError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFailAfterErrorUndefined: Self = StObject.set(x, "failAfterError", js.undefined)
        
        @scala.inline
        def setReporter(value: js.Any): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      }
    }
  }
  type GulpPugLinter = js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
  
  type _To = GulpPugLinter
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpPugLinter = ^
}
