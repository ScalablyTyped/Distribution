package typings.jupyterlabExtensionmanager.widgetMod.ListView

import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.black
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.default
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.installed
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.invalid
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.searchResult
import typings.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.white
import typings.jupyterlabExtensionmanager.modelMod.Action
import typings.jupyterlabExtensionmanager.modelMod.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProperties extends js.Object {
  
  /**
    * The extension entries to display.
    */
  var entries: js.Array[IEntry] = js.native
  
  /**
    * The list mode to apply.
    */
  var listMode: black | white | default | invalid = js.native
  
  /**
    * The number of pages that can be viewed via pagination.
    */
  var numPages: Double = js.native
  
  /**
    * The callback to use for changing the page
    */
  def onPage(page: Double): Unit = js.native
  
  /**
    * Callback to use for performing an action on an entry.
    */
  def performAction(action: Action, entry: IEntry): Unit = js.native
  
  /**
    * The requested view type.
    */
  var viewType: installed | searchResult = js.native
}
object IProperties {
  
  @scala.inline
  def apply(
    entries: js.Array[IEntry],
    listMode: black | white | default | invalid,
    numPages: Double,
    onPage: Double => Unit,
    performAction: (Action, IEntry) => Unit,
    viewType: installed | searchResult
  ): IProperties = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], listMode = listMode.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any], onPage = js.Any.fromFunction1(onPage), performAction = js.Any.fromFunction2(performAction), viewType = viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperties]
  }
  
  @scala.inline
  implicit class IPropertiesOps[Self <: IProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntriesVarargs(value: IEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[IEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListMode(value: black | white | default | invalid): Self = this.set("listMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPages(value: Double): Self = this.set("numPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPage(value: Double => Unit): Self = this.set("onPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPerformAction(value: (Action, IEntry) => Unit): Self = this.set("performAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setViewType(value: installed | searchResult): Self = this.set("viewType", value.asInstanceOf[js.Any])
  }
}
