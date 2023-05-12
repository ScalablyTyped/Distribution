package typings.logRotate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(file: String, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(file: String, options: Options, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("log-rotate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* err */ js.Error | Null, /* rotated */ js.UndefOr[String], Unit]
  
  trait Options extends StObject {
    
    /**
      * Compress rotated files with gzip
      */
    var compress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Move a log file while incrementing existing indexed / rotated logs
      */
    var count: js.UndefOr[Double] = js.undefined
    
    var matcher: js.UndefOr[js.RegExp] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setMatcher(value: js.RegExp): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
      
      inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    }
  }
}
