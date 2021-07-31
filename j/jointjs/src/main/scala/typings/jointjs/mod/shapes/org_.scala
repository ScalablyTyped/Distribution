package typings.jointjs.mod.shapes

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.attributes.SVGImageAttributes
import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import typings.jointjs.mod.dia.Element
import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.dia.Graph.Options
import typings.jointjs.mod.dia.Link
import typings.jointjs.mod.dia.Link.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object org_ {
  
  @JSImport("jointjs", "shapes.org.Arrow")
  @js.native
  // default label props
  class Arrow () extends Link {
    def this(attributes: Attributes) = this()
    def this(attributes: Unit, opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
  }
  
  @JSImport("jointjs", "shapes.org.Member")
  @js.native
  class Member () extends Element {
    def this(attributes: GenericAttributes[MemberSelectors]) = this()
    def this(attributes: Unit, opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[MemberSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  trait MemberSelectors
    extends StObject
       with Selectors {
    
    @JSName(".card")
    var Dotcard: js.UndefOr[SVGRectAttributes] = js.undefined
    
    @JSName(".name")
    var Dotname: js.UndefOr[SVGTextAttributes] = js.undefined
    
    @JSName(".rank")
    var Dotrank: js.UndefOr[SVGTextAttributes] = js.undefined
    
    var image: js.UndefOr[SVGImageAttributes] = js.undefined
  }
  object MemberSelectors {
    
    @scala.inline
    def apply(): MemberSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberSelectors]
    }
    
    @scala.inline
    implicit class MemberSelectorsMutableBuilder[Self <: MemberSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDotcard(value: SVGRectAttributes): Self = StObject.set(x, ".card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotcardUndefined: Self = StObject.set(x, ".card", js.undefined)
      
      @scala.inline
      def setDotname(value: SVGTextAttributes): Self = StObject.set(x, ".name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotnameUndefined: Self = StObject.set(x, ".name", js.undefined)
      
      @scala.inline
      def setDotrank(value: SVGTextAttributes): Self = StObject.set(x, ".rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotrankUndefined: Self = StObject.set(x, ".rank", js.undefined)
      
      @scala.inline
      def setImage(value: SVGImageAttributes): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    }
  }
}
