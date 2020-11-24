package typings.jdenticon.umdMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /**
    * Renders an indenticon for all matching supported elements.
    * 
    * @param hashOrValue A hexadecimal hash string or any value that will be hashed by Jdenticon. If not 
    * specified the `data-jdenticon-hash` and `data-jdenticon-value` attributes of each element will be
    * evaluated.
    * @param config Optional configuration. If specified, this configuration object overrides any global
    * configuration in its entirety. For backward compatibility a padding value in the range [0.0, 0.5) can be
    * specified in place of a configuration object.
    */
  def jdenticon(): Unit = js.native
  def jdenticon(hashOrValue: js.UndefOr[scala.Nothing], config: Double): Unit = js.native
  def jdenticon(hashOrValue: js.UndefOr[scala.Nothing], config: JdenticonConfig): Unit = js.native
  def jdenticon(hashOrValue: js.Any): Unit = js.native
  def jdenticon(hashOrValue: js.Any, config: Double): Unit = js.native
  def jdenticon(hashOrValue: js.Any, config: JdenticonConfig): Unit = js.native
}
