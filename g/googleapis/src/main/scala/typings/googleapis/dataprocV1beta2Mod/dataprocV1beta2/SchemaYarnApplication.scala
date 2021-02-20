package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A YARN application created by a job. Application information is a subset of
  * &lt;code&gt;org.apache.hadoop.yarn.proto.YarnProtos.ApplicationReportProto&lt;/code&gt;.Beta
  * Feature: This report is available for testing purposes only. It may be
  * changed before final release.
  */
@js.native
trait SchemaYarnApplication extends StObject {
  
  /**
    * Required. The application name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Required. The numerical progress of the application, from 1 to 100.
    */
  var progress: js.UndefOr[Double] = js.native
  
  /**
    * Required. The application state.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
    * TimelineServer that provides application-specific information. The URL
    * uses the internal hostname, and requires a proxy server for resolution
    * and, possibly, access.
    */
  var trackingUrl: js.UndefOr[String] = js.native
}
object SchemaYarnApplication {
  
  @scala.inline
  def apply(): SchemaYarnApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaYarnApplication]
  }
  
  @scala.inline
  implicit class SchemaYarnApplicationMutableBuilder[Self <: SchemaYarnApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTrackingUrl(value: String): Self = StObject.set(x, "trackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingUrlUndefined: Self = StObject.set(x, "trackingUrl", js.undefined)
  }
}
