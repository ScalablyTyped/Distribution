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
  def apply(buildId: SchemaTruncatableString = null, module: SchemaTruncatableString = null): SchemaModule = {
    val __obj = js.Dynamic.literal()
    if (buildId != null) __obj.updateDynamic("buildId")(buildId.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModule]
  }
}

