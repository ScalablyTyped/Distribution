package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnrolledService extends js.Object {
  
  /**
    * The product for which Access Approval will be enrolled. Allowed values are listed below (case-sensitive): * all * App Engine * BigQuery * Cloud Bigtable * Cloud Key Management
    * Service * Compute Engine * Cloud Dataflow * Cloud Identity and Access Management * Cloud Pub/Sub * Cloud Storage * Persistent Disk Note: These values are supported as input for
    * legacy purposes, but will not be returned from the API. * all * appengine.googleapis.com * bigquery.googleapis.com * bigtable.googleapis.com * cloudkms.googleapis.com *
    * compute.googleapis.com * dataflow.googleapis.com * iam.googleapis.com * pubsub.googleapis.com * storage.googleapis.com Calls to UpdateAccessApprovalSettings using 'all' or any of
    * the XXX.googleapis.com will be translated to the associated product name ('all', 'App Engine', etc.). Note: 'all' will enroll the resource in all products supported at both 'GA' and
    * 'Preview' levels. More information about levels of support is available at https://cloud.google.com/access-approval/docs/supported-services
    */
  var cloudProduct: js.UndefOr[String] = js.native
  
  /** The enrollment level of the service. */
  var enrollmentLevel: js.UndefOr[String] = js.native
}
object EnrolledService {
  
  @scala.inline
  def apply(): EnrolledService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrolledService]
  }
  
  @scala.inline
  implicit class EnrolledServiceOps[Self <: EnrolledService] (val x: Self) extends AnyVal {
    
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
    def setCloudProduct(value: String): Self = this.set("cloudProduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudProduct: Self = this.set("cloudProduct", js.undefined)
    
    @scala.inline
    def setEnrollmentLevel(value: String): Self = this.set("enrollmentLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnrollmentLevel: Self = this.set("enrollmentLevel", js.undefined)
  }
}
