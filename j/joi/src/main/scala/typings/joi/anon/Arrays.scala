package typings.joi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arrays extends StObject {
  
  var arrays: js.UndefOr[Boolean] = js.undefined
  
  var objects: js.UndefOr[Boolean] = js.undefined
}
object Arrays {
  
  inline def apply(): Arrays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arrays]
  }
  
  extension [Self <: Arrays](x: Self) {
    
    inline def setArrays(value: Boolean): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
    
    inline def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
    
    inline def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
  }
}
