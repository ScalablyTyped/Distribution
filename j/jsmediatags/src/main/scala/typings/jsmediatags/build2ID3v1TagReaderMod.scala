package typings.jsmediatags

import typings.jsmediatags.build2ID3v1TagReaderMod.ID3v1TagReader
import typings.jsmediatags.typesMod.ByteRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/ID3v1TagReader", JSImport.Namespace)
@js.native
object build2ID3v1TagReaderMod extends js.Object {
  @js.native
  trait ID3v1TagReader
    extends typings.jsmediatags.build2MediaTagReaderMod.default
  
  @js.native
  class default () extends ID3v1TagReader
  
  /* static members */
  @js.native
  object default extends js.Object {
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
  
}

