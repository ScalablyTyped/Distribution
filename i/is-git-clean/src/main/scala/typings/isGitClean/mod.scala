package typings.isGitClean

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Boolean]]
  inline def apply(dir: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def apply(dir: String, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def apply(dir: Unit, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("is-git-clean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[Boolean]
  inline def sync(dir: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def sync(dir: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def sync(dir: Unit, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var files: js.Array[String]
  }
  object Options {
    
    inline def apply(files: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
}
