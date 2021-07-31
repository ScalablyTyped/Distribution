package typings.jqueryScrollto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  /**
    * Scroll window
    */
  def scrollTo(target: js.Any): JQuery = js.native
  def scrollTo(target: js.Any, duration: Double): JQuery = js.native
  def scrollTo(target: js.Any, duration: Double, onAfter: js.Function): JQuery = js.native
  def scrollTo(target: js.Any, duration: Double, settings: ScrollToOptions): JQuery = js.native
  def scrollTo(target: js.Any, duration: Unit, settings: ScrollToOptions): JQuery = js.native
  /**
    * Scroll window
    */
  def scrollTo(target: js.Any, settings: ScrollToOptions): JQuery = js.native
  def scrollTo(target: js.Any, settings: ScrollToOptions, onAfter: js.Function): JQuery = js.native
}
