package typings.ipfsUtils

import typings.ipfsUtils.anon.Path
import typings.ipfsUtils.distSrcTypesMod.HTTPOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesUrlSourceMod {
  
  /**
    *
    * @param {string} url
    * @param {import("../types").HTTPOptions} [options]
    * @returns {{ path: string; content?: AsyncIterable<Uint8Array> }}
    */
  inline def apply(url: String): Path = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Path]
  inline def apply(url: String, options: HTTPOptions): Path = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Path]
  
  @JSImport("ipfs-utils/dist/src/files/url-source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
