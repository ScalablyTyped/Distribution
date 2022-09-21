package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestination extends StObject {
  
  /**
    * For publicly routable host.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The port is the target port number that is accepted by the destination.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * PSC service attachments. Format: projects/x/regions/x/serviceAttachments/x
    */
  var serviceAttachment: js.UndefOr[String | Null] = js.undefined
}
object SchemaDestination {
  
  inline def apply(): SchemaDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestination]
  }
  
  extension [Self <: SchemaDestination](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setServiceAttachment(value: String): Self = StObject.set(x, "serviceAttachment", value.asInstanceOf[js.Any])
    
    inline def setServiceAttachmentNull: Self = StObject.set(x, "serviceAttachment", null)
    
    inline def setServiceAttachmentUndefined: Self = StObject.set(x, "serviceAttachment", js.undefined)
  }
}
