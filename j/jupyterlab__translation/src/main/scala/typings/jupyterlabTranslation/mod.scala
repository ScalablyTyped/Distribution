package typings.jupyterlabTranslation

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabTranslation.baseMod.NullTranslator_
import typings.jupyterlabTranslation.gettextMod.IOptions
import typings.luminoCoreutils.mod.Token
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/translation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gettext class providing localization methods.
    */
  @JSImport("@jupyterlab/translation", "Gettext")
  @js.native
  open class Gettext ()
    extends typings.jupyterlabTranslation.gettextMod.Gettext {
    def this(options: IOptions) = this()
  }
  object Gettext {
    
    @JSImport("@jupyterlab/translation", "Gettext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * `sprintf` equivalent, takes a string and some arguments to make a
      * computed string.
      *
      * @param fmt - The string to interpolate.
      * @param args - The variables to use in interpolation.
      *
      * ### Examples
      * strfmt("%1 dogs are in %2", 7, "the kitchen"); => "7 dogs are in the kitchen"
      * strfmt("I like %1, bananas and %1", "apples"); => "I like apples, bananas and apples"
      */
    /* static member */
    inline def strfmt(fmt: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strfmt")(List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  }
  
  @JSImport("@jupyterlab/translation", "ITranslator")
  @js.native
  val ITranslator: Token[typings.jupyterlabTranslation.tokensMod.ITranslator] = js.native
  
  @JSImport("@jupyterlab/translation", "ITranslatorConnector")
  @js.native
  val ITranslatorConnector: Token[typings.jupyterlabTranslation.tokensMod.ITranslatorConnector] = js.native
  
  @JSImport("@jupyterlab/translation", "TranslationManager")
  @js.native
  open class TranslationManager ()
    extends typings.jupyterlabTranslation.managerMod.TranslationManager {
    def this(translationsUrl: String) = this()
    def this(translationsUrl: String, stringsPrefix: String) = this()
    def this(translationsUrl: Unit, stringsPrefix: String) = this()
    def this(translationsUrl: String, stringsPrefix: String, serverSettings: ISettings) = this()
    def this(translationsUrl: String, stringsPrefix: Unit, serverSettings: ISettings) = this()
    def this(translationsUrl: Unit, stringsPrefix: String, serverSettings: ISettings) = this()
    def this(translationsUrl: Unit, stringsPrefix: Unit, serverSettings: ISettings) = this()
  }
  
  @JSImport("@jupyterlab/translation", "TranslatorConnector")
  @js.native
  open class TranslatorConnector ()
    extends typings.jupyterlabTranslation.tokensMod.TranslatorConnector {
    def this(translationsUrl: String) = this()
    def this(translationsUrl: String, serverSettings: ISettings) = this()
    def this(translationsUrl: Unit, serverSettings: ISettings) = this()
  }
  
  @JSImport("@jupyterlab/translation", "nullTranslator")
  @js.native
  val nullTranslator: NullTranslator_ = js.native
  
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
