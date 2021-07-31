package typings.knockoutValidation

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationStatic extends StObject {
  
  def addAnonymousRule(
    observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
    ruleObj: KnockoutValidationAnonymousRuleDefinition
  ): Unit = js.native
  
  def addExtender(ruleName: String): Unit = js.native
  
  def addRule[T](
    observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T> */ js.Any,
    rule: KnockoutValidationRule
  ): js.Any = js.native
  
  def defineLocale(newLocale: String, msgTranslations: KnockoutValidationLocalizationDictionary): KnockoutValidationLocalizationDictionary = js.native
  
  def formatMessage(message: String, params: String): String = js.native
  
  def group(obj: js.Any): KnockoutValidationErrors = js.native
  def group(obj: js.Any, options: js.Any): KnockoutValidationErrors = js.native
  
  def init(): Unit = js.native
  def init(options: Unit, force: Boolean): Unit = js.native
  def init(options: KnockoutValidationConfiguration): Unit = js.native
  def init(options: KnockoutValidationConfiguration, force: Boolean): Unit = js.native
  
  def insertValidationMessage(element: Element): Element = js.native
  
  def locale(newLocale: String): String = js.native
  
  def localize(msgTranslations: KnockoutValidationLocalizationDictionary): Unit = js.native
  
  def parseInputValidationAttributes(
    element: Element,
    valueAccessor: js.Function0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
    ]
  ): Unit = js.native
  
  def registerExtenders(): Unit = js.native
  
  def reset(): Unit = js.native
  
  var rules: KnockoutValidationRuleDefinitions = js.native
  
  var utils: KnockoutValidationUtils = js.native
  
  def validateObservable(
    observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
  ): Boolean = js.native
}
