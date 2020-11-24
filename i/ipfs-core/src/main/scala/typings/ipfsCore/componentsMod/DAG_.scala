package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.FnCall
import typings.ipfsCore.anon.FnCallHasDnsIpnsPeerIdIsOnlineOptions
import typings.ipfsCore.anon.FnCallHasIpldPinGcLockPreload
import typings.ipfsCore.anon.Ipld
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.treeMod.TreeOptions
import typings.std.AsyncIterable
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DAG_ extends js.Object {
  
  var get: ReturnType[FnCall] = js.native
  
  var put: ReturnType[FnCallHasIpldPinGcLockPreload] = js.native
  
  var resolve: ReturnType[FnCallHasDnsIpnsPeerIdIsOnlineOptions] = js.native
  
  var tree: ReturnType[
    js.Function1[
      /* hasIpldPreload */ Ipld, 
      js.Function2[
        /* ipfsPath */ typings.cids.mod.^, 
        /* options */ js.UndefOr[TreeOptions with AbortOptions], 
        AsyncIterable[String]
      ]
    ]
  ] = js.native
}
object DAG_ {
  
  @scala.inline
  def apply(
    get: ReturnType[FnCall],
    put: ReturnType[FnCallHasIpldPinGcLockPreload],
    resolve: ReturnType[FnCallHasDnsIpnsPeerIdIsOnlineOptions],
    tree: ReturnType[
      js.Function1[
        /* hasIpldPreload */ Ipld, 
        js.Function2[
          /* ipfsPath */ typings.cids.mod.^, 
          /* options */ js.UndefOr[TreeOptions with AbortOptions], 
          AsyncIterable[String]
        ]
      ]
    ]
  ): DAG_ = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[DAG_]
  }
  
  @scala.inline
  implicit class DAG_Ops[Self <: DAG_] (val x: Self) extends AnyVal {
    
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
    def setGet(value: ReturnType[FnCall]): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPut(value: ReturnType[FnCallHasIpldPinGcLockPreload]): Self = this.set("put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: ReturnType[FnCallHasDnsIpnsPeerIdIsOnlineOptions]): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(
      value: ReturnType[
          js.Function1[
            /* hasIpldPreload */ Ipld, 
            js.Function2[
              /* ipfsPath */ typings.cids.mod.^, 
              /* options */ js.UndefOr[TreeOptions with AbortOptions], 
              AsyncIterable[String]
            ]
          ]
        ]
    ): Self = this.set("tree", value.asInstanceOf[js.Any])
  }
}
