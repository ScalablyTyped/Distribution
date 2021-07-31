package typings.jqueryAlertable

import typings.jquery.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alertable extends StObject {
  
  def alert(message: String): JQueryPromise[Unit] = js.native
  def alert(message: String, options: AlertableOptions): JQueryPromise[Unit] = js.native
  
  def confirm(message: String): JQueryPromise[Unit] = js.native
  def confirm(message: String, options: AlertableOptions): JQueryPromise[Unit] = js.native
  
  var defaults: AlertableOptions = js.native
  
  def prompt(message: String): JQueryPromise[Unit] = js.native
  def prompt(message: String, options: AlertableOptions): JQueryPromise[Unit] = js.native
}
