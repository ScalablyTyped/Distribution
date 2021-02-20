package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var classID: js.UndefOr[String] = js.native
  
  var classid: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[String] = js.native
  
  var form: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var useMap: js.UndefOr[String] = js.native
  
  var usemap: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var wmode: js.UndefOr[String] = js.native
}
object ObjectHTMLAttributes {
  
  @scala.inline
  def apply[T](): ObjectHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class ObjectHTMLAttributesMutableBuilder[Self <: ObjectHTMLAttributes[_], T] (val x: Self with ObjectHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
  }
}
