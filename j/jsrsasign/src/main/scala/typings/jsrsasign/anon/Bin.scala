package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bin extends StObject {
  
  var bin: String = js.native
  
  var critical: Boolean = js.native
}
object Bin {
  
  @scala.inline
  def apply(bin: String, critical: Boolean): Bin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
  
  @scala.inline
  implicit class BinMutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
  }
}
