package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcAccessConnector extends StObject {
  
  /** Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1. */
  var name: js.UndefOr[String] = js.undefined
}
object VpcAccessConnector {
  
  @scala.inline
  def apply(): VpcAccessConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcAccessConnector]
  }
  
  @scala.inline
  implicit class VpcAccessConnectorMutableBuilder[Self <: VpcAccessConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
