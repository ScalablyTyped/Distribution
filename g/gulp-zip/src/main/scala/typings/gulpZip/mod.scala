package typings.gulpZip

import typings.node.processMod.global.NodeJS.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filename: String): ReadStream = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[ReadStream]
  inline def apply(filename: String, options: GulpZipOptions): ReadStream = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadStream]
  
  @JSImport("gulp-zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GulpZipOptions extends StObject {
    
    /**
      * Compress
      * @default true
      */
    var compress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Overrides the modification timestamp for all files added to the archive.
      *
      * Tip: Setting it to the same value across executions enables you to create stable archives
      * that change only when the contents of their entries change, regardless of whether those
      * entries were "touched" or regenerated.
      *
      * @default undefined
      */
    var modifiedTime: js.UndefOr[js.Date] = js.undefined
  }
  object GulpZipOptions {
    
    inline def apply(): GulpZipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GulpZipOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GulpZipOptions] (val x: Self) extends AnyVal {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setModifiedTime(value: js.Date): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
      
      inline def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
    }
  }
}
