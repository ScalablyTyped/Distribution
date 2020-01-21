package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A session in the Cloud Spanner API.
  */
@js.native
trait SchemaSession extends js.Object {
  /**
    * Output only. The approximate timestamp when the session is last used. It
    * is typically earlier than the actual last use time.
    */
  var approximateLastUseTime: js.UndefOr[String] = js.native
  /**
    * Output only. The timestamp when the session is created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The labels for the session.   * Label keys must be between 1 and 63
    * characters long and must conform to    the following regular expression:
    * `[a-z]([-a-z0-9]*[a-z0-9])?`.  * Label values must be between 0 and 63
    * characters long and must conform    to the regular expression
    * `([a-z]([-a-z0-9]*[a-z0-9])?)?`.  * No more than 64 labels can be
    * associated with a given session.  See https://goo.gl/xmQnxf for more
    * information on and examples of labels.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The name of the session. This is always system-assigned; values provided
    * when creating a session are ignored.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaSession {
  @scala.inline
  def apply(
    approximateLastUseTime: String = null,
    createTime: String = null,
    labels: StringDictionary[String] = null,
    name: String = null
  ): SchemaSession = {
    val __obj = js.Dynamic.literal()
    if (approximateLastUseTime != null) __obj.updateDynamic("approximateLastUseTime")(approximateLastUseTime.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSession]
  }
}

