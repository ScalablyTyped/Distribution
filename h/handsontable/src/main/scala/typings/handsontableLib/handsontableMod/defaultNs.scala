package typings
package handsontableLib.handsontableMod

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
      extends handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Base {
      def this(hotInstance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core) = this()
      /* CompleteClass */
      override var enabled: scala.Boolean = js.native
      /* CompleteClass */
      override var initialized: scala.Boolean = js.native
      /* CompleteClass */
      override var isPluginsReady: scala.Boolean = js.native
      /* CompleteClass */
      override var pluginName: java.lang.String = js.native
      /* CompleteClass */
      override var pluginsInitializedCallback: js.Array[_] = js.native
      /* CompleteClass */
      override def addHook(name: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
      /* CompleteClass */
      override def callOnPluginsReady(callback: js.Function0[scala.Unit]): scala.Unit = js.native
      /* CompleteClass */
      override def clearHooks(): scala.Unit = js.native
      /* CompleteClass */
      override def destroy(): scala.Unit = js.native
      /* CompleteClass */
      override def disablePlugin(): scala.Unit = js.native
      /* CompleteClass */
      override def enablePlugin(): scala.Unit = js.native
      /* CompleteClass */
      override def init(): scala.Unit = js.native
      /* CompleteClass */
      override def removeHook(name: java.lang.String): scala.Unit = js.native
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
      extends handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Autocomplete
    
    @js.native
    abstract class Base protected ()
      extends handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base {
      def this(hotInstance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core, row: scala.Double, col: scala.Double, prop: java.lang.String, TD: stdLib.HTMLTableCellElement, cellProperties: handsontableLib.handsontableMod.HandsontableNs.CellProperties) = this()
      def this(hotInstance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core, row: scala.Double, col: scala.Double, prop: scala.Double, TD: stdLib.HTMLTableCellElement, cellProperties: handsontableLib.handsontableMod.HandsontableNs.CellProperties) = this()
    }
    
    @js.native
    class Checkbox ()
      extends handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Checkbox
    
    @js.native
    class Date ()
      extends handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Date
    
    @js.native
    class Dropdown ()
      extends handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Dropdown
    
    @js.native
    class Handsontable ()
      extends handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Handsontable
    
    @js.native
    class Mobile ()
      extends handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Mobile
    
    @js.native
    class Numeric ()
      extends handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Numeric
    
    @js.native
    class Password ()
      extends handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Password
    
    @js.native
    class Select ()
      extends handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Select
    
    @js.native
    class Text ()
      extends handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Text
    
  }
  
}

