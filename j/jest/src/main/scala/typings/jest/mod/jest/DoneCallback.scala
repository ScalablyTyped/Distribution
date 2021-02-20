package typings.jest.mod.jest

import typings.jest.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoneCallback extends StObject {
  
  def apply(args: js.Any*): js.Any = js.native
  
  def fail(): js.Any = js.native
  def fail(error: String): js.Any = js.native
  def fail(error: Message): js.Any = js.native
}
