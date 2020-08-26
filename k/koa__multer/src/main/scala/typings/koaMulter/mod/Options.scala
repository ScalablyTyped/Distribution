package typings.koaMulter.mod

import typings.koaMulter.anon.FieldNameSize
import typings.node.httpMod.IncomingMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** The destination directory for the uploaded files. */
  var dest: js.UndefOr[String] = js.native
  /** A function to control which files to upload and which to skip. */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ Error | Null, /* acceptFile */ Boolean, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * An object specifying the size limits of the following optional properties. This object is passed to busboy
    * directly, and the details of properties can be found on https://github.com/mscdex/busboy#busboy-methods
    */
  var limits: js.UndefOr[FieldNameSize] = js.native
  /** The storage engine to use for uploaded files. */
  var storage: js.UndefOr[StorageEngine] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    @scala.inline
    def setFileFilter(
      value: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ Error | Null, /* acceptFile */ Boolean, Unit]) => Unit
    ): Self = this.set("fileFilter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFileFilter: Self = this.set("fileFilter", js.undefined)
    @scala.inline
    def setLimits(value: FieldNameSize): Self = this.set("limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    @scala.inline
    def setStorage(value: StorageEngine): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
  
}

