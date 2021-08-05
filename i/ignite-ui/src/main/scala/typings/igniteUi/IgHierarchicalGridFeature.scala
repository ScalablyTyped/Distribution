package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgHierarchicalGridFeature
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Name of the feature to be enabled.
    */
  var name: js.UndefOr[String] = js.undefined
}
object IgHierarchicalGridFeature {
  
  inline def apply(): IgHierarchicalGridFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGridFeature]
  }
  
  extension [Self <: IgHierarchicalGridFeature](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
