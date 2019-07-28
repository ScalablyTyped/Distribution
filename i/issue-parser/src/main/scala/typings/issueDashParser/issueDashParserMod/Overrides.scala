package typings.issueDashParser.issueDashParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overrides extends Options {
  var actions: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var delimiters: js.UndefOr[String | js.Array[String]] = js.undefined
  var hosts: js.UndefOr[String | js.Array[String]] = js.undefined
  var issuePrefixes: js.UndefOr[String | js.Array[String]] = js.undefined
  var issueURLSegments: js.UndefOr[String | js.Array[String]] = js.undefined
  var mentionsPrefixes: js.UndefOr[String | js.Array[String]] = js.undefined
  var overrides: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Overrides {
  @scala.inline
  def apply(
    actions: StringDictionary[js.Array[String]] = null,
    delimiters: String | js.Array[String] = null,
    hosts: String | js.Array[String] = null,
    issuePrefixes: String | js.Array[String] = null,
    issueURLSegments: String | js.Array[String] = null,
    mentionsPrefixes: String | js.Array[String] = null,
    overrides: String | js.Array[String] = null
  ): Overrides = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (issuePrefixes != null) __obj.updateDynamic("issuePrefixes")(issuePrefixes.asInstanceOf[js.Any])
    if (issueURLSegments != null) __obj.updateDynamic("issueURLSegments")(issueURLSegments.asInstanceOf[js.Any])
    if (mentionsPrefixes != null) __obj.updateDynamic("mentionsPrefixes")(mentionsPrefixes.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overrides]
  }
}

