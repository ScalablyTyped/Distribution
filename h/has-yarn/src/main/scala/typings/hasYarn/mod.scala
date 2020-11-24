package typings.hasYarn

import typings.hasYarn.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("has-yarn", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hasYarn(cwd?: string): boolean;
  // export = hasYarn;
  @JSName("default")
  var default_Original: Call = js.native
}
