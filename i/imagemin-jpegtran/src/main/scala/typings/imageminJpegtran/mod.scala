package typings.imageminJpegtran

import typings.imagemin.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imagemin-jpegtran", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("imagemin-jpegtran", JSImport.Namespace)
  @js.native
  def apply(options: Options): Plugin = js.native
  
  @js.native
  trait Options extends StObject {
    
    var arithmetic: js.UndefOr[Boolean] = js.native
    
    var progressive: js.UndefOr[Boolean] = js.native
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
      def setArithmetic(value: Boolean): Self = StObject.set(x, "arithmetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArithmeticUndefined: Self = StObject.set(x, "arithmetic", js.undefined)
      
      @scala.inline
      def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
    }
  }
}
