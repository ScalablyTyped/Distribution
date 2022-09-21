package typings.ipfsUnixfsExporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractDataFromBlockMod {
  
  @JSImport("ipfs-unixfs-exporter/dist/src/utils/extract-data-from-block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {Uint8Array} block
    * @param {number} blockStart
    * @param {number} requestedStart
    * @param {number} requestedEnd
    */
  inline def default(block: js.typedarray.Uint8Array, blockStart: Double, requestedStart: Double, requestedEnd: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(block.asInstanceOf[js.Any], blockStart.asInstanceOf[js.Any], requestedStart.asInstanceOf[js.Any], requestedEnd.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
