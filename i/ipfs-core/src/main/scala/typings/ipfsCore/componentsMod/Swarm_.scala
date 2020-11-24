package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.Addr
import typings.ipfsCore.anon.AddrsAny
import typings.ipfsCore.anon.Libp2pAny
import typings.ipfsCore.anon.Multiaddrs
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Swarm_ extends js.Object {
  
  var addrs: ReturnType[
    js.Function1[
      /* hasLibp2p */ Libp2pAny, 
      js.Function1[/* options */ js.UndefOr[_], js.Promise[js.Array[AddrsAny]]]
    ]
  ] = js.native
  
  var connect: ReturnType[
    js.Function1[
      /* hasLibp2p */ Libp2pAny, 
      js.Function2[/* addr */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
    ]
  ] = js.native
  
  var disconnect: ReturnType[
    js.Function1[
      /* hasLibp2p */ Libp2pAny, 
      js.Function2[/* addr */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
    ]
  ] = js.native
  
  var localAddrs: ReturnType[js.Function1[/* hasMultiaddrs */ Multiaddrs, js.Function0[js.Promise[_]]]] = js.native
  
  var peers: ReturnType[
    js.Function1[
      /* hasLibp2p */ Libp2pAny, 
      js.Function1[/* options */ js.UndefOr[_], js.Promise[js.Array[Addr]]]
    ]
  ] = js.native
}
object Swarm_ {
  
  @scala.inline
  def apply(
    addrs: ReturnType[
      js.Function1[
        /* hasLibp2p */ Libp2pAny, 
        js.Function1[/* options */ js.UndefOr[_], js.Promise[js.Array[AddrsAny]]]
      ]
    ],
    connect: ReturnType[
      js.Function1[
        /* hasLibp2p */ Libp2pAny, 
        js.Function2[/* addr */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
      ]
    ],
    disconnect: ReturnType[
      js.Function1[
        /* hasLibp2p */ Libp2pAny, 
        js.Function2[/* addr */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
      ]
    ],
    localAddrs: ReturnType[js.Function1[/* hasMultiaddrs */ Multiaddrs, js.Function0[js.Promise[_]]]],
    peers: ReturnType[
      js.Function1[
        /* hasLibp2p */ Libp2pAny, 
        js.Function1[/* options */ js.UndefOr[_], js.Promise[js.Array[Addr]]]
      ]
    ]
  ): Swarm_ = {
    val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], disconnect = disconnect.asInstanceOf[js.Any], localAddrs = localAddrs.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swarm_]
  }
  
  @scala.inline
  implicit class Swarm_Ops[Self <: Swarm_] (val x: Self) extends AnyVal {
    
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
    def setAddrs(
      value: ReturnType[
          js.Function1[
            /* hasLibp2p */ Libp2pAny, 
            js.Function1[/* options */ js.UndefOr[_], js.Promise[js.Array[AddrsAny]]]
          ]
        ]
    ): Self = this.set("addrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnect(
      value: ReturnType[
          js.Function1[
            /* hasLibp2p */ Libp2pAny, 
            js.Function2[/* addr */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
          ]
        ]
    ): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnect(
      value: ReturnType[
          js.Function1[
            /* hasLibp2p */ Libp2pAny, 
            js.Function2[/* addr */ js.UndefOr[_], /* options */ js.UndefOr[_], _]
          ]
        ]
    ): Self = this.set("disconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddrs(value: ReturnType[js.Function1[/* hasMultiaddrs */ Multiaddrs, js.Function0[js.Promise[_]]]]): Self = this.set("localAddrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeers(
      value: ReturnType[
          js.Function1[
            /* hasLibp2p */ Libp2pAny, 
            js.Function1[/* options */ js.UndefOr[_], js.Promise[js.Array[Addr]]]
          ]
        ]
    ): Self = this.set("peers", value.asInstanceOf[js.Any])
  }
}
