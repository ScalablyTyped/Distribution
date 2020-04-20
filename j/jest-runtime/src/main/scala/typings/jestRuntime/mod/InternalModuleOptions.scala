package typings.jestRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalModuleOptions extends js.Object {
  var isInternalModule: Boolean
  var supportsDynamicImport: Boolean
  var supportsStaticESM: Boolean
}

object InternalModuleOptions {
  @scala.inline
  def apply(isInternalModule: Boolean, supportsDynamicImport: Boolean, supportsStaticESM: Boolean): InternalModuleOptions = {
    val __obj = js.Dynamic.literal(isInternalModule = isInternalModule.asInstanceOf[js.Any], supportsDynamicImport = supportsDynamicImport.asInstanceOf[js.Any], supportsStaticESM = supportsStaticESM.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalModuleOptions]
  }
}

