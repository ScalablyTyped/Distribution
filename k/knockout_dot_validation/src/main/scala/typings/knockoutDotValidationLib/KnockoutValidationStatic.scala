package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutValidationStatic extends js.Object {
  var rules: KnockoutValidationRuleDefinitions = js.native
  var utils: KnockoutValidationUtils = js.native
  def addAnonymousRule(observable: knockoutLib.KnockoutObservable[_], ruleObj: KnockoutValidationAnonymousRuleDefinition): scala.Unit = js.native
  def addExtender(ruleName: java.lang.String): scala.Unit = js.native
  def addRule[T](observable: knockoutLib.KnockoutObservable[T], rule: KnockoutValidationRule): knockoutLib.KnockoutObservable[T] = js.native
  def defineLocale(newLocale: java.lang.String, msgTranslations: KnockoutValidationLocalizationDictionary): KnockoutValidationLocalizationDictionary = js.native
  def formatMessage(message: java.lang.String, params: java.lang.String): java.lang.String = js.native
  def group(obj: js.Any): KnockoutValidationErrors = js.native
  def group(obj: js.Any, options: js.Any): KnockoutValidationErrors = js.native
  def init(): scala.Unit = js.native
  def init(options: KnockoutValidationConfiguration): scala.Unit = js.native
  def init(options: KnockoutValidationConfiguration, force: scala.Boolean): scala.Unit = js.native
  def insertValidationMessage(element: stdLib.Element): stdLib.Element = js.native
  def locale(newLocale: java.lang.String): java.lang.String = js.native
  def localize(msgTranslations: KnockoutValidationLocalizationDictionary): scala.Unit = js.native
  def parseInputValidationAttributes(element: stdLib.Element, valueAccessor: js.Function0[knockoutLib.KnockoutObservable[_]]): scala.Unit = js.native
  def registerExtenders(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def validateObservable(observable: knockoutLib.KnockoutObservable[_]): scala.Boolean = js.native
}

