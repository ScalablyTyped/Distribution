package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridFilteringMethods extends StObject {
  
  def changeGlobalLanguage(): Unit = js.native
  
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridfiltering#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridfiltering#options:language) or [locale](ui.iggridfiltering#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  /**
    * Changes the the regional settings of widget element to the language specified in [options.regional](ui.iggridfiltering#options:regional)
    * Note that this method is for rare scenarios, use [regional](ui.iggridfiltering#options:regional) option setter
    */
  def changeRegional(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  /**
    * Applies filtering programmatically and updates the UI by default.
    *
    * @param expressions An array of filtering expressions, each one having the format {fieldName: , expr: , cond: , logic: } where  fieldName is the key of the column, expr is the actual expression string with which we would like to filter, logic is 'AND' or 'OR', and cond is one of the following strings: "equals", "doesNotEqual", "contains", "doesNotContain", "greaterThan", "lessThan", "greaterThanOrEqualTo", "lessThanOrEqualTo", "true", "false", "null", "notNull", "empty", "notEmpty", "startsWith", "endsWith", "today", "yesterday", "on", "notOn", "thisMonth", "lastMonth", "nextMonth", "before", "after", "thisYear", "lastYear", "nextYear". The difference between the empty and null filtering conditions is that empty includes null, NaN, and undefined, as well as the empty string.
    * @param updateUI specifies whether the filter row should be also updated once the grid is filtered
    * @param addedFromAdvanced
    */
  def filter(expressions: js.Array[Any]): Unit = js.native
  def filter(expressions: js.Array[Any], updateUI: Boolean): Unit = js.native
  def filter(expressions: js.Array[Any], updateUI: Boolean, addedFromAdvanced: Boolean): Unit = js.native
  def filter(expressions: js.Array[Any], updateUI: Unit, addedFromAdvanced: Boolean): Unit = js.native
  
  /**
    * Returns the count of data records that match filtering conditions
    */
  def getFilteringMatchesCount(): Double = js.native
  
  /**
    * Check whether filterCondition requires or not filtering expression - e.g. if filterCondition is "lastMonth", "thisMonth", "null", "notNull", "true", "false", etc. then filtering expression is NOT required
    *
    * @param filterCondition filtering condition - e.g. "true", "false",  "yesterday", "empty", "null", etc.
    */
  def requiresFilteringExpression(filterCondition: String): Boolean = js.native
  
  /**
    * Toggle filter row when mode is simple or [advancedModeEditorsVisible](ui.iggridfiltering#options:advancedModeEditorsVisible) is true. Otherwise show/hide advanced dialog.
    *
    * @param event Column key
    */
  def toggleFilterRowByFeatureChooser(event: String): Unit = js.native
}
