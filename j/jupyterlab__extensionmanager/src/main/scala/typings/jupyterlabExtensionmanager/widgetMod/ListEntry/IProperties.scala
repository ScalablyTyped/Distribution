package typings.jupyterlabExtensionmanager.widgetMod.ListEntry

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
    * The entry to visualize.
    */
  var entry: IEntry = js.native
  
  /**
    * The list mode to apply.
    */
  var listMode: black | white | default | invalid = js.native
  
  /**
    * Callback to use for performing an action on the entry.
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
    entry: IEntry,
    listMode: black | white | default | invalid,
    performAction: (Action, IEntry) => Unit,
    viewType: installed | searchResult
  ): IProperties = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], listMode = listMode.asInstanceOf[js.Any], performAction = js.Any.fromFunction2(performAction), viewType = viewType.asInstanceOf[js.Any])
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
    def setEntry(value: IEntry): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListMode(value: black | white | default | invalid): Self = this.set("listMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformAction(value: (Action, IEntry) => Unit): Self = this.set("performAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setViewType(value: installed | searchResult): Self = this.set("viewType", value.asInstanceOf[js.Any])
  }
}
