package typings.ipfsCoreTypes.distSrcRootMod

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveOptions
  extends StObject
     with AbortOptions {
  
  var cidBase: js.UndefOr[String] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object ResolveOptions {
  
  inline def apply(): ResolveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveOptions]
  }
  
  extension [Self <: ResolveOptions](x: Self) {
    
    inline def setCidBase(value: String): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    inline def setCidBaseUndefined: Self = StObject.set(x, "cidBase", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
