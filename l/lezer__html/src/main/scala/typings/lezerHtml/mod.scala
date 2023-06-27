package typings.lezerHtml

import typings.lezerCommon.distParseMod.ParseWrapper
import typings.lezerHtml.anon.Attrs
import typings.lezerHtml.anon.Name
import typings.lezerLr.mod.LRParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lezer/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configureNesting(): ParseWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("configureNesting")().asInstanceOf[ParseWrapper]
  inline def configureNesting(tags: js.Array[Attrs]): ParseWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("configureNesting")(tags.asInstanceOf[js.Any]).asInstanceOf[ParseWrapper]
  inline def configureNesting(tags: js.Array[Attrs], attributes: js.Array[Name]): ParseWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("configureNesting")(tags.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ParseWrapper]
  inline def configureNesting(tags: Unit, attributes: js.Array[Name]): ParseWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("configureNesting")(tags.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ParseWrapper]
  
  @JSImport("@lezer/html", "parser")
  @js.native
  val parser: LRParser = js.native
}
