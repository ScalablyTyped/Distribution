package typings.imageminUpng

import typings.imagemin.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * upng imagemin plugin
    */
  @JSImport("imagemin-upng", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("imagemin-upng", JSImport.Namespace)
  @js.native
  def apply(options: Options): Plugin = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * number of colors in the result (0 = lossless, 256 = lossy).
      * @default 256
      */
    var cnum: js.UndefOr[Double] = js.native
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
      def setCnum(value: Double): Self = StObject.set(x, "cnum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCnumUndefined: Self = StObject.set(x, "cnum", js.undefined)
    }
  }
}
