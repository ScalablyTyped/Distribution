package typings.gulpLiveServer

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Application_
import typings.express.mod.Handler
import typings.gulpLiveServer.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-live-server", JSImport.Namespace)
  @js.native
  val ^ : GLS = js.native
  
  type GLS = (js.Function3[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<gulp-live-server.anon.FnCallCommandArgsOptions>[1] */ /* args */ js.Any, 
    /* options */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<gulp-live-server.anon.FnCallCommandArgsOptions>[2] */ js.Any
    ], 
    /* livereload */ js.UndefOr[Livereload], 
    GLSStatic
  ]) & GLSStatic
  
  @js.native
  trait GLSStatic extends StObject {
    
    def `new`(script: String): GLSStatic = js.native
    
    def notify(event: Path): Unit = js.native
    
    def start(): Unit = js.native
    def start(execPath: String): Unit = js.native
    
    def static(folder: String): GLSStatic = js.native
    def static(folder: String, port: Double): GLSStatic = js.native
    
    def stop(): Unit = js.native
  }
  
  type Livereload = Boolean | Double | LivereloadParams
  
  trait LivereloadParams extends StObject {
    
    var app: js.UndefOr[Application_] = js.undefined
    
    var cert: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<std.Parameters<gulp-live-server.anon.FnCall>[0]>['cert'] */ js.Any
      ] = js.undefined
    
    var dashboard: js.UndefOr[Boolean] = js.undefined
    
    var errorListener: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var handler: js.UndefOr[Handler] = js.undefined
    
    var key: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<std.Parameters<gulp-live-server.anon.FnCall>[0]>['key'] */ js.Any
      ] = js.undefined
    
    var liveCSS: js.UndefOr[Boolean] = js.undefined
    
    var liveImg: js.UndefOr[Boolean] = js.undefined
    
    var livereload: js.UndefOr[String] = js.undefined
    
    var pfx: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<std.Parameters<gulp-live-server.anon.FnCall>[0]>['pfx'] */ js.Any
      ] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[Boolean] = js.undefined
  }
  object LivereloadParams {
    
    inline def apply(): LivereloadParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LivereloadParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LivereloadParams] (val x: Self) extends AnyVal {
      
      inline def setApp(value: Application_): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setCert(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<std.Parameters<gulp-live-server.anon.FnCall>[0]>['cert'] */ js.Any
      ): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setDashboard(value: Boolean): Self = StObject.set(x, "dashboard", value.asInstanceOf[js.Any])
      
      inline def setDashboardUndefined: Self = StObject.set(x, "dashboard", js.undefined)
      
      inline def setErrorListener(value: /* error */ js.Error => Unit): Self = StObject.set(x, "errorListener", js.Any.fromFunction1(value))
      
      inline def setErrorListenerUndefined: Self = StObject.set(x, "errorListener", js.undefined)
      
      inline def setHandler(value: Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<std.Parameters<gulp-live-server.anon.FnCall>[0]>['key'] */ js.Any
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLiveCSS(value: Boolean): Self = StObject.set(x, "liveCSS", value.asInstanceOf[js.Any])
      
      inline def setLiveCSSUndefined: Self = StObject.set(x, "liveCSS", js.undefined)
      
      inline def setLiveImg(value: Boolean): Self = StObject.set(x, "liveImg", value.asInstanceOf[js.Any])
      
      inline def setLiveImgUndefined: Self = StObject.set(x, "liveImg", js.undefined)
      
      inline def setLivereload(value: String): Self = StObject.set(x, "livereload", value.asInstanceOf[js.Any])
      
      inline def setLivereloadUndefined: Self = StObject.set(x, "livereload", js.undefined)
      
      inline def setPfx(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<std.Parameters<gulp-live-server.anon.FnCall>[0]>['pfx'] */ js.Any
      ): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type _To = GLS
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GLS = ^
}
