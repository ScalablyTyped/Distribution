package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteRange
import typings.jsmediatags.typesMod.LoadCallbackType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags/build2/FLACTagReader", JSImport.Namespace)
@js.native
object flactagreaderMod extends js.Object {
  
  @js.native
  trait FLACTagReader
    extends typings.jsmediatags.mediaTagReaderMod.default {
    
    var _commentOffset: Double = js.native
    
    def _loadBlock(
      mediaFileReader: typings.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      callbacks: LoadCallbackType
    ): Unit = js.native
    
    def _nextBlock(
      mediaFileReader: typings.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      blockHeader: Double,
      blockSize: Double,
      callbacks: LoadCallbackType
    ): Unit = js.native
    
    var _pictureOffset: Double = js.native
  }
  
  @js.native
  class default () extends FLACTagReader
  /* static members */
  @js.native
  object default extends js.Object {
    
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
}
