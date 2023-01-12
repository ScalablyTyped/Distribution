package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorContext extends StObject {
  
  /** The HTTP request which was processed when the error was triggered. */
  var httpRequest: js.UndefOr[HttpRequestContext] = js.undefined
  
  /**
    * The location in the source code where the decision was made to report the error, usually the place where it was logged. For a logged exception this would be the source line where
    * the exception is logged, usually close to the place where it was caught.
    */
  var reportLocation: js.UndefOr[SourceLocation] = js.undefined
  
  /** Source code that was used to build the executable which has caused the given error message. */
  var sourceReferences: js.UndefOr[js.Array[SourceReference]] = js.undefined
  
  /**
    * The user who caused or was affected by the crash. This can be a user ID, an email address, or an arbitrary token that uniquely identifies the user. When sending an error report,
    * leave this field empty if the user was not logged in. In this case the Error Reporting system will use other data, such as remote IP address, to distinguish affected users. See
    * `affected_users_count` in `ErrorGroupStats`.
    */
  var user: js.UndefOr[String] = js.undefined
}
object ErrorContext {
  
  inline def apply(): ErrorContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorContext] (val x: Self) extends AnyVal {
    
    inline def setHttpRequest(value: HttpRequestContext): Self = StObject.set(x, "httpRequest", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestUndefined: Self = StObject.set(x, "httpRequest", js.undefined)
    
    inline def setReportLocation(value: SourceLocation): Self = StObject.set(x, "reportLocation", value.asInstanceOf[js.Any])
    
    inline def setReportLocationUndefined: Self = StObject.set(x, "reportLocation", js.undefined)
    
    inline def setSourceReferences(value: js.Array[SourceReference]): Self = StObject.set(x, "sourceReferences", value.asInstanceOf[js.Any])
    
    inline def setSourceReferencesUndefined: Self = StObject.set(x, "sourceReferences", js.undefined)
    
    inline def setSourceReferencesVarargs(value: SourceReference*): Self = StObject.set(x, "sourceReferences", js.Array(value*))
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
