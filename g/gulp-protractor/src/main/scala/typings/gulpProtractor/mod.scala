package typings.gulpProtractor

import org.scalablytyped.runtime.Shortcut
import typings.gulp.mod.TaskCallback
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-protractor", JSImport.Namespace)
  @js.native
  val ^ : IGulpProtractor = js.native
  
  @js.native
  trait IGulpProtractor extends StObject {
    
    def getProtractorDir(): String = js.native
    
    def protractor(): ReadWriteStream = js.native
    def protractor(options: IOptions): ReadWriteStream = js.native
    
    var webdriver_standalone: TaskCallback = js.native
    
    var webdriver_update: TaskCallback = js.native
  }
  
  @js.native
  trait IOptions extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.native
    
    var configFile: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
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
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  type _To = IGulpProtractor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IGulpProtractor = ^
}
