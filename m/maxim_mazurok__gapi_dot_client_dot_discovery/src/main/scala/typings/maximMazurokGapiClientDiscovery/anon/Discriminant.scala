package typings.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Discriminant extends StObject {
  
  /** The name of the type discriminant property. */
  var discriminant: js.UndefOr[String] = js.native
  
  /** The map of discriminant value to schema to use for parsing.. */
  var map: js.UndefOr[js.Array[Ref]] = js.native
}
object Discriminant {
  
  @scala.inline
  def apply(): Discriminant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discriminant]
  }
  
  @scala.inline
  implicit class DiscriminantMutableBuilder[Self <: Discriminant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscriminant(value: String): Self = StObject.set(x, "discriminant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminantUndefined: Self = StObject.set(x, "discriminant", js.undefined)
    
    @scala.inline
    def setMap(value: js.Array[Ref]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMapVarargs(value: Ref*): Self = StObject.set(x, "map", js.Array(value :_*))
  }
}
