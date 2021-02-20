package typings.hasYarn

import typings.hasYarn.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	 * Check if a project is using [Yarn](https://yarnpkg.com).
  	 *
  	 * @param cwd - Current working directory. Default: `process.cwd()`.
  	 * @returns Whether the project uses Yarn.
  	 */
  @JSImport("has-yarn", JSImport.Namespace)
  @js.native
  def apply(): Boolean = js.native
  @JSImport("has-yarn", JSImport.Namespace)
  @js.native
  def apply(cwd: String): Boolean = js.native
  
  @JSImport("has-yarn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * Check if a project is using [Yarn](https://yarnpkg.com).
  	 *
  	 * @param cwd - Current working directory. Default: `process.cwd()`.
  	 * @returns Whether the project uses Yarn.
  	 */
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hasYarn(cwd?: string): boolean;
  // export = hasYarn;
  @JSImport("has-yarn", "default")
  @js.native
  def default(): Boolean = js.native
  @JSImport("has-yarn", "default")
  @js.native
  def default(cwd: String): Boolean = js.native
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hasYarn(cwd?: string): boolean;
  // export = hasYarn;
  @JSImport("has-yarn", "default")
  @js.native
  def default_Fmod: Call = js.native
  
  @scala.inline
  def default_Fmod_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
