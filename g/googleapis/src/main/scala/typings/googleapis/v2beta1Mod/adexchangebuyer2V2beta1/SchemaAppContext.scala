package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly The app type the restriction applies to for mobile device.
  */
@js.native
trait SchemaAppContext extends js.Object {
  /**
    * The app types this restriction applies to.
    */
  var appTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAppContext {
  @scala.inline
  def apply(appTypes: js.Array[String] = null): SchemaAppContext = {
    val __obj = js.Dynamic.literal()
    if (appTypes != null) __obj.updateDynamic("appTypes")(appTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppContext]
  }
}

