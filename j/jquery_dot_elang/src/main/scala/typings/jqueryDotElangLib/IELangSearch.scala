package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangSearch extends IELangBase {
  @JSName("defaults")
  var defaults_IELangSearch: IELangSearchDefaults = js.native
  @JSName("delegates")
  var delegates_IELangSearch: IELangSearchDelegates = js.native
  @JSName("events")
  var events_IELangSearch: IELangSearchEvents = js.native
  var isSearchInExp: scala.Boolean = js.native
  def _onDirectionClick(eSrc: stdLib.HTMLElement): scala.Unit = js.native
  def _onSelect(eSrc: stdLib.HTMLInputElement): scala.Unit = js.native
  def _onSelectCallback(): scala.Unit = js.native
  def _select(eSrc: stdLib.HTMLInputElement): scala.Unit = js.native
}

