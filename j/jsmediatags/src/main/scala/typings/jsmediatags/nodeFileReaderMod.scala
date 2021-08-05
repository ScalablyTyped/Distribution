package typings.jsmediatags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFileReaderMod {
  
  @JSImport("jsmediatags/build2/NodeFileReader", JSImport.Default)
  @js.native
  class default protected () extends NodeFileReader {
    def this(path: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/NodeFileReader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def canReadFile(file: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  trait NodeFileReader
    extends typings.jsmediatags.mediaFileReaderMod.default {
    
    var _fileData: typings.jsmediatags.chunkedFileDataMod.default = js.native
    
    var _path: String = js.native
  }
}
