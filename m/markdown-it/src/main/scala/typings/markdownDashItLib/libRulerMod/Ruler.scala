package typings
package markdownDashItLib.libRulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ruler[S /* <: markdownDashItLib.libRulesUnderscoreCoreStateUnderscoreCoreMod.^ */] extends js.Object {
  def after(afterName: java.lang.String, ruleName: java.lang.String, rule: markdownDashItLib.libMod.Rule[S]): scala.Unit = js.native
  def after(
    afterName: java.lang.String,
    ruleName: java.lang.String,
    rule: markdownDashItLib.libMod.Rule[S],
    options: js.Any
  ): scala.Unit = js.native
  def at(name: java.lang.String, rule: markdownDashItLib.libMod.Rule[S]): scala.Unit = js.native
  def at(name: java.lang.String, rule: markdownDashItLib.libMod.Rule[S], options: js.Any): scala.Unit = js.native
  def before(beforeName: java.lang.String, ruleName: java.lang.String, rule: markdownDashItLib.libMod.Rule[S]): scala.Unit = js.native
  def before(
    beforeName: java.lang.String,
    ruleName: java.lang.String,
    rule: markdownDashItLib.libMod.Rule[S],
    options: js.Any
  ): scala.Unit = js.native
  def disable(rules: java.lang.String): js.Array[java.lang.String] = js.native
  def disable(rules: java.lang.String, ignoreInvalid: scala.Boolean): js.Array[java.lang.String] = js.native
  def disable(rules: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def disable(rules: js.Array[java.lang.String], ignoreInvalid: scala.Boolean): js.Array[java.lang.String] = js.native
  def enable(rules: java.lang.String): js.Array[java.lang.String] = js.native
  def enable(rules: java.lang.String, ignoreInvalid: scala.Boolean): js.Array[java.lang.String] = js.native
  def enable(rules: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def enable(rules: js.Array[java.lang.String], ignoreInvalid: scala.Boolean): js.Array[java.lang.String] = js.native
  def enableOnly(rule: java.lang.String): scala.Unit = js.native
  def enableOnly(rule: java.lang.String, ignoreInvalid: scala.Boolean): scala.Unit = js.native
  def getRules(chain: java.lang.String): js.Array[markdownDashItLib.libMod.Rule[S]] = js.native
  def push(ruleName: java.lang.String, rule: markdownDashItLib.libMod.Rule[S]): scala.Unit = js.native
  def push(ruleName: java.lang.String, rule: markdownDashItLib.libMod.Rule[S], options: js.Any): scala.Unit = js.native
}

