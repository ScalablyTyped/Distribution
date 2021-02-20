package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopOverPane extends StObject {
  
  var initial: js.UndefOr[String] = js.native
  
  var layout: js.UndefOr[String] = js.native
  
  var loading: js.UndefOr[String] = js.native
  
  var transition: js.UndefOr[String] = js.native
}
object PopOverPane {
  
  @scala.inline
  def apply(): PopOverPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopOverPane]
  }
  
  @scala.inline
  implicit class PopOverPaneMutableBuilder[Self <: PopOverPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
