package typings.jsmediatags.build2ID3v2TagReaderMod

import typings.jsmediatags.typesMod.ByteRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/ID3v2TagReader", JSImport.Default)
@js.native
class default () extends ID3v2TagReader

/* static members */
@JSImport("jsmediatags/build2/ID3v2TagReader", JSImport.Default)
@js.native
object default extends js.Object {
  def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
  def getTagIdentifierByteRange(): ByteRange = js.native
}

