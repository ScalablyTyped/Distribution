package typings.jqueryElang

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IELangSearch
  extends StObject
     with IELangBase {
  
  def _onDirectionClick(eSrc: HTMLElement): Unit = js.native
  
  def _onSelect(eSrc: HTMLInputElement): Unit = js.native
  
  def _onSelectCallback(): Unit = js.native
  
  def _select(eSrc: HTMLInputElement): Unit = js.native
  
  @JSName("defaults")
  var defaults_IELangSearch: IELangSearchDefaults = js.native
  
  @JSName("delegates")
  var delegates_IELangSearch: IELangSearchDelegates = js.native
  
  @JSName("events")
  var events_IELangSearch: IELangSearchEvents = js.native
  
  var isSearchInExp: Boolean = js.native
}
