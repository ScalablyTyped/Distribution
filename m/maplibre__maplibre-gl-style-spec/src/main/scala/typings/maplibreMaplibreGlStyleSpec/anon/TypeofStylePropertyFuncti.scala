package typings.maplibreMaplibreGlStyleSpec.anon

import org.scalablytyped.runtime.Instantiable2
import typings.maplibreMaplibreGlStyleSpec.mod.PropertyValueSpecification
import typings.maplibreMaplibreGlStyleSpec.mod.StylePropertyFunction
import typings.maplibreMaplibreGlStyleSpec.mod.StylePropertySpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStylePropertyFuncti
  extends StObject
     with Instantiable2[
      /* parameters */ PropertyValueSpecification[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
      /* specification */ StylePropertySpecification, 
      StylePropertyFunction[js.Object]
    ] {
  
  def deserialize[T](serialized: Parameters[T]): StylePropertyFunction[T] = js.native
  
  def serialize[T](input: StylePropertyFunction[T]): Parameters[T] = js.native
}
