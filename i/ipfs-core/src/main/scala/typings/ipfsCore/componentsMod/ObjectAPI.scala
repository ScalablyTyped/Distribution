package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.DagAny
import typings.ipfsCore.anon.FnCall
import typings.ipfsCore.anon.FnCallHasIpldPinGcLockPreload
import typings.ipfsCore.anon.FnCallHasRepo
import typings.ipfsCore.anon.IpldAny
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectAPI extends js.Object {
  
  var data: ReturnType[
    js.Function1[
      /* hasIpldPreload */ IpldAny, 
      js.Function2[/* multihash */ js.UndefOr[_], /* options */ js.UndefOr[_], js.Promise[_]]
    ]
  ] = js.native
  
  var get: ReturnType[FnCall] = js.native
  
  var links: ReturnType[
    js.Function1[
      /* hasDag */ DagAny, 
      js.Function2[/* multihash */ js.UndefOr[_], /* options */ js.UndefOr[_], js.Promise[_]]
    ]
  ] = js.native
  
  var `new`: ReturnType[
    js.Function1[
      /* hasIpldPreload */ IpldAny, 
      js.Function1[/* options */ js.UndefOr[_], js.Promise[_]]
    ]
  ] = js.native
  
  var patch: ObjectPath = js.native
  
  var put: ReturnType[FnCallHasIpldPinGcLockPreload] = js.native
  
  var stat: ReturnType[FnCallHasRepo] = js.native
}
object ObjectAPI {
  
  @scala.inline
  def apply(
    data: ReturnType[
      js.Function1[
        /* hasIpldPreload */ IpldAny, 
        js.Function2[/* multihash */ js.UndefOr[_], /* options */ js.UndefOr[_], js.Promise[_]]
      ]
    ],
    get: ReturnType[FnCall],
    links: ReturnType[
      js.Function1[
        /* hasDag */ DagAny, 
        js.Function2[/* multihash */ js.UndefOr[_], /* options */ js.UndefOr[_], js.Promise[_]]
      ]
    ],
    `new`: ReturnType[
      js.Function1[
        /* hasIpldPreload */ IpldAny, 
        js.Function1[/* options */ js.UndefOr[_], js.Promise[_]]
      ]
    ],
    patch: ObjectPath,
    put: ReturnType[FnCallHasIpldPinGcLockPreload],
    stat: ReturnType[FnCallHasRepo]
  ): ObjectAPI = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectAPI]
  }
  
  @scala.inline
  implicit class ObjectAPIOps[Self <: ObjectAPI] (val x: Self) extends AnyVal {
    
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
    def setData(
      value: ReturnType[
          js.Function1[
            /* hasIpldPreload */ IpldAny, 
            js.Function2[/* multihash */ js.UndefOr[_], /* options */ js.UndefOr[_], js.Promise[_]]
          ]
        ]
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: ReturnType[FnCall]): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(
      value: ReturnType[
          js.Function1[
            /* hasDag */ DagAny, 
            js.Function2[/* multihash */ js.UndefOr[_], /* options */ js.UndefOr[_], js.Promise[_]]
          ]
        ]
    ): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew(
      value: ReturnType[
          js.Function1[
            /* hasIpldPreload */ IpldAny, 
            js.Function1[/* options */ js.UndefOr[_], js.Promise[_]]
          ]
        ]
    ): Self = this.set("new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: ObjectPath): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPut(value: ReturnType[FnCallHasIpldPinGcLockPreload]): Self = this.set("put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: ReturnType[FnCallHasRepo]): Self = this.set("stat", value.asInstanceOf[js.Any])
  }
}
