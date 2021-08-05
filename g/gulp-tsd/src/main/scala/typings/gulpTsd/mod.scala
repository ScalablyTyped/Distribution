package typings.gulpTsd

import typings.gulp.mod.TaskCallback
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  inline def apply(opts: Unit, callback: TaskCallback): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(opts: IOptions): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(opts: IOptions, callback: TaskCallback): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-tsd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IOptions extends StObject {
    
    var command: js.UndefOr[String] = js.undefined
    
    var config: js.UndefOr[String] = js.undefined
    
    var latest: js.UndefOr[Boolean] = js.undefined
    
    var opts: js.UndefOr[js.Object] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setLatest(value: Boolean): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      inline def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      inline def setOpts(value: js.Object): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    }
  }
}
