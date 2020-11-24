package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.BlockSize
import typings.ipfsCore.anon.DagAny
import typings.ipfsCore.anon.GcLockIpldPreload
import typings.ipfsCore.anon.IpldAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "object")
@js.native
object `object` extends js.Object {
  
  def data(hasIpldPreload: IpldAny): js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  
  @JSName("get_2")
  def get2(hasIpldPreload: IpldAny): js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  
  def links(hasDag: DagAny): js.Function2[/* multihash */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  
  @JSName("_new")
  def `new`(hasIpldPreload: IpldAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  
  @JSName("put_2")
  def put2(hasIpldGcLockPreload: GcLockIpldPreload): js.Function2[/* obj */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
  
  @JSName("stat_2")
  def stat2(hasIpldPreload: IpldAny): js.Function2[
    /* multihash */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[BlockSize]
  ] = js.native
  
  @js.native
  object patch extends js.Object {
    
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
}
