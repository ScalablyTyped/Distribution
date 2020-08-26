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
  def apply(): SchemaLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabel]
  }
  @scala.inline
  implicit class SchemaLabelOps[Self <: SchemaLabel] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setNumValue(value: String): Self = this.set("numValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumValue: Self = this.set("numValue", js.undefined)
    @scala.inline
    def setStrValue(value: String): Self = this.set("strValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrValue: Self = this.set("strValue", js.undefined)
  }
  
}

