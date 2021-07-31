package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPieChartMethods extends StObject {
  
  /**
    * Adds a new item to the data source and notifies the chart.
    *
    * @param item the new item that will be added to the data source.
    */
  def addItem(item: js.Object): Unit = js.native
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
    *
    * @param $container Optional parameter - if not set it would use the element of the widget as $container
    */
  def changeLocale($container: js.Object): Unit = js.native
  
  /**
    * Destroys the widget.
    */
  def destroy(): Unit = js.native
  
  /**
    * Exports the chart to a PNG image.
    *
    * @param width The width of the image.
    * @param height The height of the image.
    */
  def exportImage(): js.Object = js.native
  def exportImage(width: js.Object): js.Object = js.native
  def exportImage(width: js.Object, height: js.Object): js.Object = js.native
  def exportImage(width: Unit, height: js.Object): js.Object = js.native
  
  /**
    * Exports visual data from the pie chart to aid in unit testing
    */
  def exportVisualData(): Unit = js.native
  
  /**
    * Forces any pending deferred work to render on the chart before continuing
    */
  def flush(): Unit = js.native
  
  /**
    * Returns data that the pie chart is bound to.
    */
  def getData(): js.Object = js.native
  
  /**
    * Returns the ID of parent element holding the chart.
    */
  def id(): String = js.native
  
  /**
    * Inserts a new item to the data source and notifies the chart.
    *
    * @param item the new item that will be inserted in the data source.
    * @param index The index in the data source where the new item will be inserted.
    */
  def insertItem(item: js.Object, index: Double): Unit = js.native
  
  def option(): Unit = js.native
  
  /**
    * Creates a print preview page with the chart, hiding all other elements on the page.
    */
  def print(): Unit = js.native
  
  /**
    * Deletes an item from the data source and notifies the chart.
    *
    * @param index The index in the data source from where the item will be been removed.
    */
  def removeItem(index: Double): Unit = js.native
  
  /**
    * Updates an item in the data source and notifies the chart.
    *
    * @param index The index in the data source that we want to change.
    * @param item the new item that we want to set in the data source.
    */
  def setItem(index: Double, item: js.Object): Unit = js.native
  
  /**
    * Returns the element holding the chart.
    */
  def widget(): Unit = js.native
}
