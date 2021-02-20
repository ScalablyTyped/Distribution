package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridFeature
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Name of the feature to be enabled.
    */
  var name: js.UndefOr[String] = js.native
}
object IgGridFeature {
  
  @scala.inline
  def apply(): IgGridFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridFeature]
  }
  
  @scala.inline
  implicit class IgGridFeatureMutableBuilder[Self <: IgGridFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
