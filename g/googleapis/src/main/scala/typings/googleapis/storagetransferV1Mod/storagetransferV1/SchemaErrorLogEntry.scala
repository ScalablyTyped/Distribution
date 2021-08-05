package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An entry describing an error that has occurred.
  */
trait SchemaErrorLogEntry extends StObject {
  
  /**
    * A list of messages that carry the error details.
    */
  var errorDetails: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A URL that refers to the target (a data source, a data sink, or an
    * object) with which the error is associated. Required.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaErrorLogEntry {
  
  inline def apply(): SchemaErrorLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorLogEntry]
  }
  
  extension [Self <: SchemaErrorLogEntry](x: Self) {
    
    inline def setErrorDetails(value: js.Array[String]): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setErrorDetailsVarargs(value: String*): Self = StObject.set(x, "errorDetails", js.Array(value :_*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
