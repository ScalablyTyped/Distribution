package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vidx extends StObject {
  
  var critical: Boolean = js.native
  
  var oid: String = js.native
  
  var vidx: Double = js.native
}
object Vidx {
  
  @scala.inline
  def apply(critical: Boolean, oid: String, vidx: Double): Vidx = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], vidx = vidx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vidx]
  }
  
  @scala.inline
  implicit class VidxMutableBuilder[Self <: Vidx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVidx(value: Double): Self = StObject.set(x, "vidx", value.asInstanceOf[js.Any])
  }
}
