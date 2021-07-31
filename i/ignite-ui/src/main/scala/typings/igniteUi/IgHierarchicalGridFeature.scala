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
  
  @scala.inline
  def apply(): IgHierarchicalGridFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGridFeature]
  }
  
  @scala.inline
  implicit class IgHierarchicalGridFeatureMutableBuilder[Self <: IgHierarchicalGridFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
