package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hierarchy extends js.Object {
  /**
    * Returns the unique name of the 'All' member for the hierarchy.
    *
    * @param value
    */
  def allMember(value: js.Object): String
  /**
    * Returns the caption of the hierarchy used when displaying the name of the hierarchy to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String
  /**
    * Returns the unique name of the default member for the hierarchy.
    *
    * @param value
    */
  def defaultMember(value: js.Object): String
  /**
    * Returns a user-friendly description of the hierarchy.
    *
    * @param value
    */
  def description(value: js.Object): String
  /**
    * Returns the unique name of the dimension that contains the hierarchy.
    *
    * @param value
    */
  def dimensionUniqueName(value: js.Object): String
  /**
    * Returns the hierarchy display folder path to be used when displaying the hierarchy in the user interface.
    *             Folder names will be separated by a semicolon (;). Nested folders are indicated by a backslash (\).
    *
    * @param value
    */
  def hierarchyDisplayFolder(value: js.Object): String
  /**
    * Returns the source of the hierarchy which is a value from the $.ig.HierarchyOrigin enumeration.
    *
    *             $.ig.HierarchyOrigin.prototype.userDefined = 1;
    *             Identifies user defined hierarchies.
    *
    *             $.ig.HierarchyOrigin.prototype.systemEnabled = 2;
    *             Identifies attribute hierarchies.
    *
    *             $.ig.HierarchyOrigin.prototype.systemInternal = 4;
    *             Identifies attributes with no attribute .
    *
    * @param value
    */
  def hierarchyOrigin(value: js.Object): Double
  /**
    * Returns the name of the hierarchy.
    *
    * @param value
    */
  def name(value: js.Object): String
  /**
    * Returns the unique name of the hierarchy.
    *
    * @param value
    */
  def uniqueName(value: js.Object): String
}

object Hierarchy {
  @scala.inline
  def apply(
    allMember: js.Object => String,
    caption: js.Object => String,
    defaultMember: js.Object => String,
    description: js.Object => String,
    dimensionUniqueName: js.Object => String,
    hierarchyDisplayFolder: js.Object => String,
    hierarchyOrigin: js.Object => Double,
    name: js.Object => String,
    uniqueName: js.Object => String
  ): Hierarchy = {
    val __obj = js.Dynamic.literal(allMember = js.Any.fromFunction1(allMember), caption = js.Any.fromFunction1(caption), defaultMember = js.Any.fromFunction1(defaultMember), description = js.Any.fromFunction1(description), dimensionUniqueName = js.Any.fromFunction1(dimensionUniqueName), hierarchyDisplayFolder = js.Any.fromFunction1(hierarchyDisplayFolder), hierarchyOrigin = js.Any.fromFunction1(hierarchyOrigin), name = js.Any.fromFunction1(name), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[Hierarchy]
  }
}

