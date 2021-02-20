package typings.handsontable.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.handsontable.handsontableStrings.handsontable
import typings.handsontable.mod.Handsontable.CellProperties
import typings.handsontable.mod.Handsontable.CellTypes_
import typings.handsontable.mod.Handsontable.Dom
import typings.handsontable.mod.Handsontable.Editors
import typings.handsontable.mod.Handsontable.GridSettings
import typings.handsontable.mod.Handsontable.Helper
import typings.handsontable.mod.Handsontable.Hooks.Methods
import typings.handsontable.mod.Handsontable.I18n.Internationalization
import typings.handsontable.mod.Handsontable.Plugins_
import typings.handsontable.mod.Handsontable.Renderers_
import typings.handsontable.mod.Handsontable.Validators_
import typings.handsontable.mod.Handsontable._editors.Autocomplete
import typings.handsontable.mod.Handsontable._editors.Base
import typings.handsontable.mod.Handsontable._editors.Checkbox
import typings.handsontable.mod.Handsontable._editors.Date
import typings.handsontable.mod.Handsontable._editors.Mobile
import typings.handsontable.mod.Handsontable._editors.Select
import typings.handsontable.mod.Handsontable._editors.Text
import typings.handsontable.mod.Handsontable.plugins.EventManager
import typings.handsontable.mod._Handsontable.Core
import typings.std.Element
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("handsontable", JSImport.Default)
@js.native
class default () extends Core
object default {
  
