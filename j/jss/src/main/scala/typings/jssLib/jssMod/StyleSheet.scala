package typings
package jssLib.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSheet[RuleName /* <: java.lang.String */] extends js.Object {
  var attached: scala.Boolean = js.native
  // Gives auto-completion on the rules declared in `createStyleSheet` without
  // causing errors for rules added dynamically after creation.
  var classes: Classes[RuleName] = js.native
  var linked: scala.Boolean = js.native
  var options: RuleOptions = js.native
  def addRule(name: RuleName, style: jssLib.cssMod.Style): Rule = js.native
  def addRule(name: RuleName, style: jssLib.cssMod.Style, options: stdLib.Partial[RuleOptions]): Rule = js.native
  /**
  	 * Add a rule to the current stylesheet.
  	 * Will insert a rule also after the stylesheet has been rendered first time.
  	 */
  def addRule(style: jssLib.cssMod.Style): Rule = js.native
  def addRule(style: jssLib.cssMod.Style, options: stdLib.Partial[RuleOptions]): Rule = js.native
  /**
  	 * Create and add rules.
  	 * Will render also after Style Sheet was rendered the first time.
  	 */
  def addRules(styles: stdLib.Partial[Styles[RuleName]]): js.Array[Rule] = js.native
  def addRules(styles: stdLib.Partial[Styles[RuleName]], options: stdLib.Partial[RuleOptions]): js.Array[Rule] = js.native
  /**
  	 * Attach renderable to the render tree.
  	 */
  def attach(): this.type = js.native
  /**
  	 * Delete a rule by name.
  	 * Returns `true`: if rule has been deleted from the DOM.
  	 */
  def deleteRule(name: RuleName): scala.Boolean = js.native
  /**
  	 * Remove renderable from render tree.
  	 */
  def detach(): this.type = js.native
  /**
  	 * Get a rule by name.
  	 */
  def getRule(name: RuleName): Rule = js.native
  /**
  	 * Get index of a rule.
  	 */
  def indexOf(rule: Rule): scala.Double = js.native
  def toString(options: ToCssOptions): java.lang.String = js.native
  /**
  	 * Update the function values with a new data.
  	 */
  def update(): this.type = js.native
  def update(data: js.Object): this.type = js.native
  def update(name: RuleName, data: js.Object): this.type = js.native
}

