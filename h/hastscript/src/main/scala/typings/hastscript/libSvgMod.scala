package typings.hastscript

import typings.hast.mod.Element
import typings.hast.mod.Root
import typings.hastscript.libCoreMod.HChild
import typings.hastscript.libCoreMod.HProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSvgMod {
  
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
      
      type Element = typings.hastscript.libJsxClassicMod.Element
      
      type ElementChildrenAttribute = typings.hastscript.libJsxClassicMod.ElementChildrenAttribute
      
      type IntrinsicAttributes = typings.hastscript.libJsxClassicMod.IntrinsicAttributes
      
      type IntrinsicElements = typings.hastscript.libJsxClassicMod.IntrinsicElements
    }
  }
  
  type Child = HChild
  
  type Properties = HProperties
}
