package typings.maplibreGl.distStyleSpecMod

import typings.maplibreGl.maplibreGlStrings.resolvedImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedImageTypeT
  extends StObject
     with Type {
  
  var kind: resolvedImage
}
object ResolvedImageTypeT {
  
  inline def apply(): ResolvedImageTypeT = {
    val __obj = js.Dynamic.literal(kind = "resolvedImage")
    __obj.asInstanceOf[ResolvedImageTypeT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedImageTypeT] (val x: Self) extends AnyVal {
    
    inline def setKind(value: resolvedImage): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
