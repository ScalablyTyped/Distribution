package typings.imageminZopfli

import typings.imagemin.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("imagemin-zopfli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /** Convert 16-bit per channel images to 8-bit per channel. */
    var `8bit`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of iterations, more iterations makes it slower
      * but provides slightly better compression.
      * Default: 15 for small files, 5 for large files.
      */
    var iterations: js.UndefOr[Double] = js.undefined
    
    /**
      * Compress more: use more iterations (depending on file size).
      */
    var more: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Remove colors behind alpha channel 0.
      * No visual difference, removes hidden information.
      */
    var transparent: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def set8bit(value: Boolean): Self = StObject.set(x, "8bit", value.asInstanceOf[js.Any])
      
      inline def set8bitUndefined: Self = StObject.set(x, "8bit", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setMore(value: Boolean): Self = StObject.set(x, "more", value.asInstanceOf[js.Any])
      
      inline def setMoreUndefined: Self = StObject.set(x, "more", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    }
  }
}
