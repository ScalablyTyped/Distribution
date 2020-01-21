package typings.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApp extends js.Object {
  val app: String
  val base: String
  val hubHost: js.UndefOr[String] = js.undefined
  val hubPrefix: js.UndefOr[String] = js.undefined
  val hubServerName: js.UndefOr[String] = js.undefined
  val hubUser: js.UndefOr[String] = js.undefined
  val notFound: js.UndefOr[String] = js.undefined
  val settings: String
  val static: String
  val themes: String
  val tree: String
  val workspaces: String
}

object AnonApp {
  @scala.inline
  def apply(
    app: String,
    base: String,
    settings: String,
    static: String,
    themes: String,
    tree: String,
    workspaces: String,
    hubHost: String = null,
    hubPrefix: String = null,
    hubServerName: String = null,
    hubUser: String = null,
    notFound: String = null
  ): AnonApp = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    if (hubHost != null) __obj.updateDynamic("hubHost")(hubHost.asInstanceOf[js.Any])
    if (hubPrefix != null) __obj.updateDynamic("hubPrefix")(hubPrefix.asInstanceOf[js.Any])
    if (hubServerName != null) __obj.updateDynamic("hubServerName")(hubServerName.asInstanceOf[js.Any])
    if (hubUser != null) __obj.updateDynamic("hubUser")(hubUser.asInstanceOf[js.Any])
    if (notFound != null) __obj.updateDynamic("notFound")(notFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApp]
  }
}

