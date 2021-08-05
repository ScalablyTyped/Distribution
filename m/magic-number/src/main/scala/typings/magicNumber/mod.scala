package typings.magicNumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("magic-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectFile(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectFile")(file.asInstanceOf[js.Any]).asInstanceOf[String]
}
