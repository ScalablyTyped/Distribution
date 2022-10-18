package typings.jsmediatags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object build2NodeFileReaderMod {
  
  @JSImport("jsmediatags/build2/NodeFileReader", JSImport.Default)
  @js.native
  open class default protected () extends NodeFileReader {
    def this(path: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/NodeFileReader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def canReadFile(file: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  trait NodeFileReader
    extends typings.jsmediatags.build2MediaFileReaderMod.default {
    
    var _fileData: typings.jsmediatags.build2ChunkedFileDataMod.default = js.native
    
    var _path: String = js.native
  }
}
