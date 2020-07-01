package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Partial results from a streaming read or SQL query. Streaming reads and SQL
  * queries better tolerate large result sets, large rows, and large values,
  * but are a little trickier to consume.
  */
@js.native
trait SchemaPartialResultSet extends js.Object {
  /**
    * If true, then the final value in values is chunked, and must be combined
    * with more values from subsequent `PartialResultSet`s to obtain a complete
    * field value.
    */
  var chunkedValue: js.UndefOr[Boolean] = js.native
  /**
    * Metadata about the result set, such as row type information. Only present
    * in the first response.
    */
  var metadata: js.UndefOr[SchemaResultSetMetadata] = js.native
  /**
    * Streaming calls might be interrupted for a variety of reasons, such as
    * TCP connection loss. If this occurs, the stream of results can be resumed
    * by re-sending the original request and including `resume_token`. Note
    * that executing any other transaction in the same session invalidates the
    * token.
    */
  var resumeToken: js.UndefOr[String] = js.native
  /**
    * Query plan and execution statistics for the statement that produced this
    * streaming result set. These can be requested by setting
    * ExecuteSqlRequest.query_mode and are sent only once with the last
    * response in the stream. This field will also be present in the last
    * response for DML statements.
    */
  var stats: js.UndefOr[SchemaResultSetStats] = js.native
  /**
    * A streamed result set consists of a stream of values, which might be
    * split into many `PartialResultSet` messages to accommodate large rows
    * and/or large values. Every N complete values defines a row, where N is
    * equal to the number of entries in metadata.row_type.fields.  Most values
    * are encoded based on type as described here.  It is possible that the
    * last value in values is &quot;chunked&quot;, meaning that the rest of the
    * value is sent in subsequent `PartialResultSet`(s). This is denoted by the
    * chunked_value field. Two or more chunked values can be merged to form a
    * complete value as follows:    * `bool/number/null`: cannot be chunked   *
    * `string`: concatenate the strings   * `list`: concatenate the lists. If
    * the last element in a list is a     `string`, `list`, or `object`, merge
    * it with the first element in     the next list by applying these rules
    * recursively.   * `object`: concatenate the (field name, field value)
    * pairs. If a     field name is duplicated, then apply these rules
    * recursively     to merge the field values.  Some examples of merging: #
    * Strings are concatenated.     &quot;foo&quot;, &quot;bar&quot; =&gt;
    * &quot;foobar&quot;      # Lists of non-strings are concatenated.     [2,
    * 3], [4] =&gt; [2, 3, 4]      # Lists are concatenated, but the last and
    * first elements are merged     # because they are strings. [&quot;a&quot;,
    * &quot;b&quot;], [&quot;c&quot;, &quot;d&quot;] =&gt; [&quot;a&quot;,
    * &quot;bc&quot;, &quot;d&quot;]      # Lists are concatenated, but the
    * last and first elements are merged     # because they are lists.
    * Recursively, the last and first elements     # of the inner lists are
    * merged because they are strings.     [&quot;a&quot;, [&quot;b&quot;,
    * &quot;c&quot;]], [[&quot;d&quot;], &quot;e&quot;] =&gt; [&quot;a&quot;,
    * [&quot;b&quot;, &quot;cd&quot;], &quot;e&quot;]      # Non-overlapping
    * object fields are combined.     {&quot;a&quot;: &quot;1&quot;},
    * {&quot;b&quot;: &quot;2&quot;} =&gt; {&quot;a&quot;: &quot;1&quot;,
    * &quot;b&quot;: 2&quot;}      # Overlapping object fields are merged.
    * {&quot;a&quot;: &quot;1&quot;}, {&quot;a&quot;: &quot;2&quot;} =&gt;
    * {&quot;a&quot;: &quot;12&quot;}      # Examples of merging objects
    * containing lists of strings.     {&quot;a&quot;: [&quot;1&quot;]},
    * {&quot;a&quot;: [&quot;2&quot;]} =&gt; {&quot;a&quot;: [&quot;12&quot;]}
    * For a more complete example, suppose a streaming SQL query is yielding a
    * result set whose rows contain a single string field. The following
    * `PartialResultSet`s might be yielded:      {       &quot;metadata&quot;:
    * { ... }       &quot;values&quot;: [&quot;Hello&quot;, &quot;W&quot;]
    * &quot;chunked_value&quot;: true       &quot;resume_token&quot;:
    * &quot;Af65...&quot;     }     {       &quot;values&quot;:
    * [&quot;orl&quot;]       &quot;chunked_value&quot;: true
    * &quot;resume_token&quot;: &quot;Bqp2...&quot;     }     {
    * &quot;values&quot;: [&quot;d&quot;]       &quot;resume_token&quot;:
    * &quot;Zx1B...&quot;     }  This sequence of `PartialResultSet`s encodes
    * two rows, one containing the field value `&quot;Hello&quot;`, and a
    * second containing the field value `&quot;World&quot; = &quot;W&quot; +
    * &quot;orl&quot; + &quot;d&quot;`.
    */
  var values: js.UndefOr[js.Array[_]] = js.native
}

object SchemaPartialResultSet {
  @scala.inline
  def apply(
    chunkedValue: js.UndefOr[Boolean] = js.undefined,
    metadata: SchemaResultSetMetadata = null,
    resumeToken: String = null,
    stats: SchemaResultSetStats = null,
    values: js.Array[_] = null
  ): SchemaPartialResultSet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkedValue)) __obj.updateDynamic("chunkedValue")(chunkedValue.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPartialResultSet]
  }
}

