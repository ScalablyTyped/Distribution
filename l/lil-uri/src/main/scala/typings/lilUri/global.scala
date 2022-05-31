package typings.lilUri

import typings.lilUri.mod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Parses the given URI string
    *
    * @param the URI string to parse.
    */
  inline def lil(): URI = js.Dynamic.global.applyDynamic("lil")().asInstanceOf[URI]
  inline def lil(uri: String): URI = js.Dynamic.global.applyDynamic("lil")(uri.asInstanceOf[js.Any]).asInstanceOf[URI]
}
