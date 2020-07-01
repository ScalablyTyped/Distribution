package typings.ltijs.platformMod

import typings.ltijs.anon.Documenttarget
import typings.ltijs.anon.Label
import typings.ltijs.anon.Title
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformContext extends js.Object {
  var __id: String
  var __v: Double
  var context: Label
  var createdAt: Date
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  var custom: js.Any
  var deploymentId: String
  var launchPresentation: Documenttarget
  var messageType: String
  var path: String
  var resource: Title
  var targetLinkUri: String
  var user: String
  var version: String
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
}

