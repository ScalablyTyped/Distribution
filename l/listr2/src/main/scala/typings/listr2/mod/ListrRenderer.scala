package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The bones of a listr renderer. */
@js.native
trait ListrRenderer extends StObject {
  
  /** A function to what to do on end of the render */
  def end(): Unit = js.native
  def end(err: js.Error): Unit = js.native
  
  /** A function to what to do on render */
  def render(): Unit = js.native
}
