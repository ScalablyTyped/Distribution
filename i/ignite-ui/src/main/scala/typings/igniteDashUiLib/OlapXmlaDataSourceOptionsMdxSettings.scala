package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OlapXmlaDataSourceOptionsMdxSettings
  extends /**
	 * Option for OlapXmlaDataSourceOptionsMdxSettings
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Optional="true" a value indicating whether a members' set expressions on COLUMNS axis should be wrapped with AddCalculatedMembers MDX method. Default value is true
  	 */
  var addCalculatedMembersOnColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="true" a value indicating whether a members' set expressions on ROWS axis should be wrapped with AddCalculatedMembers MDX method. Default value is true
  	 */
  var addCalculatedMembersOnRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="true" a string array with the names of intrinsic non-context sensitive member properties applied on COLUMNS axis. By defult CHILDREN_CARDINALITY and PARENT_UNIQUE_NAME properties are always added to DIMENSION PROPERTIES
  	 */
  var dimensionPropertiesOnColumns: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Optional="true" a string array with the names of intrinsic non-context sensitive member properties applied on ROWS axis. By defult CHILDREN_CARDINALITY and PARENT_UNIQUE_NAME properties are always added to DIMENSION PROPERTIES
  	 */
  var dimensionPropertiesOnRows: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Optional="true" a value indicating whether a NON EMPTY clause is present on COLUMNS axis. Default value is true
  	 */
  var nonEmptyOnColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Optional="true" a value indicating whether a NON EMPTY clause is present on ROWS axis. Default value is true
  	 */
  var nonEmptyOnRows: js.UndefOr[scala.Boolean] = js.undefined
}

