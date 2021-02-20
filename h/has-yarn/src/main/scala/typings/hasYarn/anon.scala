package typings.hasYarn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    /**
    	 * Check if a project is using [Yarn](https://yarnpkg.com).
    	 *
    	 * @param cwd - Current working directory. Default: `process.cwd()`.
    	 * @returns Whether the project uses Yarn.
    	 */
    def apply(): Boolean = js.native
    def apply(cwd: String): Boolean = js.native
  }
}
