package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Application related details of a job posting.
  */
@js.native
trait SchemaApplicationInfo extends StObject {
  
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
  def apply(): SchemaApplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationInfo]
  }
  
  @scala.inline
  implicit class SchemaApplicationInfoMutableBuilder[Self <: SchemaApplicationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    @scala.inline
    def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
    
    @scala.inline
    def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    @scala.inline
    def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value :_*))
  }
}
