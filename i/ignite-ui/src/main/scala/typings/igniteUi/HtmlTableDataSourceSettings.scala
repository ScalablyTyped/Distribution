package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlTableDataSourceSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Type of the data source.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object HtmlTableDataSourceSettings {
  
  @scala.inline
  def apply(): HtmlTableDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlTableDataSourceSettings]
  }
  
  @scala.inline
  implicit class HtmlTableDataSourceSettingsMutableBuilder[Self <: HtmlTableDataSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
