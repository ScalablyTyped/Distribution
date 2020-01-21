package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for grouping by findings.
  */
@js.native
trait SchemaGroupFindingsRequest extends js.Object {
  /**
    * Expression that defines the filter to apply across findings. The
    * expression is a list of one or more restrictions combined via logical
    * operators `AND` and `OR`. Parentheses are not supported, and `OR` has
    * higher precedence than `AND`.  Restrictions have the form `&lt;field&gt;
    * &lt;operator&gt; &lt;value&gt;` and may have a `-` character in front of
    * them to indicate negation. Examples include:   * name  *
    * source_properties.a_property  * security_marks.marks.marka  The supported
    * operators are:  * `=` for all value types. * `&gt;`, `&lt;`, `&gt;=`,
    * `&lt;=` for integer values. * `:`, meaning substring matching, for
    * strings.  The supported value types are:  * string literals in quotes. *
    * integer literals without quotes. * boolean literals `true` and `false`
    * without quotes.  For example, `source_properties.size = 100` is a valid
    * filter string.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Expression that defines what assets fields to use for grouping (including
    * `state`). The string value should follow SQL syntax: comma separated list
    * of fields. For example: &quot;parent,resource_name&quot;.  The following
    * fields are supported:  * resource_name * category * state * parent
    */
  var groupBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single response. Default is
    * 10, minimum is 1, maximum is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `GroupFindingsResponse`; indicates that
    * this is a continuation of a prior `GroupFindings` call, and that the
    * system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Time used as a reference point when filtering findings. The filter is
    * limited to findings existing at the supplied time and their values are
    * those at that specific time. Absence of this field will default to the
    * API&#39;s version of NOW.
    */
  var readTime: js.UndefOr[String] = js.native
}

object SchemaGroupFindingsRequest {
  @scala.inline
  def apply(
    filter: String = null,
    groupBy: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    readTime: String = null
  ): SchemaGroupFindingsRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroupFindingsRequest]
  }
}

