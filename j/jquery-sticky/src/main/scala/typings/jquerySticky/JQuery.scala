package typings.jquerySticky

import typings.jquerySticky.jqueryStickyStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Initializer. options is optional.
    */
  def sticky(): JQuery = js.native
  def sticky(options: JQueryStickyOptions): JQuery = js.native
  /**
    * Recalculates the element's position.
    */
  @JSName("sticky")
  def sticky_update(method: update): JQuery = js.native
  
  /**
    * To unstick an object.
    */
  def unstick(): JQuery = js.native
}
