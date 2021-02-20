package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapTableViewOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" a value indicating whether the result has one or more hierarchies in the columns.
    */
  var hasColumns: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional="false" a value indicating whether the result has one or more hierarchies in the rows.
    */
  var hasRows: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional="false" an object of type $.ig.OlapResult.
    */
  var result: js.UndefOr[js.Any] = js.native
  
  /**
    * Optional="false" an object containing the table view configuration options as properties.
    */
  var viewSettings: js.UndefOr[OlapTableViewOptionsViewSettings] = js.native
}
object OlapTableViewOptions {
  
  @scala.inline
  def apply(): OlapTableViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapTableViewOptions]
  }
  
  @scala.inline
  implicit class OlapTableViewOptionsMutableBuilder[Self <: OlapTableViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasColumns(value: Boolean): Self = StObject.set(x, "hasColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasColumnsUndefined: Self = StObject.set(x, "hasColumns", js.undefined)
    
    @scala.inline
    def setHasRows(value: Boolean): Self = StObject.set(x, "hasRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRowsUndefined: Self = StObject.set(x, "hasRows", js.undefined)
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setViewSettings(value: OlapTableViewOptionsViewSettings): Self = StObject.set(x, "viewSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewSettingsUndefined: Self = StObject.set(x, "viewSettings", js.undefined)
  }
}
