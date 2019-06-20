package typings
package linkifyDashIssuesLib.linkifyDashIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		HTML attributes to add to the link.
  		*/
  var attributes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Array[java.lang.String]]
  ] = js.undefined
  /**
  		Base URL.
  		@default 'https://github.com'
  		*/
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  		GitHub repository.
  		*/
  var repository: java.lang.String
  /**
  		Format of the generated content.
  		`'string'` will return it as a flat string like `'See <a href="https://github.com/sindresorhus/dofle/issue/143">#143</a>'`.
  		`'dom'` will return it as a `DocumentFragment` ready to be appended in a DOM safely, like `DocumentFragment(TextNode('See '), HTMLAnchorElement('#143'))`. This type only works in the browser.
  		@default 'string'
  		*/
  var `type`: js.UndefOr[
    linkifyDashIssuesLib.linkifyDashIssuesLibStrings.string | linkifyDashIssuesLib.linkifyDashIssuesLibStrings.dom
  ] = js.undefined
  /**
  		GitHub user.
  		*/
  var user: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    repository: java.lang.String,
    user: java.lang.String,
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Array[java.lang.String]] = null,
    baseUrl: java.lang.String = null,
    `type`: linkifyDashIssuesLib.linkifyDashIssuesLibStrings.string | linkifyDashIssuesLib.linkifyDashIssuesLibStrings.dom = null
  ): Options = {
    val __obj = js.Dynamic.literal(repository = repository, user = user)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

