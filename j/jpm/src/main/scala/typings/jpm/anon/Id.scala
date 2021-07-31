package typings.jpm.anon

import typings.jpm.sidebarMod.SidebarWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var onAttach: js.UndefOr[js.Function1[/* worker */ SidebarWorker, js.Any]] = js.undefined
  
  var onDetach: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var onReady: js.UndefOr[js.Function1[/* worker */ SidebarWorker, js.Any]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var title: String
  
  var url: String
}
object Id {
  
  @scala.inline
  def apply(title: String, url: String): Id = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOnAttach(value: /* worker */ SidebarWorker => js.Any): Self = StObject.set(x, "onAttach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAttachUndefined: Self = StObject.set(x, "onAttach", js.undefined)
    
    @scala.inline
    def setOnDetach(value: () => js.Any): Self = StObject.set(x, "onDetach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDetachUndefined: Self = StObject.set(x, "onDetach", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => js.Any): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnReady(value: /* worker */ SidebarWorker => js.Any): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => js.Any): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
