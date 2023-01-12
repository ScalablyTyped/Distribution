package typings.grommet.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prefix extends StObject {
  
  var label: js.UndefOr[String | ReactNode] = js.undefined
  
  // used for legend and/or hover/touch detail
  var prefix: js.UndefOr[String] = js.undefined
  
  // used for values in axes and hover/touch detail
  var property: String
  
  // property key to get values from objects in data
  var render: js.UndefOr[
    js.Function3[/* value */ Any, /* datum */ js.Object, /* property */ String, ReactNode]
  ] = js.undefined
  
  // used for hover/touch detail
  var suffix: js.UndefOr[String] = js.undefined
}
object Prefix {
  
  inline def apply(property: String): Prefix = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Prefix] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String | ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setRender(value: (/* value */ Any, /* datum */ js.Object, /* property */ String) => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
