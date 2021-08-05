package typings.ipfsCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMtimeMod {
  
  /**
    * @param {MTime} mtime
    * @returns {string}
    */
  inline def apply(mtime: MTime): String = ^.asInstanceOf[js.Dynamic].apply(mtime.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("ipfs-core-utils/dist/src/files/format-mtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MTime extends StObject {
    
    /**
      * - the number of nanoseconds since the last full
      * second.
      */
    var nsecs: Double
    
    /**
      * - the number of seconds since (positive) or before
      * (negative) the Unix Epoch began
      */
    var secs: Double
  }
  object MTime {
    
    inline def apply(nsecs: Double, secs: Double): MTime = {
      val __obj = js.Dynamic.literal(nsecs = nsecs.asInstanceOf[js.Any], secs = secs.asInstanceOf[js.Any])
      __obj.asInstanceOf[MTime]
    }
    
    extension [Self <: MTime](x: Self) {
      
      inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      inline def setSecs(value: Double): Self = StObject.set(x, "secs", value.asInstanceOf[js.Any])
    }
  }
}
