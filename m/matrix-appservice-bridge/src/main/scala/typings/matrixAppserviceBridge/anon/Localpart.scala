package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Localpart extends StObject {
  
  var localpart: String = js.native
}
object Localpart {
  
  @scala.inline
  def apply(localpart: String): Localpart = {
    val __obj = js.Dynamic.literal(localpart = localpart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Localpart]
  }
  
  @scala.inline
  implicit class LocalpartMutableBuilder[Self <: Localpart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalpart(value: String): Self = StObject.set(x, "localpart", value.asInstanceOf[js.Any])
  }
}
