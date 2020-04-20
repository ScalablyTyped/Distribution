package typings.jestResolveDependencies.mod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedModule extends js.Object {
  var dependencies: js.Array[Path]
  var file: Path
}

object ResolvedModule {
  @scala.inline
  def apply(dependencies: js.Array[Path], file: Path): ResolvedModule = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModule]
  }
}

