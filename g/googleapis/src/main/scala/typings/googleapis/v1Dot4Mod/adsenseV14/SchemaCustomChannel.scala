package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleapis.anon.AdsAppearOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCustomChannel extends StObject {
  
  /**
    * Code of this custom channel, not necessarily unique across ad clients.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier of this custom channel. This should be considered an
    * opaque identifier; it is not safe to rely on it being in any particular
    * format.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is, in this case adsense#customChannel.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this custom channel.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The targeting information of this custom channel, if activated.
    */
  var targetingInfo: js.UndefOr[AdsAppearOn] = js.native
}
object SchemaCustomChannel {
  
  @scala.inline
  def apply(): SchemaCustomChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomChannel]
  }
  
  @scala.inline
  implicit class SchemaCustomChannelMutableBuilder[Self <: SchemaCustomChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTargetingInfo(value: AdsAppearOn): Self = StObject.set(x, "targetingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingInfoUndefined: Self = StObject.set(x, "targetingInfo", js.undefined)
  }
}
