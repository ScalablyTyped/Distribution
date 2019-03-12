package typings
package insertDashModuleDashGlobalsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basedir extends js.Object {
  def Buffer(): java.lang.String
  def `Buffer.isBuffer`(file: java.lang.String): java.lang.String
  def __dirname(file: java.lang.String, basedir: java.lang.String): java.lang.String
  def __filename(file: java.lang.String, basedir: java.lang.String): java.lang.String
  def global(): java.lang.String
  def process(file: java.lang.String): java.lang.String
}

object Anon_Basedir {
  @scala.inline
  def apply(
    Buffer: () => java.lang.String,
    `Buffer.isBuffer`: java.lang.String => java.lang.String,
    __dirname: (java.lang.String, java.lang.String) => java.lang.String,
    __filename: (java.lang.String, java.lang.String) => java.lang.String,
    global: () => java.lang.String,
    process: java.lang.String => java.lang.String
  ): Anon_Basedir = {
    val __obj = js.Dynamic.literal(Buffer = js.Any.fromFunction0(Buffer), __dirname = js.Any.fromFunction2(__dirname), __filename = js.Any.fromFunction2(__filename), global = js.Any.fromFunction0(global), process = js.Any.fromFunction1(process))
    __obj.updateDynamic("Buffer.isBuffer")(js.Any.fromFunction1(`Buffer.isBuffer`))
    __obj.asInstanceOf[Anon_Basedir]
  }
}

