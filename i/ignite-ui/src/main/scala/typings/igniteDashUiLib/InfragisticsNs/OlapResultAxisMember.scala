package typings
package igniteDashUiLib.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.OlapResultAxisMember")
@js.native
class OlapResultAxisMember () extends js.Object {
  /**
  	 * Returns the caption of the axis member used when displaying the name of the axis member to the user.
  	 *
  	 * @param value
  	 */
  def caption(value: js.Object): java.lang.String = js.native
  /**
  	 * Returns the count of children members this member has.
  	 *
  	 * @param value
  	 */
  def childCount(value: js.Object): scala.Double = js.native
  /**
  	 * A bitmap of the information projected by childCount, drilledDown and parentSameAsPrev properties.
  	 *
  	 * @param value
  	 */
  def displayInfo(value: js.Object): scala.Double = js.native
  /**
  	 * Returns a value that indicates whether at least one child of this member appears on the axis, immediately following all occurrences of that member. This can be used by applications to display a "+" or a "-" next to the member.
  	 *
  	 * @param value
  	 */
  def drilledDown(value: js.Object): scala.Boolean = js.native
  /**
  	 * Returns the unique name of the hierarchy that contains the level.
  	 *
  	 * @param value
  	 */
  def hierarchyUniqueName(value: js.Object): java.lang.String = js.native
  /**
  	 * Returns the distance of member parent level from the root of the level. Root level is zero (0)
  	 *
  	 * @param value
  	 */
  def levelNumber(value: js.Object): scala.Double = js.native
  /**
  	 * Returns the unique name of the level this member belongs to.
  	 *
  	 * @param value
  	 */
  def levelUniqueName(value: js.Object): java.lang.String = js.native
  /**
  	 * Returns a value that indicates whether the parent of this member is the same as the parent of the member preceding all occurrences of the current member.
  	 *
  	 * @param value
  	 */
  def parentSameAsPrev(value: js.Object): scala.Boolean = js.native
  /**
  	 * Returns a key value map of the members' properties. By default only 'PARENT_UNIQUE_NAME' and 'CHILDREN_CARDINALITY' properties are available.
  	 *
  	 * @param value
  	 */
  def properties(value: js.Object): js.Object = js.native
  /**
  	 * Returns the unique name of the axis member.
  	 *
  	 * @param value
  	 */
  def uniqueName(value: js.Object): java.lang.String = js.native
}

