package typings.libarchiveJs

import typings.libarchiveJs.anon.WorkerUrl
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libarchive.js", "Archive")
  @js.native
  open class Archive protected ()
    extends typings.libarchiveJs.mainMod.Archive {
    def this(file: File, options: WorkerUrl) = this()
  }
  /* static members */
  object Archive {
    
    @JSImport("libarchive.js", "Archive")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(): WorkerUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[WorkerUrl]
    inline def init(options: WorkerUrl): WorkerUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[WorkerUrl]
    
    inline def open(file: File): js.Promise[typings.libarchiveJs.srcLibarchiveMod.Archive] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.libarchiveJs.srcLibarchiveMod.Archive]]
    inline def open(file: File, options: WorkerUrl): js.Promise[typings.libarchiveJs.srcLibarchiveMod.Archive] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.libarchiveJs.srcLibarchiveMod.Archive]]
  }
}
