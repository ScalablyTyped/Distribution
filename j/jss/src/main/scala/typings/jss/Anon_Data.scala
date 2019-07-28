package typings.jss

import typings.jss.cssMod.Style
import typings.jss.jssMod.Rule
import typings.jss.jssMod.RuleOptions
import typings.jss.jssMod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  def onChangeValue(value: js.Any, prop: String, rule: Rule): js.Any
  def onCreateRule(name: String, style: Style, options: RuleOptions): Rule
  def onProcessRule(rule: Rule, sheet: StyleSheet[_]): Unit
  def onProcessSheet(sheet: StyleSheet[_]): Unit
  def onProcessStyle(style: Style, rule: Rule, sheet: StyleSheet[_]): Style
  def onUpdate(data: js.Object, rule: Rule, sheet: StyleSheet[_]): Unit
}

object Anon_Data {
  @scala.inline
  def apply(
    onChangeValue: (js.Any, String, Rule) => js.Any,
    onCreateRule: (String, Style, RuleOptions) => Rule,
    onProcessRule: (Rule, StyleSheet[_]) => Unit,
    onProcessSheet: StyleSheet[_] => Unit,
    onProcessStyle: (Style, Rule, StyleSheet[_]) => Style,
    onUpdate: (js.Object, Rule, StyleSheet[_]) => Unit
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(onChangeValue = js.Any.fromFunction3(onChangeValue), onCreateRule = js.Any.fromFunction3(onCreateRule), onProcessRule = js.Any.fromFunction2(onProcessRule), onProcessSheet = js.Any.fromFunction1(onProcessSheet), onProcessStyle = js.Any.fromFunction3(onProcessStyle), onUpdate = js.Any.fromFunction3(onUpdate))
  
    __obj.asInstanceOf[Anon_Data]
  }
}

