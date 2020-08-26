package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LocalCopy defines how a remote file should be copied to and from the VM.
  */
@js.native
trait SchemaLocalCopy extends js.Object {
  /**
    * Required. The name of the disk where this parameter is located. Can be
    * the name of one of the disks specified in the Resources field, or
    * &quot;boot&quot;, which represents the Docker instance&#39;s boot disk
    * and has a mount point of `/`.
    */
  var disk: js.UndefOr[String] = js.native
  /**
    * Required. The path within the user&#39;s docker container where this
    * input should be localized to and from, relative to the specified
    * disk&#39;s mount point. For example: file.txt,
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaLocalCopy {
  @scala.inline
  def apply(): SchemaLocalCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalCopy]
  }
  @scala.inline
  implicit class SchemaLocalCopyOps[Self <: SchemaLocalCopy] (val x: Self) extends AnyVal {
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
    def setDisk(value: String): Self = this.set("disk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisk: Self = this.set("disk", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

