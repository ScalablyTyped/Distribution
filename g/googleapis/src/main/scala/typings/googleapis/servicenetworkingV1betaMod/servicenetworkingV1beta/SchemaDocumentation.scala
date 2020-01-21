package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Documentation` provides the information for describing a service. Example:
  * &lt;pre&gt;&lt;code&gt;documentation:   summary: &gt;     The Google
  * Calendar API gives access     to most calendar features.   pages:   - name:
  * Overview     content: &amp;#40;== include google/foo/overview.md
  * ==&amp;#41;   - name: Tutorial     content: &amp;#40;== include
  * google/foo/tutorial.md ==&amp;#41;     subpages;     - name: Java content:
  * &amp;#40;== include google/foo/tutorial_java.md ==&amp;#41;   rules:   -
  * selector: google.calendar.Calendar.Get     description: &gt;       ...   -
  * selector: google.calendar.Calendar.Put     description: &gt;       ...
  * &lt;/code&gt;&lt;/pre&gt; Documentation is provided in markdown syntax. In
  * addition to standard markdown features, definition lists, tables and fenced
  * code blocks are supported. Section headers can be provided and are
  * interpreted relative to the section nesting of the context where a
  * documentation fragment is embedded.  Documentation from the IDL is merged
  * with documentation defined via the config at normalization time, where
  * documentation provided by config rules overrides IDL provided.  A number of
  * constructs specific to the API platform are supported in documentation
  * text.  In order to reference a proto element, the following notation can be
  * used:
  * &lt;pre&gt;&lt;code&gt;&amp;#91;fully.qualified.proto.name]&amp;#91;]&lt;/code&gt;&lt;/pre&gt;
  * To override the display text used for the link, this can be used:
  * &lt;pre&gt;&lt;code&gt;&amp;#91;display
  * text]&amp;#91;fully.qualified.proto.name]&lt;/code&gt;&lt;/pre&gt; Text can
  * be excluded from doc using the following notation:
  * &lt;pre&gt;&lt;code&gt;&amp;#40;-- internal comment
  * --&amp;#41;&lt;/code&gt;&lt;/pre&gt;  A few directives are available in
  * documentation. Note that directives must appear on a single line to be
  * properly identified. The `include` directive includes a markdown file from
  * an external source: &lt;pre&gt;&lt;code&gt;&amp;#40;== include path/to/file
  * ==&amp;#41;&lt;/code&gt;&lt;/pre&gt; The `resource_for` directive marks a
  * message to be the resource of a collection in REST view. If it is not
  * specified, tools attempt to infer the resource from the operations in a
  * collection: &lt;pre&gt;&lt;code&gt;&amp;#40;== resource_for
  * v1.shelves.books ==&amp;#41;&lt;/code&gt;&lt;/pre&gt; The directive
  * `suppress_warning` does not directly affect documentation and is documented
  * together with service config validation.
  */
@js.native
trait SchemaDocumentation extends js.Object {
  /**
    * The URL to the root of documentation.
    */
  var documentationRootUrl: js.UndefOr[String] = js.native
  /**
    * Declares a single overview page. For example:
    * &lt;pre&gt;&lt;code&gt;documentation:   summary: ...   overview:
    * &amp;#40;== include overview.md ==&amp;#41; &lt;/code&gt;&lt;/pre&gt;
    * This is a shortcut for the following declaration (using pages style):
    * &lt;pre&gt;&lt;code&gt;documentation:   summary: ...   pages:   - name:
    * Overview     content: &amp;#40;== include overview.md ==&amp;#41;
    * &lt;/code&gt;&lt;/pre&gt; Note: you cannot specify both `overview` field
    * and `pages` field.
    */
  var overview: js.UndefOr[String] = js.native
  /**
    * The top level pages for the documentation set.
    */
  var pages: js.UndefOr[js.Array[SchemaPage]] = js.native
  /**
    * A list of documentation rules that apply to individual API elements.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaDocumentationRule]] = js.native
  /**
    * A short summary of what the service does. Can only be provided by plain
    * text.
    */
  var summary: js.UndefOr[String] = js.native
}

object SchemaDocumentation {
  @scala.inline
  def apply(
    documentationRootUrl: String = null,
    overview: String = null,
    pages: js.Array[SchemaPage] = null,
    rules: js.Array[SchemaDocumentationRule] = null,
    summary: String = null
  ): SchemaDocumentation = {
    val __obj = js.Dynamic.literal()
    if (documentationRootUrl != null) __obj.updateDynamic("documentationRootUrl")(documentationRootUrl.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDocumentation]
  }
}

