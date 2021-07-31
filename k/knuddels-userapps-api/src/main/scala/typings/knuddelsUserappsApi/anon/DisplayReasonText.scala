package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.KnuddelTransferDisplayType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayReasonText extends StObject {
  
  var displayReasonText: js.UndefOr[String] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var transferDisplayType: js.UndefOr[KnuddelTransferDisplayType] = js.undefined
}
object DisplayReasonText {
  
  @scala.inline
  def apply(): DisplayReasonText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayReasonText]
  }
  
  @scala.inline
  implicit class DisplayReasonTextMutableBuilder[Self <: DisplayReasonText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayReasonText(value: String): Self = StObject.set(x, "displayReasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayReasonTextUndefined: Self = StObject.set(x, "displayReasonText", js.undefined)
    
    @scala.inline
    def setOnError(value: /* message */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    @scala.inline
    def setTransferDisplayType(value: KnuddelTransferDisplayType): Self = StObject.set(x, "transferDisplayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferDisplayTypeUndefined: Self = StObject.set(x, "transferDisplayType", js.undefined)
  }
}
