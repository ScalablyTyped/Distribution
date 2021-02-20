package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pub extends StObject {
  
  var ok: typings.gun.gunNumbers.`0` = js.native
  
  var pub: String = js.native
}
object Pub {
  
  @scala.inline
  def apply(ok: typings.gun.gunNumbers.`0`, pub: String): Pub = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pub]
  }
  
  @scala.inline
  implicit class PubMutableBuilder[Self <: Pub] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOk(value: typings.gun.gunNumbers.`0`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
  }
}
