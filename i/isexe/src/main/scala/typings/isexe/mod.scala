package typings.isexe

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def apply(
    path: String,
    callback: js.Function2[/* error */ js.UndefOr[ErrnoException], /* isExe */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(path: String, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def apply(
    path: String,
    options: Options,
    callback: js.Function2[/* error */ js.UndefOr[ErrnoException], /* isExe */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("isexe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def sync(path: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var gid: js.UndefOr[Double] = js.undefined
    
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
    
    var pathExt: js.UndefOr[String] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      inline def setPathExt(value: String): Self = StObject.set(x, "pathExt", value.asInstanceOf[js.Any])
      
      inline def setPathExtUndefined: Self = StObject.set(x, "pathExt", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
