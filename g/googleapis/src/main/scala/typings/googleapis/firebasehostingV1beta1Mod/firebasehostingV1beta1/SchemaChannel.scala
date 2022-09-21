package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannel extends StObject {
  
  /**
    * Output only. The time at which the channel was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the channel will be automatically deleted. If null, the channel will not be automatically deleted. This field is present in the output whether it's set directly or via the `ttl` field.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Text labels used for extra metadata and/or filtering.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The fully-qualified resource name for the channel, in the format: sites/ SITE_ID/channels/CHANNEL_ID
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current release for the channel, if any.
    */
  var release: js.UndefOr[SchemaRelease] = js.undefined
  
  /**
    * The number of previous releases to retain on the channel for rollback or other purposes. Must be a number between 1-100. Defaults to 10 for new channels.
    */
  var retainedReleaseCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Input only. A time-to-live for this channel. Sets `expire_time` to the provided duration past the time of the request.
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which the channel was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The URL at which the content of this channel's current release can be viewed. This URL is a Firebase-provided subdomain of `web.app`. The content of this channel's current release can also be viewed at the Firebase-provided subdomain of `firebaseapp.com`. If this channel is the `live` channel for the Hosting site, then the content of this channel's current release can also be viewed at any connected custom domains.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannel {
  
  inline def apply(): SchemaChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannel]
  }
  
  extension [Self <: SchemaChannel](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRelease(value: SchemaRelease): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setRetainedReleaseCount(value: Double): Self = StObject.set(x, "retainedReleaseCount", value.asInstanceOf[js.Any])
    
    inline def setRetainedReleaseCountNull: Self = StObject.set(x, "retainedReleaseCount", null)
    
    inline def setRetainedReleaseCountUndefined: Self = StObject.set(x, "retainedReleaseCount", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
