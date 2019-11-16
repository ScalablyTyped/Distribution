package typings.jestDashWatcher.buildTypesMod

import typings.jestDashWatcher.Anon_Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestHookExposedFS extends js.Object {
  var projects: js.Array[Anon_Config]
}

object JestHookExposedFS {
  @scala.inline
  def apply(projects: js.Array[Anon_Config]): JestHookExposedFS = {
    val __obj = js.Dynamic.literal(projects = projects)
  
    __obj.asInstanceOf[JestHookExposedFS]
  }
}

