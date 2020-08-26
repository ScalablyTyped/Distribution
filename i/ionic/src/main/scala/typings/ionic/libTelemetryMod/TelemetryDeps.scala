package typings.ionic.libTelemetryMod

import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.InfoItem
import typings.ionic.definitionsMod.IonicContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelemetryDeps extends js.Object {
  val client: IClient = js.native
  val config: IConfig = js.native
  val ctx: IonicContext = js.native
  val project: js.UndefOr[IProject] = js.native
  val session: ISession = js.native
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
}

object TelemetryDeps {
  @scala.inline
  def apply(
    client: IClient,
    config: IConfig,
    ctx: IonicContext,
    getInfo: () => js.Promise[js.Array[InfoItem]],
    session: ISession
  ): TelemetryDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], getInfo = js.Any.fromFunction0(getInfo), session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryDeps]
  }
  @scala.inline
  implicit class TelemetryDepsOps[Self <: TelemetryDeps] (val x: Self) extends AnyVal {
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
    def setClient(value: IClient): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: IConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtx(value: IonicContext): Self = this.set("ctx", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetInfo(value: () => js.Promise[js.Array[InfoItem]]): Self = this.set("getInfo", js.Any.fromFunction0(value))
    @scala.inline
    def setSession(value: ISession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: IProject): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
  }
  
}

