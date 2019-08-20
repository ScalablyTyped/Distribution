package typings.jsmediatags.build2ArrayFileReaderMod

import typings.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/ArrayFileReader", JSImport.Default)
@js.native
class default protected () extends ArrayFileReader {
  def this(array: ByteArray) = this()
}

/* static members */
@JSImport("jsmediatags/build2/ArrayFileReader", JSImport.Default)
@js.native
object default extends js.Object {
  def canReadFile(file: js.Any): Boolean = js.native
}

