package typings.jsonEditor

import typings.jsonEditor.anon.Array
import typings.jsonEditor.anon.BasePath
import typings.jsonEditor.anon.EmoticonsEnabled
import typings.jsonEditor.anon.Enable
import typings.jsonEditor.anon.Theme
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("JSONEditor")
  @js.native
  open class JSONEditor[TValue] protected ()
    extends StObject
       with typings.jsonEditor.JSONEditor[TValue] {
    def this(element: HTMLElement, options: JSONEditorOptions[TValue]) = this()
  }
  object JSONEditor {
    
    /* static member */
    object defaults {
      
      @JSGlobal("JSONEditor.defaults")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("JSONEditor.defaults.custom_validators")
      @js.native
      def customValidators: js.Array[
            js.Function3[/* schema */ Any, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
          ] = js.native
      
      inline def customValidators_=(
        x: js.Array[
              js.Function3[/* schema */ Any, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("custom_validators")(x.asInstanceOf[js.Any])
      
      @JSGlobal("JSONEditor.defaults.editors")
      @js.native
      def editors: Array = js.native
      inline def editors_=(x: Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editors")(x.asInstanceOf[js.Any])
      
      @JSGlobal("JSONEditor.defaults.language")
      @js.native
      def language: String = js.native
      inline def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
      
      @JSGlobal("JSONEditor.defaults.languages")
      @js.native
      def languages: Any = js.native
      inline def languages_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
      
      @JSGlobal("JSONEditor.defaults.options")
      @js.native
      def options: JSONEditorOptions[Any] = js.native
      inline def options_=(x: JSONEditorOptions[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
      
      @JSGlobal("JSONEditor.defaults.resolvers")
      @js.native
      def resolvers: js.Array[js.Function1[/* schema */ Any, String]] = js.native
      inline def resolvers_=(x: js.Array[js.Function1[/* schema */ Any, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object plugins {
      
      @JSGlobal("JSONEditor.plugins")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("JSONEditor.plugins.ace")
      @js.native
      def ace: Theme = js.native
      inline def ace_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ace")(x.asInstanceOf[js.Any])
      
      @JSGlobal("JSONEditor.plugins.epiceditor")
      @js.native
      def epiceditor: BasePath = js.native
      inline def epiceditor_=(x: BasePath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("epiceditor")(x.asInstanceOf[js.Any])
      
      @JSGlobal("JSONEditor.plugins.sceditor")
      @js.native
      def sceditor: EmoticonsEnabled = js.native
      inline def sceditor_=(x: EmoticonsEnabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sceditor")(x.asInstanceOf[js.Any])
      
      @JSGlobal("JSONEditor.plugins.selectize")
      @js.native
      def selectize: Enable = js.native
      inline def selectize_=(x: Enable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectize")(x.asInstanceOf[js.Any])
    }
  }
}
