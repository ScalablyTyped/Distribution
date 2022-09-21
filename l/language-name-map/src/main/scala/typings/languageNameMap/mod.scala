package typings.languageNameMap

import typings.languageNameMap.anon.Dir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("language-name-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLangCodeList(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLangCodeList")().asInstanceOf[js.Array[String]]
  
  inline def getLangNameFromCode(langCode: String): js.UndefOr[Dir] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLangNameFromCode")(langCode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Dir]]
}
