package typings.jsSchema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(definition: Any): Schema = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Schema]
  
  @JSImport("js-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Schema = js.Function1[/* obj */ Any, Boolean]
}
