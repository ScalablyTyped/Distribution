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
    onChangeValue: js.Function3[js.Any, java.lang.String, jssLib.jssMod.Rule, js.Any],
    onCreateRule: js.Function3[java.lang.String, jssLib.cssMod.Style, jssLib.jssMod.RuleOptions, jssLib.jssMod.Rule],
    onProcessRule: js.Function2[jssLib.jssMod.Rule, jssLib.jssMod.StyleSheet[_], scala.Unit],
    onProcessSheet: js.Function1[jssLib.jssMod.StyleSheet[_], scala.Unit],
    onProcessStyle: js.Function3[
      jssLib.cssMod.Style, 
      jssLib.jssMod.Rule, 
      jssLib.jssMod.StyleSheet[_], 
      jssLib.cssMod.Style
    ],
    onUpdate: js.Function3[js.Object, jssLib.jssMod.Rule, jssLib.jssMod.StyleSheet[_], scala.Unit]
  ): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onChangeValue")(onChangeValue)
    __obj.updateDynamic("onCreateRule")(onCreateRule)
    __obj.updateDynamic("onProcessRule")(onProcessRule)
    __obj.updateDynamic("onProcessSheet")(onProcessSheet)
    __obj.updateDynamic("onProcessStyle")(onProcessStyle)
    __obj.updateDynamic("onUpdate")(onUpdate)
    __obj.asInstanceOf[Anon_Data]
  }
}

