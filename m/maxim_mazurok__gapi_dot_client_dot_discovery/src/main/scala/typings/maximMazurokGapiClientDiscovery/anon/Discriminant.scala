package typings.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discriminant extends StObject {
  
  /** The name of the type discriminant property. */
  var discriminant: js.UndefOr[String] = js.undefined
  
  /** The map of discriminant value to schema to use for parsing.. */
  var map: js.UndefOr[js.Array[Ref]] = js.undefined
}
object Discriminant {
  
  inline def apply(): Discriminant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discriminant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Discriminant] (val x: Self) extends AnyVal {
    
    inline def setDiscriminant(value: String): Self = StObject.set(x, "discriminant", value.asInstanceOf[js.Any])
    
    inline def setDiscriminantUndefined: Self = StObject.set(x, "discriminant", js.undefined)
    
    inline def setMap(value: js.Array[Ref]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMapVarargs(value: Ref*): Self = StObject.set(x, "map", js.Array(value*))
  }
}