  @JSImport("handsontable", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof _Handsontable.Core` */
  @JSImport("handsontable", "default.Core")
  @js.native
  class Core protected ()
    extends typings.handsontable.mod._Handsontable.Core {
    def this(element: Element, options: GridSettings) = this()
  }
  
  /* static member */
  @JSImport("handsontable", "default.DefaultSettings")
  @js.native
  def DefaultSettings: GridSettings = js.native
  @scala.inline
  def DefaultSettings_=(x: GridSettings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultSettings")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("handsontable", "default.EventManager")
  @js.native
  def EventManager: typings.handsontable.mod.Handsontable.EventManager = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("handsontable", "default.EventManager")
  @js.native
  class EventManagerCls protected () extends EventManager {
    def this(context: js.Object) = this()
  }
  
  @scala.inline
  def EventManager_=(x: typings.handsontable.mod.Handsontable.EventManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EventManager")(x.asInstanceOf[js.Any])
  
  /**
    * The "_editor" namespace is named to avoid circular reference conflict with "Handsontable.editors" namespace.
    * The other namespaces (renderers, validators, etc) don't need this because they don't expose values (classes), just types (interfaces).
    * Note that TS will think it can use the values defined here, ex `new Handsontable._editors.Base()` compiles, but this is wrong.
    * TODO: This would be better solved by moving all types outside the exported namespaces. (Separate type definition from type publication.)
    */
  object _editors {
    
    @JSImport("handsontable", "default._editors.Autocomplete")
    @js.native
    class Autocomplete ()
      extends typings.handsontable.mod.Handsontable._editors.Autocomplete
    
    @JSImport("handsontable", "default._editors.Base")
    @js.native
    abstract class Base protected ()
      extends typings.handsontable.mod.Handsontable._editors.Base {
      def this(
        hotInstance: typings.handsontable.mod._Handsontable.Core,
        row: Double,
        col: Double,
        prop: String,
        TD: HTMLTableCellElement,
        cellProperties: CellProperties
      ) = this()
      def this(
        hotInstance: typings.handsontable.mod._Handsontable.Core,
        row: Double,
        col: Double,
        prop: Double,
        TD: HTMLTableCellElement,
        cellProperties: CellProperties
      ) = this()
    }
    
    @JSImport("handsontable", "default._editors.Checkbox")
    @js.native
    class Checkbox ()
      extends typings.handsontable.mod.Handsontable._editors.Checkbox
    
    @JSImport("handsontable", "default._editors.Date")
    @js.native
    class Date ()
      extends typings.handsontable.mod.Handsontable._editors.Date
    
    @JSImport("handsontable", "default._editors.Dropdown")
    @js.native
    class Dropdown ()
      extends typings.handsontable.mod.Handsontable._editors.Autocomplete
    
    @JSImport("handsontable", "default._editors.Handsontable")
    @js.native
    class Handsontable ()
      extends typings.handsontable.mod.Handsontable._editors.Handsontable
    
    @JSImport("handsontable", "default._editors.Mobile")
    @js.native
    class Mobile ()
      extends typings.handsontable.mod.Handsontable._editors.Mobile
    
    @JSImport("handsontable", "default._editors.Numeric")
    @js.native
    class Numeric ()
      extends typings.handsontable.mod.Handsontable._editors.Text
    
    @JSImport("handsontable", "default._editors.Password")
    @js.native
    class Password ()
      extends typings.handsontable.mod.Handsontable._editors.Text
    
    @JSImport("handsontable", "default._editors.Select")
    @js.native
    class Select ()
      extends typings.handsontable.mod.Handsontable._editors.Select
    
    @JSImport("handsontable", "default._editors.Text")
    @js.native
    class Text ()
      extends typings.handsontable.mod.Handsontable._editors.Text
  }
  
  /* static member */
  @JSImport("handsontable", "default.baseVersion")
  @js.native
  def baseVersion: String = js.native
  @scala.inline
  def baseVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseVersion")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("handsontable", "default.buildDate")
  @js.native
  def buildDate: String = js.native
  @scala.inline
  def buildDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildDate")(x.asInstanceOf[js.Any])
  
  object cellTypes extends Shortcut {
    
    @JSImport("handsontable", "default.cellTypes")
    @js.native
    val ^ : CellTypes_ = js.native
    
    type _To = CellTypes_
    
    /* This means you don't have to write `^`, but can instead just say `cellTypes.foo` */
    override def _to: CellTypes_ = ^
  }
  
  /* static member */
  @JSImport("handsontable", "default.dom")
  @js.native
  def dom: Dom = js.native
  @scala.inline
  def dom_=(x: Dom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dom")(x.asInstanceOf[js.Any])
  
  /* static member */
  object editors extends Shortcut {
    
    @JSImport("handsontable", "default.editors")
    @js.native
    val ^ : Editors = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.AutocompleteEditor")
    @js.native
    class AutocompleteEditor () extends Autocomplete
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.BaseEditor")
    @js.native
    class BaseEditor protected () extends Base {
      def this(
        hotInstance: typings.handsontable.mod._Handsontable.Core,
        row: Double,
        col: Double,
        prop: String,
        TD: HTMLTableCellElement,
        cellProperties: CellProperties
      ) = this()
      def this(
        hotInstance: typings.handsontable.mod._Handsontable.Core,
        row: Double,
        col: Double,
        prop: Double,
        TD: HTMLTableCellElement,
        cellProperties: CellProperties
      ) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.CheckboxEditor")
    @js.native
    class CheckboxEditor () extends Checkbox
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.DateEditor")
    @js.native
    class DateEditor () extends Date
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.DropdownEditor")
    @js.native
    class DropdownEditor () extends Autocomplete
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.HandsontableEditor")
    @js.native
    class HandsontableEditor ()
      extends typings.handsontable.mod.Handsontable._editors.Handsontable
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.MobileEditor")
    @js.native
    class MobileEditor () extends Mobile
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.NumericEditor")
    @js.native
    class NumericEditor () extends Text
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.PasswordEditor")
    @js.native
    class PasswordEditor () extends Text
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.SelectEditor")
    @js.native
    class SelectEditor () extends Select
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.TextEditor")
    @js.native
    class TextEditor () extends Text
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("handsontable", "default.editors.TimeEditor")
    @js.native
    class TimeEditor () extends Text
    
    type _To = Editors
    
    /* This means you don't have to write `^`, but can instead just say `editors.foo` */
    override def _to: Editors = ^
  }
  
  /* static member */
  @JSImport("handsontable", "default.helper")
  @js.native
  def helper: Helper = js.native
  @scala.inline
  def helper_=(x: Helper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("helper")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("handsontable", "default.hooks")
  @js.native
  def hooks: Methods = js.native
  @scala.inline
  def hooks_=(x: Methods): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hooks")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("handsontable", "default.languages")
  @js.native
  def languages: Internationalization = js.native
  @scala.inline
  def languages_=(x: Internationalization): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("handsontable", "default.packageName")
  @js.native
  def packageName: handsontable = js.native
  @scala.inline
  def packageName_=(x: handsontable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packageName")(x.asInstanceOf[js.Any])
  
  object plugins extends Shortcut {
    
    @JSImport("handsontable", "default.plugins")
    @js.native
    val ^ : Plugins_ = js.native
    
    @JSImport("handsontable", "default.plugins.Base")
    @js.native
    class Base ()
      extends typings.handsontable.mod.Handsontable.plugins.Base
         with Instantiable0[typings.handsontable.mod.Handsontable.plugins.Base]
         with Instantiable1[
              /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
              typings.handsontable.mod.Handsontable.plugins.Base
            ] {
      def this(hotInstance: typings.handsontable.mod._Handsontable.Core) = this()
    }
    
    // utils for Filters
    object FiltersPlugin
    
    type _To = Plugins_
    
    /* This means you don't have to write `^`, but can instead just say `plugins.foo` */
    override def _to: Plugins_ = ^
  }
  
  object renderers extends Shortcut {
    
    @JSImport("handsontable", "default.renderers")
    @js.native
    val ^ : Renderers_ = js.native
    
    type _To = Renderers_
    
    /* This means you don't have to write `^`, but can instead just say `renderers.foo` */
    override def _to: Renderers_ = ^
  }
  
  object validators extends Shortcut {
    
    @JSImport("handsontable", "default.validators")
    @js.native
    val ^ : Validators_ = js.native
    
    type _To = Validators_
    
    /* This means you don't have to write `^`, but can instead just say `validators.foo` */
    override def _to: Validators_ = ^
  }
  
  /* static member */
  @JSImport("handsontable", "default.version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  // Plugin options
  object comments
}
