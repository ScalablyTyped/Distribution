package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGCoreAttributes extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var tabindex: js.UndefOr[Double] = js.undefined
  
  @JSName("xml:base")
  var xmlColonbase: js.UndefOr[String] = js.undefined
  
  @JSName("xml:lang")
  var xmlColonlang: js.UndefOr[String] = js.undefined
  
  @JSName("xml:space")
  var xmlColonspace: js.UndefOr[String] = js.undefined
}
object SVGCoreAttributes {
  
  inline def apply(): SVGCoreAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGCoreAttributes]
  }
  
  extension [Self <: SVGCoreAttributes](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
    
    inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
    
    inline def setXmlColonbase(value: String): Self = StObject.set(x, "xml:base", value.asInstanceOf[js.Any])
    
    inline def setXmlColonbaseUndefined: Self = StObject.set(x, "xml:base", js.undefined)
    
    inline def setXmlColonlang(value: String): Self = StObject.set(x, "xml:lang", value.asInstanceOf[js.Any])
    
    inline def setXmlColonlangUndefined: Self = StObject.set(x, "xml:lang", js.undefined)
    
    inline def setXmlColonspace(value: String): Self = StObject.set(x, "xml:space", value.asInstanceOf[js.Any])
    
    inline def setXmlColonspaceUndefined: Self = StObject.set(x, "xml:space", js.undefined)
  }
}
