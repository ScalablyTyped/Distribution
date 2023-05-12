package typings.gulpProtractor

import org.scalablytyped.runtime.Shortcut
import typings.gulp.mod.TaskCallback
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-protractor", JSImport.Namespace)
  @js.native
  val ^ : IGulpProtractor = js.native
  
  @js.native
  trait IGulpProtractor extends StObject {
    
    def getProtractorCli(): String = js.native
    
    def getProtractorDir(): String = js.native
    
    def protractor(): ReadWriteStream = js.native
    def protractor(options: IOptions): ReadWriteStream = js.native
    
    var webdriver_standalone: TaskCallback = js.native
    
    var webdriver_update: TaskCallback = js.native
    
    var webdriver_update_specific: TaskCallback = js.native
  }
  
  trait IOptions extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var configFile: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  type _To = IGulpProtractor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IGulpProtractor = ^
}
