package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes one specific error.
  */
@js.native
trait SchemaErrorProto extends js.Object {
  
  /**
    * Error arguments, to be used when building user-friendly error messages
    * given the error domain and code.  Different error codes require different
    * arguments.
    */
  var argument: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Error code in the error domain. This should correspond to a value of the
    * enum type whose name is in domain. See the core error domain in
    * error_domain.proto.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * Debugging information, which should not be shared externally.
    */
  var debugInfo: js.UndefOr[String] = js.native
  
  /**
    * Error domain. RoSy services can define their own domain and error codes.
    * This should normally be the name of an enum type, such as:
    * gdata.CoreErrorDomain
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * A short explanation for the error, which can be shared outside Google.
    * Please set domain, code and arguments whenever possible instead of this
    * error message so that external APIs can build safe error messages
    * themselves.  External messages built in a RoSy interface will most likely
    * refer to information and concepts that are not available externally and
    * should not be exposed. It is safer if external APIs can understand the
    * errors and decide what the error message should look like.
    */
  var externalErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * Location of the error, as specified by the location type.  If
    * location_type is PATH, this should be a path to a field that&#39;s
    * relative to the request, using FieldPath notation
    * (net/proto2/util/public/field_path.h).  Examples:
    * authenticated_user.gaia_id   resource.address[2].country
    */
  var location: js.UndefOr[String] = js.native
  
  var locationType: js.UndefOr[String] = js.native
}
object SchemaErrorProto {
  
  @scala.inline
  def apply(): SchemaErrorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorProto]
  }
  
  @scala.inline
  implicit class SchemaErrorProtoOps[Self <: SchemaErrorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgumentVarargs(value: String*): Self = this.set("argument", js.Array(value :_*))
    
    @scala.inline
    def setArgument(value: js.Array[String]): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgument: Self = this.set("argument", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setDebugInfo(value: String): Self = this.set("debugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugInfo: Self = this.set("debugInfo", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setExternalErrorMessage(value: String): Self = this.set("externalErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalErrorMessage: Self = this.set("externalErrorMessage", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
  }
}
