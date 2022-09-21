package typings.googleapis.lifesciencesV2betaMod.lifesciencesV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNFSMount extends StObject {
  
  /**
    * A target NFS mount. The target must be specified as `address:/mount".
    */
  var target: js.UndefOr[String | Null] = js.undefined
}
object SchemaNFSMount {
  
  inline def apply(): SchemaNFSMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNFSMount]
  }
  
  extension [Self <: SchemaNFSMount](x: Self) {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
