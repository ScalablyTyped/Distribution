package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplicationInfo extends StObject {
  
  /**
    * Use this field to specify email address(es) to which resumes or applications can be sent. The maximum number of allowed characters for each entry is 255.
    */
  var emails: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Use this field to provide instructions, such as "Mail your application to ...", that a candidate can follow to apply for the job. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 3,000.
    */
  var instruction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Use this URI field to direct an applicant to a website, for example to link to an online application form. The maximum number of allowed characters for each entry is 2,000.
    */
  var uris: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaApplicationInfo {
  
  inline def apply(): SchemaApplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationInfo]
  }
  
  extension [Self <: SchemaApplicationInfo](x: Self) {
    
    inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsNull: Self = StObject.set(x, "emails", null)
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionNull: Self = StObject.set(x, "instruction", null)
    
    inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
    
    inline def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisNull: Self = StObject.set(x, "uris", null)
    
    inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    inline def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value*))
  }
}
