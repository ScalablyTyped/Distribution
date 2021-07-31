package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes one specific error.
  */
trait SchemaErrorProto extends StObject {
  
  /**
    * Error arguments, to be used when building user-friendly error messages
    * given the error domain and code.  Different error codes require different
    * arguments.
    */
  var argument: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Error code in the error domain. This should correspond to a value of the
    * enum type whose name is in domain. See the core error domain in
    * error_domain.proto.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Debugging information, which should not be shared externally.
    */
  var debugInfo: js.UndefOr[String] = js.undefined
  
  /**
    * Error domain. RoSy services can define their own domain and error codes.
    * This should normally be the name of an enum type, such as:
    * gdata.CoreErrorDomain
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * A short explanation for the error, which can be shared outside Google.
    * Please set domain, code and arguments whenever possible instead of this
    * error message so that external APIs can build safe error messages
    * themselves.  External messages built in a RoSy interface will most likely
    * refer to information and concepts that are not available externally and
    * should not be exposed. It is safer if external APIs can understand the
    * errors and decide what the error message should look like.
    */
  var externalErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Location of the error, as specified by the location type.  If
    * location_type is PATH, this should be a path to a field that&#39;s
    * relative to the request, using FieldPath notation
    * (net/proto2/util/public/field_path.h).  Examples:
    * authenticated_user.gaia_id   resource.address[2].country
    */
  var location: js.UndefOr[String] = js.undefined
  
  var locationType: js.UndefOr[String] = js.undefined
}
object SchemaErrorProto {
  
  @scala.inline
  def apply(): SchemaErrorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorProto]
  }
  
  @scala.inline
  implicit class SchemaErrorProtoMutableBuilder[Self <: SchemaErrorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: js.Array[String]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    @scala.inline
    def setArgumentVarargs(value: String*): Self = StObject.set(x, "argument", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDebugInfo(value: String): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setExternalErrorMessage(value: String): Self = StObject.set(x, "externalErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalErrorMessageUndefined: Self = StObject.set(x, "externalErrorMessage", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
