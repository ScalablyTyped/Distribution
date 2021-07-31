package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.LoadFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipldFormatsMod {
  
  @scala.inline
  def apply(): js.Function = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function]
  @scala.inline
  def apply(hasFormatsLoadFormat: LoadFormat): js.Function = ^.asInstanceOf[js.Dynamic].apply(hasFormatsLoadFormat.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @JSImport("ipfs-http-client/dist/src/lib/ipld-formats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CID = typings.cids.mod.^
}
