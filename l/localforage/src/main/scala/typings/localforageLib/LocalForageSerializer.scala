package typings
package localforageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalForageSerializer extends js.Object {
  def bufferToString(buffer: stdLib.ArrayBuffer): java.lang.String = js.native
  def deserialize[T](value: java.lang.String): T | stdLib.ArrayBuffer | stdLib.Blob = js.native
  def serialize[T](value: T, callback: js.Function2[/* value */ java.lang.String, /* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def serialize[T](
    value: stdLib.ArrayBuffer,
    callback: js.Function2[/* value */ java.lang.String, /* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def serialize[T](
    value: stdLib.Blob,
    callback: js.Function2[/* value */ java.lang.String, /* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def stringToBuffer(serializedString: java.lang.String): stdLib.ArrayBuffer = js.native
}

