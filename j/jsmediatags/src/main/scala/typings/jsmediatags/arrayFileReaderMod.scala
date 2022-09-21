package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayFileReaderMod {
  
  @JSImport("jsmediatags/build2/ArrayFileReader", JSImport.Default)
  @js.native
  open class default protected () extends ArrayFileReader {
    def this(array: ByteArray) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/ArrayFileReader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def canReadFile(file: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  trait ArrayFileReader
    extends typings.jsmediatags.mediaFileReaderMod.default {
    
    var _array: ByteArray = js.native
  }
}
