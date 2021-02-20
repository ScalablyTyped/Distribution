package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictk extends /* k */ StringDictionary[String] {
  
  var status: String = js.native
}
object Dictk {
  
  @scala.inline
  def apply(status: String): Dictk = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictk]
  }
  
  @scala.inline
  implicit class DictkMutableBuilder[Self <: Dictk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
