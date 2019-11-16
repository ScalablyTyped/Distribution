package typings.jestDashChangedDashFiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typings.atJestTypes.buildConfigMod.Path
  import typings.std.Set

  type ChangedFilesPromise = js.Promise[ChangedFiles]
  type Paths = Set[Path]
}
