package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines access rights for a single file, applied to a user or group */
trait EvaluatedFileACL
  extends StObject
     with FileACL {
  
  /** Whether the user may read the file */
  var read: Boolean
  
  /** Whether the user may write the file */
  var write: Boolean
}
object EvaluatedFileACL {
  
  inline def apply(owner: String, ownerGroup: String, permissions: Double, read: Boolean, write: Boolean): EvaluatedFileACL = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerGroup = ownerGroup.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluatedFileACL]
  }
  
  extension [Self <: EvaluatedFileACL](x: Self) {
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
