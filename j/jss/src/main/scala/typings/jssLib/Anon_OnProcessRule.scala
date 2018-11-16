package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_OnProcessRule extends js.Object {
  def onChangeValue(value: js.Any, prop: java.lang.String, rule: jssLib.jssMod.Rule): js.Any
  def onCreateRule(name: java.lang.String, style: jssLib.cssMod.Style, options: jssLib.jssMod.RuleOptions): jssLib.jssMod.Rule
  def onProcessRule(rule: jssLib.jssMod.Rule, sheet: jssLib.jssMod.StyleSheet[_]): scala.Unit
  def onProcessSheet(sheet: jssLib.jssMod.StyleSheet[_]): scala.Unit
  def onProcessStyle(style: jssLib.cssMod.Style, rule: jssLib.jssMod.Rule, sheet: jssLib.jssMod.StyleSheet[_]): jssLib.cssMod.Style
  def onUpdate(data: js.Object, rule: jssLib.jssMod.Rule, sheet: jssLib.jssMod.StyleSheet[_]): scala.Unit
}

