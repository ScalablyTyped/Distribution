package typings.jotai.anon

import typings.jotai.vanillaStoreMod.AnyError
import typings.jotai.vanillaStoreMod.Dependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  e :jotai.jotai/vanilla/store.AnyError} & {  d :jotai.jotai/vanilla/store.Dependencies} */
trait eAnyErrordDependencies extends StObject {
  
  var d: Dependencies
  
  var e: AnyError
}
object eAnyErrordDependencies {
  
  inline def apply(d: Dependencies, e: AnyError): eAnyErrordDependencies = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any])
    __obj.asInstanceOf[eAnyErrordDependencies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: eAnyErrordDependencies] (val x: Self) extends AnyVal {
    
    inline def setD(value: Dependencies): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setE(value: AnyError): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
  }
}
