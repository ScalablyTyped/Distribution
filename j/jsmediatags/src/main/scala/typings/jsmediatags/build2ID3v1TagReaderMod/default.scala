package typings.jsmediatags.build2ID3v1TagReaderMod

import typings.jsmediatags.typesMod.ByteRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/ID3v1TagReader", JSImport.Default)
@js.native
class default () extends ID3v1TagReader

/* static members */
@JSImport("jsmediatags/build2/ID3v1TagReader", JSImport.Default)
@js.native
object default extends js.Object {
  def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
  def getTagIdentifierByteRange(): ByteRange = js.native
}

