package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteRange
import typings.jsmediatags.typesMod.LoadCallbackType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flactagreaderMod {
  
  @JSImport("jsmediatags/build2/FLACTagReader", JSImport.Default)
  @js.native
  class default () extends FLACTagReader
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/FLACTagReader", "default.canReadTagFormat")
    @js.native
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    
    @JSImport("jsmediatags/build2/FLACTagReader", "default.getTagIdentifierByteRange")
    @js.native
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
  
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
}
