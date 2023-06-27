package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@maplibre/maplibre-gl-style-spec", "ResolvedImage")
@js.native
open class ResolvedImage protected ()
  extends StObject
     with _Value {
  def this(options: ResolvedImageOptions) = this()
  
  var available: Boolean = js.native
  
  var name: String = js.native
}
/* static members */
object ResolvedImage {
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "ResolvedImage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromString(name: String): ResolvedImage | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(name.asInstanceOf[js.Any]).asInstanceOf[ResolvedImage | Null]
}
