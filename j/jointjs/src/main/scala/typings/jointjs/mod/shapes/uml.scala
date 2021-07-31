package typings.jointjs.mod.shapes

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.attributes.SVGCircleAttributes
import typings.jointjs.mod.attributes.SVGPathAttributes
import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import typings.jointjs.mod.dia.Element
import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.dia.ElementView
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link
import typings.jointjs.mod.dia.Link.Attributes
import typings.jointjs.mod.shapes.basic.Circle
import typings.jointjs.mod.shapes.basic.CircleSelectors
import typings.jointjs.mod.shapes.basic.Generic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uml {
  
  @JSImport("jointjs", "shapes.uml.Abstract")
  @js.native
  class Abstract () extends Class {
    def this(attributes: ClassAttributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: ClassAttributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.AbstractView")
  @js.native
  class AbstractView () extends ClassView {
    def this(attributes: ClassAttributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: ClassAttributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.Aggregation")
  @js.native
  // default label props
  class Aggregation () extends Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.Association")
  @js.native
  // default label props
  class Association () extends Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.Class")
  @js.native
  class Class () extends Generic {
    def this(attributes: ClassAttributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: ClassAttributes, opt: StringDictionary[js.Any]) = this()
    
    def getClassName(): js.Array[String] = js.native
    
    /* protected */ def updateRectangles(): Unit = js.native
  }
  
  @JSImport("jointjs", "shapes.uml.ClassView")
  @js.native
  class ClassView () extends ElementView {
    def this(opt: typings.jointjs.mod.dia.CellView.Options[Element]) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.Composition")
  @js.native
  // default label props
  class Composition () extends Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.EndState")
  @js.native
  class EndState () extends Generic {
    def this(attributes: GenericAttributes[EndStateSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[EndStateSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.Generalization")
  @js.native
  // default label props
  class Generalization () extends Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.Implementation")
  @js.native
  // default label props
  class Implementation () extends Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.Interface")
  @js.native
  class Interface () extends Class {
    def this(attributes: ClassAttributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: ClassAttributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.InterfaceView")
  @js.native
  class InterfaceView () extends ClassView {
    def this(attributes: ClassAttributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: ClassAttributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.StartState")
  @js.native
  class StartState () extends Circle {
    def this(attributes: GenericAttributes[CircleSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[CircleSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.uml.State")
  @js.native
  class State () extends Generic {
    def this(attributes: GenericAttributes[StateSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[StateSelectors], opt: StringDictionary[js.Any]) = this()
    
    /* protected */ def updateEvents(): Unit = js.native
    
    /* protected */ def updateName(): Unit = js.native
    
    /* protected */ def updatePath(): Unit = js.native
  }
  
  @JSImport("jointjs", "shapes.uml.Transition")
  @js.native
  // default label props
  class Transition () extends Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  trait ClassAttributes
    extends StObject
       with GenericAttributes[SVGRectSelector] {
    
    var attributes: js.Array[String]
    
    var methods: js.Array[String]
    
    var name: js.Array[String]
  }
  object ClassAttributes {
    
    @scala.inline
    def apply(attributes: js.Array[String], methods: js.Array[String], name: js.Array[String]): ClassAttributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassAttributes]
    }
    
    @scala.inline
    implicit class ClassAttributesMutableBuilder[Self <: ClassAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
    }
  }
  
  trait EndStateSelectors
    extends StObject
       with Selectors {
    
    @JSName("circle.inner")
    var circleDotinner: js.UndefOr[SVGCircleAttributes] = js.undefined
    
    @JSName("circle.outer")
    var circleDotouter: js.UndefOr[SVGCircleAttributes] = js.undefined
  }
  object EndStateSelectors {
    
    @scala.inline
    def apply(): EndStateSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndStateSelectors]
    }
    
    @scala.inline
    implicit class EndStateSelectorsMutableBuilder[Self <: EndStateSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircleDotinner(value: SVGCircleAttributes): Self = StObject.set(x, "circle.inner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleDotinnerUndefined: Self = StObject.set(x, "circle.inner", js.undefined)
      
      @scala.inline
      def setCircleDotouter(value: SVGCircleAttributes): Self = StObject.set(x, "circle.outer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleDotouterUndefined: Self = StObject.set(x, "circle.outer", js.undefined)
    }
  }
  
  trait StateSelectors
    extends StObject
       with Selectors {
    
    @JSName(".uml-state-body")
    var `Dotuml-state-body`: js.UndefOr[SVGRectAttributes] = js.undefined
    
    @JSName(".uml-state-events")
    var `Dotuml-state-events`: js.UndefOr[SVGTextAttributes] = js.undefined
    
    @JSName(".uml-state-name")
    var `Dotuml-state-name`: js.UndefOr[SVGTextAttributes] = js.undefined
    
    @JSName(".uml-state-separator")
    var `Dotuml-state-separator`: js.UndefOr[SVGPathAttributes] = js.undefined
  }
  object StateSelectors {
    
    @scala.inline
    def apply(): StateSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateSelectors]
    }
    
    @scala.inline
    implicit class StateSelectorsMutableBuilder[Self <: StateSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setDotuml-state-body`(value: SVGRectAttributes): Self = StObject.set(x, ".uml-state-body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDotuml-state-bodyUndefined`: Self = StObject.set(x, ".uml-state-body", js.undefined)
      
      @scala.inline
      def `setDotuml-state-events`(value: SVGTextAttributes): Self = StObject.set(x, ".uml-state-events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDotuml-state-eventsUndefined`: Self = StObject.set(x, ".uml-state-events", js.undefined)
      
      @scala.inline
      def `setDotuml-state-name`(value: SVGTextAttributes): Self = StObject.set(x, ".uml-state-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDotuml-state-nameUndefined`: Self = StObject.set(x, ".uml-state-name", js.undefined)
      
      @scala.inline
      def `setDotuml-state-separator`(value: SVGPathAttributes): Self = StObject.set(x, ".uml-state-separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDotuml-state-separatorUndefined`: Self = StObject.set(x, ".uml-state-separator", js.undefined)
    }
  }
}
