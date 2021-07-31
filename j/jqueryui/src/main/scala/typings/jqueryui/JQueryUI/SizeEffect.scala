package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeEffect extends StObject {
  
  var origin: js.UndefOr[js.Array[String]] = js.undefined
  
  var scale: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[js.Any] = js.undefined
}
object SizeEffect {
  
  @scala.inline
  def apply(): SizeEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeEffect]
  }
  
  @scala.inline
  implicit class SizeEffectMutableBuilder[Self <: SizeEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: js.Array[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setOriginVarargs(value: String*): Self = StObject.set(x, "origin", js.Array(value :_*))
    
    @scala.inline
    def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTo(value: js.Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
