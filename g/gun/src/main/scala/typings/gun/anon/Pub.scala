package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pub extends StObject {
  
  var ok: typings.gun.gunNumbers.`0`
  
  var pub: String
}
object Pub {
  
  @scala.inline
  def apply(pub: String): Pub = {
    val __obj = js.Dynamic.literal(ok = 0, pub = pub.asInstanceOf[js.Any])
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
