package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  /**
    * Returns the caption of the level used when displaying the name of the level to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String
  /**
    * Returns the distance of the level from the root of the level. Root level is zero (0)
    *
    * @param value
    */
  def depth(value: js.Object): Double
  /**
    * Returns a user-friendly description of the level.
    *
    * @param value
    */
  def description(value: js.Object): String
  /**
    * Returns the unique name of the dimension that contains the level.
    *
    * @param value
    */
  def dimensionUniqueName(value: js.Object): String
  /**
    * Returns the unique name of the hierarchy that contains the level.
    *
    * @param value
    */
  def hierarchyUniqueName(value: js.Object): String
  /**
    * Returns the ID of the attribute that the level is sorted on.
    *
    * @param value
    */
  def levelOrderingProperty(value: js.Object): Double
  /**
    * Returns a value that defines how the level was sourced.
    *
    * @param value
    */
  def levelOrigin(value: js.Object): Double
  /**
    * Returns the count of all members in the level.
    *
    * @param value
    */
  def membersCount(value: js.Object): Double
  /**
    * Returns the name of the level.
    *
    * @param value
    */
  def name(value: js.Object): String
  /**
    * Returns the unique name of the level.
    *
    * @param value
    */
  def uniqueName(value: js.Object): String
}

object Level {
  @scala.inline
  def apply(
    caption: js.Object => String,
    depth: js.Object => Double,
    description: js.Object => String,
    dimensionUniqueName: js.Object => String,
    hierarchyUniqueName: js.Object => String,
    levelOrderingProperty: js.Object => Double,
    levelOrigin: js.Object => Double,
    membersCount: js.Object => Double,
    name: js.Object => String,
    uniqueName: js.Object => String
  ): Level = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), depth = js.Any.fromFunction1(depth), description = js.Any.fromFunction1(description), dimensionUniqueName = js.Any.fromFunction1(dimensionUniqueName), hierarchyUniqueName = js.Any.fromFunction1(hierarchyUniqueName), levelOrderingProperty = js.Any.fromFunction1(levelOrderingProperty), levelOrigin = js.Any.fromFunction1(levelOrigin), membersCount = js.Any.fromFunction1(membersCount), name = js.Any.fromFunction1(name), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[Level]
  }
}

