package typings.libarchiveJs

import org.scalablytyped.runtime.StringDictionary
import typings.libarchiveJs.anon.Path
import typings.libarchiveJs.anon.WorkerUrl
import typings.libarchiveJs.srcCompressedFileMod.CompressedFile
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibarchiveMod {
  
  @JSImport("libarchive.js/src/libarchive", "Archive")
  @js.native
  open class Archive protected () extends StObject {
    def this(file: File, options: WorkerUrl) = this()
    
    def extractFiles(): js.Promise[FilesObject] = js.native
    def extractFiles(extractCallback: js.Function1[/* entry */ Path, Unit]): js.Promise[FilesObject] = js.native
    
    def extractSingleFile(path: String): js.Promise[File] = js.native
    
    def getFilesArray(): js.Promise[js.Array[typings.libarchiveJs.anon.File]] = js.native
    
    def getFilesObject(): js.Promise[FilesObject] = js.native
    
    def hasEncryptedData(): js.Promise[Boolean | Null] = js.native
    
    def open(): js.Promise[Archive] = js.native
    
    def usePassword(archivePassword: String): js.Promise[Unit] = js.native
    def usePassword(archivePassword: Double): js.Promise[Unit] = js.native
  }
  /* static members */
  object Archive {
    
    @JSImport("libarchive.js/src/libarchive", "Archive")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(): WorkerUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[WorkerUrl]
    inline def init(options: WorkerUrl): WorkerUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[WorkerUrl]
    
    inline def open(file: File): js.Promise[Archive] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Archive]]
    inline def open(file: File, options: WorkerUrl): js.Promise[Archive] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Archive]]
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type FilesObject = {[key: string] : libarchive.js.libarchive.js/src/libarchive.FilesObject | libarchive.js.libarchive.js/src/compressed-file.CompressedFile | std.File}
  }}}
  to avoid circular code involving: 
  - libarchive.js.libarchive.js/src/libarchive.FilesObject
  */
  trait FilesObject
    extends StObject
       with /* key */ StringDictionary[FilesObject | CompressedFile | File]
  object FilesObject {
    
    inline def apply(): FilesObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilesObject]
    }
  }
}
