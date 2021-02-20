package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgButtonLink
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var href: js.UndefOr[js.Any] = js.native
  
  var target: js.UndefOr[js.Any] = js.native
  
  var title: js.UndefOr[js.Any] = js.native
}
object IgButtonLink {
  
  @scala.inline
  def apply(): IgButtonLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgButtonLink]
  }
  
  @scala.inline
  implicit class IgButtonLinkMutableBuilder[Self <: IgButtonLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: js.Any): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
