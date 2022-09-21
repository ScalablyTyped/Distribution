package typings.hastscript

import typings.hast.mod.Element
import typings.hast.mod.Root
import typings.hastscript.coreMod.HChild
import typings.hastscript.coreMod.HProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("hastscript/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def h(): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("h")().asInstanceOf[Root]
  inline def h(selector: String, children: HChild*): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Element]
  inline def h(selector: String, properties: Unit, children: HChild*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((List(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def h(selector: String, properties: HProperties, children: HChild*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((List(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
  inline def h(selector: Null, children: HChild*): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Root]
  inline def h(selector: Unit, children: HChild*): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(List(selector.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Root]
  
  type Child = typings.hastscript.libMod.Child
  
  type Properties = typings.hastscript.libMod.Properties
}
