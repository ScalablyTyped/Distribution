package typings.intercomClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppApiKey extends js.Object {
  var appApiKey: String = js.native
  var appId: String = js.native
}

object AppApiKey {
  @scala.inline
  def apply(appApiKey: String, appId: String): AppApiKey = {
    val __obj = js.Dynamic.literal(appApiKey = appApiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppApiKey]
  }
  @scala.inline
  implicit class AppApiKeyOps[Self <: AppApiKey] (val x: Self) extends AnyVal {
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
    def setAppApiKey(value: String): Self = this.set("appApiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
  }
  
}

