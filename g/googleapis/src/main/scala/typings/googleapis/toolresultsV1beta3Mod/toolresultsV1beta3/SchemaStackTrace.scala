package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A stacktrace.
  */
trait SchemaStackTrace extends StObject {
  
  /**
    * The stack trace message.  Required
    */
  var exception: js.UndefOr[String] = js.undefined
}
object SchemaStackTrace {
  
  @scala.inline
  def apply(): SchemaStackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackTrace]
  }
  
  @scala.inline
  implicit class SchemaStackTraceMutableBuilder[Self <: SchemaStackTrace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
  }
}
