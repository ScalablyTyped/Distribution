package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapXmlaDataSourceOptionsMdxSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
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
  var dimensionPropertiesOnColumns: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Optional="true" a string array with the names of intrinsic non-context sensitive member properties applied on ROWS axis. By defult CHILDREN_CARDINALITY and PARENT_UNIQUE_NAME properties are always added to DIMENSION PROPERTIES
    */
  var dimensionPropertiesOnRows: js.UndefOr[js.Array[Any]] = js.undefined
  
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
  
  inline def apply(): OlapXmlaDataSourceOptionsMdxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapXmlaDataSourceOptionsMdxSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OlapXmlaDataSourceOptionsMdxSettings] (val x: Self) extends AnyVal {
    
    inline def setAddCalculatedMembersOnColumns(value: Boolean): Self = StObject.set(x, "addCalculatedMembersOnColumns", value.asInstanceOf[js.Any])
    
    inline def setAddCalculatedMembersOnColumnsUndefined: Self = StObject.set(x, "addCalculatedMembersOnColumns", js.undefined)
    
    inline def setAddCalculatedMembersOnRows(value: Boolean): Self = StObject.set(x, "addCalculatedMembersOnRows", value.asInstanceOf[js.Any])
    
    inline def setAddCalculatedMembersOnRowsUndefined: Self = StObject.set(x, "addCalculatedMembersOnRows", js.undefined)
    
    inline def setDimensionPropertiesOnColumns(value: js.Array[Any]): Self = StObject.set(x, "dimensionPropertiesOnColumns", value.asInstanceOf[js.Any])
    
    inline def setDimensionPropertiesOnColumnsUndefined: Self = StObject.set(x, "dimensionPropertiesOnColumns", js.undefined)
    
    inline def setDimensionPropertiesOnColumnsVarargs(value: Any*): Self = StObject.set(x, "dimensionPropertiesOnColumns", js.Array(value*))
    
    inline def setDimensionPropertiesOnRows(value: js.Array[Any]): Self = StObject.set(x, "dimensionPropertiesOnRows", value.asInstanceOf[js.Any])
    
    inline def setDimensionPropertiesOnRowsUndefined: Self = StObject.set(x, "dimensionPropertiesOnRows", js.undefined)
    
    inline def setDimensionPropertiesOnRowsVarargs(value: Any*): Self = StObject.set(x, "dimensionPropertiesOnRows", js.Array(value*))
    
    inline def setNonEmptyOnColumns(value: Boolean): Self = StObject.set(x, "nonEmptyOnColumns", value.asInstanceOf[js.Any])
    
    inline def setNonEmptyOnColumnsUndefined: Self = StObject.set(x, "nonEmptyOnColumns", js.undefined)
    
    inline def setNonEmptyOnRows(value: Boolean): Self = StObject.set(x, "nonEmptyOnRows", value.asInstanceOf[js.Any])
    
    inline def setNonEmptyOnRowsUndefined: Self = StObject.set(x, "nonEmptyOnRows", js.undefined)
  }
}
