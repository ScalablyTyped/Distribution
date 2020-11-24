package typings.jsprintmanager.mod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.ClientPrintJobGroup")
@js.native
class ClientPrintJobGroup () extends js.Object {
  
  /* private */ def _generateDataAsync(): js.Any = js.native
  
  /* private */ def _generateMiniJob(cj: js.Any): js.Any = js.native
  
  /* private */ def _intToArray(number: js.Any): js.Any = js.native
  
  var _jobs: js.Array[ClientPrintJob] = js.native
  
  val jobs: js.Array[ClientPrintJob] = js.native
  
  def sendToClient(): js.Promise[js.Object] = js.native
}
