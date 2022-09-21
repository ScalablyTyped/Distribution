package typings.isPlainObject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-plain-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPlainObject(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
