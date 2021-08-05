package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Meta information related to the job searcher or entity
  * conducting the job search. This information is used to improve the
  * performance of the service.
  */
trait SchemaRequestMetadata extends StObject {
  
  /**
    * Optional.  The type of device used by the job seeker at the time of the
    * call to the service.
    */
  var deviceInfo: js.UndefOr[SchemaDeviceInfo] = js.undefined
  
  /**
    * Required.  The client-defined scope or source of the service call, which
    * typically is the domain on which the service has been implemented and is
    * currently being run.  For example, if the service is being run by client
    * &lt;em&gt;Foo, Inc.&lt;/em&gt;, on job board www.foo.com and career site
    * www.bar.com, then this field is set to &quot;foo.com&quot; for use on the
    * job board, and &quot;bar.com&quot; for use on the career site.  If this
    * field isn&#39;t available for some reason, send &quot;UNKNOWN&quot;. Any
    * improvements to the model for a particular tenant site rely on this field
    * being set correctly to a domain.  The maximum number of allowed
    * characters is 255.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Required.  A unique session identification string. A session is defined
    * as the duration of an end user&#39;s interaction with the service over a
    * certain period. Obfuscate this field for privacy concerns before
    * providing it to the service.  If this field is not available for some
    * reason, send &quot;UNKNOWN&quot;. Note that any improvements to the model
    * for a particular tenant site, rely on this field being set correctly to
    * some unique session_id.  The maximum number of allowed characters is 255.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required.  A unique user identification string, as determined by the
    * client. To have the strongest positive impact on search quality make sure
    * the client-level is unique. Obfuscate this field for privacy concerns
    * before providing it to the service.  If this field is not available for
    * some reason, send &quot;UNKNOWN&quot;. Note that any improvements to the
    * model for a particular tenant site, rely on this field being set
    * correctly to a unique user_id.  The maximum number of allowed characters
    * is 255.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object SchemaRequestMetadata {
  
  inline def apply(): SchemaRequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestMetadata]
  }
  
  extension [Self <: SchemaRequestMetadata](x: Self) {
    
    inline def setDeviceInfo(value: SchemaDeviceInfo): Self = StObject.set(x, "deviceInfo", value.asInstanceOf[js.Any])
    
    inline def setDeviceInfoUndefined: Self = StObject.set(x, "deviceInfo", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
