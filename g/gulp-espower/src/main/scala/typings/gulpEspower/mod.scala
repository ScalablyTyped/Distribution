package typings.gulpEspower

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-espower", JSImport.Namespace)
  @js.native
  val ^ : Espower = js.native
  
  type Espower = js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
  
  trait Options extends StObject {
    
    var patterns: js.Array[String]
  }
  object Options {
    
    @scala.inline
    def apply(patterns: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    }
  }
  
  type _To = Espower
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Espower = ^
}
