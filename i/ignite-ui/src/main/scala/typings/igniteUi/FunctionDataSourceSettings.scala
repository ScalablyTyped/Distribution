package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionDataSourceSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Type of the data source.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object FunctionDataSourceSettings {
  
  inline def apply(): FunctionDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDataSourceSettings]
  }
  
  extension [Self <: FunctionDataSourceSettings](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
