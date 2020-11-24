package typings.jestMatcherUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-matcher-utils", "matcherHint")
@js.native
object matcherHint extends js.Object {
  
  def apply(matcherName: String): String = js.native
  def apply(
    matcherName: String,
    received: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    options: MatcherHintOptions
  ): String = js.native
  def apply(matcherName: String, received: js.UndefOr[scala.Nothing], expected: String): String = js.native
  def apply(
    matcherName: String,
    received: js.UndefOr[scala.Nothing],
    expected: String,
    options: MatcherHintOptions
  ): String = js.native
  def apply(matcherName: String, received: String): String = js.native
  def apply(
    matcherName: String,
    received: String,
    expected: js.UndefOr[scala.Nothing],
    options: MatcherHintOptions
  ): String = js.native
  def apply(matcherName: String, received: String, expected: String): String = js.native
  def apply(matcherName: String, received: String, expected: String, options: MatcherHintOptions): String = js.native
}
