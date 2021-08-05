package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteRange
import typings.jsmediatags.typesMod.TagFrames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object id3v2tagreaderMod {
  
  @JSImport("jsmediatags/build2/ID3v2TagReader", JSImport.Default)
  @js.native
  class default () extends ID3v2TagReader
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/ID3v2TagReader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadTagFormat")(tagIdentifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getTagIdentifierByteRange(): ByteRange = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagIdentifierByteRange")().asInstanceOf[ByteRange]
  }
  
  @js.native
  trait ID3v2TagReader
    extends typings.jsmediatags.mediaTagReaderMod.default {
    
    def _getFrameData(frames: TagFrames, ids: js.Array[String]): js.Any = js.native
  }
}
