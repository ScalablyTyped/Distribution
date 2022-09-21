package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Function extends StObject {
  
  /** Describes the Build step of the function that builds a container from the given source. */
  var buildConfig: js.UndefOr[BuildConfig] = js.native
  
  /** User-provided description of a function. */
  var description: js.UndefOr[String] = js.native
  
  /** Describe whether the function is gen1 or gen2. */
  var environment: js.UndefOr[String] = js.native
  
  /** An Eventarc trigger managed by Google Cloud Functions that fires events in response to a condition in another service. */
  var eventTrigger: js.UndefOr[EventTrigger] = js.native
  
  /** Labels associated with this Cloud Function. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.Function & TopLevel[Any]
  ] = js.native
  
  /** A user-defined name of the function. Function names must be unique globally and match pattern `projects/ *‍/locations/ *‍/functions/ *` */
  var name: js.UndefOr[String] = js.native
  
  /** Describes the Service being deployed. Currently deploys services to Cloud Run (fully managed). */
  var serviceConfig: js.UndefOr[ServiceConfig] = js.native
  
  /** Output only. State of the function. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. State Messages for this Cloud Function. */
  var stateMessages: js.UndefOr[js.Array[GoogleCloudFunctionsV2StateMessage]] = js.native
  
  /** Output only. The last update timestamp of a Cloud Function. */
  var updateTime: js.UndefOr[String] = js.native
}
