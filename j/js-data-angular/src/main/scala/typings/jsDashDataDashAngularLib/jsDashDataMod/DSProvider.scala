package typings
package jsDashDataDashAngularLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DSProvider extends js.Object {
  var defaults: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DSConfiguration */ js.Any
}

object DSProvider {
  @scala.inline
  def apply(
    defaults: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DSConfiguration */ js.Any
  ): DSProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[DSProvider]
  }
}

