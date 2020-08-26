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
  def apply(): SchemaCreateSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateSessionRequest]
  }
  @scala.inline
  implicit class SchemaCreateSessionRequestOps[Self <: SchemaCreateSessionRequest] (val x: Self) extends AnyVal {
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
    def setSession(value: SchemaSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
  
}

