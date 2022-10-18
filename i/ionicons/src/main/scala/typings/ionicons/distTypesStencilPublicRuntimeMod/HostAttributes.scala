package typings.ionicons.distTypesStencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Host
  */
trait HostAttributes
  extends StObject
     with /* prop */ StringDictionary[Any] {
  
  var `class`: js.UndefOr[String | StringDictionary[Boolean]] = js.undefined
  
  var ref: js.UndefOr[js.Function1[/* el */ HTMLElement | Null, Unit]] = js.undefined
  
  var style: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
}
object HostAttributes {
  
  inline def apply(): HostAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostAttributes]
  }
  
  extension [Self <: HostAttributes](x: Self) {
    
    inline def setClass(value: String | StringDictionary[Boolean]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setRef(value: /* el */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStyle(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
