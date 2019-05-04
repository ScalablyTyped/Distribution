package typings
package atJupyterlabApplicationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppSettings extends js.Object {
  val appSettings: java.lang.String
  val schemas: java.lang.String
  val serverRoot: java.lang.String
  val static: java.lang.String
  val templates: java.lang.String
  val themes: java.lang.String
  val userSettings: java.lang.String
  val workspaces: java.lang.String
}

object Anon_AppSettings {
  @scala.inline
  def apply(
    appSettings: java.lang.String,
    schemas: java.lang.String,
    serverRoot: java.lang.String,
    static: java.lang.String,
    templates: java.lang.String,
    themes: java.lang.String,
    userSettings: java.lang.String,
    workspaces: java.lang.String
  ): Anon_AppSettings = {
    val __obj = js.Dynamic.literal(appSettings = appSettings, schemas = schemas, serverRoot = serverRoot, static = static, templates = templates, themes = themes, userSettings = userSettings, workspaces = workspaces)
  
    __obj.asInstanceOf[Anon_AppSettings]
  }
}

