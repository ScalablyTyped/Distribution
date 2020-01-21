package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A key-value pair applied to a given object.
  */
@js.native
trait SchemaLabel extends js.Object {
  /**
    * The key of a label is a syntactically valid URL (as per RFC 1738) with
    * the &quot;scheme&quot; and initial slashes omitted and with the
    * additional restrictions noted below.  Each key should be globally unique.
    * The &quot;host&quot; portion is called the &quot;namespace&quot; and is
    * not necessarily resolvable to a network endpoint.  Instead, the namespace
    * indicates what system or entity defines the semantics of the label.
    * Namespaces do not restrict the set of objects to which a label may be
    * associated.  Keys are defined by the following grammar:    key          =
    * hostname &quot;/&quot; kpath   kpath        = ksegment *[ &quot;/&quot;
    * ksegment ]   ksegment     = alphadigit | *[ alphadigit | &quot;-&quot; |
    * &quot;_&quot; | &quot;.&quot; ]  where &quot;hostname&quot; and
    * &quot;alphadigit&quot; are defined as in RFC 1738.  Example key:
    * spanner.google.com/universe
    */
  var key: js.UndefOr[String] = js.native
  /**
    * An integer value.
    */
  var numValue: js.UndefOr[String] = js.native
  /**
    * A string value.
    */
  var strValue: js.UndefOr[String] = js.native
}

object SchemaLabel {
  @scala.inline
  def apply(key: String = null, numValue: String = null, strValue: String = null): SchemaLabel = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (numValue != null) __obj.updateDynamic("numValue")(numValue.asInstanceOf[js.Any])
    if (strValue != null) __obj.updateDynamic("strValue")(strValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLabel]
  }
}

