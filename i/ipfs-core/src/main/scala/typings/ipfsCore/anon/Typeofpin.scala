package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.addMod.AddOptions
import typings.ipfsCore.pinAddAllMod.AddSettings
import typings.ipfsCore.pinLsMod.LsEntry
import typings.ipfsCore.pinLsMod.LsSettings
import typings.ipfsCore.pinRmMod.RmSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpin extends js.Object {
  
  def addAll(hasPinManagerGcLockDag: DagGcLock): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddSettings with AbortOptions], 
    AsyncIterable[^]
  ] = js.native
  
  def add_1(hasAddAll: `1`): js.Function2[
    /* path */ String | ^ , 
    /* options */ js.UndefOr[AddOptions with AbortOptions], 
    js.Promise[^]
  ] = js.native
  
  def ls(hasPinManagerDag: DagPinManager): js.Function1[/* options */ js.UndefOr[LsSettings with AbortOptions], AsyncIterable[LsEntry]] = js.native
  
  def rmAll(hasPinManagerGcLockDag: DagGcLockPinManager): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* _options */ js.UndefOr[AbortOptions], 
    AsyncIterable[^]
  ] = js.native
  
  def rm_3(hasRmAll: RmAll): js.Function2[
    /* path */ String | ^ , 
    /* options */ js.UndefOr[RmSettings with AbortOptions], 
    js.Promise[^]
  ] = js.native
}
object Typeofpin {
  
  @scala.inline
  def apply(
    addAll: DagGcLock => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
      /* options */ js.UndefOr[AddSettings with AbortOptions], 
      AsyncIterable[^]
    ],
    add_1: `1` => js.Function2[
      /* path */ String | ^ , 
      /* options */ js.UndefOr[AddOptions with AbortOptions], 
      js.Promise[^]
    ],
    ls: DagPinManager => js.Function1[/* options */ js.UndefOr[LsSettings with AbortOptions], AsyncIterable[LsEntry]],
    rmAll: DagGcLockPinManager => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
      /* _options */ js.UndefOr[AbortOptions], 
      AsyncIterable[^]
    ],
    rm_3: RmAll => js.Function2[
      /* path */ String | ^ , 
      /* options */ js.UndefOr[RmSettings with AbortOptions], 
      js.Promise[^]
    ]
  ): Typeofpin = {
    val __obj = js.Dynamic.literal(addAll = js.Any.fromFunction1(addAll), add_1 = js.Any.fromFunction1(add_1), ls = js.Any.fromFunction1(ls), rmAll = js.Any.fromFunction1(rmAll), rm_3 = js.Any.fromFunction1(rm_3))
    __obj.asInstanceOf[Typeofpin]
  }
  
  @scala.inline
  implicit class TypeofpinOps[Self <: Typeofpin] (val x: Self) extends AnyVal {
    
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
    def setAddAll(
      value: DagGcLock => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
          /* options */ js.UndefOr[AddSettings with AbortOptions], 
          AsyncIterable[^]
        ]
    ): Self = this.set("addAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd_1(
      value: `1` => js.Function2[
          /* path */ String | ^ , 
          /* options */ js.UndefOr[AddOptions with AbortOptions], 
          js.Promise[^]
        ]
    ): Self = this.set("add_1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLs(
      value: DagPinManager => js.Function1[/* options */ js.UndefOr[LsSettings with AbortOptions], AsyncIterable[LsEntry]]
    ): Self = this.set("ls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRmAll(
      value: DagGcLockPinManager => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
          /* _options */ js.UndefOr[AbortOptions], 
          AsyncIterable[^]
        ]
    ): Self = this.set("rmAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRm_3(
      value: RmAll => js.Function2[
          /* path */ String | ^ , 
          /* options */ js.UndefOr[RmSettings with AbortOptions], 
          js.Promise[^]
        ]
    ): Self = this.set("rm_3", js.Any.fromFunction1(value))
  }
}
