package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Application related details of a job posting.
  */
@js.native
trait SchemaApplicationInfo extends js.Object {
  /**
    * Optional but at least one of uris, emails or instruction must be
    * specified.  Use this field to specify email address(es) to which resumes
    * or applications can be sent.  The maximum number of allowed characters
    * for each entry is 255.
    */
  var emails: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional but at least one of uris, emails or instruction must be
    * specified.  Use this field to provide instructions, such as &quot;Mail
    * your application to ...&quot;, that a candidate can follow to apply for
    * the job.  This field accepts and sanitizes HTML input, and also accepts
    * bold, italic, ordered list, and unordered list markup tags.  The maximum
    * number of allowed characters is 3,000.
    */
  var instruction: js.UndefOr[String] = js.native
  /**
    * Optional but at least one of uris, emails or instruction must be
    * specified.  Use this URI field to direct an applicant to a website, for
    * example to link to an online application form.  The maximum number of
    * allowed characters for each entry is 2,000.
    */
  var uris: js.UndefOr[js.Array[String]] = js.native
}

object SchemaApplicationInfo {
  @scala.inline
  def apply(emails: js.Array[String] = null, instruction: String = null, uris: js.Array[String] = null): SchemaApplicationInfo = {
    val __obj = js.Dynamic.literal()
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (instruction != null) __obj.updateDynamic("instruction")(instruction.asInstanceOf[js.Any])
    if (uris != null) __obj.updateDynamic("uris")(uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApplicationInfo]
  }
}

