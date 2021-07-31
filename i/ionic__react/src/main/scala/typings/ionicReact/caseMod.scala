package typings.ionicReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object caseMod {
  
  @JSImport("@ionic/react/dist/types/components/utils/case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def camelToDashCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelToDashCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def dashToPascalCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dashToPascalCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
