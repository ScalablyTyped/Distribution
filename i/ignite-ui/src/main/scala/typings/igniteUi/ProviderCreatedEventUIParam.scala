package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderCreatedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the igZoombar.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the created provider.
  	 */
  var provider: js.UndefOr[js.Any] = js.undefined
}

object ProviderCreatedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, provider: js.Any = null): ProviderCreatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderCreatedEventUIParam]
  }
}

