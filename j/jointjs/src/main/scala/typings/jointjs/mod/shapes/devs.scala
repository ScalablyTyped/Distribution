package typings.jointjs.mod.shapes

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link.Attributes
import typings.jointjs.mod.shapes.basic.Generic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devs {
  
  @JSImport("jointjs", "shapes.devs.Atomic")
  @js.native
  class Atomic () extends Model {
    def this(attributes: ModelAttributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: ModelAttributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.devs.Coupled")
  @js.native
  class Coupled () extends Model {
    def this(attributes: ModelAttributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: ModelAttributes, opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.devs.Link")
  @js.native
  // default label props
  class Link ()
    extends typings.jointjs.mod.dia.Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.devs.Model")
  @js.native
  class Model () extends Generic {
    def this(attributes: ModelAttributes) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: ModelAttributes, opt: StringDictionary[js.Any]) = this()
    
    def addInPort(port: String): this.type = js.native
    def addInPort(port: String, opt: js.Any): this.type = js.native
    
    def addOutPort(port: String): this.type = js.native
    def addOutPort(port: String, opt: js.Any): this.type = js.native
    
    def changeInGroup(properties: js.Any): Boolean = js.native
    def changeInGroup(properties: js.Any, opt: js.Any): Boolean = js.native
    
    def changeOutGroup(properties: js.Any): Boolean = js.native
    def changeOutGroup(properties: js.Any, opt: js.Any): Boolean = js.native
    
    def createPortItem(group: String, port: String): js.Any = js.native
    
    def createPortItems(group: String, ports: js.Array[String]): js.Array[js.Any] = js.native
    
    def removeInPort(port: String): this.type = js.native
    def removeInPort(port: String, opt: js.Any): this.type = js.native
    
    def removeOutPort(port: String): this.type = js.native
    def removeOutPort(port: String, opt: js.Any): this.type = js.native
  }
  
  trait ModelAttributes
    extends StObject
       with GenericAttributes[ModelSelectors] {
    
    var inPorts: js.UndefOr[js.Array[String]] = js.undefined
    
    var outPorts: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ModelAttributes {
    
    @scala.inline
    def apply(): ModelAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelAttributes]
    }
    
    @scala.inline
    implicit class ModelAttributesMutableBuilder[Self <: ModelAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInPorts(value: js.Array[String]): Self = StObject.set(x, "inPorts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInPortsUndefined: Self = StObject.set(x, "inPorts", js.undefined)
      
      @scala.inline
      def setInPortsVarargs(value: String*): Self = StObject.set(x, "inPorts", js.Array(value :_*))
      
      @scala.inline
      def setOutPorts(value: js.Array[String]): Self = StObject.set(x, "outPorts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutPortsUndefined: Self = StObject.set(x, "outPorts", js.undefined)
      
      @scala.inline
      def setOutPortsVarargs(value: String*): Self = StObject.set(x, "outPorts", js.Array(value :_*))
    }
  }
  
  trait ModelSelectors
    extends StObject
       with Selectors {
    
    @JSName(".body")
    var Dotbody: js.UndefOr[SVGRectAttributes] = js.undefined
    
    @JSName(".label")
    var Dotlabel: js.UndefOr[SVGTextAttributes] = js.undefined
  }
  object ModelSelectors {
    
    @scala.inline
    def apply(): ModelSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelSelectors]
    }
    
    @scala.inline
    implicit class ModelSelectorsMutableBuilder[Self <: ModelSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDotbody(value: SVGRectAttributes): Self = StObject.set(x, ".body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotbodyUndefined: Self = StObject.set(x, ".body", js.undefined)
      
      @scala.inline
      def setDotlabel(value: SVGTextAttributes): Self = StObject.set(x, ".label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotlabelUndefined: Self = StObject.set(x, ".label", js.undefined)
    }
  }
}
