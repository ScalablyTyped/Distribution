package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If a `run` call succeeds but the script function (or Apps Script itself)
  * throws an exception, the response body&#39;s error field contains this
  * `Status` object.
  */
@js.native
trait SchemaStatus extends js.Object {
  
  /**
    * The status code. For this API, this value either: &lt;ul&gt; &lt;li&gt;
    * 10, indicating a `SCRIPT_TIMEOUT` error,&lt;/li&gt; &lt;li&gt; 3,
    * indicating an `INVALID_ARGUMENT` error, or&lt;/li&gt; &lt;li&gt; 1,
    * indicating a `CANCELLED` execution.&lt;/li&gt; &lt;/ul&gt;
    */
  var code: js.UndefOr[Double] = js.native
  
  /**
    * An array that contains a single ExecutionError object that provides
    * information about the nature of the error.
    */
  var details: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  
  /**
    * A developer-facing error message, which is in English. Any user-facing
    * error message is localized and sent in the details field, or localized by
    * the client.
    */
  var message: js.UndefOr[String] = js.native
}
object SchemaStatus {
  
  @scala.inline
  def apply(): SchemaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatus]
  }
  
  @scala.inline
  implicit class SchemaStatusOps[Self <: SchemaStatus] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: StringDictionary[js.Any]*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[StringDictionary[_]]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
