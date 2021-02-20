package typings.hardRejection

import typings.hardRejection.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Make unhandled promise rejections fail hard right away instead of the default [silent fail](https://gist.github.com/benjamingr/0237932cee84712951a2).
  	@param log - Custom logging function to print the rejected promise. Receives the error stack. Default: `console.error`.
  	*/
  @JSImport("hard-rejection", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  @JSImport("hard-rejection", JSImport.Namespace)
  @js.native
  def apply(log: js.Function1[/* stack */ js.UndefOr[String], Unit]): Unit = js.native
  
  @JSImport("hard-rejection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Make unhandled promise rejections fail hard right away instead of the default [silent fail](https://gist.github.com/benjamingr/0237932cee84712951a2).
  	@param log - Custom logging function to print the rejected promise. Receives the error stack. Default: `console.error`.
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hardRejection(log?: (stack?: string) => void): void;
  // export = hardRejection;
  @JSImport("hard-rejection", "default")
  @js.native
  def default(): Unit = js.native
  @JSImport("hard-rejection", "default")
  @js.native
  def default(log: js.Function1[/* stack */ js.UndefOr[String], Unit]): Unit = js.native
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hardRejection(log?: (stack?: string) => void): void;
  // export = hardRejection;
  @JSImport("hard-rejection", "default")
  @js.native
  def default_Fmod: Call = js.native
  
  @scala.inline
  def default_Fmod_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
