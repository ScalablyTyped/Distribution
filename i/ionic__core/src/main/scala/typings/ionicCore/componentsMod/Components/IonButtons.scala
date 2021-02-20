package typings.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonButtons extends StObject {
  
  /**
    * If true, buttons will disappear when its parent toolbar has fully collapsed if the toolbar is not the first toolbar. If the toolbar is the first toolbar, the buttons will be hidden and will only be shown once all toolbars have fully collapsed.  Only applies in `ios` mode with `collapse` set to `true` on `ion-header`.  Typically used for [Collapsible Large Titles](https://ionicframework.com/docs/api/title#collapsible-large-titles)
    */
  var collapse: Boolean = js.native
}
object IonButtons {
  
  @scala.inline
  def apply(collapse: Boolean): IonButtons = {
    val __obj = js.Dynamic.literal(collapse = collapse.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonButtons]
  }
  
  @scala.inline
  implicit class IonButtonsMutableBuilder[Self <: IonButtons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
  }
}
