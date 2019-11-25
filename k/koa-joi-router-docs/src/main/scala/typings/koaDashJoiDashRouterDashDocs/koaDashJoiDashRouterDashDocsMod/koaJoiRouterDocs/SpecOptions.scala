package typings.koaDashJoiDashRouterDashDocs.koaDashJoiDashRouterDashDocsMod.koaJoiRouterDocs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecOptions extends js.Object {
  var defaultResponses: js.UndefOr[js.Object] = js.undefined
  var warnFunc: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SpecOptions {
  @scala.inline
  def apply(defaultResponses: js.Object = null, warnFunc: () => Unit = null): SpecOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultResponses != null) __obj.updateDynamic("defaultResponses")(defaultResponses.asInstanceOf[js.Any])
    if (warnFunc != null) __obj.updateDynamic("warnFunc")(js.Any.fromFunction0(warnFunc))
    __obj.asInstanceOf[SpecOptions]
  }
}

