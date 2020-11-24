package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the Instance resource.
  */
@js.native
trait SchemaInstance extends js.Object {
  
  /**
    * URI which shows where a user can acquire this instance.
    */
  var acquisitionUri: js.UndefOr[String] = js.native
  
  /**
    * Platform dependent details for Android.
    */
  var androidInstance: js.UndefOr[SchemaInstanceAndroidDetails] = js.native
  
  /**
    * Platform dependent details for iOS.
    */
  var iosInstance: js.UndefOr[SchemaInstanceIosDetails] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#instance.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Localized display name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The platform type. Possible values are:   - &quot;ANDROID&quot; -
    * Instance is for Android.  - &quot;IOS&quot; - Instance is for iOS  -
    * &quot;WEB_APP&quot; - Instance is for Web App.
    */
  var platformType: js.UndefOr[String] = js.native
  
  /**
    * Flag to show if this game instance supports realtime play.
    */
  var realtimePlay: js.UndefOr[Boolean] = js.native
  
  /**
    * Flag to show if this game instance supports turn based play.
    */
  var turnBasedPlay: js.UndefOr[Boolean] = js.native
  
  /**
    * Platform dependent details for Web.
    */
  var webInstance: js.UndefOr[SchemaInstanceWebDetails] = js.native
}
object SchemaInstance {
  
  @scala.inline
  def apply(): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstance]
  }
  
  @scala.inline
  implicit class SchemaInstanceOps[Self <: SchemaInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcquisitionUri(value: String): Self = this.set("acquisitionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcquisitionUri: Self = this.set("acquisitionUri", js.undefined)
    
    @scala.inline
    def setAndroidInstance(value: SchemaInstanceAndroidDetails): Self = this.set("androidInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidInstance: Self = this.set("androidInstance", js.undefined)
    
    @scala.inline
    def setIosInstance(value: SchemaInstanceIosDetails): Self = this.set("iosInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosInstance: Self = this.set("iosInstance", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlatformType(value: String): Self = this.set("platformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformType: Self = this.set("platformType", js.undefined)
    
    @scala.inline
    def setRealtimePlay(value: Boolean): Self = this.set("realtimePlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealtimePlay: Self = this.set("realtimePlay", js.undefined)
    
    @scala.inline
    def setTurnBasedPlay(value: Boolean): Self = this.set("turnBasedPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTurnBasedPlay: Self = this.set("turnBasedPlay", js.undefined)
    
    @scala.inline
    def setWebInstance(value: SchemaInstanceWebDetails): Self = this.set("webInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebInstance: Self = this.set("webInstance", js.undefined)
  }
}
