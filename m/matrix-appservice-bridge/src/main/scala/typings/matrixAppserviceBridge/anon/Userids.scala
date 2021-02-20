package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Userids extends StObject {
  
  var user_ids: js.Array[String] = js.native
}
object Userids {
  
  @scala.inline
  def apply(user_ids: js.Array[String]): Userids = {
    val __obj = js.Dynamic.literal(user_ids = user_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userids]
  }
  
  @scala.inline
  implicit class UseridsMutableBuilder[Self <: Userids] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser_ids(value: js.Array[String]): Self = StObject.set(x, "user_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idsVarargs(value: String*): Self = StObject.set(x, "user_ids", js.Array(value :_*))
  }
}
