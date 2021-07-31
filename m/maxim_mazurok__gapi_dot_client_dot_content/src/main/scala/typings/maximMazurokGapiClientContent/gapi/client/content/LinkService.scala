package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkService extends StObject {
  
  /** Service provided to or by the linked account. Acceptable values are: - "`shoppingActionsOrderManagement`" - "`shoppingActionsProductManagement`" - "`shoppingAdsProductManagement`" */
  var service: js.UndefOr[String] = js.undefined
  
  /** Status of the link Acceptable values are: - "`active`" - "`inactive`" - "`pending`" */
  var status: js.UndefOr[String] = js.undefined
}
object LinkService {
  
  @scala.inline
  def apply(): LinkService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkService]
  }
  
  @scala.inline
  implicit class LinkServiceMutableBuilder[Self <: LinkService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
