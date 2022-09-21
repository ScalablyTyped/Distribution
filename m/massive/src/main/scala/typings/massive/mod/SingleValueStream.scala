package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("massive", "SingleValueStream")
@js.native
open class SingleValueStream protected () extends StObject {
  /** A stream which processes single-key results objects into their values for convenience on the client side. */
  def this(options: AnyObject[Any]) = this()
  
  /** Implement the Transform stream that invokes singleValue on everything which passes through it. */
  /* private */ def _transform(obj: AnyObject[Any], encoding: String, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  /** Converts a single-key object into its value. */
  def singleValue(obj: AnyObject[Any]): Any = js.native
}
