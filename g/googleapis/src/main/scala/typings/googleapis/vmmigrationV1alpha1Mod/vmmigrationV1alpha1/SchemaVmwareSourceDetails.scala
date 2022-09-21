package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVmwareSourceDetails extends StObject {
  
  /**
    * Input only. The credentials password. This is write only and can not be read in a GET operation.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The thumbprint representing the certificate for the vcenter.
    */
  var thumbprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The credentials username.
    */
  var username: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ip address of the vcenter this Source represents.
    */
  var vcenterIp: js.UndefOr[String | Null] = js.undefined
}
object SchemaVmwareSourceDetails {
  
  inline def apply(): SchemaVmwareSourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmwareSourceDetails]
  }
  
  extension [Self <: SchemaVmwareSourceDetails](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    
    inline def setThumbprintNull: Self = StObject.set(x, "thumbprint", null)
    
    inline def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setVcenterIp(value: String): Self = StObject.set(x, "vcenterIp", value.asInstanceOf[js.Any])
    
    inline def setVcenterIpNull: Self = StObject.set(x, "vcenterIp", null)
    
    inline def setVcenterIpUndefined: Self = StObject.set(x, "vcenterIp", js.undefined)
  }
}
