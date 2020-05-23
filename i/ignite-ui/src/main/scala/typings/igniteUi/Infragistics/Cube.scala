package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cube extends js.Object {
  /**
    * Returns the caption of the cube used when displaying the name of the cube to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String
  /**
    * Returns the type of the cube which is a value from the $.ig.CubeType enumeration.
    *
    *             $.ig.CubeType.prototype.cube = 0;
    *             $.ig.CubeType.prototype.dimension = 1;
    *             $.ig.CubeType.prototype.unknown = 2;
    *
    * @param value
    */
  def cubeType(value: js.Object): Double
  /**
    * Returns a user-friendly description of the cube.
    *
    * @param value
    */
  def description(value: js.Object): String
  /**
    * Returns the date and time on which the cube was last processed.
    *
    * @param value
    */
  def lastProcessed(value: js.Object): js.Object
  /**
    * Returns the date and time on which the cube was last updated.
    *
    * @param value
    */
  def lastUpdated(value: js.Object): js.Object
  /**
    * Returns the name of the cube.
    *
    * @param value
    */
  def name(value: js.Object): String
  /**
    * Returns the unique name of the cube.
    *
    * @param value
    */
  def uniqueName(value: js.Object): String
}

object Cube {
  @scala.inline
  def apply(
    caption: js.Object => String,
    cubeType: js.Object => Double,
    description: js.Object => String,
    lastProcessed: js.Object => js.Object,
    lastUpdated: js.Object => js.Object,
    name: js.Object => String,
    uniqueName: js.Object => String
  ): Cube = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), cubeType = js.Any.fromFunction1(cubeType), description = js.Any.fromFunction1(description), lastProcessed = js.Any.fromFunction1(lastProcessed), lastUpdated = js.Any.fromFunction1(lastUpdated), name = js.Any.fromFunction1(name), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[Cube]
  }
}

