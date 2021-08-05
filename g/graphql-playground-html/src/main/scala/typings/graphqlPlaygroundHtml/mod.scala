package typings.graphqlPlaygroundHtml

import typings.graphqlPlaygroundHtml.renderPlaygroundPageMod.RenderPageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphql-playground-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderPlaygroundPage(options: RenderPageOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPlaygroundPage")(options.asInstanceOf[js.Any]).asInstanceOf[String]
}
