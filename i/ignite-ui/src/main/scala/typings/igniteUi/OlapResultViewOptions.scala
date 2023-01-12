package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapResultViewOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Optional="false" a value indicating whether the result has one or more hierarchies in the columns.
    */
  var hasColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional="false" a value indicating whether the result has one or more hierarchies in the rows.
    */
  var hasRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional="false" an object of type $.ig.OlapResult which represents the full cached result.
    */
  var result: js.UndefOr[Any] = js.undefined
  
  /**
    * Optional="false" an object of type $.ig.OlapResult which represents the visible part of the result.
    */
  var visibleResult: js.UndefOr[Any] = js.undefined
}
object OlapResultViewOptions {
  
  inline def apply(): OlapResultViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapResultViewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OlapResultViewOptions] (val x: Self) extends AnyVal {
    
    inline def setHasColumns(value: Boolean): Self = StObject.set(x, "hasColumns", value.asInstanceOf[js.Any])
    
    inline def setHasColumnsUndefined: Self = StObject.set(x, "hasColumns", js.undefined)
    
    inline def setHasRows(value: Boolean): Self = StObject.set(x, "hasRows", value.asInstanceOf[js.Any])
    
    inline def setHasRowsUndefined: Self = StObject.set(x, "hasRows", js.undefined)
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setVisibleResult(value: Any): Self = StObject.set(x, "visibleResult", value.asInstanceOf[js.Any])
    
    inline def setVisibleResultUndefined: Self = StObject.set(x, "visibleResult", js.undefined)
  }
}
