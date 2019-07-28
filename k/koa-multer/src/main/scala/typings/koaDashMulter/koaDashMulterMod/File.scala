package typings.koaDashMulter.koaDashMulterMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /** A Buffer of the entire file (MemoryStorage) */
  var buffer: Buffer
  /** The folder to which the file has been saved (DiskStorage) */
  var destination: String
  /** Encoding type of the file */
  var encoding: String
  /** Field name specified in the form */
  var fieldname: String
  /** The name of the file within the destination (DiskStorage) */
  var filename: String
  /** Mime type of the file */
  var mimetype: String
  /** Name of the file on the user's computer */
  var originalname: String
  /** Location of the uploaded file (DiskStorage) */
  var path: String
  /** Size of the file in bytes */
  var size: Double
}

object File {
  @scala.inline
  def apply(
    buffer: Buffer,
    destination: String,
    encoding: String,
    fieldname: String,
    filename: String,
    mimetype: String,
    originalname: String,
    path: String,
    size: Double
  ): File = {
    val __obj = js.Dynamic.literal(buffer = buffer, destination = destination, encoding = encoding, fieldname = fieldname, filename = filename, mimetype = mimetype, originalname = originalname, path = path, size = size)
  
    __obj.asInstanceOf[File]
  }
}

