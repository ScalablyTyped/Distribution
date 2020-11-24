package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags/build2/ArrayFileReader", JSImport.Namespace)
@js.native
object arrayFileReaderMod extends js.Object {
  
  @js.native
  trait ArrayFileReader
    extends typings.jsmediatags.mediaFileReaderMod.default {
    
    var _array: ByteArray = js.native
  }
  
  @js.native
  class default protected () extends ArrayFileReader {
    def this(array: ByteArray) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def canReadFile(file: js.Any): Boolean = js.native
  }
}
