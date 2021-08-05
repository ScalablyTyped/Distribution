package typings.htmlDocxJs

import typings.htmlDocxJs.anon.Margins
import typings.node.Buffer
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-docx-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asBlob(
    /**
    * An HTML formatted string. It should be a complete, valid HTML
    * (including DOCTYPE, `html` and `body` tags).
    * This may be less convenient, but gives you possibility of including
    * CSS rules in `style` tags.
    */
  html: String
  ): Blob | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("asBlob")(html.asInstanceOf[js.Any]).asInstanceOf[Blob | Buffer]
  inline def asBlob(
    /**
    * An HTML formatted string. It should be a complete, valid HTML
    * (including DOCTYPE, `html` and `body` tags).
    * This may be less convenient, but gives you possibility of including
    * CSS rules in `style` tags.
    */
  html: String,
    /** Additional options for controlling page setup for the document. */
  options: Margins
  ): Blob | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("asBlob")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Blob | Buffer]
}
