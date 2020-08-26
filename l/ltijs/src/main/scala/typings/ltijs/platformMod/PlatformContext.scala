package typings.ltijs.platformMod

import typings.ltijs.anon.Documenttarget
import typings.ltijs.anon.Label
import typings.ltijs.anon.Title
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformContext extends js.Object {
  var __id: String = js.native
  var __v: Double = js.native
  var context: Label = js.native
  var createdAt: Date = js.native
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  var custom: js.Any = js.native
  var deploymentId: String = js.native
  var launchPresentation: Documenttarget = js.native
  var messageType: String = js.native
  var path: String = js.native
  var resource: Title = js.native
  var targetLinkUri: String = js.native
  var user: String = js.native
  var version: String = js.native
}

object PlatformContext {
  @scala.inline
  def apply(
    __id: String,
    __v: Double,
    context: Label,
    createdAt: Date,
    custom: js.Any,
    deploymentId: String,
    launchPresentation: Documenttarget,
    messageType: String,
    path: String,
    resource: Title,
    targetLinkUri: String,
    user: String,
    version: String
  ): PlatformContext = {
    val __obj = js.Dynamic.literal(__id = __id.asInstanceOf[js.Any], __v = __v.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], launchPresentation = launchPresentation.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], targetLinkUri = targetLinkUri.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformContext]
  }
  @scala.inline
  implicit class PlatformContextOps[Self <: PlatformContext] (val x: Self) extends AnyVal {
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
    def set__id(value: String): Self = this.set("__id", value.asInstanceOf[js.Any])
    @scala.inline
    def set__v(value: Double): Self = this.set("__v", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: Label): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: js.Any): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaunchPresentation(value: Documenttarget): Self = this.set("launchPresentation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageType(value: String): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: Title): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetLinkUri(value: String): Self = this.set("targetLinkUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

