package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPathFinder
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var items: js.UndefOr[js.Any] = js.native
}
object IgPathFinder {
  
  @scala.inline
  def apply(): IgPathFinder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPathFinder]
  }
  
  @scala.inline
  implicit class IgPathFinderMutableBuilder[Self <: IgPathFinder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
  }
}
