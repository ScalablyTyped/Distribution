package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="true" a value indicating whether a members' set expressions on COLUMNS axis should be wrapped with AddCalculatedMembers MDX method. Default value is true
    */
  var addCalculatedMembersOnColumns: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional="true" a value indicating whether a members' set expressions on ROWS axis should be wrapped with AddCalculatedMembers MDX method. Default value is true
    */
  var addCalculatedMembersOnRows: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional="true" a string array with the names of intrinsic non-context sensitive member properties applied on COLUMNS axis. By defult CHILDREN_CARDINALITY and PARENT_UNIQUE_NAME properties are always added to DIMENSION PROPERTIES
    */
  var dimensionPropertiesOnColumns: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Optional="true" a string array with the names of intrinsic non-context sensitive member properties applied on ROWS axis. By defult CHILDREN_CARDINALITY and PARENT_UNIQUE_NAME properties are always added to DIMENSION PROPERTIES
    */
  var dimensionPropertiesOnRows: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Optional="true" a value indicating whether a NON EMPTY clause is present on COLUMNS axis. Default value is true
    */
  var nonEmptyOnColumns: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional="true" a value indicating whether a NON EMPTY clause is present on ROWS axis. Default value is true
    */
  var nonEmptyOnRows: js.UndefOr[Boolean] = js.native
}
object IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings {
  
  @scala.inline
  def apply(): IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings]
  }
  
  @scala.inline
  implicit class IgPivotGridDataSourceOptionsXmlaOptionsMdxSettingsOps[Self <: IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddCalculatedMembersOnColumns(value: Boolean): Self = this.set("addCalculatedMembersOnColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddCalculatedMembersOnColumns: Self = this.set("addCalculatedMembersOnColumns", js.undefined)
    
    @scala.inline
    def setAddCalculatedMembersOnRows(value: Boolean): Self = this.set("addCalculatedMembersOnRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddCalculatedMembersOnRows: Self = this.set("addCalculatedMembersOnRows", js.undefined)
    
    @scala.inline
    def setDimensionPropertiesOnColumnsVarargs(value: js.Any*): Self = this.set("dimensionPropertiesOnColumns", js.Array(value :_*))
    
    @scala.inline
    def setDimensionPropertiesOnColumns(value: js.Array[_]): Self = this.set("dimensionPropertiesOnColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionPropertiesOnColumns: Self = this.set("dimensionPropertiesOnColumns", js.undefined)
    
    @scala.inline
    def setDimensionPropertiesOnRowsVarargs(value: js.Any*): Self = this.set("dimensionPropertiesOnRows", js.Array(value :_*))
    
    @scala.inline
    def setDimensionPropertiesOnRows(value: js.Array[_]): Self = this.set("dimensionPropertiesOnRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionPropertiesOnRows: Self = this.set("dimensionPropertiesOnRows", js.undefined)
    
    @scala.inline
    def setNonEmptyOnColumns(value: Boolean): Self = this.set("nonEmptyOnColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonEmptyOnColumns: Self = this.set("nonEmptyOnColumns", js.undefined)
    
    @scala.inline
    def setNonEmptyOnRows(value: Boolean): Self = this.set("nonEmptyOnRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonEmptyOnRows: Self = this.set("nonEmptyOnRows", js.undefined)
  }
}
