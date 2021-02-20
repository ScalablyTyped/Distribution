package typings.jupyterlabServices.anon

import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commid extends StObject {
  
  var comm_id: String = js.native
  
  var data: JSONObject = js.native
}
object Commid {
  
  @scala.inline
  def apply(comm_id: String, data: JSONObject): Commid = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commid]
  }
  
  @scala.inline
  implicit class CommidMutableBuilder[Self <: Commid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComm_id(value: String): Self = StObject.set(x, "comm_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: JSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
