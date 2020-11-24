package typings.jszip.anon

import typings.jszip.jszipBooleans.`true`
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jszip.jszip.JSZipFileOptions & {  dir :true} */
@js.native
trait JSZipFileOptionsdirtrue extends js.Object {
  
  /** Set to `true` if the data is `base64` encoded. For example image data from a `<canvas>` element. Plain text and HTML do not need this option. */
  var base64: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to `true` if the data should be treated as raw content, `false` if this is a text. If `base64` is used,
    * this defaults to `true`, if the data is not a `string`, this will be set to `true`.
    */
  var binary: js.UndefOr[Boolean] = js.native
  
  var comment: js.UndefOr[String] = js.native
  
  var compression: js.UndefOr[String] = js.native
  
  /** Set to `true` if folders in the file path should be automatically created, otherwise there will only be virtual folders that represent the path to the file. */
  var createFolders: js.UndefOr[Boolean] = js.native
  
  /**
    * The last modification date, defaults to the current date.
    */
  var date: js.UndefOr[Date] = js.native
  
  /** Set to `true` if this is a directory and content should be ignored. */
  var dir: js.UndefOr[Boolean] with `true` = js.native
  
  /** 6 bits number. The DOS permissions of the file, if any. */
  var dosPermissions: js.UndefOr[Double | Null] = js.native
  
  /** Set to `true` if (and only if) the input is a "binary string" and has already been prepared with a `0xFF` mask. */
  var optimizedBinaryString: js.UndefOr[Boolean] = js.native
  
  /**
    * 16 bits number. The UNIX permissions of the file, if any.
    * Also accepts a `string` representing the octal value: `"644"`, `"755"`, etc.
    */
  var unixPermissions: js.UndefOr[Double | String | Null] = js.native
}
object JSZipFileOptionsdirtrue {
  
  @scala.inline
  def apply(dir: js.UndefOr[Boolean] with `true`): JSZipFileOptionsdirtrue = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipFileOptionsdirtrue]
  }
  
  @scala.inline
  implicit class JSZipFileOptionsdirtrueOps[Self <: JSZipFileOptionsdirtrue] (val x: Self) extends AnyVal {
    
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
    def setDir(value: js.UndefOr[Boolean] with `true`): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase64(value: Boolean): Self = this.set("base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase64: Self = this.set("base64", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setCreateFolders(value: Boolean): Self = this.set("createFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFolders: Self = this.set("createFolders", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDosPermissions(value: Double): Self = this.set("dosPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDosPermissions: Self = this.set("dosPermissions", js.undefined)
    
    @scala.inline
    def setDosPermissionsNull: Self = this.set("dosPermissions", null)
    
    @scala.inline
    def setOptimizedBinaryString(value: Boolean): Self = this.set("optimizedBinaryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizedBinaryString: Self = this.set("optimizedBinaryString", js.undefined)
    
    @scala.inline
    def setUnixPermissions(value: Double | String): Self = this.set("unixPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnixPermissions: Self = this.set("unixPermissions", js.undefined)
    
    @scala.inline
    def setUnixPermissionsNull: Self = this.set("unixPermissions", null)
  }
}
