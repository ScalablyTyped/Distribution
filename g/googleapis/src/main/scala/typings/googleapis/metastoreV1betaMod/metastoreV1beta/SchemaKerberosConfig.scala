package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKerberosConfig extends StObject {
  
  /**
    * A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
    */
  var keytab: js.UndefOr[SchemaSecret] = js.undefined
  
  /**
    * A Cloud Storage URI that specifies the path to a krb5.conf file. It is of the form gs://{bucket_name\}/path/to/krb5.conf, although the file does not need to be named krb5.conf explicitly.
    */
  var krb5ConfigGcsUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A Kerberos principal that exists in the both the keytab the KDC to authenticate as. A typical principal is of the form primary/instance@REALM, but there is no exact format.
    */
  var principal: js.UndefOr[String | Null] = js.undefined
}
object SchemaKerberosConfig {
  
  inline def apply(): SchemaKerberosConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKerberosConfig]
  }
  
  extension [Self <: SchemaKerberosConfig](x: Self) {
    
    inline def setKeytab(value: SchemaSecret): Self = StObject.set(x, "keytab", value.asInstanceOf[js.Any])
    
    inline def setKeytabUndefined: Self = StObject.set(x, "keytab", js.undefined)
    
    inline def setKrb5ConfigGcsUri(value: String): Self = StObject.set(x, "krb5ConfigGcsUri", value.asInstanceOf[js.Any])
    
    inline def setKrb5ConfigGcsUriNull: Self = StObject.set(x, "krb5ConfigGcsUri", null)
    
    inline def setKrb5ConfigGcsUriUndefined: Self = StObject.set(x, "krb5ConfigGcsUri", js.undefined)
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalNull: Self = StObject.set(x, "principal", null)
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
  }
}
