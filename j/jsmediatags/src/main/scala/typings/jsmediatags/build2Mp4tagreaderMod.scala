package typings.jsmediatags

import typings.jsmediatags.typesMod.ByteRange
import typings.jsmediatags.typesMod.LoadCallbackType
import typings.jsmediatags.typesMod.TagFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object build2Mp4tagreaderMod {
  
  @JSImport("jsmediatags/build2/MP4TagReader", JSImport.Default)
  @js.native
  open class default () extends MP4TagReader
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/MP4TagReader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReadTagFormat")(tagIdentifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getTagIdentifierByteRange(): ByteRange = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagIdentifierByteRange")().asInstanceOf[ByteRange]
  }
  
  @js.native
  trait MP4TagReader
    extends typings.jsmediatags.build2MediaTagReaderMod.default {
    
    def _canReadAtom(atomName: String): Boolean = js.native
    
    def _isContainerAtom(atomName: String): Boolean = js.native
    
    def _loadAtom(
      mediaFileReader: typings.jsmediatags.build2MediaFileReaderMod.default,
      offset: Double,
      parentAtomFullName: String,
      callbacks: LoadCallbackType
    ): Unit = js.native
    
    def _readAtom(
      tags: Any,
      data: typings.jsmediatags.build2MediaFileReaderMod.default,
      offset: Double,
      length: Double
    ): Unit = js.native
    def _readAtom(
      tags: Any,
      data: typings.jsmediatags.build2MediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.Array[String]
    ): Unit = js.native
    def _readAtom(
      tags: Any,
      data: typings.jsmediatags.build2MediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.Array[String],
      parentAtomFullName: String
    ): Unit = js.native
    def _readAtom(
      tags: Any,
      data: typings.jsmediatags.build2MediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.Array[String],
      parentAtomFullName: String,
      indent: String
    ): Unit = js.native
    def _readAtom(
      tags: Any,
      data: typings.jsmediatags.build2MediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.Array[String],
      parentAtomFullName: Unit,
      indent: String
    ): Unit = js.native
    def _readAtom(
      tags: Any,
      data: typings.jsmediatags.build2MediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: Unit,
      parentAtomFullName: String
    ): Unit = js.native
    def _readAtom(
      tags: Any,
      data: typings.jsmediatags.build2MediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: Unit,
      parentAtomFullName: String,
      indent: String
    ): Unit = js.native
    def _readAtom(
      tags: Any,
      data: typings.jsmediatags.build2MediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: Unit,
      parentAtomFullName: Unit,
      indent: String
    ): Unit = js.native
    
    def _readMetadataAtom(data: typings.jsmediatags.build2MediaFileReaderMod.default, offset: Double): TagFrame = js.native
  }
}
