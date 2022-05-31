package typings.jointjs.global.joint

import typings.jointjs.anon.CellModel
import typings.jointjs.mod.dia.Cell.Attributes
import typings.jointjs.mod.dia.Cell.Constructor
import typings.jointjs.mod.dia.CellView.PresentationAttributes
import typings.jointjs.mod.dia.Graph.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dia {
  
  @JSGlobal("joint.dia.Cell")
  @js.native
  class Cell ()
    extends typings.jointjs.mod.dia.Cell {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  object Cell {
    
    @JSGlobal("joint.dia.Cell")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def define(`type`: String): Constructor[typings.jointjs.mod.dia.Cell] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any]).asInstanceOf[Constructor[typings.jointjs.mod.dia.Cell]]
    inline def define(`type`: String, defaults: js.Any): Constructor[typings.jointjs.mod.dia.Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Cell]]
    inline def define(`type`: String, defaults: js.Any, protoProps: js.Any): Constructor[typings.jointjs.mod.dia.Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Cell]]
    inline def define(`type`: String, defaults: js.Any, protoProps: js.Any, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Cell]]
    inline def define(`type`: String, defaults: js.Any, protoProps: Unit, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Cell]]
    inline def define(`type`: String, defaults: Unit, protoProps: js.Any): Constructor[typings.jointjs.mod.dia.Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Cell]]
    inline def define(`type`: String, defaults: Unit, protoProps: js.Any, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Cell]]
    inline def define(`type`: String, defaults: Unit, protoProps: Unit, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Cell]]
  }
  
  @JSGlobal("joint.dia.CellView")
  @js.native
  class CellView ()
    extends typings.jointjs.mod.dia.CellView {
    def this(opt: typings.jointjs.mod.dia.CellView.Options[typings.jointjs.mod.dia.Cell]) = this()
  }
  
  @JSGlobal("joint.dia.CellViewGeneric")
  @js.native
  abstract class CellViewGeneric[T /* <: typings.jointjs.mod.dia.Cell */] ()
    extends typings.jointjs.mod.dia.CellViewGeneric[T] {
    def this(opt: typings.jointjs.mod.dia.CellView.Options[T]) = this()
  }
  object CellViewGeneric {
    
    @JSGlobal("joint.dia.CellViewGeneric")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addPresentationAttributes(attributes: PresentationAttributes): PresentationAttributes = ^.asInstanceOf[js.Dynamic].applyDynamic("addPresentationAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[PresentationAttributes]
  }
  
  @JSGlobal("joint.dia.Element")
  @js.native
  class Element ()
    extends typings.jointjs.mod.dia.Element {
    def this(attributes: typings.jointjs.mod.dia.Element.Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: typings.jointjs.mod.dia.Element.Attributes, opt: Options) = this()
  }
  object Element {
    
    @JSGlobal("joint.dia.Element")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def define(`type`: String): Constructor[typings.jointjs.mod.dia.Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any]).asInstanceOf[Constructor[typings.jointjs.mod.dia.Element]]
    inline def define(`type`: String, defaults: js.Any): Constructor[typings.jointjs.mod.dia.Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Element]]
    inline def define(`type`: String, defaults: js.Any, protoProps: js.Any): Constructor[typings.jointjs.mod.dia.Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Element]]
    inline def define(`type`: String, defaults: js.Any, protoProps: js.Any, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Element]]
    inline def define(`type`: String, defaults: js.Any, protoProps: Unit, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Element]]
    inline def define(`type`: String, defaults: Unit, protoProps: js.Any): Constructor[typings.jointjs.mod.dia.Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Element]]
    inline def define(`type`: String, defaults: Unit, protoProps: js.Any, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Element]]
    inline def define(`type`: String, defaults: Unit, protoProps: Unit, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Element]]
  }
  
  @JSGlobal("joint.dia.ElementView")
  @js.native
  class ElementView ()
    extends typings.jointjs.mod.dia.ElementView {
    def this(opt: typings.jointjs.mod.dia.CellView.Options[typings.jointjs.mod.dia.Element]) = this()
  }
  
  @JSGlobal("joint.dia.Graph")
  @js.native
  class Graph ()
    extends typings.jointjs.mod.dia.Graph {
    def this(attributes: js.Any) = this()
    def this(attributes: js.Any, opt: CellModel) = this()
    def this(attributes: Unit, opt: CellModel) = this()
  }
  
  @JSGlobal("joint.dia.Link")
  @js.native
  // default label props
  class Link ()
    extends typings.jointjs.mod.dia.Link {
    def this(attributes: typings.jointjs.mod.dia.Link.Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: typings.jointjs.mod.dia.Link.Attributes, opt: Options) = this()
  }
  object Link {
    
    @JSGlobal("joint.dia.Link")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def define(`type`: String): Constructor[typings.jointjs.mod.dia.Link] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any]).asInstanceOf[Constructor[typings.jointjs.mod.dia.Link]]
    inline def define(`type`: String, defaults: js.Any): Constructor[typings.jointjs.mod.dia.Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Link]]
    inline def define(`type`: String, defaults: js.Any, protoProps: js.Any): Constructor[typings.jointjs.mod.dia.Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Link]]
    inline def define(`type`: String, defaults: js.Any, protoProps: js.Any, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Link]]
    inline def define(`type`: String, defaults: js.Any, protoProps: Unit, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Link]]
    inline def define(`type`: String, defaults: Unit, protoProps: js.Any): Constructor[typings.jointjs.mod.dia.Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Link]]
    inline def define(`type`: String, defaults: Unit, protoProps: js.Any, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Link]]
    inline def define(`type`: String, defaults: Unit, protoProps: Unit, staticProps: js.Any): Constructor[typings.jointjs.mod.dia.Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], protoProps.asInstanceOf[js.Any], staticProps.asInstanceOf[js.Any])).asInstanceOf[Constructor[typings.jointjs.mod.dia.Link]]
  }
  
  @JSGlobal("joint.dia.LinkView")
  @js.native
  class LinkView ()
    extends typings.jointjs.mod.dia.LinkView {
    def this(opt: typings.jointjs.mod.dia.CellView.Options[typings.jointjs.mod.dia.Link]) = this()
  }
  
  @JSGlobal("joint.dia.Paper")
  @js.native
  class Paper protected ()
    extends typings.jointjs.mod.dia.Paper {
    def this(opt: typings.jointjs.mod.dia.Paper.Options) = this()
  }
  object Paper {
    
    @JSGlobal("joint.dia.Paper.sorting")
    @js.native
    object sorting extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.jointjs.mod.dia.Paper.sorting & String] = js.native
      
      /* "sorting-approximate" */ val APPROX: typings.jointjs.mod.dia.Paper.sorting.APPROX & String = js.native
      
      /* "sorting-exact" */ val EXACT: typings.jointjs.mod.dia.Paper.sorting.EXACT & String = js.native
      
      /* "sorting-none" */ val NONE: typings.jointjs.mod.dia.Paper.sorting.NONE & String = js.native
    }
  }
  
  @JSGlobal("joint.dia.ToolView")
  @js.native
  class ToolView ()
    extends typings.jointjs.mod.dia.ToolView {
    def this(opt: typings.jointjs.mod.dia.ToolView.Options) = this()
  }
  
  @JSGlobal("joint.dia.ToolsView")
  @js.native
  class ToolsView ()
    extends typings.jointjs.mod.dia.ToolsView {
    def this(opt: typings.jointjs.mod.dia.ToolsView.Options) = this()
  }
}
