package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to provide a search operator for text properties. This is optional.
  * Search operators let users restrict the query to specific fields relevant
  * to the type of item being searched.
  */
@js.native
trait SchemaTextOperatorOptions extends js.Object {
  /**
    * If true, the text value will be tokenized as one atomic value in operator
    * searches and facet matches. For example, if the operator name is
    * &quot;genre&quot; and the value is &quot;science-fiction&quot; the query
    * restrictions &quot;genre:science&quot; and &quot;genre:fiction&quot; will
    * not match the item; &quot;genre:science-fiction&quot; will. Value
    * matching is case-sensitive and does not remove special characters. If
    * false, the text will be tokenized. For example, if the value is
    * &quot;science-fiction&quot; the queries &quot;genre:science&quot; and
    * &quot;genre:fiction&quot; will match the item.
    */
  var exactMatchWithOperator: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the operator name required in the query in order to isolate the
    * text property. For example, if operatorName is *subject* and the
    * property&#39;s name is *subjectLine*, then queries like
    * *subject:&amp;lt;value&amp;gt;* will show results only where the value of
    * the property named *subjectLine* matches *&amp;lt;value&amp;gt;*. By
    * contrast, a search that uses the same *&amp;lt;value&amp;gt;* without an
    * operator will return all items where *&amp;lt;value&amp;gt;* matches the
    * value of any text properties or text within the content field for the
    * item. The operator name can only contain lowercase letters (a-z). The
    * maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.native
}

object SchemaTextOperatorOptions {
  @scala.inline
  def apply(exactMatchWithOperator: js.UndefOr[Boolean] = js.undefined, operatorName: String = null): SchemaTextOperatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exactMatchWithOperator)) __obj.updateDynamic("exactMatchWithOperator")(exactMatchWithOperator.get.asInstanceOf[js.Any])
    if (operatorName != null) __obj.updateDynamic("operatorName")(operatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextOperatorOptions]
  }
}

