package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeedsUpgrade extends StObject {
  
  var needsUpgrade: Boolean
  
  var urgent: Boolean
  
  var version: String
}
object NeedsUpgrade {
  
  inline def apply(needsUpgrade: Boolean, urgent: Boolean, version: String): NeedsUpgrade = {
    val __obj = js.Dynamic.literal(needsUpgrade = needsUpgrade.asInstanceOf[js.Any], urgent = urgent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsUpgrade]
  }
  
  extension [Self <: NeedsUpgrade](x: Self) {
    
    inline def setNeedsUpgrade(value: Boolean): Self = StObject.set(x, "needsUpgrade", value.asInstanceOf[js.Any])
    
    inline def setUrgent(value: Boolean): Self = StObject.set(x, "urgent", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
