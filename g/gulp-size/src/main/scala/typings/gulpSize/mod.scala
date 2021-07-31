package typings.gulpSize

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): SizeStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[SizeStream]
  @scala.inline
  def apply(options: Options): SizeStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[SizeStream]
  
  @JSImport("gulp-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    var showFiles: js.UndefOr[Boolean] = js.undefined
    
    var showTotal: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
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
  trait SizeStream
    extends StObject
       with ReadWriteStream {
    
    var prettySize: String = js.native
    
    var size: Double = js.native
  }
}
