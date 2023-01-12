package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabContents extends StObject {
  
  var tabContents: js.UndefOr[String] = js.undefined
}
object TabContents {
  
  inline def apply(): TabContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabContents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabContents] (val x: Self) extends AnyVal {
    
    inline def setTabContents(value: String): Self = StObject.set(x, "tabContents", value.asInstanceOf[js.Any])
    
    inline def setTabContentsUndefined: Self = StObject.set(x, "tabContents", js.undefined)
  }
}
