package typings.isoRandomStream

import typings.readableStream.mod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iso-random-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def randomStream(): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("randomStream")().asInstanceOf[Readable]
  inline def randomStream(size: Double): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("randomStream")(size.asInstanceOf[js.Any]).asInstanceOf[Readable]
}
