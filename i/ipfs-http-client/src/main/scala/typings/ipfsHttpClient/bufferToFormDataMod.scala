package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferToFormDataMod {
  
  @scala.inline
  def apply(buf: js.Any): typings.formData.mod.^ = ^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any]).asInstanceOf[typings.formData.mod.^]
  @scala.inline
  def apply(buf: js.Any, hasModeMtimeMtimeNsecs: Mode): typings.formData.mod.^ = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], hasModeMtimeMtimeNsecs.asInstanceOf[js.Any])).asInstanceOf[typings.formData.mod.^]
  
  @JSImport("ipfs-http-client/dist/src/lib/buffer-to-form-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
