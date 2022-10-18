package typings.jupyterlabUiComponents

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabUiComponents.anon.Ignore
import typings.jupyterlabUiComponents.jupyterlabUiComponentsBooleans.`false`
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("@jupyterlab/ui-components/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def classesDedupe_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[Any]])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classesDedupe")(classes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def classes_false(classes: (js.UndefOr[String | `false` | Null | StringDictionary[Any]])*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classes")(classes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def getReactAttrs(elem: Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getReactAttrs")(elem.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getReactAttrs(elem: Element, hasIgnore: Ignore): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getReactAttrs")(elem.asInstanceOf[js.Any], hasIgnore.asInstanceOf[js.Any])).asInstanceOf[Any]
}
