package typings.hasYarn

import typings.hasYarn.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	 * Check if a project is using [Yarn](https://yarnpkg.com).
  	 *
  	 * @param cwd - Current working directory. Default: `process.cwd()`.
  	 * @returns Whether the project uses Yarn.
  	 */
  @scala.inline
  def apply(): Boolean = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boolean]
  @scala.inline
  def apply(cwd: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
  @scala.inline
  def default(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Boolean]
  @scala.inline
  def default(cwd: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cwd.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hasYarn(cwd?: string): boolean;
  // export = hasYarn;
  @JSImport("has-yarn", "default")
  @js.native
  def default_Fmod: Call = js.native
  
  @scala.inline
  def default_Fmod_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
