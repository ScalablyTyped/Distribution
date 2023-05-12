package typings.hapiHoek

import typings.hapiHoek.mod.reach.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReachTemplateMod {
  
  inline def apply(obj: js.Object, template: String): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: js.Object, template: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Null, template: String): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Null, template: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@hapi/hoek/lib/reachTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
