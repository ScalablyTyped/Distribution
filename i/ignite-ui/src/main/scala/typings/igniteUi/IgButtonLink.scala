package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgButtonLink
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var href: js.UndefOr[js.Any] = js.undefined
  
  var target: js.UndefOr[js.Any] = js.undefined
  
  var title: js.UndefOr[js.Any] = js.undefined
}
object IgButtonLink {
  
  inline def apply(): IgButtonLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgButtonLink]
  }
  
  extension [Self <: IgButtonLink](x: Self) {
    
    inline def setHref(value: js.Any): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
