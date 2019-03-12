package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  def onChangeValue(value: js.Any, prop: java.lang.String, rule: jssLib.jssMod.Rule): js.Any
  def onCreateRule(name: java.lang.String, style: jssLib.cssMod.Style, options: jssLib.jssMod.RuleOptions): jssLib.jssMod.Rule
  def onProcessRule(rule: jssLib.jssMod.Rule, sheet: jssLib.jssMod.StyleSheet[_]): scala.Unit
  def onProcessSheet(sheet: jssLib.jssMod.StyleSheet[_]): scala.Unit
  def onProcessStyle(style: jssLib.cssMod.Style, rule: jssLib.jssMod.Rule, sheet: jssLib.jssMod.StyleSheet[_]): jssLib.cssMod.Style
  def onUpdate(data: js.Object, rule: jssLib.jssMod.Rule, sheet: jssLib.jssMod.StyleSheet[_]): scala.Unit
}

object Anon_Data {
  @scala.inline
  def apply(
    onChangeValue: (js.Any, java.lang.String, jssLib.jssMod.Rule) => js.Any,
    onCreateRule: (java.lang.String, jssLib.cssMod.Style, jssLib.jssMod.RuleOptions) => jssLib.jssMod.Rule,
    onProcessRule: (jssLib.jssMod.Rule, jssLib.jssMod.StyleSheet[_]) => scala.Unit,
    onProcessSheet: jssLib.jssMod.StyleSheet[_] => scala.Unit,
    onProcessStyle: (jssLib.cssMod.Style, jssLib.jssMod.Rule, jssLib.jssMod.StyleSheet[_]) => jssLib.cssMod.Style,
    onUpdate: (js.Object, jssLib.jssMod.Rule, jssLib.jssMod.StyleSheet[_]) => scala.Unit
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(onChangeValue = js.Any.fromFunction3(onChangeValue), onCreateRule = js.Any.fromFunction3(onCreateRule), onProcessRule = js.Any.fromFunction2(onProcessRule), onProcessSheet = js.Any.fromFunction1(onProcessSheet), onProcessStyle = js.Any.fromFunction3(onProcessStyle), onUpdate = js.Any.fromFunction3(onUpdate))
  
    __obj.asInstanceOf[Anon_Data]
  }
}

