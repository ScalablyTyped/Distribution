package typings.jupyterlabTranslation

import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServerMod {
  
  @JSImport("@jupyterlab/translation/lib/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requestTranslationsAPI[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")().asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: String, init: Unit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: String, init: RequestInit): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: String, init: RequestInit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: Unit, init: Unit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: Unit, init: RequestInit): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: String, locale: Unit, init: RequestInit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: String, init: Unit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: String, init: RequestInit): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: String, init: RequestInit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: Unit, init: Unit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: Unit, init: RequestInit): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def requestTranslationsAPI[T](translationsUrl: Unit, locale: Unit, init: RequestInit, serverSettings: ISettings): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTranslationsAPI")(translationsUrl.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], init.asInstanceOf[js.Any], serverSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
