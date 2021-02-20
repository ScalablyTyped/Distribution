package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PdlInitFile extends StObject {
  
  var `pdl-init-file-entry`: js.UndefOr[String] = js.native
  
  var `pdl-init-file-location`: js.UndefOr[String] = js.native
  
  var `pdl-init-file-name`: js.UndefOr[String] = js.native
}
object PdlInitFile {
  
  @scala.inline
  def apply(): PdlInitFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdlInitFile]
  }
  
  @scala.inline
  implicit class PdlInitFileMutableBuilder[Self <: PdlInitFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setPdl-init-file-entry`(value: String): Self = StObject.set(x, "pdl-init-file-entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPdl-init-file-entryUndefined`: Self = StObject.set(x, "pdl-init-file-entry", js.undefined)
    
    @scala.inline
    def `setPdl-init-file-location`(value: String): Self = StObject.set(x, "pdl-init-file-location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPdl-init-file-locationUndefined`: Self = StObject.set(x, "pdl-init-file-location", js.undefined)
    
    @scala.inline
    def `setPdl-init-file-name`(value: String): Self = StObject.set(x, "pdl-init-file-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPdl-init-file-nameUndefined`: Self = StObject.set(x, "pdl-init-file-name", js.undefined)
  }
}
