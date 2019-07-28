package typings.atJupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  val app: String
  val base: String
  val hubHost: js.UndefOr[String] = js.undefined
  val hubPrefix: js.UndefOr[String] = js.undefined
  val notFound: js.UndefOr[String] = js.undefined
  val settings: String
  val static: String
  val themes: String
  val tree: String
  val workspaces: String
}

object Anon_App {
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
    notFound: String = null
  ): Anon_App = {
    val __obj = js.Dynamic.literal(app = app, base = base, settings = settings, static = static, themes = themes, tree = tree, workspaces = workspaces)
    if (hubHost != null) __obj.updateDynamic("hubHost")(hubHost)
    if (hubPrefix != null) __obj.updateDynamic("hubPrefix")(hubPrefix)
    if (notFound != null) __obj.updateDynamic("notFound")(notFound)
    __obj.asInstanceOf[Anon_App]
  }
}

