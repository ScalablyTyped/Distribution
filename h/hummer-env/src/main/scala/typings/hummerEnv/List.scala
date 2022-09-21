package typings.hummerEnv

import typings.hummerEnv.hummerEnvNumbers.`0`
import typings.hummerEnv.hummerEnvNumbers.`1`
import typings.hummerEnv.hummerEnvNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List
  extends StObject
     with HummerComponent {
  
  /**
    * @summary is enable bounces default: true
    */
  var bounces: Boolean = js.native
  
  /**
    * @summary the component to be displayed when pullup refresh
    */
  var loadMoreView: HummerComponent = js.native
  
  /**
    * @param type: item type, is the return from onRegister
    * @returns component to be display
    */
  def onCreate(`type`: Double): HummerComponent = js.native
  
  /**
    * @summary cb when on pullup refresh
    * @param state 0: init/end 1: loading 2: no more data
    */
  def onLoadMore(state: `0` | `1` | `2`): Unit = js.native
  
  /**
    * @summary cb when on pulldown refresh
    * @param state 0: init/end 1: start pulldown 2: refreshing
    */
  def onRefresh(state: `0` | `1` | `2`): Unit = js.native
  
  /**
    * @param index position of item
    * @returns type of item, must be a number
    */
  def onRegister(index: Double): Double = js.native
  
  /**
    * @param index position of item
    * @param cell componet
    */
  def onUpdate(index: Double, cell: HummerComponent): Unit = js.native
  
  // methods
  /**
    * @summary refresh list
    * @param count number of items
    */
  def refresh(count: Double): Unit = js.native
  
  /**
    * @summary the component to be displayed when pulldown refresh
    */
  var refreshView: HummerComponent = js.native
  
  /**
    * @summary scroll by relative distance
    * @param dx x distance
    * @param dy y distance
    */
  def scrollBy(dx: Double, dy: Double): Unit = js.native
  
  /**
    * @summary scroll to coordinate
    * @param x x coordinate
    * @param y y coordinate
    */
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  /**
    * @summary scroll to the nth item
    * @param position : the index to be scrolled;
    */
  def scrollToPosition(position: Double): Unit = js.native
  
  /**
    * @summary is show scrollbar default: false
    */
  var showScrollBar: Boolean = js.native
  
  /**
    * @param enable can trigger loadmore or not next time
    */
  def stopLoadMore(enable: Boolean): Unit = js.native
  
  /**
    * @summary stop pull refresh
    */
  def stopPullRefresh(): Unit = js.native
  
  @JSName("style")
  var style_List: ListStyle = js.native
}
