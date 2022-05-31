package typings.jupyterlabUiComponents

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabUiComponents.anon.Ignore
import typings.jupyterlabUiComponents.jupyterlabUiComponentsBooleans.`false`
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@jupyterlab/ui-components/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def classesDedupe_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classesDedupe")(classes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[js.Any]])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classes")(classes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getReactAttrs(elem: Element): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getReactAttrs")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def getReactAttrs(elem: Element, hasIgnore: Ignore): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getReactAttrs")(elem.asInstanceOf[js.Any], hasIgnore.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
