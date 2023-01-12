package typings.gulpModernizr

import typings.gulpModernizr.anon.ClassPrefix
import typings.gulpModernizr.anon.Src
import typings.gulpModernizr.gulpModernizrBooleans.`false`
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(file: String): Transform = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(file: String, parames: Params): Transform = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], parames.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(file: Unit, parames: Params): Transform = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], parames.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(parames: Params): Transform = ^.asInstanceOf[js.Dynamic].apply(parames.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("gulp-modernizr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Params extends StObject {
    
    /**
      * Avoid unnecessary builds (see Caching section below)
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, will crawl your project for references to Modernizr tests
      * Set to false to disable
      */
    var crawl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Have custom Modernizr tests? Add them here.
      */
    var customTests: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Path to save out the built file
      */
    var dest: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * Path to the build you're using for development.
      */
    var devFile: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * Useful for excluding any tests that this tool will match
      * e.g. you use .notification class for notification elements,
      * but don’t want the test for Notification API
      */
    var excludeTests: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * By default, this task will crawl all *.js, *.css, *.scss files.
      */
    var files: js.UndefOr[Src] = js.undefined
    
    /**
      * Based on default settings on http://modernizr.com/download/
      */
    var options: js.UndefOr[ClassPrefix] = js.undefined
    
    /**
      * Define any tests you want to explicitly include
      */
    var tests: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * By default, source is uglified before saving
      */
    var uglify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to pass in buffers via the "files" parameter below
      */
    var useBuffers: js.UndefOr[Boolean] = js.undefined
  }
  object Params {
    
    inline def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCrawl(value: Boolean): Self = StObject.set(x, "crawl", value.asInstanceOf[js.Any])
      
      inline def setCrawlUndefined: Self = StObject.set(x, "crawl", js.undefined)
      
      inline def setCustomTests(value: js.Array[String]): Self = StObject.set(x, "customTests", value.asInstanceOf[js.Any])
      
      inline def setCustomTestsUndefined: Self = StObject.set(x, "customTests", js.undefined)
      
      inline def setCustomTestsVarargs(value: String*): Self = StObject.set(x, "customTests", js.Array(value*))
      
      inline def setDest(value: String | `false`): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setDevFile(value: String | `false`): Self = StObject.set(x, "devFile", value.asInstanceOf[js.Any])
      
      inline def setDevFileUndefined: Self = StObject.set(x, "devFile", js.undefined)
      
      inline def setExcludeTests(value: js.Array[String]): Self = StObject.set(x, "excludeTests", value.asInstanceOf[js.Any])
      
      inline def setExcludeTestsUndefined: Self = StObject.set(x, "excludeTests", js.undefined)
      
      inline def setExcludeTestsVarargs(value: String*): Self = StObject.set(x, "excludeTests", js.Array(value*))
      
      inline def setFiles(value: Src): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setOptions(value: ClassPrefix): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTests(value: js.Array[String]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
      
      inline def setTestsVarargs(value: String*): Self = StObject.set(x, "tests", js.Array(value*))
      
      inline def setUglify(value: Boolean): Self = StObject.set(x, "uglify", value.asInstanceOf[js.Any])
      
      inline def setUglifyUndefined: Self = StObject.set(x, "uglify", js.undefined)
      
      inline def setUseBuffers(value: Boolean): Self = StObject.set(x, "useBuffers", value.asInstanceOf[js.Any])
      
      inline def setUseBuffersUndefined: Self = StObject.set(x, "useBuffers", js.undefined)
    }
  }
}
