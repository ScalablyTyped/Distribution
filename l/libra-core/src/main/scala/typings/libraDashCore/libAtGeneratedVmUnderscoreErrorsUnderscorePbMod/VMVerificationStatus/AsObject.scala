package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationStatus

import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationErrorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var dependencyId: js.UndefOr[
    typings.libraDashCore.libAtGeneratedLanguageUnderscoreStorageUnderscorePbMod.ModuleId.AsObject
  ] = js.undefined
  var errorKind: VMVerificationErrorKind
  var message: String
  var moduleIdx: Double
  var statusKind: StatusKind
}

object AsObject {
  @scala.inline
  def apply(
    errorKind: VMVerificationErrorKind,
    message: String,
    moduleIdx: Double,
    statusKind: StatusKind,
    dependencyId: typings.libraDashCore.libAtGeneratedLanguageUnderscoreStorageUnderscorePbMod.ModuleId.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(errorKind = errorKind, message = message, moduleIdx = moduleIdx, statusKind = statusKind)
    if (dependencyId != null) __obj.updateDynamic("dependencyId")(dependencyId)
    __obj.asInstanceOf[AsObject]
  }
}

