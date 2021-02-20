package typings.gulpSize

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-size", JSImport.Namespace)
  @js.native
  def apply(): SizeStream = js.native
  @JSImport("gulp-size", JSImport.Namespace)
  @js.native
  def apply(options: Options): SizeStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    var gzip: js.UndefOr[Boolean] = js.native
    
    var pretty: js.UndefOr[Boolean] = js.native
    
    var showFiles: js.UndefOr[Boolean] = js.native
    
    var showTotal: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String] = js.native
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
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      @scala.inline
      def setShowFiles(value: Boolean): Self = StObject.set(x, "showFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFilesUndefined: Self = StObject.set(x, "showFiles", js.undefined)
      
      @scala.inline
      def setShowTotal(value: Boolean): Self = StObject.set(x, "showTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTotalUndefined: Self = StObject.set(x, "showTotal", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait SizeStream extends ReadWriteStream {
    
    var prettySize: String = js.native
    
    var size: Double = js.native
  }
}
