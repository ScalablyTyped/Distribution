package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbarButtonMethods extends js.Object {
  /**
  	 * Activate toolbar button
  	 *
  	 * @param event
  	 */
  def activate(event: js.Object): scala.Unit
  /**
  	 * Deactivate toolbar button
  	 *
  	 * @param event
  	 */
  def deactivate(event: js.Object): scala.Unit
  /**
  	 * Destroy the widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Toggle toolbar button
  	 */
  def toggle(): scala.Unit
  /**
  	 * Returns the element that represents this widget.
  	 */
  def widget(): js.Object
}

