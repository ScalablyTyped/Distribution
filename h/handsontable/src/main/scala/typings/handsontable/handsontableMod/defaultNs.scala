package typings.handsontable.handsontableMod

import typings.handsontable.handsontableMod.HandsontableNs.CellProperties
import typings.handsontable.handsontableMod.underscoreHandsontableNs.Core
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("handsontable", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  // Plugin options
  @JSName("comments")
  @js.native
  object commentsNs extends js.Object
  
  @JSName("plugins")
  @js.native
  object pluginsNs extends js.Object {
    @js.native
    class Base ()
      extends typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.Base {
      def this(hotInstance: Core) = this()
      /* CompleteClass */
      override var enabled: Boolean = js.native
      /* CompleteClass */
      override var initialized: Boolean = js.native
      /* CompleteClass */
      override var isPluginsReady: Boolean = js.native
      /* CompleteClass */
      override var pluginName: String = js.native
      /* CompleteClass */
      override var pluginsInitializedCallback: js.Array[_] = js.native
      /* CompleteClass */
      override def addHook(name: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
      /* CompleteClass */
      override def callOnPluginsReady(callback: js.Function0[Unit]): Unit = js.native
      /* CompleteClass */
      override def clearHooks(): Unit = js.native
      /* CompleteClass */
      override def destroy(): Unit = js.native
      /* CompleteClass */
      override def disablePlugin(): Unit = js.native
      /* CompleteClass */
      override def enablePlugin(): Unit = js.native
      /* CompleteClass */
      override def init(): Unit = js.native
      /* CompleteClass */
      override def removeHooks(name: String): Unit = js.native
    }
    
    // utils for Filters
    @JSName("FiltersPlugin")
    @js.native
    object FiltersPluginNs extends js.Object
    
  }
  
  /**
    * The "_editor" namespace is named to avoid circular reference conflict with "Handsontable.editors" namespace.
    * The other namespaces (renderers, validators, etc) don't need this because they don't expose values (classes), just types (interfaces).
    * Note that TS will think it can use the values defined here, ex `new Handsontable._editors.Base()` compiles, but this is wrong.
    * TODO: This would be better solved by moving all types outside the exported namespaces. (Separate type definition from type publication.)
    */
  @JSName("_editors")
  @js.native
  object underscoreEditorsNs extends js.Object {
    @js.native
    class Autocomplete ()
      extends typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Autocomplete
    
    @js.native
    abstract class Base protected ()
      extends typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Base {
      def this(
        hotInstance: Core,
        row: Double,
        col: Double,
        prop: String,
        TD: HTMLTableCellElement,
        cellProperties: CellProperties
      ) = this()
      def this(
        hotInstance: Core,
        row: Double,
        col: Double,
        prop: Double,
        TD: HTMLTableCellElement,
        cellProperties: CellProperties
      ) = this()
    }
    
    @js.native
    class Checkbox ()
      extends typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Checkbox
    
    @js.native
    class Date ()
      extends typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Date
    
    @js.native
    class Dropdown ()
      extends typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Dropdown
    
    @js.native
    class Handsontable ()
      extends typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Handsontable
    
    @js.native
    class Mobile ()
      extends typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Mobile
    
    @js.native
    class Numeric ()
      extends typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Numeric
    
    @js.native
    class Password ()
      extends typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Password
    
    @js.native
    class Select ()
      extends typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Select
    
    @js.native
    class Text ()
      extends typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Text
    
  }
  
}

