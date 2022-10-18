package typings.jsmediatags

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object build2BlobFileReaderMod {
  
  @JSImport("jsmediatags/build2/BlobFileReader", JSImport.Default)
  @js.native
  open class default protected () extends BlobFileReader {
    def this(blob: Blob) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/BlobFileReader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def canReadFile(file: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  trait BlobFileReader
    extends typings.jsmediatags.build2MediaFileReaderMod.default {
    
    var _blob: Blob = js.native
    
    var _fileData: typings.jsmediatags.build2ChunkedFileDataMod.default = js.native
  }
}
