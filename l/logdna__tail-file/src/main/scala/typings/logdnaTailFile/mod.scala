package typings.logdnaTailFile

import typings.logdnaTailFile.libTailFileMod.TailFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@logdna/tail-file", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends typings.logdnaTailFile.libTailFileMod.^ {
    /**
      * Instantiating `TailFile` will return a readable stream, but nothing will
      * happen until `start()` is called. After that, follow node's standard
      * procedure to get the stream into flowing mode. Typically, this means
      * using `pipe` or attaching `data` listeners to the readable stream.
      *
      * @param filename The filename to tail. Poll errors do not happen until `start` is called.
      * @param opts Optional options.
      * @throws {TypeError | RangeError} if parameter validation fails.
      */
    def this(filename: String) = this()
    def this(filename: String, opts: TailFileOptions) = this()
  }
}
