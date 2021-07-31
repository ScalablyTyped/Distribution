package typings.inversify

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
  @JSImport("inversify/dts/utils/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def template(strings: TemplateStringsArray, keys: js.Any*): js.Function1[/* repeated */ js.Any, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(strings.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, String]]
}
