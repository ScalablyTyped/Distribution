package typings.hapi.anon

import typings.hapi.hapiStrings.`private`
import typings.hapi.hapiStrings.default
import typings.hapi.hapiStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Otherwise extends StObject {
  
  var otherwise: js.UndefOr[String] = js.native
  
  var privacy: js.UndefOr[default | public | `private`] = js.native
  
  var statuses: js.UndefOr[js.Array[Double]] = js.native
}
object Otherwise {
  
  @scala.inline
  def apply(): Otherwise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Otherwise]
  }
  
  @scala.inline
  implicit class OtherwiseMutableBuilder[Self <: Otherwise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOtherwise(value: String): Self = StObject.set(x, "otherwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherwiseUndefined: Self = StObject.set(x, "otherwise", js.undefined)
    
    @scala.inline
    def setPrivacy(value: default | public | `private`): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    
    @scala.inline
    def setStatuses(value: js.Array[Double]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    @scala.inline
    def setStatusesVarargs(value: Double*): Self = StObject.set(x, "statuses", js.Array(value :_*))
  }
}
