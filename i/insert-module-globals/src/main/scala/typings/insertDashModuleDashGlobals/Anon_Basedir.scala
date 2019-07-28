package typings.insertDashModuleDashGlobals

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basedir extends js.Object {
  def Buffer(): String
  def `Buffer.isBuffer`(file: String): String
  def __dirname(file: String, basedir: String): String
  def __filename(file: String, basedir: String): String
  def global(): String
  def process(file: String): String
}

object Anon_Basedir {
  @scala.inline
  def apply(
    Buffer: () => String,
    `Buffer.isBuffer`: String => String,
    __dirname: (String, String) => String,
    __filename: (String, String) => String,
    global: () => String,
    process: String => String
  ): Anon_Basedir = {
    val __obj = js.Dynamic.literal(Buffer = js.Any.fromFunction0(Buffer), __dirname = js.Any.fromFunction2(__dirname), __filename = js.Any.fromFunction2(__filename), global = js.Any.fromFunction0(global), process = js.Any.fromFunction1(process))
    __obj.updateDynamic("Buffer.isBuffer")(js.Any.fromFunction1(`Buffer.isBuffer`))
    __obj.asInstanceOf[Anon_Basedir]
  }
}

