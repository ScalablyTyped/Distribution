package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.dagGetMod.DagEntry
import typings.ipfsCore.dagGetMod.GetOptions
import typings.ipfsCore.dagPutMod.PutOptions
import typings.ipfsCore.nameResolveMod.ResolveOptions
import typings.ipfsCore.resolveMod.ResolveResult
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.treeMod.TreeOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdag extends js.Object {
  
  def get_1(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ ^, 
    /* options */ js.UndefOr[GetOptions with AbortOptions], 
    js.Promise[DagEntry]
  ] = js.native
  
  def put_1(hasIpldPinGcLockPreload: GcLockIpld): js.Function2[
    /* dagNode */ js.Any, 
    /* options */ js.UndefOr[PutOptions with AbortOptions], 
    js.Promise[^]
  ] = js.native
  
  def resolve(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ String | ^ , 
    /* options */ js.UndefOr[ResolveOptions with AbortOptions], 
    js.Promise[ResolveResult]
  ] = js.native
  
  def tree(hasIpldPreload: IpldPreload): js.Function2[
    /* ipfsPath */ ^, 
    /* options */ js.UndefOr[TreeOptions with AbortOptions], 
    AsyncIterable[String]
  ] = js.native
}
object Typeofdag {
  
  @scala.inline
  def apply(
    get_1: IpldPreload => js.Function2[
      /* ipfsPath */ ^, 
      /* options */ js.UndefOr[GetOptions with AbortOptions], 
      js.Promise[DagEntry]
    ],
    put_1: GcLockIpld => js.Function2[
      /* dagNode */ js.Any, 
      /* options */ js.UndefOr[PutOptions with AbortOptions], 
      js.Promise[^]
    ],
    resolve: IpldPreload => js.Function2[
      /* ipfsPath */ String | ^ , 
      /* options */ js.UndefOr[ResolveOptions with AbortOptions], 
      js.Promise[ResolveResult]
    ],
    tree: IpldPreload => js.Function2[
      /* ipfsPath */ ^, 
      /* options */ js.UndefOr[TreeOptions with AbortOptions], 
      AsyncIterable[String]
    ]
  ): Typeofdag = {
    val __obj = js.Dynamic.literal(get_1 = js.Any.fromFunction1(get_1), put_1 = js.Any.fromFunction1(put_1), resolve = js.Any.fromFunction1(resolve), tree = js.Any.fromFunction1(tree))
    __obj.asInstanceOf[Typeofdag]
  }
  
  @scala.inline
  implicit class TypeofdagOps[Self <: Typeofdag] (val x: Self) extends AnyVal {
    
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
    def setGet_1(
      value: IpldPreload => js.Function2[
          /* ipfsPath */ ^, 
          /* options */ js.UndefOr[GetOptions with AbortOptions], 
          js.Promise[DagEntry]
        ]
    ): Self = this.set("get_1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut_1(
      value: GcLockIpld => js.Function2[
          /* dagNode */ js.Any, 
          /* options */ js.UndefOr[PutOptions with AbortOptions], 
          js.Promise[^]
        ]
    ): Self = this.set("put_1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolve(
      value: IpldPreload => js.Function2[
          /* ipfsPath */ String | ^ , 
          /* options */ js.UndefOr[ResolveOptions with AbortOptions], 
          js.Promise[ResolveResult]
        ]
    ): Self = this.set("resolve", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTree(
      value: IpldPreload => js.Function2[
          /* ipfsPath */ ^, 
          /* options */ js.UndefOr[TreeOptions with AbortOptions], 
          AsyncIterable[String]
        ]
    ): Self = this.set("tree", js.Any.fromFunction1(value))
  }
}
