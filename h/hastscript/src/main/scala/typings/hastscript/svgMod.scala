package typings.hastscript

import typings.hast.mod.Element
import typings.hast.mod.Root
import typings.hastscript.coreMod.HChild
import typings.hastscript.coreMod.HProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgMod {
  
  object s {
    
    inline def apply(): Root = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Root]
    inline def apply(selector: String, children: HChild*): Element = ^.asInstanceOf[js.Dynamic].apply(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Element]
    inline def apply(selector: String, properties: Unit, children: HChild*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply(selector: String, properties: HProperties, children: HChild*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply(selector: Null, children: HChild*): Root = ^.asInstanceOf[js.Dynamic].apply(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Root]
    inline def apply(selector: Unit, children: HChild*): Root = ^.asInstanceOf[js.Dynamic].apply(scala.List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Root]
    
    @JSImport("hastscript/lib/svg", "s")
    @js.native
    val ^ : js.Any = js.native
    
    object JSX {
      
      type Element = typings.hastscript.jsxClassicMod.Element
      
      type ElementChildrenAttribute = typings.hastscript.jsxClassicMod.ElementChildrenAttribute
      
      type IntrinsicAttributes = typings.hastscript.jsxClassicMod.IntrinsicAttributes
      
      type IntrinsicElements = typings.hastscript.jsxClassicMod.IntrinsicElements
    }
  }
  
  type Child = HChild
  
  type Properties = HProperties
}
