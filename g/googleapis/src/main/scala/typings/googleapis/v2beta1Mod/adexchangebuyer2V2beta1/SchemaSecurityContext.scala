package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly A security context.
  */
@js.native
trait SchemaSecurityContext extends js.Object {
  /**
    * The security types in this context.
    */
  var securities: js.UndefOr[js.Array[String]] = js.native
}

object SchemaSecurityContext {
  @scala.inline
  def apply(securities: js.Array[String] = null): SchemaSecurityContext = {
    val __obj = js.Dynamic.literal()
    if (securities != null) __obj.updateDynamic("securities")(securities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecurityContext]
  }
}

