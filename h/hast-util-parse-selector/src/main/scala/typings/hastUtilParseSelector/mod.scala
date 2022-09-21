package typings.hastUtilParseSelector

import typings.hastUtilParseSelector.anon.TagName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-parse-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseSelector[Selector /* <: String */, DefaultTagName /* <: String */](): typings.hast.mod.Element & (TagName[Selector, DefaultTagName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")().asInstanceOf[typings.hast.mod.Element & (TagName[Selector, DefaultTagName])]
  inline def parseSelector[Selector /* <: String */, DefaultTagName /* <: String */](selector: Selector): typings.hast.mod.Element & (TagName[Selector, DefaultTagName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.hast.mod.Element & (TagName[Selector, DefaultTagName])]
  inline def parseSelector[Selector /* <: String */, DefaultTagName /* <: String */](selector: Selector, defaultTagName: DefaultTagName): typings.hast.mod.Element & (TagName[Selector, DefaultTagName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")(selector.asInstanceOf[js.Any], defaultTagName.asInstanceOf[js.Any])).asInstanceOf[typings.hast.mod.Element & (TagName[Selector, DefaultTagName])]
  inline def parseSelector[Selector /* <: String */, DefaultTagName /* <: String */](selector: Unit, defaultTagName: DefaultTagName): typings.hast.mod.Element & (TagName[Selector, DefaultTagName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")(selector.asInstanceOf[js.Any], defaultTagName.asInstanceOf[js.Any])).asInstanceOf[typings.hast.mod.Element & (TagName[Selector, DefaultTagName])]
  
  type Element = typings.hast.mod.Element
  
  type Properties = typings.hast.mod.Properties
}
