package typings.hapiHapi.anon

import typings.hapiHapi.hapiHapiStrings.`private`
import typings.hapiHapi.hapiHapiStrings.default
import typings.hapiHapi.hapiHapiStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Otherwise extends StObject {
  
  var otherwise: js.UndefOr[String] = js.undefined
  
  var privacy: js.UndefOr[default | public | `private`] = js.undefined
  
  var statuses: js.UndefOr[js.Array[Double]] = js.undefined
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
