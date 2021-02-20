package typings.historyJs

import typings.historyJs.anon.HashChange
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Since History is defined in lib.d.ts as well
// the name for our interfaces was chosen to be Historyjs
// However at runtime you would need to do
// https://github.com/DefinitelyTyped/DefinitelyTyped/issues/277
// var Historyjs: Historyjs = <any>History;
@js.native
trait Historyjs extends StObject {
  
  var Adapter: HistoryAdapter = js.native
  
  def back(): Unit = js.native
  
  def clearAllIntervals(): Unit = js.native
  
  def clearQueue(): Historyjs = js.native
  
  def debug(messages: js.Any*): Unit = js.native
  
  var emulated: HashChange = js.native
  
  var enabled: Boolean = js.native
  
  def forward(): Unit = js.native
  
  def getCurrentIndex(): Double = js.native
  
  def getHash(): String = js.native
  
  def getRootUrl(): String = js.native
  
  def getState(): HistoryState = js.native
  def getState(friendly: js.UndefOr[scala.Nothing], create: Boolean): HistoryState = js.native
  def getState(friendly: Boolean): HistoryState = js.native
  def getState(friendly: Boolean, create: Boolean): HistoryState = js.native
  
  def getStateById(id: String): HistoryState = js.native
  
  def getStateByIndex(index: Double): HistoryState = js.native
  
  def getStateId(passedState: HistoryState): String = js.native
  
  def go(x: Number): Unit = js.native
  
  def log(messages: js.Any*): Unit = js.native
  
  var options: HistoryOptions = js.native
  
  def pushState(data: js.Any, title: String, url: String): Boolean = js.native
  def pushState(data: js.Any, title: String, url: String, queue: Boolean): Boolean = js.native
  
  def replaceState(data: js.Any, title: String, url: String): Boolean = js.native
  def replaceState(data: js.Any, title: String, url: String, queue: Boolean): Boolean = js.native
  
  /**
    * History.setTitle(title)
    * Applies the title to the document
    * @param {HistoryState} newState
    * @return {Boolean}
    */
  def setTitle(newState: HistoryState): Boolean = js.native
}
