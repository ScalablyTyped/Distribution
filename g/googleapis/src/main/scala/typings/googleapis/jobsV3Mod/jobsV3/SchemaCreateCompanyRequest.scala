package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  The Request of the CreateCompany method.
  */
@js.native
trait SchemaCreateCompanyRequest extends js.Object {
  /**
    * Required.  The company to be created.
    */
  var company: js.UndefOr[SchemaCompany] = js.native
}

object SchemaCreateCompanyRequest {
  @scala.inline
  def apply(company: SchemaCompany = null): SchemaCreateCompanyRequest = {
    val __obj = js.Dynamic.literal()
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateCompanyRequest]
  }
}

