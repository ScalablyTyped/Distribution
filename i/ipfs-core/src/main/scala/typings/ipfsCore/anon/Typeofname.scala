package typings.ipfsCore.anon

import typings.ipfsCore.nameResolveMod.ResolveSettings
import typings.ipfsCore.publishMod.PublishResult
import typings.ipfsCore.publishMod.PublishSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofname extends js.Object {
  
  def publish(hasIpnsDagPeerIdIsOnlineKeychain: Dag): js.Function2[
    /* value */ String, 
    /* options */ js.UndefOr[PublishSettings with AbortOptions], 
    js.Promise[PublishResult]
  ] = js.native
  
  val pubsub: Typeofpubsub = js.native
  
  def resolve_1(hasDnsIpnsPeerIdIsOnlineOptions: Dns): js.Function2[
    /* name */ String, 
    /* options */ js.UndefOr[ResolveSettings with AbortOptions], 
    AsyncIterable[String]
  ] = js.native
}
object Typeofname {
  
  @scala.inline
  def apply(
    publish: Dag => js.Function2[
      /* value */ String, 
      /* options */ js.UndefOr[PublishSettings with AbortOptions], 
      js.Promise[PublishResult]
    ],
    pubsub: Typeofpubsub,
    resolve_1: Dns => js.Function2[
      /* name */ String, 
      /* options */ js.UndefOr[ResolveSettings with AbortOptions], 
      AsyncIterable[String]
    ]
  ): Typeofname = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction1(publish), pubsub = pubsub.asInstanceOf[js.Any], resolve_1 = js.Any.fromFunction1(resolve_1))
    __obj.asInstanceOf[Typeofname]
  }
  
  @scala.inline
  implicit class TypeofnameOps[Self <: Typeofname] (val x: Self) extends AnyVal {
    
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
      value: Dag => js.Function2[
          /* value */ String, 
          /* options */ js.UndefOr[PublishSettings with AbortOptions], 
          js.Promise[PublishResult]
        ]
    ): Self = this.set("publish", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPubsub(value: Typeofpubsub): Self = this.set("pubsub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve_1(
      value: Dns => js.Function2[
          /* name */ String, 
          /* options */ js.UndefOr[ResolveSettings with AbortOptions], 
          AsyncIterable[String]
        ]
    ): Self = this.set("resolve_1", js.Any.fromFunction1(value))
  }
}
