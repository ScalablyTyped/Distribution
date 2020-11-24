package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.DagIpns
import typings.ipfsCore.anon.FnCallHasDnsIpnsPeerIdIsOnlineOptions
import typings.ipfsCore.publishMod.PublishResult
import typings.ipfsCore.publishMod.PublishSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name_ extends js.Object {
  
  var publish: ReturnType[
    js.Function1[
      /* hasIpnsDagPeerIdIsOnlineKeychain */ DagIpns, 
      js.Function2[
        /* value */ String, 
        /* options */ js.UndefOr[PublishSettings with AbortOptions], 
        js.Promise[PublishResult]
      ]
    ]
  ] = js.native
  
  var pubsub: NamePubSub = js.native
  
  var resolve: ReturnType[FnCallHasDnsIpnsPeerIdIsOnlineOptions] = js.native
}
object Name_ {
  
  @scala.inline
  def apply(
    publish: ReturnType[
      js.Function1[
        /* hasIpnsDagPeerIdIsOnlineKeychain */ DagIpns, 
        js.Function2[
          /* value */ String, 
          /* options */ js.UndefOr[PublishSettings with AbortOptions], 
          js.Promise[PublishResult]
        ]
      ]
    ],
    pubsub: NamePubSub,
    resolve: ReturnType[FnCallHasDnsIpnsPeerIdIsOnlineOptions]
  ): Name_ = {
    val __obj = js.Dynamic.literal(publish = publish.asInstanceOf[js.Any], pubsub = pubsub.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name_]
  }
  
  @scala.inline
  implicit class Name_Ops[Self <: Name_] (val x: Self) extends AnyVal {
    
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
    def setPublish(
      value: ReturnType[
          js.Function1[
            /* hasIpnsDagPeerIdIsOnlineKeychain */ DagIpns, 
            js.Function2[
              /* value */ String, 
              /* options */ js.UndefOr[PublishSettings with AbortOptions], 
              js.Promise[PublishResult]
            ]
          ]
        ]
    ): Self = this.set("publish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsub(value: NamePubSub): Self = this.set("pubsub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: ReturnType[FnCallHasDnsIpnsPeerIdIsOnlineOptions]): Self = this.set("resolve", value.asInstanceOf[js.Any])
  }
}
