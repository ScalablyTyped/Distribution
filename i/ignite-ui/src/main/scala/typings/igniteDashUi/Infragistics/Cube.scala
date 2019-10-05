package typings.igniteDashUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.Cube")
@js.native
class Cube () extends js.Object {
  /**
  	 * Returns the caption of the cube used when displaying the name of the cube to the user.
  	 *
  	 * @param value
  	 */
  def caption(value: js.Object): String = js.native
  /**
  	 * Returns the type of the cube which is a value from the $.ig.CubeType enumeration.
  	 *
  	 *             $.ig.CubeType.prototype.cube = 0;
  	 *             $.ig.CubeType.prototype.dimension = 1;
  	 *             $.ig.CubeType.prototype.unknown = 2;
  	 *
  	 * @param value
  	 */
  def cubeType(value: js.Object): Double = js.native
  /**
  	 * Returns a user-friendly description of the cube.
  	 *
  	 * @param value
  	 */
  def description(value: js.Object): String = js.native
  /**
  	 * Returns the date and time on which the cube was last processed.
  	 *
  	 * @param value
  	 */
  def lastProcessed(value: js.Object): js.Object = js.native
  /**
  	 * Returns the date and time on which the cube was last updated.
  	 *
  	 * @param value
  	 */
  def lastUpdated(value: js.Object): js.Object = js.native
  /**
  	 * Returns the name of the cube.
  	 *
  	 * @param value
  	 */
  def name(value: js.Object): String = js.native
  /**
  	 * Returns the unique name of the cube.
  	 *
  	 * @param value
  	 */
  def uniqueName(value: js.Object): String = js.native
}

