package typings.gulpLess

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-less", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-less", JSImport.Namespace)
  @js.native
  def apply(options: IOptions): ReadWriteStream = js.native
  
  @js.native
  trait IOptions extends StObject {
    
    var modifyVars: js.UndefOr[js.Object] = js.native
    
    var paths: js.UndefOr[js.Array[String]] = js.native
    
    var plugins: js.UndefOr[js.Array[_]] = js.native
    
    var relativeUrls: js.UndefOr[Boolean] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModifyVars(value: js.Object): Self = StObject.set(x, "modifyVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifyVarsUndefined: Self = StObject.set(x, "modifyVars", js.undefined)
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setPlugins(value: js.Array[_]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRelativeUrls(value: Boolean): Self = StObject.set(x, "relativeUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUrlsUndefined: Self = StObject.set(x, "relativeUrls", js.undefined)
    }
  }
}
