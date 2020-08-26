package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegrationAddDetails extends js.Object {
  var enableArgs: js.UndefOr[js.Array[String]] = js.native
  var env: IonicEnvironment = js.native
  var quiet: js.UndefOr[Boolean] = js.native
  var root: String = js.native
}

object IntegrationAddDetails {
  @scala.inline
  def apply(env: IonicEnvironment, root: String): IntegrationAddDetails = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationAddDetails]
  }
  @scala.inline
  implicit class IntegrationAddDetailsOps[Self <: IntegrationAddDetails] (val x: Self) extends AnyVal {
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
    def setEnv(value: IonicEnvironment): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableArgsVarargs(value: String*): Self = this.set("enableArgs", js.Array(value :_*))
    @scala.inline
    def setEnableArgs(value: js.Array[String]): Self = this.set("enableArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableArgs: Self = this.set("enableArgs", js.undefined)
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
  }
  
}

