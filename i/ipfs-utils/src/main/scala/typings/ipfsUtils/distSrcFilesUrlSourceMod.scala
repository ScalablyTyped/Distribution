package typings.ipfsUtils

import typings.ipfsUtils.anon.Content
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
  inline def apply(url: String): Content = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Content]
  inline def apply(url: String, options: HTTPOptions): Content = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Content]
  
  @JSImport("ipfs-utils/dist/src/files/url-source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
