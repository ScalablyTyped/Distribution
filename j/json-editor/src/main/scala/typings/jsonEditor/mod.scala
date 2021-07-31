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

object mod {
  
  @JSImport("json-editor", JSImport.Namespace)
  @js.native
  class ^[TValue] protected ()
    extends StObject
       with JSONEditor[TValue] {
    def this(element: HTMLElement, options: JSONEditorOptions[TValue]) = this()
  }
  
  /* static member */
  object defaults {
    
    @JSImport("json-editor", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("json-editor", "defaults.custom_validators")
    @js.native
    def customValidators: js.Array[
        js.Function3[/* schema */ js.Any, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
      ] = js.native
    
    @scala.inline
    def customValidators_=(
      x: js.Array[
          js.Function3[/* schema */ js.Any, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("custom_validators")(x.asInstanceOf[js.Any])
    
    @JSImport("json-editor", "defaults.editors")
    @js.native
    def editors: Array = js.native
    @scala.inline
    def editors_=(x: Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editors")(x.asInstanceOf[js.Any])
    
    @JSImport("json-editor", "defaults.language")
    @js.native
    def language: String = js.native
    @scala.inline
    def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
    
    @JSImport("json-editor", "defaults.languages")
    @js.native
    def languages: js.Any = js.native
    @scala.inline
    def languages_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
    
    @JSImport("json-editor", "defaults.options")
    @js.native
    def options: JSONEditorOptions[js.Any] = js.native
    @scala.inline
    def options_=(x: JSONEditorOptions[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    @JSImport("json-editor", "defaults.resolvers")
    @js.native
    def resolvers: js.Array[js.Function1[/* schema */ js.Any, String]] = js.native
    @scala.inline
    def resolvers_=(x: js.Array[js.Function1[/* schema */ js.Any, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object plugins {
    
    @JSImport("json-editor", "plugins")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("json-editor", "plugins.ace")
    @js.native
    def ace: Theme = js.native
    @scala.inline
    def ace_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ace")(x.asInstanceOf[js.Any])
    
    @JSImport("json-editor", "plugins.epiceditor")
    @js.native
    def epiceditor: BasePath = js.native
    @scala.inline
    def epiceditor_=(x: BasePath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("epiceditor")(x.asInstanceOf[js.Any])
    
    @JSImport("json-editor", "plugins.sceditor")
    @js.native
    def sceditor: EmoticonsEnabled = js.native
    @scala.inline
    def sceditor_=(x: EmoticonsEnabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sceditor")(x.asInstanceOf[js.Any])
    
    @JSImport("json-editor", "plugins.selectize")
    @js.native
    def selectize: Enable = js.native
    @scala.inline
    def selectize_=(x: Enable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectize")(x.asInstanceOf[js.Any])
  }
}
