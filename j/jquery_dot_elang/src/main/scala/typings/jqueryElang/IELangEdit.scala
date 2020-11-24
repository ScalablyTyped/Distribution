package typings.jqueryElang

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IELangEdit extends IELangBase {
  
  def _insert(): Unit = js.native
  
  def _modify(): Unit = js.native
  
  def _onAddClick(key: HTMLInputElement, value: HTMLInputElement): Unit = js.native
  
  def _onInsert(): Unit = js.native
  
  def _onInsertCallback(): Unit = js.native
  
  def _onModify(): Unit = js.native
  
  def _onModifyCallback(): Unit = js.native
  
  def _onRemove(): Unit = js.native
  
  def _onRemoveCallback(): Unit = js.native
  
  def _onSelect(): Unit = js.native
  
  def _onSelectCallback(): Unit = js.native
  
  def _remove(): Unit = js.native
  
  def _select(): Unit = js.native
  
  @JSName("defaults")
  var defaults_IELangEdit: IELangEditDefaults = js.native
  
  @JSName("delegates")
  var delegates_IELangEdit: IELangEditDelegates = js.native
  
  @JSName("events")
  var events_IELangEdit: IELangEditEvents = js.native
}
