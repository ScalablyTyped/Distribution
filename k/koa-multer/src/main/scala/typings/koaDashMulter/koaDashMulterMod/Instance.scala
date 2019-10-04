package typings.koaDashMulter.koaDashMulterMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /** Accepts all files that comes over the wire. An array of files will be stored in req.files. */
  def any(): Middleware[DefaultState, DefaultContext] = js.native
  /** Accept an array of files, all with the name fieldName. Optionally error out if more than maxCount files are uploaded. The array of files will be stored in req.files. */
  def array(fieldName: String): Middleware[DefaultState, DefaultContext] = js.native
  def array(fieldName: String, maxCount: Double): Middleware[DefaultState, DefaultContext] = js.native
  /** Accept a mix of files, specified by fields. An object with arrays of files will be stored in req.files. */
  def fields(fields: js.Array[Field]): Middleware[DefaultState, DefaultContext] = js.native
  /** In case you need to handle a text-only multipart form, you can use any of the multer methods (.single(), .array(), fields()), req.body contains the text fields */
  /** Accept a single file with the name fieldName. The single file will be stored in req.file. */
  def single(): Middleware[DefaultState, DefaultContext] = js.native
  def single(fieldName: String): Middleware[DefaultState, DefaultContext] = js.native
}

