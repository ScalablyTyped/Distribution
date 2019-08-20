package typings.jsmediatags.build2FLACTagReaderMod

import typings.jsmediatags.typesMod.ByteRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/FLACTagReader", JSImport.Default)
@js.native
class default () extends FLACTagReader

/* static members */
@JSImport("jsmediatags/build2/FLACTagReader", JSImport.Default)
@js.native
object default extends js.Object {
  def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
  def getTagIdentifierByteRange(): ByteRange = js.native
}

