package typings.mailgunJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailgunRequest extends StObject {
  
  def apply(resource: String): js.Promise[Any] = js.native
  def apply(resource: String, callback: js.Function2[/* error */ Error, /* response */ Any, Unit]): Unit = js.native
  def apply(resource: String, data: Any): js.Promise[Any] = js.native
  def apply(resource: String, data: Any, callback: js.Function2[/* error */ Error, /* response */ Any, Unit]): Unit = js.native
}
