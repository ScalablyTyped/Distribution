package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridPagingMethods extends StObject {
  
  def changeGlobalLanguage(): Unit = js.native
  
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridpaging#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridpaging#options:language) or [locale](ui.iggridpaging#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  /**
    * Destroys the igGridPaging feature by removing all elements in the pager area, unbinding events, and resetting data to discard data filtering on paging.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets/Sets the current page index, delegates data binding and paging to [$.ig.DataSource](ig.datasource).
    *
    * @param index The page index to go to.
    */
  def pageIndex(): Double = js.native
  def pageIndex(index: Double): Double = js.native
  
  /**
    * Gets/Sets the page size. If no parameter is specified, just returns the current page size.
    *
    * @param size The new page size.
    */
  def pageSize(): Double = js.native
  def pageSize(size: Double): Double = js.native
}
