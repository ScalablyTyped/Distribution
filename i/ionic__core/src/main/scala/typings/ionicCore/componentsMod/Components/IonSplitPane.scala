package typings.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonSplitPane extends StObject {
  
  /**
    * The content `id` of the split-pane's main content.
    */
  var contentId: js.UndefOr[String] = js.native
  
  /**
    * If `true`, the split pane will be hidden.
    */
  var disabled: Boolean = js.native
  
  /**
    * When the split-pane should be shown. Can be a CSS media query expression, or a shortcut expression. Can also be a boolean expression.
    */
  var when: String | Boolean = js.native
}
object IonSplitPane {
  
  @scala.inline
  def apply(disabled: Boolean, when: String | Boolean): IonSplitPane = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSplitPane]
  }
  
  @scala.inline
  implicit class IonSplitPaneMutableBuilder[Self <: IonSplitPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhen(value: String | Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
  }
}
