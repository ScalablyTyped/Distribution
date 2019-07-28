package typings.linkifyDashIssues.linkifyDashIssuesMod

import org.scalablytyped.runtime.StringDictionary
import typings.linkifyDashIssues.linkifyDashIssuesStrings.dom
import typings.linkifyDashIssues.linkifyDashIssuesStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		HTML attributes to add to the link.
  		*/
  var attributes: js.UndefOr[StringDictionary[String | Double | Boolean | js.Array[String]]] = js.undefined
  /**
  		Base URL.
  		@default 'https://github.com'
  		*/
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
  		GitHub repository.
  		*/
  var repository: String
  /**
  		Format of the generated content.
  		`'string'` will return it as a flat string like `'See <a href="https://github.com/sindresorhus/dofle/issue/143">#143</a>'`.
  		`'dom'` will return it as a `DocumentFragment` ready to be appended in a DOM safely, like `DocumentFragment(TextNode('See '), HTMLAnchorElement('#143'))`. This type only works in the browser.
  		@default 'string'
  		*/
  var `type`: js.UndefOr[string | dom] = js.undefined
  /**
  		GitHub user.
  		*/
  var user: String
}

object Options {
  @scala.inline
  def apply(
    repository: String,
    user: String,
    attributes: StringDictionary[String | Double | Boolean | js.Array[String]] = null,
    baseUrl: String = null,
    `type`: string | dom = null
  ): Options = {
    val __obj = js.Dynamic.literal(repository = repository, user = user)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

