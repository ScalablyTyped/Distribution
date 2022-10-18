package typings.gulpSize

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): SizeStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[SizeStream]
  inline def apply(options: Options): SizeStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[SizeStream]
  
  @JSImport("gulp-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Displays the brotli compressed size.
      *
      * @default false
      */
    var brotli: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Displays the gzipped size.
      *
      * @default false
      */
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Displays prettified size: 1337 B → 1.34 kB.
      *
      * @default true
      */
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Displays the size of every file instead of just the total size.
      *
      * @default false
      */
    var showFiles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Displays the total of all files.
      *
      * @default true
      */
    var showTotal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Give it a title so it's possible to distinguish the output of multiple instances logging at once.
      *
      * @default ''
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Displays the uncompressed size.
      *
      * @default false
      */
    var uncompressed: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBrotli(value: Boolean): Self = StObject.set(x, "brotli", value.asInstanceOf[js.Any])
      
      inline def setBrotliUndefined: Self = StObject.set(x, "brotli", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setShowFiles(value: Boolean): Self = StObject.set(x, "showFiles", value.asInstanceOf[js.Any])
      
      inline def setShowFilesUndefined: Self = StObject.set(x, "showFiles", js.undefined)
      
      inline def setShowTotal(value: Boolean): Self = StObject.set(x, "showTotal", value.asInstanceOf[js.Any])
      
      inline def setShowTotalUndefined: Self = StObject.set(x, "showTotal", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUncompressed(value: Boolean): Self = StObject.set(x, "uncompressed", value.asInstanceOf[js.Any])
      
      inline def setUncompressedUndefined: Self = StObject.set(x, "uncompressed", js.undefined)
    }
  }
  
  @js.native
  trait SizeStream
    extends StObject
       with ReadWriteStream {
    
    /**
      * Prettified version of .size.
      *
      * @example 14 kB
      */
    var prettySize: String = js.native
    
    /**
      * The total size of all files in bytes.
      *
      * @example 12423000
      */
    var size: Double = js.native
  }
}
