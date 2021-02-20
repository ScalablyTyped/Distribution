package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserDataAccessConfig extends StObject {
  
  /** Structured Data Files (SDF) settings for the advertiser. If not specified, the SDF settings of the parent partner are used. */
  var sdfConfig: js.UndefOr[AdvertiserSdfConfig] = js.native
}
object AdvertiserDataAccessConfig {
  
  @scala.inline
  def apply(): AdvertiserDataAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserDataAccessConfig]
  }
  
  @scala.inline
  implicit class AdvertiserDataAccessConfigMutableBuilder[Self <: AdvertiserDataAccessConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSdfConfig(value: AdvertiserSdfConfig): Self = StObject.set(x, "sdfConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdfConfigUndefined: Self = StObject.set(x, "sdfConfig", js.undefined)
  }
}
