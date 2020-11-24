package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.blockStatMod.StatOptions
import typings.ipfsCore.dagGetMod.GetOptions
import typings.ipfsCore.dagPutMod.PutOptions
import typings.ipfsCore.pinRmMod.RmOptions
import typings.ipfsCore.rmMod.RmFailure
import typings.ipfsCore.rmMod.RmSucceess
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofblock extends js.Object {
  
  def get(hasBlockServicePreload: BlockServicePreload): js.Function2[
    /* cid */ String | ^  | Uint8Array, 
    /* options */ js.UndefOr[GetOptions with AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
  
  def put(hasBlockServicePinGcLockPreload: BlockServiceGcLock): js.Function2[
    /* block */ Uint8Array | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any), 
    /* options */ js.UndefOr[PutOptions with AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
  
  def rm(hasBlockServiceGcLockPinManager: GcLockPinManager): js.Function2[
    /* cids */ ^  | js.Array[^], 
    /* options */ js.UndefOr[RmOptions with AbortOptions], 
    AsyncIterable[RmSucceess | RmFailure]
  ] = js.native
  
  def stat(hasBlockServicePreload: BlockServicePreload): js.Function2[
    /* cid */ ^, 
    /* options */ js.UndefOr[StatOptions with AbortOptions], 
    js.Promise[typings.ipfsCore.blockStatMod.Stat]
  ] = js.native
}
object Typeofblock {
  
  @scala.inline
  def apply(
    get: BlockServicePreload => js.Function2[
      /* cid */ String | ^  | Uint8Array, 
      /* options */ js.UndefOr[GetOptions with AbortOptions], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
      ]
    ],
    put: BlockServiceGcLock => js.Function2[
      /* block */ Uint8Array | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any), 
      /* options */ js.UndefOr[PutOptions with AbortOptions], 
      js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
      ]
    ],
    rm: GcLockPinManager => js.Function2[
      /* cids */ ^  | js.Array[^], 
      /* options */ js.UndefOr[RmOptions with AbortOptions], 
      AsyncIterable[RmSucceess | RmFailure]
    ],
    stat: BlockServicePreload => js.Function2[
      /* cid */ ^, 
      /* options */ js.UndefOr[StatOptions with AbortOptions], 
      js.Promise[typings.ipfsCore.blockStatMod.Stat]
    ]
  ): Typeofblock = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), put = js.Any.fromFunction1(put), rm = js.Any.fromFunction1(rm), stat = js.Any.fromFunction1(stat))
    __obj.asInstanceOf[Typeofblock]
  }
  
  @scala.inline
  implicit class TypeofblockOps[Self <: Typeofblock] (val x: Self) extends AnyVal {
    
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
    def setGet(
      value: BlockServicePreload => js.Function2[
          /* cid */ String | ^  | Uint8Array, 
          /* options */ js.UndefOr[GetOptions with AbortOptions], 
          js.Promise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
          ]
        ]
    ): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(
      value: BlockServiceGcLock => js.Function2[
          /* block */ Uint8Array | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any), 
          /* options */ js.UndefOr[PutOptions with AbortOptions], 
          js.Promise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
          ]
        ]
    ): Self = this.set("put", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRm(
      value: GcLockPinManager => js.Function2[
          /* cids */ ^  | js.Array[^], 
          /* options */ js.UndefOr[RmOptions with AbortOptions], 
          AsyncIterable[RmSucceess | RmFailure]
        ]
    ): Self = this.set("rm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStat(
      value: BlockServicePreload => js.Function2[
          /* cid */ ^, 
          /* options */ js.UndefOr[StatOptions with AbortOptions], 
          js.Promise[typings.ipfsCore.blockStatMod.Stat]
        ]
    ): Self = this.set("stat", js.Any.fromFunction1(value))
  }
}
