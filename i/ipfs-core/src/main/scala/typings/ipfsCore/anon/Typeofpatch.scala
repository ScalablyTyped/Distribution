package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpatch extends js.Object {
  
  def addLink(hasIpldGcLockPreload: GcLockIpldPreload): js.Function3[
    /* multihash */ js.UndefOr[js.Any], 
    /* link */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[_]
  ] = js.native
  
  def appendData(hasIpldGcLockPreload: GcLockIpldPreload): js.Function3[
    /* multihash */ js.UndefOr[js.Any], 
    /* data */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[_]
  ] = js.native
  
  def rmLink(hasIpldGcLockPreload: GcLockIpldPreload): js.Function3[
    /* multihash */ js.UndefOr[js.Any], 
    /* linkRef */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[_]
  ] = js.native
  
  def setData(hasIpldGcLockPreload: GcLockIpldPreload): js.Function3[
    /* multihash */ js.UndefOr[js.Any], 
    /* data */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[_]
  ] = js.native
}
object Typeofpatch {
  
  @scala.inline
  def apply(
    addLink: GcLockIpldPreload => js.Function3[
      /* multihash */ js.UndefOr[js.Any], 
      /* link */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      js.Promise[_]
    ],
    appendData: GcLockIpldPreload => js.Function3[
      /* multihash */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      js.Promise[_]
    ],
    rmLink: GcLockIpldPreload => js.Function3[
      /* multihash */ js.UndefOr[js.Any], 
      /* linkRef */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      js.Promise[_]
    ],
    setData: GcLockIpldPreload => js.Function3[
      /* multihash */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      js.Promise[_]
    ]
  ): Typeofpatch = {
    val __obj = js.Dynamic.literal(addLink = js.Any.fromFunction1(addLink), appendData = js.Any.fromFunction1(appendData), rmLink = js.Any.fromFunction1(rmLink), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[Typeofpatch]
  }
  
  @scala.inline
  implicit class TypeofpatchOps[Self <: Typeofpatch] (val x: Self) extends AnyVal {
    
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
      value: GcLockIpldPreload => js.Function3[
          /* multihash */ js.UndefOr[js.Any], 
          /* link */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          js.Promise[_]
        ]
    ): Self = this.set("addLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendData(
      value: GcLockIpldPreload => js.Function3[
          /* multihash */ js.UndefOr[js.Any], 
          /* data */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          js.Promise[_]
        ]
    ): Self = this.set("appendData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRmLink(
      value: GcLockIpldPreload => js.Function3[
          /* multihash */ js.UndefOr[js.Any], 
          /* linkRef */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          js.Promise[_]
        ]
    ): Self = this.set("rmLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetData(
      value: GcLockIpldPreload => js.Function3[
          /* multihash */ js.UndefOr[js.Any], 
          /* data */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          js.Promise[_]
        ]
    ): Self = this.set("setData", js.Any.fromFunction1(value))
  }
}
