package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "AsyncSingleFileHost")
@js.native
class AsyncSingleFileHost protected () extends AsyncHost {
  def this(file: String, content: String) = this()
  def this(file: String, content: String, hostFallback: AsyncHost) = this()
  
  val content: String = js.native
  
  val file: String = js.native
  
  var hostFallback: js.Any = js.native
}
