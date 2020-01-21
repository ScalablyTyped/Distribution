package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for CreateSession.
  */
@js.native
trait SchemaCreateSessionRequest extends js.Object {
  /**
    * The session to create.
    */
  var session: js.UndefOr[SchemaSession] = js.native
}

object SchemaCreateSessionRequest {
  @scala.inline
  def apply(session: SchemaSession = null): SchemaCreateSessionRequest = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateSessionRequest]
  }
}

