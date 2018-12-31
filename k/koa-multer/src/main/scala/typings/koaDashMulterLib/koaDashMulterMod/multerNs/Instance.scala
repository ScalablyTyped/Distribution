package typings
package koaDashMulterLib.koaDashMulterMod.multerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /** Accepts all files that comes over the wire. An array of files will be stored in req.files. */
  def any(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  /** Accept an array of files, all with the name fieldName. Optionally error out if more than maxCount files are uploaded. The array of files will be stored in req.files. */
  def array(fieldName: java.lang.String): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def array(fieldName: java.lang.String, maxCount: scala.Double): koaLib.koaMod.ApplicationNs.Middleware = js.native
  /** Accept a mix of files, specified by fields. An object with arrays of files will be stored in req.files. */
  def fields(fields: js.Array[Field]): koaLib.koaMod.ApplicationNs.Middleware = js.native
  /** In case you need to handle a text-only multipart form, you can use any of the multer methods (.single(), .array(), fields()), req.body contains the text fields */
  /** Accept a single file with the name fieldName. The single file will be stored in req.file. */
  def single(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def single(fieldName: java.lang.String): koaLib.koaMod.ApplicationNs.Middleware = js.native
}

