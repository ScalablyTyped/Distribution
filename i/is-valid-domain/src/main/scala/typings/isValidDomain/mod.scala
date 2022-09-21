package typings.isValidDomain

import typings.isValidDomain.anon.AllowUnicode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(text: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(text: String, opts: AllowUnicode): Boolean = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("is-valid-domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
