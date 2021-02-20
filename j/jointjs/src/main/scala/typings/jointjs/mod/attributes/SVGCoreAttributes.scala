package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGCoreAttributes extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var tabindex: js.UndefOr[Double] = js.native
  
  @JSName("xml:base")
  var xmlColonbase: js.UndefOr[String] = js.native
  
  @JSName("xml:lang")
  var xmlColonlang: js.UndefOr[String] = js.native
  
  @JSName("xml:space")
  var xmlColonspace: js.UndefOr[String] = js.native
}
object SVGCoreAttributes {
  
  @scala.inline
  def apply(): SVGCoreAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGCoreAttributes]
  }
  
  @scala.inline
  implicit class SVGCoreAttributesMutableBuilder[Self <: SVGCoreAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
    
    @scala.inline
    def setXmlColonbase(value: String): Self = StObject.set(x, "xml:base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlColonbaseUndefined: Self = StObject.set(x, "xml:base", js.undefined)
    
    @scala.inline
    def setXmlColonlang(value: String): Self = StObject.set(x, "xml:lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlColonlangUndefined: Self = StObject.set(x, "xml:lang", js.undefined)
    
    @scala.inline
    def setXmlColonspace(value: String): Self = StObject.set(x, "xml:space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlColonspaceUndefined: Self = StObject.set(x, "xml:space", js.undefined)
  }
}
