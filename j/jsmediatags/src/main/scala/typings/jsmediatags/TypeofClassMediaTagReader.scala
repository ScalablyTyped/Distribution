package typings.jsmediatags

import org.scalablytyped.runtime.Instantiable1
import typings.jsmediatags.build2MediaFileReaderMod.default
import typings.jsmediatags.typesMod.ByteRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassMediaTagReader
  extends Instantiable1[/* mediaFileReader */ default, typings.jsmediatags.build2MediaTagReaderMod.default] {
  def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
  def getTagIdentifierByteRange(): ByteRange = js.native
}

