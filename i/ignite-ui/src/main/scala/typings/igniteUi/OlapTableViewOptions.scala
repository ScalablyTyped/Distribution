package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapTableViewOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" a value indicating whether the result has one or more hierarchies in the columns.
    */
  var hasColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional="false" a value indicating whether the result has one or more hierarchies in the rows.
    */
  var hasRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional="false" an object of type $.ig.OlapResult.
    */
  var result: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Optional="false" an object containing the table view configuration options as properties.
    */
  var viewSettings: js.UndefOr[OlapTableViewOptionsViewSettings] = js.undefined
}
object OlapTableViewOptions {
  
  inline def apply(): OlapTableViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapTableViewOptions]
  }
  
  extension [Self <: OlapTableViewOptions](x: Self) {
    
    inline def setHasColumns(value: Boolean): Self = StObject.set(x, "hasColumns", value.asInstanceOf[js.Any])
    
    inline def setHasColumnsUndefined: Self = StObject.set(x, "hasColumns", js.undefined)
    
    inline def setHasRows(value: Boolean): Self = StObject.set(x, "hasRows", value.asInstanceOf[js.Any])
    
    inline def setHasRowsUndefined: Self = StObject.set(x, "hasRows", js.undefined)
    
    inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setViewSettings(value: OlapTableViewOptionsViewSettings): Self = StObject.set(x, "viewSettings", value.asInstanceOf[js.Any])
    
    inline def setViewSettingsUndefined: Self = StObject.set(x, "viewSettings", js.undefined)
  }
}
