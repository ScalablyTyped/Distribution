package typings.gulpStripComments

import org.scalablytyped.runtime.Shortcut
import typings.gulpStripComments.mod.stripComments.Strip
import typings.node.NodeJS.ReadWriteStream
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-strip-comments", JSImport.Namespace)
  @js.native
  val ^ : Strip = js.native
  
  type _To = Strip
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Strip = ^
  
  object stripComments {
    
    @js.native
    trait Strip extends StObject {
      
      def apply(): ReadWriteStream = js.native
      def apply(options: StripOptions): ReadWriteStream = js.native
      
      def getEOL(): String = js.native
      
      def html(): ReadWriteStream = js.native
      def html(options: StripOptions): ReadWriteStream = js.native
      
      def text(): ReadWriteStream = js.native
      def text(options: StripOptions): ReadWriteStream = js.native
    }
    
    @js.native
    trait StripOptions extends StObject {
      
      var ignore: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
      
      var safe: js.UndefOr[Boolean] = js.native
      
      var space: js.UndefOr[Boolean] = js.native
      
      var trim: js.UndefOr[Boolean] = js.native
    }
    object StripOptions {
      
      @scala.inline
      def apply(): StripOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StripOptions]
      }
      
      @scala.inline
      implicit class StripOptionsMutableBuilder[Self <: StripOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIgnore(value: RegExp | js.Array[RegExp]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
        
        @scala.inline
        def setIgnoreVarargs(value: RegExp*): Self = StObject.set(x, "ignore", js.Array(value :_*))
        
        @scala.inline
        def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
        
        @scala.inline
        def setSpace(value: Boolean): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
        
        @scala.inline
        def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      }
    }
  }
}
