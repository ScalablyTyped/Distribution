package typings.i18nextKo

import org.scalablytyped.runtime.StringDictionary
import typings.i18nextKo.anon.Translation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-ko", "i18n")
  @js.native
  val i18n: typings.i18next.mod.i18n = js.native
  
  @JSImport("i18next-ko", "init")
  @js.native
  def init(
    resourceStore: i18nextkoResourceStore,
    language: String,
    ko: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutStatic */ js.Any
  ): Unit = js.native
  
  @JSImport("i18next-ko", "setLanguage")
  @js.native
  def setLanguage(language: String): Unit = js.native
  
  @JSImport("i18next-ko", "t")
  @js.native
  def t(key: String): js.Any = js.native
  
  type i18nextkoResourceStore = StringDictionary[Translation]
}
