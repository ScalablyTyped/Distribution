package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapResultViewOptions
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
    * Optional="false" an object of type $.ig.OlapResult which represents the full cached result.
    */
  var result: js.UndefOr[js.Any] = js.native
  
  /**
    * Optional="false" an object of type $.ig.OlapResult which represents the visible part of the result.
    */
  var visibleResult: js.UndefOr[js.Any] = js.native
}
object OlapResultViewOptions {
  
  @scala.inline
  def apply(): OlapResultViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapResultViewOptions]
  }
  
  @scala.inline
  implicit class OlapResultViewOptionsMutableBuilder[Self <: OlapResultViewOptions] (val x: Self) extends AnyVal {
    
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
    def setVisibleResult(value: js.Any): Self = StObject.set(x, "visibleResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleResultUndefined: Self = StObject.set(x, "visibleResult", js.undefined)
  }
}
