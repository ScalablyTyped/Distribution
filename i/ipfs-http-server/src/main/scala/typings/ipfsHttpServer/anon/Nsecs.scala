package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nsecs extends StObject {
  
  var nsecs: Double
  
  var secs: Double
}
object Nsecs {
  
  inline def apply(nsecs: Double, secs: Double): Nsecs = {
    val __obj = js.Dynamic.literal(nsecs = nsecs.asInstanceOf[js.Any], secs = secs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nsecs]
  }
  
  extension [Self <: Nsecs](x: Self) {
    
    inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
    
    inline def setSecs(value: Double): Self = StObject.set(x, "secs", value.asInstanceOf[js.Any])
  }
}
