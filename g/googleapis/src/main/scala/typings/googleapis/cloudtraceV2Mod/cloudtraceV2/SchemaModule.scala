package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Binary module.
  */
@js.native
trait SchemaModule extends js.Object {
  /**
    * A unique identifier for the module, usually a hash of its contents (up to
    * 128 bytes).
    */
  var buildId: js.UndefOr[SchemaTruncatableString] = js.native
  /**
    * For example: main binary, kernel modules, and dynamic libraries such as
    * libc.so, sharedlib.so (up to 256 bytes).
    */
  var module: js.UndefOr[SchemaTruncatableString] = js.native
}

object SchemaModule {
  @scala.inline
  def apply(): SchemaModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModule]
  }
  @scala.inline
  implicit class SchemaModuleOps[Self <: SchemaModule] (val x: Self) extends AnyVal {
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
    def setBuildId(value: SchemaTruncatableString): Self = this.set("buildId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildId: Self = this.set("buildId", js.undefined)
    @scala.inline
    def setModule(value: SchemaTruncatableString): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
  }
  
}

