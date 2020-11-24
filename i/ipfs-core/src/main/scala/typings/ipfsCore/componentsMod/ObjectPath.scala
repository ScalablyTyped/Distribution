package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.GcLockIpldPreload
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPath extends js.Object {
  
  var addLink: ReturnType[
    js.Function1[
      /* hasIpldGcLockPreload */ GcLockIpldPreload, 
      js.Function3[
        /* multihash */ js.UndefOr[_], 
        /* link */ js.UndefOr[_], 
        /* options */ js.UndefOr[_], 
        js.Promise[_]
      ]
    ]
  ] = js.native
  
  var appendData: ReturnType[
    js.Function1[
      /* hasIpldGcLockPreload */ GcLockIpldPreload, 
      js.Function3[
        /* multihash */ js.UndefOr[_], 
        /* data */ js.UndefOr[_], 
        /* options */ js.UndefOr[_], 
        js.Promise[_]
      ]
    ]
  ] = js.native
  
  var rmLink: ReturnType[
    js.Function1[
      /* hasIpldGcLockPreload */ GcLockIpldPreload, 
      js.Function3[
        /* multihash */ js.UndefOr[_], 
        /* linkRef */ js.UndefOr[_], 
        /* options */ js.UndefOr[_], 
        js.Promise[_]
      ]
    ]
  ] = js.native
  
  var setData: ReturnType[
    js.Function1[
      /* hasIpldGcLockPreload */ GcLockIpldPreload, 
      js.Function3[
        /* multihash */ js.UndefOr[_], 
        /* data */ js.UndefOr[_], 
        /* options */ js.UndefOr[_], 
        js.Promise[_]
      ]
    ]
  ] = js.native
}
object ObjectPath {
  
  @scala.inline
  def apply(
    addLink: ReturnType[
      js.Function1[
        /* hasIpldGcLockPreload */ GcLockIpldPreload, 
        js.Function3[
          /* multihash */ js.UndefOr[_], 
          /* link */ js.UndefOr[_], 
          /* options */ js.UndefOr[_], 
          js.Promise[_]
        ]
      ]
    ],
    appendData: ReturnType[
      js.Function1[
        /* hasIpldGcLockPreload */ GcLockIpldPreload, 
        js.Function3[
          /* multihash */ js.UndefOr[_], 
          /* data */ js.UndefOr[_], 
          /* options */ js.UndefOr[_], 
          js.Promise[_]
        ]
      ]
    ],
    rmLink: ReturnType[
      js.Function1[
        /* hasIpldGcLockPreload */ GcLockIpldPreload, 
        js.Function3[
          /* multihash */ js.UndefOr[_], 
          /* linkRef */ js.UndefOr[_], 
          /* options */ js.UndefOr[_], 
          js.Promise[_]
        ]
      ]
    ],
    setData: ReturnType[
      js.Function1[
        /* hasIpldGcLockPreload */ GcLockIpldPreload, 
        js.Function3[
          /* multihash */ js.UndefOr[_], 
          /* data */ js.UndefOr[_], 
          /* options */ js.UndefOr[_], 
          js.Promise[_]
        ]
      ]
    ]
  ): ObjectPath = {
    val __obj = js.Dynamic.literal(addLink = addLink.asInstanceOf[js.Any], appendData = appendData.asInstanceOf[js.Any], rmLink = rmLink.asInstanceOf[js.Any], setData = setData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPath]
  }
  
  @scala.inline
  implicit class ObjectPathOps[Self <: ObjectPath] (val x: Self) extends AnyVal {
    
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
    def setAddLink(
      value: ReturnType[
          js.Function1[
            /* hasIpldGcLockPreload */ GcLockIpldPreload, 
            js.Function3[
              /* multihash */ js.UndefOr[_], 
              /* link */ js.UndefOr[_], 
              /* options */ js.UndefOr[_], 
              js.Promise[_]
            ]
          ]
        ]
    ): Self = this.set("addLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendData(
      value: ReturnType[
          js.Function1[
            /* hasIpldGcLockPreload */ GcLockIpldPreload, 
            js.Function3[
              /* multihash */ js.UndefOr[_], 
              /* data */ js.UndefOr[_], 
              /* options */ js.UndefOr[_], 
              js.Promise[_]
            ]
          ]
        ]
    ): Self = this.set("appendData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRmLink(
      value: ReturnType[
          js.Function1[
            /* hasIpldGcLockPreload */ GcLockIpldPreload, 
            js.Function3[
              /* multihash */ js.UndefOr[_], 
              /* linkRef */ js.UndefOr[_], 
              /* options */ js.UndefOr[_], 
              js.Promise[_]
            ]
          ]
        ]
    ): Self = this.set("rmLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetData(
      value: ReturnType[
          js.Function1[
            /* hasIpldGcLockPreload */ GcLockIpldPreload, 
            js.Function3[
              /* multihash */ js.UndefOr[_], 
              /* data */ js.UndefOr[_], 
              /* options */ js.UndefOr[_], 
              js.Promise[_]
            ]
          ]
        ]
    ): Self = this.set("setData", value.asInstanceOf[js.Any])
  }
}
