package typings.jointjs.mod.shapes

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.attributes.SVGCircleAttributes
import typings.jointjs.mod.attributes.SVGImageAttributes
import typings.jointjs.mod.attributes.SVGPathAttributes
import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import typings.jointjs.mod.dia.Element.Attributes
import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link
import typings.jointjs.mod.shapes.basic.CircleSelectors
import typings.jointjs.mod.shapes.basic.Generic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logic {
  
  @JSImport("jointjs", "shapes.logic.And")
  @js.native
  class And () extends Gate21 {
    def this(attributes: GenericAttributes[Gate21Selectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[Gate21Selectors], opt: StringDictionary[js.Any]) = this()
    
    def operation(input1: js.Any, input2: js.Any): Boolean = js.native
  }
  
  @JSImport("jointjs", "shapes.logic.Gate")
  @js.native
  abstract class Gate () extends Generic {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.logic.Gate11")
  @js.native
  class Gate11 () extends Gate {
    def this(attributes: GenericAttributes[Gate11Selectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[Gate11Selectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.logic.Gate21")
  @js.native
  class Gate21 () extends Gate {
    def this(attributes: GenericAttributes[Gate21Selectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[Gate21Selectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.logic.IO")
  @js.native
  class IO () extends Gate {
    def this(attributes: GenericAttributes[CircleSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[CircleSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.logic.Input")
  @js.native
  class Input () extends IO {
    def this(attributes: GenericAttributes[CircleSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[CircleSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.logic.Nand")
  @js.native
  class Nand () extends Gate21 {
    def this(attributes: GenericAttributes[Gate21Selectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[Gate21Selectors], opt: StringDictionary[js.Any]) = this()
    
    def operation(input1: js.Any, input2: js.Any): Boolean = js.native
  }
  
  @JSImport("jointjs", "shapes.logic.Nor")
  @js.native
  class Nor () extends Gate21 {
    def this(attributes: GenericAttributes[Gate21Selectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[Gate21Selectors], opt: StringDictionary[js.Any]) = this()
    
    def operation(input1: js.Any, input2: js.Any): Boolean = js.native
  }
  
  @JSImport("jointjs", "shapes.logic.Not")
  @js.native
  class Not () extends Gate11 {
    def this(attributes: GenericAttributes[Gate11Selectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[Gate11Selectors], opt: StringDictionary[js.Any]) = this()
    
    def operation(input: js.Any): Boolean = js.native
  }
  
  @JSImport("jointjs", "shapes.logic.Or")
  @js.native
  class Or () extends Gate21 {
    def this(attributes: GenericAttributes[Gate21Selectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[Gate21Selectors], opt: StringDictionary[js.Any]) = this()
    
    def operation(input1: js.Any, input2: js.Any): Boolean = js.native
  }
  
  @JSImport("jointjs", "shapes.logic.Output")
  @js.native
  class Output () extends IO {
    def this(attributes: GenericAttributes[CircleSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[CircleSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.logic.Repeater")
  @js.native
  class Repeater () extends Gate11 {
    def this(attributes: GenericAttributes[Gate11Selectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[Gate11Selectors], opt: StringDictionary[js.Any]) = this()
    
    def operation(input: js.Any): js.Any = js.native
  }
  
  @JSImport("jointjs", "shapes.logic.Wire")
  @js.native
  // default label props
  class Wire () extends Link {
    def this(attributes: typings.jointjs.mod.dia.Link.Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: typings.jointjs.mod.dia.Link.Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.logic.Xnor")
  @js.native
  class Xnor () extends Gate21 {
    def this(attributes: GenericAttributes[Gate21Selectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[Gate21Selectors], opt: StringDictionary[js.Any]) = this()
    
    def operation(input1: js.Any, input2: js.Any): Boolean = js.native
  }
  
  @JSImport("jointjs", "shapes.logic.Xor")
  @js.native
  class Xor () extends Gate21 {
    def this(attributes: GenericAttributes[Gate21Selectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[Gate21Selectors], opt: StringDictionary[js.Any]) = this()
    
    def operation(input1: js.Any, input2: js.Any): Boolean = js.native
  }
  
  trait Gate11Selectors
    extends StObject
       with Selectors {
    
    @JSName(".body")
    var Dotbody: js.UndefOr[SVGImageAttributes] = js.undefined
    
    @JSName(".input")
    var Dotinput: js.UndefOr[SVGCircleAttributes] = js.undefined
    
    @JSName(".output")
    var Dotoutput: js.UndefOr[SVGCircleAttributes] = js.undefined
    
    var image: js.UndefOr[SVGImageAttributes] = js.undefined
  }
  object Gate11Selectors {
    
    inline def apply(): Gate11Selectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Gate11Selectors]
    }
    
    extension [Self <: Gate11Selectors](x: Self) {
      
      inline def setDotbody(value: SVGImageAttributes): Self = StObject.set(x, ".body", value.asInstanceOf[js.Any])
      
      inline def setDotbodyUndefined: Self = StObject.set(x, ".body", js.undefined)
      
      inline def setDotinput(value: SVGCircleAttributes): Self = StObject.set(x, ".input", value.asInstanceOf[js.Any])
      
      inline def setDotinputUndefined: Self = StObject.set(x, ".input", js.undefined)
      
      inline def setDotoutput(value: SVGCircleAttributes): Self = StObject.set(x, ".output", value.asInstanceOf[js.Any])
      
      inline def setDotoutputUndefined: Self = StObject.set(x, ".output", js.undefined)
      
      inline def setImage(value: SVGImageAttributes): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    }
  }
  
  trait Gate21Selectors
    extends StObject
       with Selectors {
    
    @JSName(".body")
    var Dotbody: js.UndefOr[SVGImageAttributes] = js.undefined
    
    @JSName(".input")
    var Dotinput: js.UndefOr[SVGCircleAttributes] = js.undefined
    
    @JSName(".input1")
    var Dotinput1: js.UndefOr[SVGCircleAttributes] = js.undefined
    
    @JSName(".input2")
    var Dotinput2: js.UndefOr[SVGCircleAttributes] = js.undefined
    
    @JSName(".output")
    var Dotoutput: js.UndefOr[SVGCircleAttributes] = js.undefined
    
    var image: js.UndefOr[SVGImageAttributes] = js.undefined
  }
  object Gate21Selectors {
    
    inline def apply(): Gate21Selectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Gate21Selectors]
    }
    
    extension [Self <: Gate21Selectors](x: Self) {
      
      inline def setDotbody(value: SVGImageAttributes): Self = StObject.set(x, ".body", value.asInstanceOf[js.Any])
      
      inline def setDotbodyUndefined: Self = StObject.set(x, ".body", js.undefined)
      
      inline def setDotinput(value: SVGCircleAttributes): Self = StObject.set(x, ".input", value.asInstanceOf[js.Any])
      
      inline def setDotinput1(value: SVGCircleAttributes): Self = StObject.set(x, ".input1", value.asInstanceOf[js.Any])
      
      inline def setDotinput1Undefined: Self = StObject.set(x, ".input1", js.undefined)
      
      inline def setDotinput2(value: SVGCircleAttributes): Self = StObject.set(x, ".input2", value.asInstanceOf[js.Any])
      
      inline def setDotinput2Undefined: Self = StObject.set(x, ".input2", js.undefined)
      
      inline def setDotinputUndefined: Self = StObject.set(x, ".input", js.undefined)
      
      inline def setDotoutput(value: SVGCircleAttributes): Self = StObject.set(x, ".output", value.asInstanceOf[js.Any])
      
      inline def setDotoutputUndefined: Self = StObject.set(x, ".output", js.undefined)
      
      inline def setImage(value: SVGImageAttributes): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    }
  }
  
  trait GateSelectors
    extends StObject
       with Selectors {
    
    @JSName(".body")
    var Dotbody: js.UndefOr[SVGRectAttributes] = js.undefined
    
    @JSName(".wire")
    var Dotwire: js.UndefOr[SVGPathAttributes] = js.undefined
    
    var circle: js.UndefOr[SVGCircleAttributes] = js.undefined
    
    var text: js.UndefOr[SVGTextAttributes] = js.undefined
  }
  object GateSelectors {
    
    inline def apply(): GateSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GateSelectors]
    }
    
    extension [Self <: GateSelectors](x: Self) {
      
      inline def setCircle(value: SVGCircleAttributes): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setDotbody(value: SVGRectAttributes): Self = StObject.set(x, ".body", value.asInstanceOf[js.Any])
      
      inline def setDotbodyUndefined: Self = StObject.set(x, ".body", js.undefined)
      
      inline def setDotwire(value: SVGPathAttributes): Self = StObject.set(x, ".wire", value.asInstanceOf[js.Any])
      
      inline def setDotwireUndefined: Self = StObject.set(x, ".wire", js.undefined)
      
      inline def setText(value: SVGTextAttributes): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
