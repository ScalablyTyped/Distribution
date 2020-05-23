package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapXmlaDataSourceOptionsMdxSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Optional="true" a value indicating whether a members' set expressions on COLUMNS axis should be wrapped with AddCalculatedMembers MDX method. Default value is true
    */
  var addCalculatedMembersOnColumns: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional="true" a value indicating whether a members' set expressions on ROWS axis should be wrapped with AddCalculatedMembers MDX method. Default value is true
    */
  var addCalculatedMembersOnRows: js.UndefOr[Boolean] = js.undefined
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
  var nonEmptyOnColumns: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional="true" a value indicating whether a NON EMPTY clause is present on ROWS axis. Default value is true
    */
  var nonEmptyOnRows: js.UndefOr[Boolean] = js.undefined
}

object OlapXmlaDataSourceOptionsMdxSettings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    addCalculatedMembersOnColumns: js.UndefOr[Boolean] = js.undefined,
    addCalculatedMembersOnRows: js.UndefOr[Boolean] = js.undefined,
    dimensionPropertiesOnColumns: js.Array[_] = null,
    dimensionPropertiesOnRows: js.Array[_] = null,
    nonEmptyOnColumns: js.UndefOr[Boolean] = js.undefined,
    nonEmptyOnRows: js.UndefOr[Boolean] = js.undefined
  ): OlapXmlaDataSourceOptionsMdxSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(addCalculatedMembersOnColumns)) __obj.updateDynamic("addCalculatedMembersOnColumns")(addCalculatedMembersOnColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addCalculatedMembersOnRows)) __obj.updateDynamic("addCalculatedMembersOnRows")(addCalculatedMembersOnRows.get.asInstanceOf[js.Any])
    if (dimensionPropertiesOnColumns != null) __obj.updateDynamic("dimensionPropertiesOnColumns")(dimensionPropertiesOnColumns.asInstanceOf[js.Any])
    if (dimensionPropertiesOnRows != null) __obj.updateDynamic("dimensionPropertiesOnRows")(dimensionPropertiesOnRows.asInstanceOf[js.Any])
    if (!js.isUndefined(nonEmptyOnColumns)) __obj.updateDynamic("nonEmptyOnColumns")(nonEmptyOnColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonEmptyOnRows)) __obj.updateDynamic("nonEmptyOnRows")(nonEmptyOnRows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlapXmlaDataSourceOptionsMdxSettings]
  }
}

