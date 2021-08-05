package typings.ionicons

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ionicons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addIcons(icons: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addIcons")(icons.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
