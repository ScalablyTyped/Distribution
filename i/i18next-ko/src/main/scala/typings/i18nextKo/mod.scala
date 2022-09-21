package typings.i18nextKo

import org.scalablytyped.runtime.StringDictionary
import typings.i18nextKo.anon.Translation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-ko", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("i18next-ko", "i18n")
  @js.native
  val i18n: typings.i18next.mod.i18n = js.native
  
  inline def init(
    resourceStore: i18nextkoResourceStore,
    language: String,
    ko: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutStatic */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(resourceStore.asInstanceOf[js.Any], language.asInstanceOf[js.Any], ko.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setLanguage(language: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def t(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type i18nextkoResourceStore = StringDictionary[Translation]
}
