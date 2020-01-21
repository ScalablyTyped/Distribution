package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(code: Int | Double = null, details: js.Array[StringDictionary[_]] = null, message: String = null): SchemaStatus = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStatus]
  }
}

