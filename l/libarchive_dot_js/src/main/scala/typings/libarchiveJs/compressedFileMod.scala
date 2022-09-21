package typings.libarchiveJs

import typings.libarchiveJs.libarchiveMod.Archive
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compressedFileMod {
  
  @JSImport("libarchive.js/src/compressed-file", "CompressedFile")
  @js.native
  open class CompressedFile protected () extends StObject {
    def this(name: String, size: Double, path: String, archiveRef: Archive) = this()
    
    var _archiveRef: Archive = js.native
    
    var _name: String = js.native
    
    var _path: String = js.native
    
    var _size: Double = js.native
    
    def extract(): js.Promise[File] = js.native
    
    def name: String = js.native
    
    def size: Double = js.native
  }
}
