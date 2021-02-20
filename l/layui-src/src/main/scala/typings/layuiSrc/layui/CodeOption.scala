package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeOption extends StObject {
  
  var about: js.UndefOr[Boolean] = js.native
  
  var elem: js.UndefOr[String] = js.native
  
  var encode: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  var skin: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object CodeOption {
  
  @scala.inline
  def apply(): CodeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeOption]
  }
  
  @scala.inline
  implicit class CodeOptionMutableBuilder[Self <: CodeOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbout(value: Boolean): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    @scala.inline
    def setElem(value: String): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    @scala.inline
    def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
