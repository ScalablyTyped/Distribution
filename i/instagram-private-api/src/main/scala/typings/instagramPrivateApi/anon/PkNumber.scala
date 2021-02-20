package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PkNumber extends StObject {
  
  var pk: Double = js.native
}
object PkNumber {
  
  @scala.inline
  def apply(pk: Double): PkNumber = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PkNumber]
  }
  
  @scala.inline
  implicit class PkNumberMutableBuilder[Self <: PkNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
  }
}
