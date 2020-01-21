package typings.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/NodeFileReader", JSImport.Namespace)
@js.native
object nodeFileReaderMod extends js.Object {
  @js.native
  trait NodeFileReader
    extends typings.jsmediatags.mediaFileReaderMod.default {
    var _fileData: typings.jsmediatags.chunkedFileDataMod.default = js.native
    var _path: String = js.native
  }
  
  @js.native
  class default protected () extends NodeFileReader {
    def this(path: String) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def canReadFile(file: js.Any): Boolean = js.native
  }
  
}

