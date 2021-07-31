package typings.imageminUpng

import typings.imagemin.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * upng imagemin plugin
    */
  @scala.inline
  def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  @scala.inline
  def apply(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("imagemin-upng", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * number of colors in the result (0 = lossless, 256 = lossy).
      * @default 256
      */
    var cnum: js.UndefOr[Double] = js.undefined
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
