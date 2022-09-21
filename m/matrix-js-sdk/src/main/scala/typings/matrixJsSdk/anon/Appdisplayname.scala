package typings.matrixJsSdk.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appdisplayname extends StObject {
  
  var app_display_name: String
  
  var app_id: String
  
  // If true, the homeserver should add another pusher with the given pushkey and App ID in addition to any others
  // with different user IDs. Otherwise, the homeserver must remove any other pushers with the same App ID and
  // pushkey for different users. The default is false.
  var append: js.UndefOr[Boolean] = js.undefined
  
  // A dictionary of information for the pusher implementation itself. If `kind` is `http`,
  // this should contain `url` which is the URL to use to send notifications to.
  var data: Record[String, Any]
  
  var device_display_name: String
  
  var kind: String
  
  var lang: String
  
  // This string determines which set of device specific rules this pusher executes.
  var profile_tag: js.UndefOr[String] = js.undefined
  
  var pushkey: String
}
object Appdisplayname {
  
  inline def apply(
    app_display_name: String,
    app_id: String,
    data: Record[String, Any],
    device_display_name: String,
    kind: String,
    lang: String,
    pushkey: String
  ): Appdisplayname = {
    val __obj = js.Dynamic.literal(app_display_name = app_display_name.asInstanceOf[js.Any], app_id = app_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], device_display_name = device_display_name.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], pushkey = pushkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appdisplayname]
  }
  
  extension [Self <: Appdisplayname](x: Self) {
    
    inline def setApp_display_name(value: String): Self = StObject.set(x, "app_display_name", value.asInstanceOf[js.Any])
    
    inline def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDevice_display_name(value: String): Self = StObject.set(x, "device_display_name", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setProfile_tag(value: String): Self = StObject.set(x, "profile_tag", value.asInstanceOf[js.Any])
    
    inline def setProfile_tagUndefined: Self = StObject.set(x, "profile_tag", js.undefined)
    
    inline def setPushkey(value: String): Self = StObject.set(x, "pushkey", value.asInstanceOf[js.Any])
  }
}
