package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.ParallelPortPrinter")
@js.native
open class ParallelPortPrinter protected ()
  extends StObject
     with IClientPrinter {
  def this(portName: String) = this()
  
  /* CompleteClass */
  var Id: Any = js.native
  @JSName("Id")
  var Id_ParallelPortPrinter: String = js.native
  
  /* private */ var _parallelPortName: Any = js.native
  
  var portName: String = js.native
  
  /* CompleteClass */
  override def serialize(): Any = js.native
}
