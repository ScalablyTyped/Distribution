package typings.koaMulter.mod

import typings.koaMulter.AnonFieldNameSize
import typings.node.httpMod.IncomingMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The destination directory for the uploaded files. */
  var dest: js.UndefOr[String] = js.undefined
  /** A function to control which files to upload and which to skip. */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ Error | Null, /* acceptFile */ Boolean, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * An object specifying the size limits of the following optional properties. This object is passed to busboy
    * directly, and the details of properties can be found on https://github.com/mscdex/busboy#busboy-methods
    */
  var limits: js.UndefOr[AnonFieldNameSize] = js.undefined
  /** The storage engine to use for uploaded files. */
  var storage: js.UndefOr[StorageEngine] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dest: String = null,
    fileFilter: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ Error | Null, /* acceptFile */ Boolean, Unit]) => Unit = null,
    limits: AnonFieldNameSize = null,
    storage: StorageEngine = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (fileFilter != null) __obj.updateDynamic("fileFilter")(js.Any.fromFunction3(fileFilter))
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

