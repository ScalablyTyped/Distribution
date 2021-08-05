package typings.jqueryPnotify

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PNotifyStack extends StObject {
  
  var context: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  
  var dir1: js.UndefOr[String] = js.undefined
  
  var dir2: js.UndefOr[String] = js.undefined
  
  var firstpos1: js.UndefOr[Double] = js.undefined
  
  var firstpos2: js.UndefOr[Double] = js.undefined
  
  var modal: js.UndefOr[Boolean] = js.undefined
  
  var push: js.UndefOr[String] = js.undefined
  
  var spacing1: js.UndefOr[Double] = js.undefined
  
  var spacing2: js.UndefOr[Double] = js.undefined
}
object PNotifyStack {
  
  inline def apply(): PNotifyStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyStack]
  }
  
  extension [Self <: PNotifyStack](x: Self) {
    
    inline def setContext(value: JQuery[HTMLElement]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDir1(value: String): Self = StObject.set(x, "dir1", value.asInstanceOf[js.Any])
    
    inline def setDir1Undefined: Self = StObject.set(x, "dir1", js.undefined)
    
    inline def setDir2(value: String): Self = StObject.set(x, "dir2", value.asInstanceOf[js.Any])
    
    inline def setDir2Undefined: Self = StObject.set(x, "dir2", js.undefined)
    
    inline def setFirstpos1(value: Double): Self = StObject.set(x, "firstpos1", value.asInstanceOf[js.Any])
    
    inline def setFirstpos1Undefined: Self = StObject.set(x, "firstpos1", js.undefined)
    
    inline def setFirstpos2(value: Double): Self = StObject.set(x, "firstpos2", value.asInstanceOf[js.Any])
    
    inline def setFirstpos2Undefined: Self = StObject.set(x, "firstpos2", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setPush(value: String): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setSpacing1(value: Double): Self = StObject.set(x, "spacing1", value.asInstanceOf[js.Any])
    
    inline def setSpacing1Undefined: Self = StObject.set(x, "spacing1", js.undefined)
    
    inline def setSpacing2(value: Double): Self = StObject.set(x, "spacing2", value.asInstanceOf[js.Any])
    
    inline def setSpacing2Undefined: Self = StObject.set(x, "spacing2", js.undefined)
  }
}
