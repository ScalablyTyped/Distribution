package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeOption extends StObject {
  
  var about: js.UndefOr[Boolean] = js.undefined
  
  var elem: js.UndefOr[String] = js.undefined
  
  var encode: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[String] = js.undefined
  
  var skin: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object CodeOption {
  
  inline def apply(): CodeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeOption]
  }
  
  extension [Self <: CodeOption](x: Self) {
    
    inline def setAbout(value: Boolean): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setElem(value: String): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    inline def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
