package typings.hasYarn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCwd extends js.Object {
  /**
  	 * Check if a project is using [Yarn](https://yarnpkg.com).
  	 *
  	 * @param cwd - Current working directory. Default: `process.cwd()`.
  	 * @returns Whether the project uses Yarn.
  	 */
  def apply(): Boolean = js.native
  def apply(cwd: String): Boolean = js.native
}

