package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If a `run` call succeeds but the script function (or Apps Script itself)
  * throws an exception, the response body&#39;s error field contains this
  * `Status` object.
  */
trait SchemaStatus extends StObject {
  
  /**
    * The status code. For this API, this value either: &lt;ul&gt; &lt;li&gt;
    * 10, indicating a `SCRIPT_TIMEOUT` error,&lt;/li&gt; &lt;li&gt; 3,
    * indicating an `INVALID_ARGUMENT` error, or&lt;/li&gt; &lt;li&gt; 1,
    * indicating a `CANCELLED` execution.&lt;/li&gt; &lt;/ul&gt;
    */
  var code: js.UndefOr[Double] = js.undefined
  
  /**
    * An array that contains a single ExecutionError object that provides
    * information about the nature of the error.
    */
  var details: js.UndefOr[js.Array[StringDictionary[js.Any]]] = js.undefined
  
  /**
    * A developer-facing error message, which is in English. Any user-facing
    * error message is localized and sent in the details field, or localized by
    * the client.
    */
  var message: js.UndefOr[String] = js.undefined
}
object SchemaStatus {
  
  inline def apply(): SchemaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatus]
  }
  
  extension [Self <: SchemaStatus](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetails(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
