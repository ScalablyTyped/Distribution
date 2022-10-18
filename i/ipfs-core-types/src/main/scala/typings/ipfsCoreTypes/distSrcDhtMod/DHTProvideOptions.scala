package typings.ipfsCoreTypes.distSrcDhtMod

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DHTProvideOptions
  extends StObject
     with AbortOptions {
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object DHTProvideOptions {
  
  inline def apply(): DHTProvideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DHTProvideOptions]
  }
  
  extension [Self <: DHTProvideOptions](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
