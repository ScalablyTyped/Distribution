package typings.jqueryScrollto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Scroll the matched elements
    */
  def scrollTo(target: Any): JQuery = js.native
  def scrollTo(target: Any, duration: Double): JQuery = js.native
  def scrollTo(target: Any, duration: Double, onAfter: js.Function): JQuery = js.native
  def scrollTo(target: Any, duration: Double, settings: ScrollToOptions): JQuery = js.native
  def scrollTo(target: Any, duration: Unit, settings: ScrollToOptions): JQuery = js.native
  /**
    * Scroll the matched elements
    */
  def scrollTo(target: Any, settings: ScrollToOptions): JQuery = js.native
  def scrollTo(target: Any, settings: ScrollToOptions, onAfter: js.Function): JQuery = js.native
}
