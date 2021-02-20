package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pk extends StObject {
  
  var pk: String | Double = js.native
}
object Pk {
  
  @scala.inline
  def apply(pk: String | Double): Pk = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pk]
  }
  
  @scala.inline
  implicit class PkMutableBuilder[Self <: Pk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPk(value: String | Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
  }
}
