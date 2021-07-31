package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Face extends StObject {
  
  var face: js.UndefOr[String] = js.undefined
  
  var family: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[String] = js.undefined
  
  var maxWidth: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object Face {
  
  @scala.inline
  def apply(): Face = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Face]
  }
  
  @scala.inline
  implicit class FaceMutableBuilder[Self <: Face] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
