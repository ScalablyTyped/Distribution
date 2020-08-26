package typings.gun.mod.Gun

import typings.gun.anon.Bucket
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * options['module name'] allows you to pass options to a 3rd party module.
  * Their project README will likely list the exposed options
  * https://github.com/amark/gun/wiki/Modules
  */
/* Inlined std.Partial<{  file :string,   web :any,   s3 :{  key :any,   secret :any,   bucket :any},   peers :std.Record<string, {}>,   radisk :boolean,   localStorage :boolean, uuid (): string, [key: string] : any}> */
@js.native
trait ConstructorOptions extends js.Object {
  var file: js.UndefOr[String] = js.native
  var localStorage: js.UndefOr[Boolean] = js.native
  var peers: js.UndefOr[Record[String, js.Object]] = js.native
  var radisk: js.UndefOr[Boolean] = js.native
  var s3: js.UndefOr[Bucket] = js.native
  var uuid: js.UndefOr[js.Function0[String]] = js.native
  var web: js.UndefOr[js.Any] = js.native
}

object ConstructorOptions {
  @scala.inline
  def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  @scala.inline
  implicit class ConstructorOptionsOps[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setLocalStorage(value: Boolean): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalStorage: Self = this.set("localStorage", js.undefined)
    @scala.inline
    def setPeers(value: Record[String, js.Object]): Self = this.set("peers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeers: Self = this.set("peers", js.undefined)
    @scala.inline
    def setRadisk(value: Boolean): Self = this.set("radisk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadisk: Self = this.set("radisk", js.undefined)
    @scala.inline
    def setS3(value: Bucket): Self = this.set("s3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3: Self = this.set("s3", js.undefined)
    @scala.inline
    def setUuid(value: () => String): Self = this.set("uuid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
    @scala.inline
    def setWeb(value: js.Any): Self = this.set("web", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeb: Self = this.set("web", js.undefined)
  }
  
}

