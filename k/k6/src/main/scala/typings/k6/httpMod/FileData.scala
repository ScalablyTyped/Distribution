package typings.k6.httpMod

import typings.k6.mod.bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("k6/http", "FileData")
@js.native
open class FileData () extends StObject {
  
  /** Content type to include in MIME message. */
  var content_type: js.UndefOr[String] = js.native
  
  /** File data. */
  var data: String | bytes | js.typedarray.ArrayBuffer = js.native
  
  /** Filename to include in MIME message. */
  var filename: js.UndefOr[String] = js.native
}
