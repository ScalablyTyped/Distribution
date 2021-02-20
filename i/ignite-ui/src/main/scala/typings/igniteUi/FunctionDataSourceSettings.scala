package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionDataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Type of the data source.
    */
  var `type`: js.UndefOr[String] = js.native
}
object FunctionDataSourceSettings {
  
  @scala.inline
  def apply(): FunctionDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDataSourceSettings]
  }
  
  @scala.inline
  implicit class FunctionDataSourceSettingsMutableBuilder[Self <: FunctionDataSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
