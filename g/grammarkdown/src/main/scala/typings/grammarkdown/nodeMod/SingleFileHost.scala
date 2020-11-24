package typings.grammarkdown.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/hosts/node", "SingleFileHost")
@js.native
class SingleFileHost protected () extends Host {
  def this(content: String) = this()
  def this(content: String, file: String) = this()
  def this(content: String, file: js.UndefOr[scala.Nothing], hostFallback: Host) = this()
  def this(content: String, file: String, hostFallback: Host) = this()
  
  var _hostFallback: js.Any = js.native
  
  val content: String = js.native
  
  val file: String = js.native
}
