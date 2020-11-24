package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of an execution of an Apps Script function started with
  * run. The execution response does not arrive until the function finishes
  * executing. The maximum execution runtime is listed in the [Apps Script
  * quotas guide](/apps-script/guides/services/quotas#current_limitations).
  * &lt;p&gt;After execution has started, it can have one of four
  * outcomes:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; If the script function returns
  * successfully, the   response field contains an   ExecutionResponse object
  * with the function&#39;s return value in the object&#39;s `result`
  * field.&lt;/li&gt; &lt;li&gt; If the script function (or Apps Script itself)
  * throws an exception, the   error field contains a   Status object. The
  * `Status` object&#39;s `details`   field contains an array with a single
  * ExecutionError object that   provides information about the nature of the
  * error.&lt;/li&gt; &lt;li&gt; If the execution has not yet completed,   the
  * done field is `false` and   the neither the `response` nor `error` fields
  * are present.&lt;/li&gt; &lt;li&gt; If the `run` call itself fails (for
  * example, because of a   malformed request or an authorization error), the
  * method returns an HTTP   response code in the 4XX range with a different
  * format for the response   body. Client libraries automatically convert a
  * 4XX response into an   exception class.&lt;/li&gt; &lt;/ul&gt;
  */
@js.native
trait SchemaOperation extends js.Object {
  
  /**
    * This field indicates whether the script execution has completed. A
    * completed execution has a populated `response` field containing the
    * ExecutionResponse from function that was executed.
    */
  var done: js.UndefOr[Boolean] = js.native
  
  /**
    * If a `run` call succeeds but the script function (or Apps Script itself)
    * throws an exception, this field contains a Status object. The `Status`
    * object&#39;s `details` field contains an array with a single
    * ExecutionError object that provides information about the nature of the
    * error.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * If the script function returns successfully, this field contains an
    * ExecutionResponse object with the function&#39;s return value.
    */
  var response: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object SchemaOperation {
  
  @scala.inline
  def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  
  @scala.inline
  implicit class SchemaOperationOps[Self <: SchemaOperation] (val x: Self) extends AnyVal {
    
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setError(value: SchemaStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setResponse(value: StringDictionary[js.Any]): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
}
