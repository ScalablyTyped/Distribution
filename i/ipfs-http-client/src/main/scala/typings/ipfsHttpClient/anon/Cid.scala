package typings.ipfsHttpClient.anon

import typings.ipfsHttpClient.distSrcPinRemoteUtilsMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cid extends StObject {
  
  var Cid: String
  
  var Name: String
  
  var Status: typings.ipfsHttpClient.distSrcPinRemoteUtilsMod.Status
}
object Cid {
  
  inline def apply(Cid: String, Name: String, Status: Status): Cid = {
    val __obj = js.Dynamic.literal(Cid = Cid.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cid] (val x: Self) extends AnyVal {
    
    inline def setCid(value: String): Self = StObject.set(x, "Cid", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
