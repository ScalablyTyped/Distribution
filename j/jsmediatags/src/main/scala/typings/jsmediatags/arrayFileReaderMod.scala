package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayFileReaderMod {
  
  @JSImport("jsmediatags/build2/ArrayFileReader", JSImport.Default)
  @js.native
  class default protected () extends ArrayFileReader {
    def this(array: ByteArray) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/ArrayFileReader", "default.canReadFile")
    @js.native
    def canReadFile(file: js.Any): Boolean = js.native
  }
  
  @js.native
  trait ArrayFileReader
    extends typings.jsmediatags.mediaFileReaderMod.default {
    
    var _array: ByteArray = js.native
  }
}
