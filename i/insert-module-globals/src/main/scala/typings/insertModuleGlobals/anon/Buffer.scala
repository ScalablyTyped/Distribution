package typings.insertModuleGlobals.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  def Buffer(): String
  @JSName("Buffer.isBuffer")
  def BufferDotisBuffer(file: String): String
  def __dirname(file: String, basedir: String): String
  def __filename(file: String, basedir: String): String
  def global(): String
  def process(file: String): String
}

object Buffer {
  @scala.inline
  def apply(
    Buffer: () => String,
    BufferDotisBuffer: String => String,
    __dirname: (String, String) => String,
    __filename: (String, String) => String,
    global: () => String,
    process: String => String
  ): Buffer = {
    val __obj = js.Dynamic.literal(Buffer = js.Any.fromFunction0(Buffer), __dirname = js.Any.fromFunction2(__dirname), __filename = js.Any.fromFunction2(__filename), global = js.Any.fromFunction0(global), process = js.Any.fromFunction1(process))
    __obj.updateDynamic("Buffer.isBuffer")(js.Any.fromFunction1(BufferDotisBuffer))
    __obj.asInstanceOf[Buffer]
  }
}

