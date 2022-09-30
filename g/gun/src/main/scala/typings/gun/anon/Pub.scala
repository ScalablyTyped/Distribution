package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pub extends StObject {
  
  var ok: typings.gun.gunInts.`0`
  
  var pub: String
}
object Pub {
  
  inline def apply(pub: String): Pub = {
    val __obj = js.Dynamic.literal(ok = 0, pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pub]
  }
  
  extension [Self <: Pub](x: Self) {
    
    inline def setOk(value: typings.gun.gunInts.`0`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
  }
}
