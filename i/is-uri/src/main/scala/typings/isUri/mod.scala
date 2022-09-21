package typings.isUri

import typings.parseUri.mod.Options
import typings.parseUri.mod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(uri: String, opts: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(uri: URI): Boolean = ^.asInstanceOf[js.Dynamic].apply(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(uri: URI, opts: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("is-uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
