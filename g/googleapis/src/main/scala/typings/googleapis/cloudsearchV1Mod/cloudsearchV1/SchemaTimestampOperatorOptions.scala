package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to provide a search operator for timestamp properties. This is
  * optional. Search operators let users restrict the query to specific fields
  * relevant to the type of item being searched.
  */
@js.native
trait SchemaTimestampOperatorOptions extends js.Object {
  /**
    * Indicates the operator name required in the query in order to isolate the
    * timestamp property using the greater-than operator. For example, if
    * greaterThanOperatorName is *closedafter* and the property&#39;s name is
    * *closeDate*, then queries like *closedafter:&amp;lt;value&amp;gt;* will
    * show results only where the value of the property named *closeDate* is
    * later than *&amp;lt;value&amp;gt;*. The operator name can only contain
    * lowercase letters (a-z). The maximum length is 32 characters.
    */
  var greaterThanOperatorName: js.UndefOr[String] = js.native
  /**
    * Indicates the operator name required in the query in order to isolate the
    * timestamp property using the less-than operator. For example, if
    * lessThanOperatorName is *closedbefore* and the property&#39;s name is
    * *closeDate*, then queries like *closedbefore:&amp;lt;value&amp;gt;* will
    * show results only where the value of the property named *closeDate* is
    * earlier than *&amp;lt;value&amp;gt;*. The operator name can only contain
    * lowercase letters (a-z). The maximum length is 32 characters.
    */
  var lessThanOperatorName: js.UndefOr[String] = js.native
  /**
    * Indicates the operator name required in the query in order to isolate the
    * timestamp property. For example, if operatorName is *closedon* and the
    * property&#39;s name is *closeDate*, then queries like
    * *closedon:&amp;lt;value&amp;gt;* will show results only where the value
    * of the property named *closeDate* matches *&amp;lt;value&amp;gt;*. By
    * contrast, a search that uses the same *&amp;lt;value&amp;gt;* without an
    * operator will return all items where *&amp;lt;value&amp;gt;* matches the
    * value of any String properties or text within the content field for the
    * item. The operator name can only contain lowercase letters (a-z). The
    * maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.native
}

object SchemaTimestampOperatorOptions {
  @scala.inline
  def apply(): SchemaTimestampOperatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestampOperatorOptions]
  }
  @scala.inline
  implicit class SchemaTimestampOperatorOptionsOps[Self <: SchemaTimestampOperatorOptions] (val x: Self) extends AnyVal {
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
    def setGreaterThanOperatorName(value: String): Self = this.set("greaterThanOperatorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreaterThanOperatorName: Self = this.set("greaterThanOperatorName", js.undefined)
    @scala.inline
    def setLessThanOperatorName(value: String): Self = this.set("lessThanOperatorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLessThanOperatorName: Self = this.set("lessThanOperatorName", js.undefined)
    @scala.inline
    def setOperatorName(value: String): Self = this.set("operatorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatorName: Self = this.set("operatorName", js.undefined)
  }
  
}

