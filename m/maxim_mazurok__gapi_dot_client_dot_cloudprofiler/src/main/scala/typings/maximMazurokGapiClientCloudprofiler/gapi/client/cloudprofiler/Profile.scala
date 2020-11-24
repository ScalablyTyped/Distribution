package typings.maximMazurokGapiClientCloudprofiler.gapi.client.cloudprofiler

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Profile extends js.Object {
  
  /** Deployment this profile corresponds to. */
  var deployment: js.UndefOr[Deployment] = js.native
  
  /**
    * Duration of the profiling session. Input (for the offline mode) or output (for the online mode). The field represents requested profiling duration. It may slightly differ from the
    * effective profiling duration, which is recorded in the profile data, in case the profiling can't be stopped immediately (e.g. in case stopping the profiling is handled
    * asynchronously).
    */
  var duration: js.UndefOr[String] = js.native
  
  /**
    * Input only. Labels associated to this specific profile. These labels will get merged with the deployment labels for the final data set. See documentation on deployment labels for
    * validation rules and limits.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.Profile with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. Opaque, server-assigned, unique ID for this profile. */
  var name: js.UndefOr[String] = js.native
  
  /** Input only. Profile bytes, as a gzip compressed serialized proto, the format is https://github.com/google/pprof/blob/master/proto/profile.proto. */
  var profileBytes: js.UndefOr[String] = js.native
  
  /** Type of profile. For offline mode, this must be specified when creating the profile. For online mode it is assigned and returned by the server. */
  var profileType: js.UndefOr[String] = js.native
}
object Profile {
  
  @scala.inline
  def apply(): Profile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profile]
  }
  
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    
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
    def setDeployment(value: Deployment): Self = this.set("deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployment: Self = this.set("deployment", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudprofiler.maximMazurokGapiClientCloudprofilerStrings.Profile with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProfileBytes(value: String): Self = this.set("profileBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileBytes: Self = this.set("profileBytes", js.undefined)
    
    @scala.inline
    def setProfileType(value: String): Self = this.set("profileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileType: Self = this.set("profileType", js.undefined)
  }
}
