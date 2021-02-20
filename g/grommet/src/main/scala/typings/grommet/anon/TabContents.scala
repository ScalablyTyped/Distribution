package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabContents extends StObject {
  
  var tabContents: js.UndefOr[String] = js.native
}
object TabContents {
  
  @scala.inline
  def apply(): TabContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabContents]
  }
  
  @scala.inline
  implicit class TabContentsMutableBuilder[Self <: TabContents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTabContents(value: String): Self = StObject.set(x, "tabContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabContentsUndefined: Self = StObject.set(x, "tabContents", js.undefined)
  }
}
