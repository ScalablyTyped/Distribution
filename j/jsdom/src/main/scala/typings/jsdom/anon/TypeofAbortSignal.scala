package typings.jsdom.anon

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAbortSignal extends StObject {
  
  /* standard dom */
  def abort(): AbortSignal = js.native
  def abort(reason: Any): AbortSignal = js.native
  
  /* standard dom */
  def timeout(milliseconds: Double): AbortSignal = js.native
}
