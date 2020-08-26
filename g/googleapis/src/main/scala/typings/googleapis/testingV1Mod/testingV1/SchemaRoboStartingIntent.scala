package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for specifying the start activities to crawl.
  */
@js.native
trait SchemaRoboStartingIntent extends js.Object {
  var launcherActivity: js.UndefOr[SchemaLauncherActivityIntent] = js.native
  var startActivity: js.UndefOr[SchemaStartActivityIntent] = js.native
  /**
    * Timeout in seconds for each intent.
    */
  var timeout: js.UndefOr[String] = js.native
}

object SchemaRoboStartingIntent {
  @scala.inline
  def apply(): SchemaRoboStartingIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoboStartingIntent]
  }
  @scala.inline
  implicit class SchemaRoboStartingIntentOps[Self <: SchemaRoboStartingIntent] (val x: Self) extends AnyVal {
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
    def setLauncherActivity(value: SchemaLauncherActivityIntent): Self = this.set("launcherActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLauncherActivity: Self = this.set("launcherActivity", js.undefined)
    @scala.inline
    def setStartActivity(value: SchemaStartActivityIntent): Self = this.set("startActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartActivity: Self = this.set("startActivity", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

