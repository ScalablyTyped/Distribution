package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thread extends StObject {
  
  /** Resource name, in the form "spaces/∗/threads/ *". Example: spaces/AAAAMpdlehY/threads/UMxbHmzDlr4 */
  var name: js.UndefOr[String] = js.undefined
}
object Thread {
  
  @scala.inline
  def apply(): Thread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thread]
  }
  
  @scala.inline
  implicit class ThreadMutableBuilder[Self <: Thread] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
