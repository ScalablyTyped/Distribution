package typings.jestWatcher.typesMod

import typings.jestWatcher.anon.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestHookExposedFS extends js.Object {
  var projects: js.Array[Config]
}

object JestHookExposedFS {
  @scala.inline
  def apply(projects: js.Array[Config]): JestHookExposedFS = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[JestHookExposedFS]
  }
}

