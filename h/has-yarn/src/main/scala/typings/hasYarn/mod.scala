package typings.hasYarn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("has-yarn", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hasYarn(cwd?: string): boolean;
  // export = hasYarn;
  @JSName("default")
  var default_Original: AnonCall = js.native
  /**
  	 * Check if a project is using [Yarn](https://yarnpkg.com).
  	 *
  	 * @param cwd - Current working directory. Default: `process.cwd()`.
  	 * @returns Whether the project uses Yarn.
  	 */
  def apply(): Boolean = js.native
  def apply(cwd: String): Boolean = js.native
  /**
  	 * Check if a project is using [Yarn](https://yarnpkg.com).
  	 *
  	 * @param cwd - Current working directory. Default: `process.cwd()`.
  	 * @returns Whether the project uses Yarn.
  	 */
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hasYarn(cwd?: string): boolean;
  // export = hasYarn;
  def default(): Boolean = js.native
  def default(cwd: String): Boolean = js.native
}

