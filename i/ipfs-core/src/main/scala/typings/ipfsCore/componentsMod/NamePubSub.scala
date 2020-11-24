package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.Canceled
import typings.ipfsCore.anon.Enabled
import typings.ipfsCore.anon.Ipns
import typings.ipfsCore.anon.IpnsOptions
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamePubSub extends js.Object {
  
  var cancel: ReturnType[
    js.Function1[
      /* hasIpnsOptions */ Ipns, 
      js.Function2[/* name */ String, /* options */ js.UndefOr[AbortOptions], js.Promise[Canceled]]
    ]
  ] = js.native
  
  var state: ReturnType[
    js.Function1[
      /* hasIpnsOptions */ IpnsOptions, 
      js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[Enabled]]
    ]
  ] = js.native
  
  var subs: ReturnType[
    js.Function1[
      /* hasIpnsOptions */ IpnsOptions, 
      js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[String]]]
    ]
  ] = js.native
}
object NamePubSub {
  
  @scala.inline
  def apply(
    cancel: ReturnType[
      js.Function1[
        /* hasIpnsOptions */ Ipns, 
        js.Function2[/* name */ String, /* options */ js.UndefOr[AbortOptions], js.Promise[Canceled]]
      ]
    ],
    state: ReturnType[
      js.Function1[
        /* hasIpnsOptions */ IpnsOptions, 
        js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[Enabled]]
      ]
    ],
    subs: ReturnType[
      js.Function1[
        /* hasIpnsOptions */ IpnsOptions, 
        js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[String]]]
      ]
    ]
  ): NamePubSub = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subs = subs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamePubSub]
  }
  
  @scala.inline
  implicit class NamePubSubOps[Self <: NamePubSub] (val x: Self) extends AnyVal {
    
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
    def setCancel(
      value: ReturnType[
          js.Function1[
            /* hasIpnsOptions */ Ipns, 
            js.Function2[/* name */ String, /* options */ js.UndefOr[AbortOptions], js.Promise[Canceled]]
          ]
        ]
    ): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(
      value: ReturnType[
          js.Function1[
            /* hasIpnsOptions */ IpnsOptions, 
            js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[Enabled]]
          ]
        ]
    ): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubs(
      value: ReturnType[
          js.Function1[
            /* hasIpnsOptions */ IpnsOptions, 
            js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[String]]]
          ]
        ]
    ): Self = this.set("subs", value.asInstanceOf[js.Any])
  }
}
