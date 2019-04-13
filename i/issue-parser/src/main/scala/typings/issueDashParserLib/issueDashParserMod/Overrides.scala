package typings
package issueDashParserLib.issueDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overrides extends Options {
  var actions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  var delimiters: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var hosts: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var issuePrefixes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var issueURLSegments: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var mentionsPrefixes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var overrides: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Overrides {
  @scala.inline
  def apply(
    actions: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    delimiters: java.lang.String | js.Array[java.lang.String] = null,
    hosts: java.lang.String | js.Array[java.lang.String] = null,
    issuePrefixes: java.lang.String | js.Array[java.lang.String] = null,
    issueURLSegments: java.lang.String | js.Array[java.lang.String] = null,
    mentionsPrefixes: java.lang.String | js.Array[java.lang.String] = null,
    overrides: java.lang.String | js.Array[java.lang.String] = null
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

