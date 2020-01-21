package typings.markdownIt.rulerMod

import typings.markdownIt.libMod.Rule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ruler[S /* <: typings.markdownIt.stateCoreMod.^ */] extends js.Object {
  def after(afterName: String, ruleName: String, rule: Rule[S]): Unit = js.native
  def after(afterName: String, ruleName: String, rule: Rule[S], options: js.Any): Unit = js.native
  def at(name: String, rule: Rule[S]): Unit = js.native
  def at(name: String, rule: Rule[S], options: js.Any): Unit = js.native
  def before(beforeName: String, ruleName: String, rule: Rule[S]): Unit = js.native
  def before(beforeName: String, ruleName: String, rule: Rule[S], options: js.Any): Unit = js.native
  def disable(rules: String): js.Array[String] = js.native
  def disable(rules: String, ignoreInvalid: Boolean): js.Array[String] = js.native
  def disable(rules: js.Array[String]): js.Array[String] = js.native
  def disable(rules: js.Array[String], ignoreInvalid: Boolean): js.Array[String] = js.native
  def enable(rules: String): js.Array[String] = js.native
  def enable(rules: String, ignoreInvalid: Boolean): js.Array[String] = js.native
  def enable(rules: js.Array[String]): js.Array[String] = js.native
  def enable(rules: js.Array[String], ignoreInvalid: Boolean): js.Array[String] = js.native
  def enableOnly(rule: String): Unit = js.native
  def enableOnly(rule: String, ignoreInvalid: Boolean): Unit = js.native
  def getRules(chain: String): js.Array[Rule[S]] = js.native
  def push(ruleName: String, rule: Rule[S]): Unit = js.native
  def push(ruleName: String, rule: Rule[S], options: js.Any): Unit = js.native
}

