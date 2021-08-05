package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A YARN application created by a job. Application information is a subset of
  * &lt;code&gt;org.apache.hadoop.yarn.proto.YarnProtos.ApplicationReportProto&lt;/code&gt;.Beta
  * Feature: This report is available for testing purposes only. It may be
  * changed before final release.
  */
trait SchemaYarnApplication extends StObject {
  
  /**
    * Required. The application name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The numerical progress of the application, from 1 to 100.
    */
  var progress: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. The application state.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
    * TimelineServer that provides application-specific information. The URL
    * uses the internal hostname, and requires a proxy server for resolution
    * and, possibly, access.
    */
  var trackingUrl: js.UndefOr[String] = js.undefined
}
object SchemaYarnApplication {
  
  inline def apply(): SchemaYarnApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaYarnApplication]
  }
  
  extension [Self <: SchemaYarnApplication](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTrackingUrl(value: String): Self = StObject.set(x, "trackingUrl", value.asInstanceOf[js.Any])
    
    inline def setTrackingUrlUndefined: Self = StObject.set(x, "trackingUrl", js.undefined)
  }
}
